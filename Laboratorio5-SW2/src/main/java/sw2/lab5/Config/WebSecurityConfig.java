package sw2.lab5.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.formLogin().loginPage("/loginForm").loginProcessingUrl("/processLogin")
        .defaultSuccessUrl("/redirectByRole",true);

        http.authorizeRequests().antMatchers("/user/list").hasAuthority("admin");
        http.authorizeRequests().antMatchers("/user","/user/edit").hasAnyAuthority("admin","user");

        http.authorizeRequests().antMatchers("/post/delete").hasAuthority("admin");
        http.authorizeRequests().antMatchers("/post/create","/post/edit").hasAnyAuthority("admin","user");

        http.authorizeRequests().anyRequest().permitAll();

        http.logout().logoutUrl("/cerrar").logoutSuccessUrl("/posts");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("SELECT email, pwd, activo FROM usuario WHERE email = ?")
                .authoritiesByUsernameQuery("SELECT u.email, r.nombre, from  usuario  u inner join rol r on (u.idrol =r.idrol) " +
                        "where u.email = ? and u.active = 1");
    }
}
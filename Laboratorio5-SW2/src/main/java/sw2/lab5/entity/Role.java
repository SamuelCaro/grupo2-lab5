package sw2.lab5.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable =  false)
    @NotBlank(message = "Este campo no puede estar vacio")
    private int idrole;
    @Column(name = "role_name", nullable = false)
    @NotBlank(message = "Este campo no puede estar vacio")
    private String rolename;

    public int getIdrole() {
        return idrole;
    }

    public void setIdrole(int idrole) {
        this.idrole = idrole;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}

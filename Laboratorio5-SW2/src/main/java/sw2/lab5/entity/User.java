package sw2.lab5.entity;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int iduser;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String intro;
    private String profile;
    @Column(nullable = false)
    private String active;
    @Column(nullable = false)
    @Column(name = "id_user")
    private role idrole;
}

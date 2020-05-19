package sw2.lab5.entity;


import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private int idrole;
    @Column(name = "role_name")
    @Column(nullable = false)
    private String rolename;

}

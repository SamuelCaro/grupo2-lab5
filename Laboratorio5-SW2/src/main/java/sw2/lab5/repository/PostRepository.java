package sw2.lab5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sw2.lab5.entity.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

/*
    @Query(value = "select * from comunidad where nombre = ?1 or codigo =?2",
            nativeQuery = true)
    List<Comunidad> buscarPorNombre (String nombre, String codigo);
    */


}

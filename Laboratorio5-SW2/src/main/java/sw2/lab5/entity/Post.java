package sw2.lab5.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "post")
public class Post {



    @Id
    @Column(name = "id_post")
    private int idpost;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author_id;
    @Column(name="title")
    @NotBlank(message = "Este campo no puede estar vacio")
    @Size(max = 75)
    private String title;
    @Column(name = "summary")
    private String summary;
    @Column (name = "published")
    @NotBlank(message = "Este campo no puede estar vacio")
    private boolean published;
    @Column(name = "content")
    private String content;


    public int getIdpost() {
        return idpost;
    }

    public void setIdpost(int idpost) {
        this.idpost = idpost;
    }

    public User getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(User author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

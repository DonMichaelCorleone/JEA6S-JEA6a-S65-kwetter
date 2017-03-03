package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import model.Comment;
import model.User;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@NamedQueries({
    @NamedQuery(name = "Posting.getAllByUserId", query = "select p from posting as p where p.user_id = :id"),
})
public class Posting implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private User author;
    
    private String title;
    private String content;
    private Date date;
    
    @OneToMany
    private List<Comment> comments;
    private Long nextCommentId;
    
  

    public Posting(User author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.date = new Date();
        this.comments = new ArrayList<Comment>();
        this.nextCommentId = 1L;
    }

    public Posting(Long id, User author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.date = new Date();
        this.comments = new ArrayList<Comment>();
        this.nextCommentId = 1L;
    }

    public List<Comment> getComments() {
        return comments;
    }
    
    public void addComment(String message) {
        Comment comment = new Comment(this.nextCommentId++, message, this.author, this);
        this.comments.add(comment);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Comment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private Date date;
    
    @ManyToOne
    private User poster;
    
    @ManyToOne
    private Posting post;
 
    public Comment(String content , User u , Posting p) {
        this.content = content;
        this.date = new Date();
        this.post = p;
        this.poster = u;
    }
      
   public Comment(Long id, String content , User u , Posting p) {
        this.id = id;
        this.content = content;
        this.date = new Date();
        this.post = p;
        this.poster = u;
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

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

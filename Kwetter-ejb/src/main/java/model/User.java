/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import model.Posting;
import model.User;

/**
 *
 * @author Loek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@NamedQueries({
    @NamedQuery(name = "User.getAll", query = "select u from User as u"),
    @NamedQuery(name = "User.count", query = "select count(u) from User as u"),
    @NamedQuery(name = "User.findByEmail", query = "select u from User as u where u.email= :email")
})
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private static final long serialVersionUID = 1L;
    private String userName;
    
    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private ArrayList<Posting> tweets;
    
    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private ArrayList<User> followers;
    
    @OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
    private ArrayList<User> following;
    
    private String password;
    private String location;
    private String biography;
    private String websiteURL;
    
    public User(){
        
    }
    
    public User(String userName){
        this.userName = userName;
    }   

    public User(String userName, String profilePicture, ArrayList<Posting> tweets, ArrayList<User> followers, ArrayList<User> following, String location, String biography, String websiteURL) {
        this.userName = userName;
        this.profilePicture = profilePicture;
        this.tweets = tweets;
        this.followers = followers;
        this.following = following;
        this.location = location;
        this.biography = biography;
        this.websiteURL = websiteURL;
    }
    private String profilePicture;
    
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public ArrayList<Posting> getTweets() {
        return tweets;
    }

    public void setTweets(ArrayList<Posting> tweets) {
        this.tweets = tweets;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.User[ id=" + id + " ]";
    }
}

package service;

import kwetter.dao.PostingDao;
import kwetter.dao.PostingDaoImp;
import java.util.List;
import model.Posting;
import model.User;

public class Postingservice {

    private final PostingDao postingDao;

    public Postingservice() {
        postingDao = PostingDaoImp.getPostingDao();
    }
    
    public void create(Posting p){
        postingDao.create(p);
    } 
  
    
    public void edit(Posting p){
        postingDao.edit(p);
    };
    
    public void remove(Long id){
        postingDao.remove(id);
    };

    public List<Posting> findAll(User u){
        return postingDao.findAll(u);
    };
    
    public Posting find(Long id){
         return postingDao.find(id);
    };
}

package service;

import kwetter.dao.PostingDaoJPAImp;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import model.Posting;
import model.User;

@Stateless
public class Postingservice {

    @Inject
    private PostingDaoJPAImp postingDao;

    public Postingservice() {
        
    }

    public Postingservice(EntityManager em) {
        postingDao = PostingDaoJPAImp.getPostingDao(em);
    }
    
    public void create(Posting p){
        if(p.getContent().length() <= 140){
             postingDao.create(p);
        }       
    } 
    
    public void edit(Posting p){
        if(p.getContent().length() <= 140){
             postingDao.edit(p);
        }     
    };
    
    public void remove(Long id){
        postingDao.remove(id);
    };

    public List<Posting> findAll(User u){
        if(u != null){
               return postingDao.findAll(u);
        }else{
            return null;
        }
    };
    
    public Posting find(Long id){
         return postingDao.find(id);
    };
}

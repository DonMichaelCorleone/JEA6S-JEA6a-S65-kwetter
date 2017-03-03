package kwetter.dao;

import java.util.List;
import model.Posting;
import model.User;

public interface PostingDao {

    void create(Posting p);
    
    void edit(Posting p);
    
    void remove(Long id);

    List<Posting> findAll(User u);
    
    Posting find(Long id);
}

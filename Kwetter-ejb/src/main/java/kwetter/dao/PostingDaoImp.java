/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kwetter.dao;

import model.Posting;
import java.util.ArrayList;
import java.util.List;
import model.User;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kwetter.dao.UserDaoImp;

public class PostingDaoImp implements PostingDao {

    private static PostingDaoImp instance = null;
    private ConcurrentHashMap<Long, Posting> postings;
    private AtomicLong nextId = new AtomicLong(0L);
    private UserDaoImp userDaoImp;

    public static synchronized PostingDao getPostingDao() {
        if (instance == null) {
            instance = new PostingDaoImp();
        }

        return instance;
    }

    private PostingDaoImp() {
        this.userDaoImp = new UserDaoImp();
    }



    @Override
    public void create(Posting p) {
        if (p == null) {
            throw new IllegalArgumentException("Posting is null");
        }
        p.setId(nextId.getAndIncrement());
        postings.put(p.getId(), p);
    }

    @Override
    public void edit(Posting x) {
        if (x.getAuthor() == null || x.getTitle() == null || x.getContent() == null) {
            throw new IllegalArgumentException("Author, Title or Content is null");
        }
        if (!postings.containsKey(x.getId())) {
            throw new IllegalArgumentException("Id not found: " + x.getId());
        }

        Posting p = postings.get(x.getId());
        p.setAuthor(x.getAuthor());
        p.setTitle(x.getTitle());
        p.setContent(x.getContent());
    }

    @Override
    public void remove(Long id) {
        if (!postings.containsKey(id)) {
            throw new IllegalArgumentException("Id not found: " + id);
        }

        postings.remove(id);
    }

    @Override
    public List<Posting> findAll(User u) {
        return new ArrayList(postings.values());
    }

    @Override
    public Posting find(Long id) {
        if (!postings.containsKey(id)) {
            throw new IllegalArgumentException("Id not found: " + id);
        }
        return postings.get(id);
    }
}

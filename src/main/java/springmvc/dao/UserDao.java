package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;


//this is db layer which tell spring container that this clss object ned to created and injected
@Repository
public class UserDao {
	//to inject HibernateTemplate automatically use autowired
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//enbale wiriting
	@Transactional
	public int saveUser(User user) {
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}
}

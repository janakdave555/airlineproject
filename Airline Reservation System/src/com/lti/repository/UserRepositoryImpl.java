package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.UserRegistration;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository
{
	@PersistenceContext
	EntityManager em;
	@Transactional
	@Override
	public UserRegistration addUser(UserRegistration ur)
	{
		ur=em.merge(ur);
		em.persist(ur);
		return ur;
	}

	@Override
	public UserRegistration findUserByEmail(String email) {
		
		TypedQuery<UserRegistration> query = em.createQuery("Select u from UserRegistration u where u.email=?1", UserRegistration.class);
		
		query.setParameter(1, email);
		UserRegistration u=query.getSingleResult();
		return u;
	
	}

}

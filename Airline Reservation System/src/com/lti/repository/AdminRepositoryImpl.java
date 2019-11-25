package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.AdminRegistration;

@Repository("adminRepository")


public class AdminRepositoryImpl implements AdminRepository

{
	@PersistenceContext(name= "myPu")
	EntityManager em;

	
	

public EntityManager getEm() {
		return em;
	}


	public void setEm(EntityManager em) {
		this.em = em;
	}


@Override
@Transactional
	public AdminRegistration addAdmin(AdminRegistration ar)
	{
		  ar=em.merge(ar);
			
			em.persist(ar);
			System.out.println("Admin Added");
			return ar;
		
	}
	
	
	@Override
	@Transactional
	public AdminRegistration findAdminByAdminName(String admin_name)
	{
		
		TypedQuery<AdminRegistration> query = em.createQuery("Select a from AdminRegistration a where a.admin_name=?1", AdminRegistration.class);
		
		query.setParameter(1, admin_name);
		AdminRegistration a=query.getSingleResult();
		return a;
	
	}
	
	
	
	

}

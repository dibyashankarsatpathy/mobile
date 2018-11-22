package com.cg.mobshop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.mobshop.dto.Mobiles;
@Repository("dao")
public class MobileDaoImpl implements MobileDao{

	
	@PersistenceContext
	EntityManager manager;
	public EntityManager getManager(){
		return manager;
	}
	public void setManager(EntityManager manager)
	{
		this.manager=manager;
	}
	
	@Override
	public List<Mobiles> getAllMobiles() {
		// TODO Auto-generated method stub
		System.out.println("in dao class method");
		String str="select mobile from Mobiles mobile ";
		TypedQuery<Mobiles> query=
				manager.createQuery(str,Mobiles.class);
		return query.getResultList();
	}



}

package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Pet;

@Component
public class PetDAOImpl implements PetDAO{
	
	@Autowired
	SessionFactory sessionfactory;
	
	@Override
	public void addPet(Pet pet) {
		// TODO Auto-generated method stub
		
		Session session=sessionfactory.openSession();
		session.getTransaction().begin();
		session.persist(pet);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updatePet(Pet pet) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		session.getTransaction().begin();
		session.update(pet);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deletePet(Pet pet) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.delete(session);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Pet> getAllPet() {
		Session session=sessionfactory.openSession();
		String query="Select p from Pet p";
		Query sessionquery=session.createQuery(query);
		
		
		
		// TODO Auto-generated method stub
		return sessionquery.list();
	}

	@Override
	public Pet findPet(int id) {
		Session session=sessionfactory.openSession();
		
		Pet pet=session.get(Pet.class, id);
		// TODO Auto-generated method stub
		return pet;
	}

}

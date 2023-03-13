package com.xworkz.dog.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.dog.entity.DogEntity;

@Repository
public class DogRepoImpl implements DogRepo {

	@Autowired
	private EntityManagerFactory emf;
	
	@Override
	public boolean save(DogEntity entity) {
		if(emf != null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public DogEntity findById(int id) {
		if(emf != null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findById",DogEntity.class);
			query.setParameter("id", id);
			em.getTransaction().commit();
			return (DogEntity)query.getSingleResult();
		}
		return null;
	}

	@Override
	public List<DogEntity> readAll() {
		if(emf != null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll",DogEntity.class);
			em.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

	@Override
	public boolean updateTypebyID(String breadType, int id) {
		if(emf != null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateTypeById");
			query.setParameter("id", id);
			query.setParameter("type", breadType);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteByColorAndAge(String color, int age) {
		if(emf != null) {
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByColorAndAge");
			query.setParameter("color", color);
			query.setParameter("age", age);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

}

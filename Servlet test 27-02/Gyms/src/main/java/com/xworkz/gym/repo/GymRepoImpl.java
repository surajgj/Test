package com.xworkz.gym.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.gym.dto.GymDto;

public class GymRepoImpl implements GymRepo{

	EntityManagerFactory fitness = Persistence.createEntityManagerFactory("gymDetails");
	EntityManager body = fitness.createEntityManager();
	
	@Override
	public boolean save(GymDto dto) {
		if( body != null) {
			body.getTransaction().begin();
			body.persist(dto);
			body.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<GymDto> readAll() {
		if( body != null ) {
			body.getTransaction().begin();
			Query query = body.createNamedQuery("readAll", GymDto.class);
			body.getTransaction().commit();
			return query.getResultList();
		}
		return null;
	}

}

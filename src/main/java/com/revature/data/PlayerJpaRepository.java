package com.revature.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.revature.models.Player;

@Repository
public class PlayerJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public Player findById(int id) {
		
		return entityManager.find(Player.class, id);
	}
	
	public Player insert(Player p) {
		
		return entityManager.merge(p);
	}
	
	public Player update(Player p) {
		
		return entityManager.merge(p);
	}
	
	public void deleteById(int id) {
		
		Player p = findById(id);
		
		entityManager.remove(p);
	}
	
	public List<Player> findAll() {
		
		TypedQuery<Player> namedQuery = entityManager.createNamedQuery("find_all_players", Player.class);
		return namedQuery.getResultList();
	}
	
}	

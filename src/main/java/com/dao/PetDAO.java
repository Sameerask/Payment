package com.dao;
import java.util.List;

import com.model.Pet;
public interface PetDAO {
	
	public void addPet(Pet pet);
	public void updatePet(Pet pet);
	public void deletePet(Pet pet);
	public List<Pet> getAllPet();
	public Pet findPet(int id);
	

}

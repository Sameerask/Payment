package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Pet;
import com.dao.*;
@RestController
public class PetStoreRestController {
	
	
	@Autowired
	PetDAOImpl petDAOImpl;
  	
	@GetMapping("/petlist")
	public List<Pet> getPetList()
	{
		
		
   return petDAOImpl.getAllPet();
	}
	
	
	@PostMapping("/addpet")
	public String addPet(@RequestBody Pet pet)
	{
		
		petDAOImpl.addPet(pet);
		return "Pet added "+pet;
		
	}
	
	
	
	@DeleteMapping("/removepet")
	public String deletePet(@RequestBody Pet pet)
	{
		
		petDAOImpl.deletePet(pet);
		 return "pet deleted "+pet;
	} 
	
	@PatchMapping("/updatepet")
	public String updatePet(@RequestBody Pet pet)
	{
		petDAOImpl.updatePet(pet);
		return "Pet updated "+pet;
	}
	
	
	
	
	

}

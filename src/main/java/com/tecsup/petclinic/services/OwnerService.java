package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;
import com.tecsup.petclinic.exception.PetNotFoundException;
import com.tecsup.petclinic.repositories.Pet;

public interface OwnerService {
	Owner create(Owner owner);

	/**
	 * 
	 * @param owner
	 * @return
	 */
	Owner update(Owner owner);

	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException
	 */
	void delete(Long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	Owner findById(long id) throws OwnerNotFoundException;

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Owner> findByFirstname(String first_name);

	/**
	 * 
	 * @param typeId
	 * @return
	 */
	List<Owner> findBylastname(String last_name);

	/**
	 * 
	 * @param ownerId
	 * @return
	 */
	List<Owner> findbytelephone(String telephone);

	/**
	 * 
	 * @return
	 */
	Iterable<Owner> findAll();
}

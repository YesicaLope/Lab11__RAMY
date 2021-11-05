package com.tecsup.petclinic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.exception.OwnertNotFoundException;
import com.tecsup.petclinic.exception.PetNotFoundException;

@SpringBootTest
public class OwnerServiceTest {

	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceTest.class);

	@Autowired
	private OwnerService ownerService;

	/**
	 * @throws PetNotFoundException 
	 * 
	 */
	@Test
	public void testFindOwnerById() throws OwnertNotFoundException, PetNotFoundException {

		long ID = 1;
		String NAME = "Jaime";
		Owner owner = null;
		
		owner = ownerService.findById(ID);
		logger.info("" + owner);

		assertEquals(NAME, owner.getFirstname());

	}
	
}


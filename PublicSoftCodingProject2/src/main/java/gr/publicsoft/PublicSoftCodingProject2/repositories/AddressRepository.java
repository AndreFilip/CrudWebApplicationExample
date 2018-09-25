package gr.publicsoft.PublicSoftCodingProject2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.publicsoft.PublicSoftCodingProject2.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
	Address findByAddressUnumbered(String addressUnumbered);
	Address findByNumber(String number);

}

package gr.publicsoft.PublicSoftCodingProject2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.publicsoft.PublicSoftCodingProject2.model.Address;
import gr.publicsoft.PublicSoftCodingProject2.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address findByAddressUnumbered (String addressUnumbered) {
		return addressRepository.findByAddressUnumbered(addressUnumbered);
	}
	
	public Address findByNumber (String number) {
		return addressRepository.findByNumber(number);
	}


}

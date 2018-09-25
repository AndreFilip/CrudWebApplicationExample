package gr.publicsoft.PublicSoftCodingProject2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.publicsoft.PublicSoftCodingProject2.model.Address;
import gr.publicsoft.PublicSoftCodingProject2.model.Supplier;
import gr.publicsoft.PublicSoftCodingProject2.repositories.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository supplierRepository;
	
	public Iterable<Supplier> findAllSuppliers() {
		return supplierRepository.findAll();
	}
	
	public Supplier saveSupplier(Supplier supplier) {
		return supplierRepository.save(supplier);
	}	

	public void deleteSupplier (Supplier supplier) {
		supplierRepository.delete(supplier);
	}	
	
	public void	deleteAllSuppliers() {
		supplierRepository.deleteAll();
	}

	public Long	deleteSupplierById(Long id) {
		try {
			supplierRepository.deleteById(id);
			return id;
		} catch (Exception e) {
			return (long) -1;
		}
	}

	public Optional<Supplier> findSupplierById(Long id) {
		return supplierRepository.findById(id);
	}	
	
	public List<Supplier> findByContainingString(String containingString) {
		
		List<Supplier> suppliers1 = Stream.concat(supplierRepository.findByLastnameContaining(containingString).stream(),
			supplierRepository.findByFirstnameContaining(containingString).stream()).distinct().collect(Collectors.toList());
		List<Supplier> suppliers2 = Stream.concat(supplierRepository.findByCompanynameContaining(containingString).stream(),
			supplierRepository.findByVatContaining(containingString).stream()).distinct().collect(Collectors.toList());
		List<Supplier> suppliers3 = Stream.concat(supplierRepository.findByIrsContaining(containingString).stream(),
				supplierRepository.findByCityContaining(containingString).stream()).distinct().collect(Collectors.toList());
		List<Supplier> suppliers4 = Stream.concat(supplierRepository.findByCountryContaining(containingString).stream(),
				supplierRepository.findByAddress_addressUnumberedContaining(containingString).stream()).distinct().collect(Collectors.toList());
		
		List<Supplier> suppliers5 = Stream.concat(suppliers1.stream(),suppliers2.stream()).distinct().collect(Collectors.toList());
		List<Supplier> suppliers6 = Stream.concat(suppliers3.stream(),suppliers4.stream()).distinct().collect(Collectors.toList());

		List<Supplier> suppliers = Stream.concat(suppliers5.stream(),suppliers6.stream()).distinct().collect(Collectors.toList());
		
		return suppliers;
	}	

}

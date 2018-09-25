package gr.publicsoft.PublicSoftCodingProject2.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.publicsoft.PublicSoftCodingProject2.model.Supplier;
import gr.publicsoft.PublicSoftCodingProject2.services.SupplierService;

@CrossOrigin
@RestController
@RequestMapping("/suppliers")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;	
	
	
	@GetMapping
	public Iterable<Supplier> findAllSuppliers() {
		return supplierService.findAllSuppliers();
	}	
	
	@GetMapping("/{id}")
	public Optional<Supplier> findSupplierById(@PathVariable Long id) {
		return supplierService.findSupplierById(id);
	}
	
	@PostMapping
	public Supplier saveSupplier(@RequestBody Supplier supplier) {
		return supplierService.saveSupplier(supplier);
	}
	
	@PutMapping
	public Supplier updateSupplier(@RequestBody Supplier supplier) {
		return supplierService.saveSupplier(supplier);
	}
	
	@DeleteMapping("/{id}")
	public Long deleteSupplierById(@PathVariable Long id) {
		return supplierService.deleteSupplierById(id);
	}
	
	@DeleteMapping
	public void	deleteAllSuppliers() {
		supplierService.deleteAllSuppliers();
	}
	
	@GetMapping("/bystring/{containingString}")
	public List<Supplier> findByContainingString(@PathVariable String containingString) {
		return supplierService.findByContainingString(containingString);
	}
	

}

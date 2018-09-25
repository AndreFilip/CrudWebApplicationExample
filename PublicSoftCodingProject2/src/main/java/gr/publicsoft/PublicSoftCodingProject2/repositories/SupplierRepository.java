package gr.publicsoft.PublicSoftCodingProject2.repositories;

import gr.publicsoft.PublicSoftCodingProject2.model.Supplier;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {
	
	List<Supplier> findByLastname(String lastname);
	List<Supplier> findByLastnameContaining(String lastnameContaining);

	List<Supplier> findByFirstname(String firstname);
	List<Supplier> findByFirstnameContaining(String firstnameContaining);

	List<Supplier> findByCompanyname(String companyname);
	List<Supplier> findByCompanynameContaining(String companynameContaining);

	List<Supplier> findByVat(String vat);
	List<Supplier> findByVatContaining(String vatContaining);

	List<Supplier> findByIrs(String irs);
	List<Supplier> findByIrsContaining(String irsContaining);

	List<Supplier> findByCity(String city);
	List<Supplier> findByCityContaining(String cityContaining);

	List<Supplier> findByCountry(String country);
	List<Supplier> findByCountryContaining(String countryContaining);

	List<Supplier> findByAddress_addressUnumbered(String addressUnumbered);
	List<Supplier> findByAddress_addressUnumberedContaining(String addressUnumberedContaining);

	List<Supplier> findByAddress_number(String number);	

}

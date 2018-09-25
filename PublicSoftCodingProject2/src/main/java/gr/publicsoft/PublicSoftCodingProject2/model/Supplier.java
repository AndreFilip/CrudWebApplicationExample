package gr.publicsoft.PublicSoftCodingProject2.model;

import gr.publicsoft.PublicSoftCodingProject2.model.Address;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Supplier {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 public Long id;
	 public String firstname;
	 public String lastname;
	 public String companyname;	
	 public String vat;
	 public String irs;
	 public String city;
	 public String country;
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "address_id")
	 public Address address;
	 
	 public Supplier() {}
	 
	 public Supplier(String firstname, String lastname, String companyname, String vat, String irs, String city,
			String country, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.companyname = companyname;
		this.vat = vat;
		this.irs = irs;
		this.city = city;
		this.country = country;
		this.address = address;
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getIrs() {
		return irs;
	}

	public void setIrs(String irs) {
		this.irs = irs;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}

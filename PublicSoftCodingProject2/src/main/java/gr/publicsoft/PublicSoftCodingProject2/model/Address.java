package gr.publicsoft.PublicSoftCodingProject2.model;

import gr.publicsoft.PublicSoftCodingProject2.model.Supplier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 public Long id;
	 public String addressUnumbered;
	 public String number;

	 
	 public Address() { }		 
	 
	 public Address(String addressUnumbered, String number) {
		this.addressUnumbered = addressUnumbered;
		this.number = number;
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressUnumbered() {
		return addressUnumbered;
	}

	public void setAddressUnumbered(String addressUnumbered) {
		this.addressUnumbered = addressUnumbered;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	} 


}

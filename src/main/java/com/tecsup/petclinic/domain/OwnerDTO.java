package com.tecsup.petclinic.domain;

/**
 * 
 * @author jgomezm
 *
 */
public class OwnerDTO {

	private long id;
	
	private String firstname;
	
	private String lastname;

	private String address;

	private String city;
	
	private String telephone;

	public OwnerDTO(long id, String firstname, String lastname, String address, String city, String telephone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}
	
	public long getId() {
			return id;
		}
	
		public void setId(long id) {
			this.id = id;
		}
	
		public String getFirstname() {
			return firstname;
		}
	
		public void setFirstname(String first_name) {
			this.firstname = first_name;
		}
	
		public String getLastname() {
			return lastname;
		}
	
		public void setLast_name(String last_name) {
			this.lastname = last_name;
		}
	
		public String getAddress() {
			return address;
		}
	
		public void setAddress(String address) {
			this.address = address;
		}
	
		public String getCity() {
			return city;
		}
	
		public void setCity(String city) {
			this.city = city;
		}
	
		public String getTelephone() {
			return telephone;
		}
	
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		
	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + "]";
	}

}



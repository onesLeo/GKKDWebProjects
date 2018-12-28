package spittr.data;

import java.math.BigDecimal;
import java.util.Date;

public class Users  {

	private Integer unUsers;
	private String firstName;
	private String middleName;
	private String lastName;
	private String password;
	private Date dob;
	private String address;
	private String city;
	private int postCode;
	private String phoneNumber;
	private String username;
	private String email;
	private Integer ic_number;
	private Date dateChange;
	private String modifierUser;
	private char isActive;
	private String[] roles;
	
	public Users(String username, String password, String... roles) {
		this.firstName = username;
		this.password = password;
		this.roles = roles;
	}
	
	public Users(Integer unUser, String username,String password, String firstname, String lastName,String email) {
		this.unUsers = unUser;
		this.username = username;
		this.password=password;
		this.firstName= firstname;
		this.lastName = lastName;
		this.email = email;
	}
	

	public Integer getUnUsers() {
		return unUsers;
	}

	public void setUnUsers(Integer unUsers) {
		this.unUsers = unUsers;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIc_number() {
		return ic_number;
	}

	public void setIc_number(Integer ic_number) {
		this.ic_number = ic_number;
	}

	public Date getDateChange() {
		return dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	public String getModifierUser() {
		return modifierUser;
	}

	public void setModifierUser(String modifierUser) {
		this.modifierUser = modifierUser;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	
	
}

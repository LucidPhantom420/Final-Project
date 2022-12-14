//Dani Mayorga (dmayorga6@toromail.csudh.edu)
//Sathwika Reddy Nevoori (snevoori1@toromail.csudh.edu)
public class Customer {
	
	String firstName;
	String lastName;
	String emailAddress;
	String socialSecurityNumber;
	
	public Customer(String nameInput, String lastNameinput, String emailAddress, String socialSecurityNumber) {
		this.firstName = nameInput;
		this.lastName = lastNameinput;
		this.emailAddress = emailAddress;
		this.socialSecurityNumber = socialSecurityNumber;
		
		
		
		
		
	}
	public String getfirstName() {
		return firstName;
		
	}
	public String getlastName() {
		return lastName;
	}
	public String getemailAddress() {
		return emailAddress;
		
	}
	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
		
		
	}

}

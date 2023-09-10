package Model;


import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User{
	
       private String customerName;
       private String customerAddress;
       private long customerPhone;
       private LocalDate customerDob;
       private String customerGender;
      public Customer(){
    	  
      }
       
       
	public Customer(String userName, String password, String customerName, String customerAddress, long customerPhone, LocalDate customerDob,
			String customerGender) {
		super(userName, password);
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customerDob = customerDob;
		this.customerGender = customerGender;
	
       

}



	public String getCustomerName() {
		return customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public long getCustomerPhone() {
		return customerPhone;
	}



	public LocalDate getCustomerDob() {
		return customerDob;
	}



	public String getCustomerGender() {
		return customerGender;
	}
}
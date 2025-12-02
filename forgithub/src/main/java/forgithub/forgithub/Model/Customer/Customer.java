package forgithub.forgithub.Model.Customer;


public class Customer {
	
	String Name;
	String Phone;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Customer(String name, String phone) {
		super();
		Name = name;
		Phone = phone;
	}
	
}

package customers;

public class CustomerService implements ICustomerService {
	/*
	 * The application provided has a CustomerService class with an injected
	 * reference to the EmailSender class and an injected reference to the
	 * CustomerDAO class.
	 */
	private ICustomerDAO customerDAO;
	private IEmailSender emailSender;

	public void setCustomerDAO(ICustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public void setEmailSender(IEmailSender emailSender) {
		this.emailSender = emailSender;
	}

	/*
	 * When addCustomer() is called on the CustomerService class, it creates a
	 * Customer object and a corresponding Address object. The Customer is then
	 * saved to the database by the CustomerService by calling the save() method
	 * on the CustomerDAO, and an email is sent to the customer by calling the
	 * sendEmail() method on the EmailSender
	 */

	public void addCustomer(String name, String email, String street, String city, String zip) {
		Customer customer = new Customer(name, email);
		Address address = new Address(street, city, zip);
		customer.setAddress(address);
		customerDAO.save(customer);
		emailSender.sendEmail(email, "Welcome " + name + " as a new customer");
	}
}

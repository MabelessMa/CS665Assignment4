package edu.bu.met.cs665.assignment4;

public class CustomerDataViaHttpsImpl implements CustomerDataViaHttps {

	@Override
	public void printCustomer(int customerId) {
		// TODO Auto-generated method stub
		 System.out.println("Printing customer details via HTTPS for customer ID: " + customerId);
	}

	@Override
	public Customer getCustomerViaHttps(int customerId) {
		// TODO Auto-generated method stub
		return new Customer(customerId, "Customer" + customerId);
	}
}

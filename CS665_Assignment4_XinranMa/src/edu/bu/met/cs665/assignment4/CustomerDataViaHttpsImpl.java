package edu.bu.met.cs665.assignment4;

/**
 * New System Implementation
 * This class implements the CustomerDataViaHttps interface, simulating data retrieval via HTTPS.
 */
public class CustomerDataViaHttpsImpl implements CustomerDataViaHttps {

    @Override
    public void printCustomer(int customerId) {
        // Simulate printing customer details via HTTPS
        System.out.println("Printing customer details via HTTPS for customer ID: " + customerId);
    }

    @Override
    public Customer getCustomerViaHttps(int customerId) {
        // Simulate retrieving customer data via HTTPS
        return new Customer(customerId, "Customer" + customerId);
    }
}

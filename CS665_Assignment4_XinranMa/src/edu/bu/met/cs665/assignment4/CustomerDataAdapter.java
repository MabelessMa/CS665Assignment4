package edu.bu.met.cs665.assignment4;

/**
 * Adapter Class
 * This class acts as an adapter, implementing the legacy interface (CustomerDataViaUsb)
 * but internally using the new system interface (CustomerDataViaHttps) to retrieve data.
 */
public class CustomerDataAdapter implements CustomerDataViaUsb {
    private CustomerDataViaHttps newSystem; // Reference to the new system interface

    /**
     * Constructor to initialize the adapter with an instance of the new system.
     * @param newSystem An instance of the new system implementing CustomerDataViaHttps.
     */
    public CustomerDataAdapter(CustomerDataViaHttps newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public void printCustomer(int customerId) {
        // Delegate print operation to the new system
        newSystem.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        // Delegate data retrieval to the new system
        return newSystem.getCustomerViaHttps(customerId);
    }
}

package edu.bu.met.cs665.assignment4;

public class CustomerDataAdapter implements CustomerDataViaUsb {
    private CustomerDataViaHttps newSystem;

    public CustomerDataAdapter(CustomerDataViaHttps newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public void printCustomer(int customerId) {
        newSystem.printCustomer(customerId);
    }

    @Override
    public Customer getCustomerViaUsb(int customerId) {
        return newSystem.getCustomerViaHttps(customerId);
    }
}

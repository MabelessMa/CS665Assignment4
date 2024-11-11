package edu.bu.met.cs665.assignment4;

/**
 * New System Interface
 * This interface defines methods for accessing customer data via HTTPS.
 */
public interface CustomerDataViaHttps {

    /**
     * Prints the details of a customer with the given ID.
     * @param customerId The ID of the customer to print.
     */
    void printCustomer(int customerId);

    /**
     * Retrieves a customer object with the given ID.
     * @param customerId The ID of the customer to retrieve.
     * @return Customer object containing customer details.
     */
    Customer getCustomerViaHttps(int customerId);
}

package edu.bu.met.cs665.assignment4;

/**
 * Customer Data Class
 * Represents customer information, including an ID and name.
 */
public class Customer {
    private int id;         // The ID of the customer
    private String name;    // The name of the customer

    /**
     * Constructor to initialize a customer with an ID and name.
     * @param id The ID of the customer.
     * @param name The name of the customer.
     */
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the ID of the customer.
     * @return The ID of the customer.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the name of the customer.
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string representation of the customer.
     * @return String with customer ID and name.
     */
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }
}

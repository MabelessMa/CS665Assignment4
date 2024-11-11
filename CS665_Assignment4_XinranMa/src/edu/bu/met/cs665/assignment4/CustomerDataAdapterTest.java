package edu.bu.met.cs665.assignment4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit Test Class for CustomerDataAdapter
 * This class contains unit tests to verify the functionality of the adapter.
 */
public class CustomerDataAdapterTest {

    private CustomerDataViaHttps newSystem;     // Reference to the new system
    private CustomerDataViaUsb adapter;         // Adapter instance

    /**
     * Setup method to initialize instances before each test.
     */
    @BeforeEach
    public void setUp() {
        // Initialize new system implementation and adapter
        newSystem = new CustomerDataViaHttpsImpl();
        adapter = new CustomerDataAdapter(newSystem);
    }

    /**
     * Test to verify that the adapter initializes correctly.
     */
    @Test
    public void testCustomerDataAdapter() {
        assertNotNull(adapter, "Adapter should be initialized");
    }

    /**
     * Test to verify that the printCustomer method works correctly.
     */
    @Test
    public void testPrintCustomer() {
        adapter.printCustomer(1); // Check output manually to verify functionality
    }

    /**
     * Test to verify that customer data can be retrieved via the adapter.
     */
    @Test
    public void testGetCustomerViaUsb() {
        Customer customer = adapter.getCustomerViaUsb(1);
        assertNotNull(customer, "Customer should not be null");
        assertEquals(1, customer.getId(), "Customer ID should match");
        assertEquals("Customer1", customer.getName(), "Customer name should match");
    }
}

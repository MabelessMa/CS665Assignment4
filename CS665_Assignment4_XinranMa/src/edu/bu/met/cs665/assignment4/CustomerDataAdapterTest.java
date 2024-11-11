package edu.bu.met.cs665.assignment4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CustomerDataAdapterTest {

    private CustomerDataViaHttps newSystem;
    private CustomerDataViaUsb adapter;

    @BeforeEach
    public void setUp() {
        // 使用新系统的具体实现，并通过适配器适配成旧系统接口
        newSystem = new CustomerDataViaHttpsImpl();
        adapter = new CustomerDataAdapter(newSystem);
    }

    @Test
    public void testPrintCustomer() {
        // 测试printCustomer方法是否正常工作
        adapter.printCustomer(1); // 验证输出
    }

    @Test
    public void testGetCustomerViaUsb() {
        // 测试通过适配器获取客户数据
        Customer customer = adapter.getCustomerViaUsb(1);
        assertNotNull(customer);
        assertEquals(1, customer.getId());
        assertEquals("Customer1", customer.getName());
    }
}

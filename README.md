# CS665Assignment4

## Project Overview
This project aims to integrate the customer data interfaces of an old system and a new system, allowing the old system to access customer data through the new system’s interface. The company currently has two different systems to access customer data:

Legacy System: Connects to external disks via USB and accesses binary files to retrieve data.

New System: Uses HTTPS and a REST API to access customer data from an external server.

This project uses the Adapter Design Pattern to adapt the interfaces of the old and new systems. The adapter allows the legacy system to access customer data through the new system's API without modifying the legacy code.

## Features
Interface Adapter: Uses the Adapter Design Pattern to bridge the legacy system interface (CustomerDataViaUsb) to the new system interface (CustomerDataViaHttps), allowing the legacy system to access data from the new system.

Mock Data: Uses mock objects to simulate customer data during testing.

Unit Testing: JUnit 5 tests to verify the functionality of the adapter class.

## Key Classes and Interfaces
CustomerDataViaUsb: Interface for the legacy system, providing printCustomer and getCustomerViaUsb methods.

CustomerDataViaHttps: Interface for the new system, providing printCustomer and getCustomerViaHttps methods.

CustomerDataAdapter: Adapter class that implements the legacy system interface but delegates calls to the new system interface.

Customer: Customer data class representing customer information.

CustomerDataAdapterTest: JUnit test class to validate the functionality of the adapter class.

## Design Pattern
Adapter Pattern: Transforms the interface of one system to be compatible with another system's interface, allowing the legacy system to access data through the new system's API seamlessly.

## Usage
### Prerequisites

Java 8 or higher

JUnit 5 (JUnit JAR files should be added to the project's lib directory)

## Test Cases
This project includes the following test cases to validate the adapter’s functionality:

testCustomerDataAdapter: Verifies that the adapter is initialized correctly.

testPrintCustomer: Tests that the printCustomer method works as expected.

testGetCustomerViaUsb: Tests the functionality of retrieving customer data via the adapter.

## Github Link
https://github.com/MabelessMa/CS665Assignment4

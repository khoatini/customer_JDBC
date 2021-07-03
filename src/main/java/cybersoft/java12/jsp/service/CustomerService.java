package cybersoft.java12.jsp.service;

import java.util.LinkedList;
import java.util.List;

import cybersoft.java12.jsp.model.Customer;
import cybersoft.java12.jsp.repository.CustomerRepository;

public class CustomerService {
	private List<Customer> customers;
	private CustomerRepository repository;
	
	public CustomerService() {

		repository = new CustomerRepository();
		customers = new LinkedList<Customer>();
		
		customers.add(new Customer(1, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(2, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(3, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(4, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(5, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(6, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(7, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(8, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		customers.add(new Customer(9, "VIP CUSTOMER", "police@gov.kt", "ISIS HQ"));
		
	}
	
	/*
	 * thuc hien code cac chuc nang sau
	 * - findallCustomer: tra ve danh sach customer dangquan ly
	 * - findcustomerbycode: tra ve customer co code bang voi tham so dc truyen vao
	 * - deletecustome: Xoa customer co ma code bang voi tham so duoc truyen vao 
	 * 	
	
	 * 	
	 * */
	
	public List<Customer> findAllCustomers(){
		return repository.findAllCustomer();
	}
	
	public Customer findCustomerByCode(int code) {
		return repository.findCustomerByCode(code);
	}
	
	public int deleteCustomerByCode(int code) {
		return repository.deleteCustomerByCode(code);
	}
	
	
	public int addNewCustomer(Customer customer) {
		return repository.addNewCustomer(customer); 
	}

	public int update(Customer customerToUpdate, int codeToUpdate) {
		return repository.updateCustomer(customerToUpdate, codeToUpdate);
	}
	
}

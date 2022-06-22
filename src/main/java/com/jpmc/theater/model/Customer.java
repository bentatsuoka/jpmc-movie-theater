package com.jpmc.theater.model;

import java.util.Objects;

public class Customer {

    private String name;

    private String id;

    /**
     * @param name customer name
     * @param id customer id
     */
    public Customer(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
    public boolean equals(Object o) {
    	if (o == null) return false;
    	if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}
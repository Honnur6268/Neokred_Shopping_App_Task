package com.shop.dto;

import java.util.List;

import com.shop.entity.ShoppingCart;

public class OrderDTO {

	private String orderDescription;
    private List<ShoppingCart> cartItems;
    private String customerEmail;
    private String customerName;
    private String customerPassword;

    public OrderDTO() {
    }

    public OrderDTO(String orderDescription, List<ShoppingCart> cartItems, String customerEmail, String customerName, String customerPassword) {
        this.orderDescription = orderDescription;
        this.cartItems = cartItems;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public List<ShoppingCart> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<ShoppingCart> cartItems) {
        this.cartItems = cartItems;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    

    public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderDescription=" + orderDescription + ", cartItems=" + cartItems + ", customerEmail="
				+ customerEmail + ", customerName=" + customerName + ", customerPassword=" + customerPassword + "]";
	}
}

/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Invoice_Line.
 * 
 * @author alu20924612v
 */
public class Invoice_Line {
	/**
	 * Description of the property identifier.
	 */
	private Integer identifier = Integer.valueOf(0);

	/**
	 * Description of the property applyDiscount.
	 */
	private Boolean applyDiscount = Boolean.FALSE;

	/**
	 * Description of the property totalAmount.
	 */
	private double totalAmount = 0;

	/**
	 * Description of the property datePurchase.
	 */
	private Boolean datePurchase = Boolean.FALSE;

	/**
	 * Description of the property invoices.
	 */
	public HashSet<Invoice> invoices = new HashSet<Invoice>();

	/**
	 * Description of the property products.
	 */
	public HashSet<Product> products = new HashSet<Product>();

	// Start of user code (user defined attributes for Invoice_Line)

	// End of user code

	/**
	 * The constructor.
	 */
	public Invoice_Line() {
		// Start of user code constructor for Invoice_Line)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Invoice_Line)

	// End of user code
	/**
	 * Returns identifier.
	 * @return identifier 
	 */
	public Integer getIdentifier() {
		return this.identifier;
	}

	/**
	 * Sets a value to attribute identifier. 
	 * @param newIdentifier 
	 */
	public void setIdentifier(Integer newIdentifier) {
		this.identifier = newIdentifier;
	}

	/**
	 * Returns applyDiscount.
	 * @return applyDiscount 
	 */
	public Boolean getApplyDiscount() {
		return this.applyDiscount;
	}

	/**
	 * Sets a value to attribute applyDiscount. 
	 * @param newApplyDiscount 
	 */
	public void setApplyDiscount(Boolean newApplyDiscount) {
		this.applyDiscount = newApplyDiscount;
	}

	/**
	 * Returns totalAmount.
	 * @return totalAmount 
	 */
	public double getTotalAmount() {
		return this.totalAmount;
	}

	/**
	 * Sets a value to attribute totalAmount. 
	 * @param newTotalAmount 
	 */
	public void setTotalAmount(double newTotalAmount) {
		this.totalAmount = newTotalAmount;
	}

	/**
	 * Returns datePurchase.
	 * @return datePurchase 
	 */
	public Boolean getDatePurchase() {
		return this.datePurchase;
	}

	/**
	 * Sets a value to attribute datePurchase. 
	 * @param newDatePurchase 
	 */
	public void setDatePurchase(Boolean newDatePurchase) {
		this.datePurchase = newDatePurchase;
	}

	/**
	 * Returns invoices.
	 * @return invoices 
	 */
	public HashSet<Invoice> getInvoices() {
		return this.invoices;
	}

	/**
	 * Returns products.
	 * @return products 
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

}

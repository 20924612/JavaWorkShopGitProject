/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Invoice.
 * 
 * @author alu20924612v
 */
public class Invoice {
	/**
	 * Description of the property identifier.
	 */
	private Integer identifier = Integer.valueOf(0);

	/**
	 * Description of the property applyDiscount.
	 */
	private Boolean applyDiscount = Boolean.FALSE;

	/**
	 * Description of the property invoice_Lines.
	 */
	public HashSet<Invoice_Line> invoice_Lines = new HashSet<Invoice_Line>();

	/**
	 * Description of the property clients.
	 */
	public HashSet<Client> clients = new HashSet<Client>();

	/**
	 * Description of the property totalAmount.
	 */
	private double totalAmount = 0;

	/**
	 * Description of the property datePurchase.
	 */
	private Boolean datePurchase = Boolean.FALSE;

	// Start of user code (user defined attributes for Invoice)

	// End of user code

	/**
	 * The constructor.
	 */
	public Invoice() {
		// Start of user code constructor for Invoice)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Invoice)

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
	 * Returns invoice_Lines.
	 * @return invoice_Lines 
	 */
	public HashSet<Invoice_Line> getInvoice_Lines() {
		return this.invoice_Lines;
	}

	/**
	 * Returns clients.
	 * @return clients 
	 */
	public HashSet<Client> getClients() {
		return this.clients;
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

}

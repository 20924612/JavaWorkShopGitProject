/*******************************************************************************
 * 2018, All rights reserved.
 *******************************************************************************/
package main.workshopgitproject.classes;

import java.util.HashSet;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author alu20924612v
 */
public class Product {
	/**
	 * Description of the property invoice_Lines.
	 */
	public HashSet<Invoice_Line> invoice_Lines = new HashSet<Invoice_Line>();

	/**
	 * Description of the property price.
	 */
	private double price = 0;

	/**
	 * Description of the property suplierName.
	 */
	private String suplierName = "";

	/**
	 * Description of the property stock.
	 */
	private Integer stock = Integer.valueOf(0);

	/**
	 * Description of the property identifier.
	 */
	public Integer identifier = Integer.valueOf(0);

	/**
	 * Description of the property description.
	 */
	private String description = "";

	/**
	 * Description of the property suplientD.
	 */
	private String suplientD = "";

	// Start of user code (user defined attributes for Product)

	// End of user code

	/**
	 * The constructor.
	 */
	public Product() {
		// Start of user code constructor for Product)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Product)

	// End of user code
	/**
	 * Returns invoice_Lines.
	 * @return invoice_Lines 
	 */
	public HashSet<Invoice_Line> getInvoice_Lines() {
		return this.invoice_Lines;
	}

	/**
	 * Returns price.
	 * @return price 
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Sets a value to attribute price. 
	 * @param newPrice 
	 */
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	/**
	 * Returns suplierName.
	 * @return suplierName 
	 */
	public String getSuplierName() {
		return this.suplierName;
	}

	/**
	 * Sets a value to attribute suplierName. 
	 * @param newSuplierName 
	 */
	public void setSuplierName(String newSuplierName) {
		this.suplierName = newSuplierName;
	}

	/**
	 * Returns stock.
	 * @return stock 
	 */
	public Integer getStock() {
		return this.stock;
	}

	/**
	 * Sets a value to attribute stock. 
	 * @param newStock 
	 */
	public void setStock(Integer newStock) {
		this.stock = newStock;
	}

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
	 * Returns description.
	 * @return description 
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets a value to attribute description. 
	 * @param newDescription 
	 */
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	/**
	 * Returns suplientD.
	 * @return suplientD 
	 */
	public String getSuplientD() {
		return this.suplientD;
	}

	/**
	 * Sets a value to attribute suplientD. 
	 * @param newSuplientD 
	 */
	public void setSuplientD(String newSuplientD) {
		this.suplientD = newSuplientD;
	}

}

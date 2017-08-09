/**
 * 
 */
package com.backbase.model;

import java.io.Serializable;

/**
 * @author Vaidyanath Rajpoot
 *
 */
public class Other_account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2697987620295050323L;

	private String id;

    private Holder holder;

    private String number;

    private String kind;

    private String IBAN;

    private String swift_bic;

    private Bank bank;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the holder
	 */
	public Holder getHolder() {
		return holder;
	}

	/**
	 * @param holder the holder to set
	 */
	public void setHolder(Holder holder) {
		this.holder = holder;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * @return the iBAN
	 */
	public String getIBAN() {
		return IBAN;
	}

	/**
	 * @param iBAN the iBAN to set
	 */
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	/**
	 * @return the swift_bic
	 */
	public String getSwift_bic() {
		return swift_bic;
	}

	/**
	 * @param swift_bic the swift_bic to set
	 */
	public void setSwift_bic(String swift_bic) {
		this.swift_bic = swift_bic;
	}

	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}

    

}

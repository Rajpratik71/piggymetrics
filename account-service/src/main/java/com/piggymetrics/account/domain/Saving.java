package com.piggymetrics.account.domain;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="saving")
public class Saving  implements java.io.Serializable{


	private static final long serialVersionUID = 6684675866816210401L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private BigDecimal amount;

	@Column
	@Enumerated(EnumType.STRING)
	private Currency currency;

	@Column
	private BigDecimal interest;

	@Column
	private Boolean deposit;

	@Column
	private Boolean capitalization;

	@OneToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name = "account_id")
	private Account account;

	public Saving(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Boolean getDeposit() {
		return deposit;
	}

	public void setDeposit(Boolean deposit) {
		this.deposit = deposit;
	}

	public Boolean getCapitalization() {
		return capitalization;
	}

	public void setCapitalization(Boolean capitalization) {
		this.capitalization = capitalization;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}

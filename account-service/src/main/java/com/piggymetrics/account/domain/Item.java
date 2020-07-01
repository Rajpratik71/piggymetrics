package com.piggymetrics.account.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="item")
public class Item implements java.io.Serializable{


	private static final long serialVersionUID = -5447477886745371470L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String title;

	@Column
	private BigDecimal amount;

	@Column
	@Enumerated(EnumType.STRING)
	private Currency currency;

	@Column
	@Enumerated(EnumType.STRING)
	private TimePeriod period;

	@Column
	private String icon;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	public Item(){}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public TimePeriod getPeriod() {
		return period;
	}

	public void setPeriod(TimePeriod period) {
		this.period = period;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}

package com.exchange.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.exchange.api.util.UUIDHelper;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Exchange {
	@Id
	@GeneratedValue
	public int id;
	public double amount;
	public String currency_in;
	public String currency_out;
	public double amount_converted;
	public String create_date;

	public Exchange(double amount, String currency_in, String currency_out, double amount_converted, String create_date) {
		this.id = UUIDHelper.getId();
		this.amount = amount;
		this.currency_in = currency_in;
		this.currency_out = currency_out;
		this.amount_converted = amount_converted;
		this.create_date = create_date;
	}
}

package com.exchange.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class ExchangeRate {
    @Id
    @GeneratedValue
    public int id;
    public String label;
    public String description;
    public double usd_rate;
    public double eur_rate;
    public double pen_rate;
    public double mxn_rate;
    public double jpy_rate;
    public double gbp_rate;
    public String created_date;
    public String created_by;
    public String modified_date;
    public String modified_by;

    public ExchangeRate(String label, String description, double usd_rate, double eur_rate, double pen_rate, double mxn_rate, double jpy_rate, double gbp_rate, String created_date, String created_by) {
        this.label = label;
        this.description = description;
        this.usd_rate = usd_rate;
        this.eur_rate = eur_rate;
        this.pen_rate = pen_rate;
        this.mxn_rate = mxn_rate;
        this.jpy_rate = jpy_rate;
        this.gbp_rate = gbp_rate;
        this.created_date = created_date;
        this.created_by = created_by;
    }
}

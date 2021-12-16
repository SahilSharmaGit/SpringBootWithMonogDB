package com.rk.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	/*
	@Id type must be String only. Integer, Double… not accepted. It is UUID (Hexa
			Decimal value) which can be stored in string Datatype only.*/
	@Id
	private String id;
	private Integer prodId;
	private String prodName;
	private Double prodCost;

		public Product(Integer prodId, String prodName, Double prodCost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		}

}

package com.corunet.comercioelectronico.rest.dtos;


import com.corunet.comercioelectronico.model.entities.Prices;

public class PricesConversor {

	private PricesConversor() {
	}

	public static final PricesDto toPricesDto(Prices prices) {
		return new PricesDto(prices.getBrandId(), prices.getStartDate(),
				prices.getEndDate(), prices.getPriceList(),
				prices.getProductId(), prices.getPrice(), prices.getCurr());
	}
}

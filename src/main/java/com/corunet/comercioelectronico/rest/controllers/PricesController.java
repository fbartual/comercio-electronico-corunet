package com.corunet.comercioelectronico.rest.controllers;

import com.corunet.comercioelectronico.model.entities.Prices;
import com.corunet.comercioelectronico.model.services.PricesService;
import com.corunet.comercioelectronico.rest.dtos.PricesConversor;
import com.corunet.comercioelectronico.rest.dtos.PricesDto;
import com.corunet.comercioelectronico.rest.dtos.PricesParamsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;


@RestController
@RequestMapping("/api/prices")
public class PricesController {

	@Autowired
	private PricesService pricesService;

	@GetMapping("/")
	public PricesDto getPrices(@Validated @RequestBody PricesParamsDto params)
			throws InstanceNotFoundException {

		Prices price = pricesService.consultPrice(params.getDate(),
				params.getProductId(), params.getBrandId());

		return PricesConversor.toPricesDto(price);

	}
}

package com.corunet.comercioelectronico.model.services;

import com.corunet.comercioelectronico.model.entities.Prices;

import javax.management.InstanceNotFoundException;
import java.time.LocalDateTime;

public interface PricesService {

	Prices consultPrice(LocalDateTime date, Long productId, Long brandId)
			throws InstanceNotFoundException;

}

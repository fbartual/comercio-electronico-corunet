package com.corunet.comercioelectronico.model.services;

import com.corunet.comercioelectronico.model.entities.Prices;
import com.corunet.comercioelectronico.model.entities.PricesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.InstanceNotFoundException;
import java.time.LocalDateTime;
import java.util.Optional;


@Service
@Transactional
public class PricesServiceImpl implements PricesService {

	@Autowired
	private PricesDao pricesDao;

	@Override
	@Transactional(readOnly = true)
	public Prices consultPrice(LocalDateTime date, Long productId, Long brandId)
			throws InstanceNotFoundException {
		Optional<Prices> price = pricesDao.findPrice(date, productId, brandId);
		if (price.isEmpty()){
			throw new InstanceNotFoundException();
		}
		return price.get();

	}

}

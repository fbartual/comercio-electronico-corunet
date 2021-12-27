package com.corunet.comercioelectronico.rest.dtos;

import com.sun.istack.NotNull;

import java.time.LocalDateTime;

public class PricesParamsDto {

	private Long brandId;
	private LocalDateTime date;
	private Long productId;

	public PricesParamsDto(Long brandId, LocalDateTime date, Long productId) {
		this.brandId = brandId;
		this.date = date;
		this.productId = productId;
	}

	@NotNull()
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	@NotNull()
	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@NotNull()
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}

package com.corunet.comercioelectronico.rest.dtos;

import java.time.LocalDateTime;

public class PricesDto {

	private Long brandId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long priceList;
	private Long productId;
	private double price;
	private String curr;

	public PricesDto(Long brandId, LocalDateTime startDate,
					 LocalDateTime endDate, Long priceList, Long productId,
					 double price, String curr) {
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.priceList = priceList;
		this.productId = productId;
		this.curr = curr;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getPriceList() {
		return priceList;
	}

	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
}

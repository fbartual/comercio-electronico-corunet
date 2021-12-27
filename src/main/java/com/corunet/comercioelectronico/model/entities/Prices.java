package com.corunet.comercioelectronico.model.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Prices")
public class Prices {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long brandId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Long priceList;
	private Long productId;
	private int priority;
	private double price;
	private String curr;

	public Prices() {

	}

	public Prices (Long brandId, LocalDateTime startDate, LocalDateTime endDate,
				   Long priceList, Long productId, int priority, double price,
				   String curr) {
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.curr = curr;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	public Long getId() {
		return id;
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

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Prices prices = (Prices) o;
		return priority == prices.priority &&
				Double.compare(prices.price, price) == 0 &&
				Objects.equals(brandId, prices.brandId) &&
				Objects.equals(startDate, prices.startDate) &&
				Objects.equals(endDate, prices.endDate) &&
				Objects.equals(priceList, prices.priceList) &&
				Objects.equals(productId, prices.productId) &&
				Objects.equals(curr, prices.curr);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandId, startDate, endDate, priceList, productId,
				priority, price, curr);
	}

	@Override
	public String toString() {
		return "Prices{" +
				"brandId=" + brandId +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", priceList=" + priceList +
				", productId=" + productId +
				", priority=" + priority +
				", price=" + price +
				", curr='" + curr + '\'' +
				'}';
	}
}

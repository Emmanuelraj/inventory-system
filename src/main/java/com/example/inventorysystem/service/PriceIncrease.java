package com.example.inventorysystem.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PriceIncrease
{
	@NotNull
	@Max(value=50)
	@Min(value=1)
	private int percentage;

	/**
	 * @return the percentage
	 */
	public int getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PriceIncrease [percentage=" + percentage + "]";
	}
	
	
	
	
	
	
	

}

package org.objectCloning;

public class Insurance implements Cloneable{
	
	private String policyHolder;
	private String claimNumber;
	private Double premiumAmount;
	public Insurance(String policyHolder, String claimNumber, Double premiumAmount) {
		
		this.policyHolder = policyHolder;
		this.claimNumber = claimNumber;
		this.premiumAmount = premiumAmount;
	}
	public String getPolicyHolder() {
		return policyHolder;
	}
	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}
	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	@Override
	public String toString() {
		return "Insurance [policyHolder=" + policyHolder + ", claimNumber=" + claimNumber + ", premiumAmount="
				+ premiumAmount + "]";
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}

}

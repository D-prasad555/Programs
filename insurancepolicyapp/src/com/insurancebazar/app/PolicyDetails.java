package com.insurancebazar.app;

public class PolicyDetails
{
	private int policyId;
	private String insurancePolicyName;
	
	public PolicyDetails(int policyId, String insurancePolicyName) {
		super();
		this.policyId = policyId;
		this.insurancePolicyName = insurancePolicyName;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getInsurancePolicyName() {
		return insurancePolicyName;
	}

	public void setInsurancePolicyName(String insurancePolicyName) {
		this.insurancePolicyName = insurancePolicyName;
	}
	
	public String toString()
	{
		return "Policy id : "+policyId+"Insurance policy name : "+insurancePolicyName;
	}
}

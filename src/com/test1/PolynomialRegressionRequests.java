package com.test1;

public class PolynomialRegressionRequests {
	private Integer regressionSectionCode;
	private String polynomialRegressionApproval1;
	private String polynomialRegressionApprovalMessage1;
	private String polynomialRegressionApproval2;
	private String polynomialRegressionApprovalMessage2;
	private Integer dataPoints;
	private Integer dataPointsAggregate;
	private String linearRegression;
	private String xVariables;
	private String yVariables;
	private String variableRelationship;

	public PolynomialRegressionRequests() {

	}

	public PolynomialRegressionRequests(Integer regressionSectionCode, String polynomialRegressionApproval1,
			String polynomialRegressionApprovalMessage1, String polynomialRegressionApproval2,
			String polynomialRegressionApprovalMessage2, Integer dataPoints, Integer dataPointsAggregate,
			String linearRegression, String xVariables, String yVariables, String variableRelationship) {
		super();
		this.regressionSectionCode = regressionSectionCode;
		this.polynomialRegressionApproval1 = polynomialRegressionApproval1;
		this.polynomialRegressionApprovalMessage1 = polynomialRegressionApprovalMessage1;
		this.polynomialRegressionApproval2 = polynomialRegressionApproval2;
		this.polynomialRegressionApprovalMessage2 = polynomialRegressionApprovalMessage2;
		this.dataPoints = dataPoints;
		this.dataPointsAggregate = dataPointsAggregate;
		this.linearRegression = linearRegression;
		this.xVariables = xVariables;
		this.yVariables = yVariables;
		this.variableRelationship = variableRelationship;
	}

	public Integer getRegressionSectionCode() {
		return regressionSectionCode;
	}

	public void setRegressionSectionCode(Integer regressionSectionCode) {
		this.regressionSectionCode = regressionSectionCode;
	}

	public String getPolynomialRegressionApproval1() {
		return polynomialRegressionApproval1;
	}

	public void setPolynomialRegressionApproval1(String polynomialRegressionApproval1) {
		this.polynomialRegressionApproval1 = polynomialRegressionApproval1;
	}

	public String getPolynomialRegressionApprovalMessage1() {
		return polynomialRegressionApprovalMessage1;
	}

	public void setPolynomialRegressionApprovalMessage1(String polynomialRegressionApprovalMessage1) {
		this.polynomialRegressionApprovalMessage1 = polynomialRegressionApprovalMessage1;
	}

	public String getPolynomialRegressionApproval2() {
		return polynomialRegressionApproval2;
	}

	public void setPolynomialRegressionApproval2(String polynomialRegressionApproval2) {
		this.polynomialRegressionApproval2 = polynomialRegressionApproval2;
	}

	public String getPolynomialRegressionApprovalMessage2() {
		return polynomialRegressionApprovalMessage2;
	}

	public void setPolynomialRegressionApprovalMessage2(String polynomialRegressionApprovalMessage2) {
		this.polynomialRegressionApprovalMessage2 = polynomialRegressionApprovalMessage2;
	}

	public Integer getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(Integer dataPoints) {
		this.dataPoints = dataPoints;
	}

	public Integer getDataPointsAggregate() {
		return dataPointsAggregate;
	}

	public void setDataPointsAggregate(Integer dataPointsAggregate) {
		this.dataPointsAggregate = dataPointsAggregate;
	}

	public String getLinearRegression() {
		return linearRegression;
	}

	public void setLinearRegression(String linearRegression) {
		this.linearRegression = linearRegression;
	}

	public String getxVariables() {
		return xVariables;
	}

	public void setxVariables(String xVariables) {
		this.xVariables = xVariables;
	}

	public String getyVariables() {
		return yVariables;
	}

	public void setyVariables(String yVariables) {
		this.yVariables = yVariables;
	}

	public String getVariableRelationship() {
		return variableRelationship;
	}

	public void setVariableRelationship(String variableRelationship) {
		this.variableRelationship = variableRelationship;
	}

}

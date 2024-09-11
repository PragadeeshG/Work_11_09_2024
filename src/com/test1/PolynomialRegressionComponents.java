package com.test1;

public class PolynomialRegressionComponents {
	private Integer runBy;
	private String decisionTree;
	private String predictFrom;
	private String targetColumn;
	private String stages;
	private boolean hierarchicalClustering;
	private boolean clusteringDataPoint;
	private boolean clusterVisualizer;
	private String scatterPlot;
	private String bottomUpApproach;
	private Integer linkageMethod;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PolynomialRegressionComponents() {

	}

	public PolynomialRegressionComponents(Integer runBy, String decisionTree, String predictFrom, String targetColumn,
			String stages, boolean hierarchicalClustering, boolean clusteringDataPoint, boolean clusterVisualizer,
			String scatterPlot, String bottomUpApproach, Integer linkageMethod, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.runBy = runBy;
		this.decisionTree = decisionTree;
		this.predictFrom = predictFrom;
		this.targetColumn = targetColumn;
		this.stages = stages;
		this.hierarchicalClustering = hierarchicalClustering;
		this.clusteringDataPoint = clusteringDataPoint;
		this.clusterVisualizer = clusterVisualizer;
		this.scatterPlot = scatterPlot;
		this.bottomUpApproach = bottomUpApproach;
		this.linkageMethod = linkageMethod;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getRunBy() {
		return runBy;
	}

	public void setRunBy(Integer runBy) {
		this.runBy = runBy;
	}

	public String getDecisionTree() {
		return decisionTree;
	}

	public void setDecisionTree(String decisionTree) {
		this.decisionTree = decisionTree;
	}

	public String getPredictFrom() {
		return predictFrom;
	}

	public void setPredictFrom(String predictFrom) {
		this.predictFrom = predictFrom;
	}

	public String getTargetColumn() {
		return targetColumn;
	}

	public void setTargetColumn(String targetColumn) {
		this.targetColumn = targetColumn;
	}

	public String getStages() {
		return stages;
	}

	public void setStages(String stages) {
		this.stages = stages;
	}

	public boolean isHierarchicalClustering() {
		return hierarchicalClustering;
	}

	public void setHierarchicalClustering(boolean hierarchicalClustering) {
		this.hierarchicalClustering = hierarchicalClustering;
	}

	public boolean isClusteringDataPoint() {
		return clusteringDataPoint;
	}

	public void setClusteringDataPoint(boolean clusteringDataPoint) {
		this.clusteringDataPoint = clusteringDataPoint;
	}

	public boolean isClusterVisualizer() {
		return clusterVisualizer;
	}

	public void setClusterVisualizer(boolean clusterVisualizer) {
		this.clusterVisualizer = clusterVisualizer;
	}

	public String getScatterPlot() {
		return scatterPlot;
	}

	public void setScatterPlot(String scatterPlot) {
		this.scatterPlot = scatterPlot;
	}

	public String getBottomUpApproach() {
		return bottomUpApproach;
	}

	public void setBottomUpApproach(String bottomUpApproach) {
		this.bottomUpApproach = bottomUpApproach;
	}

	public Integer getLinkageMethod() {
		return linkageMethod;
	}

	public void setLinkageMethod(Integer linkageMethod) {
		this.linkageMethod = linkageMethod;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

package com.test1;

public class PolynomialRegressionSecurity {
	private Integer regressionSectionCode;
	private String variableGroupOwner;
	private String systemCode;
	private String appName;
	private Integer variableName;
	private boolean secretvariable;
	private boolean independentValues;
	private String dependentValues;
	private String readCsvMode;
	private String writeCsvMode;
	private String overideCsvMode;
	private String dataFrameObject;
	private String learnModule;
	private String entityState;

	public PolynomialRegressionSecurity() {

	}

	public PolynomialRegressionSecurity(Integer regressionSectionCode, String variableGroupOwner, String systemCode,
			String appName, Integer variableName, boolean secretvariable, boolean independentValues,
			String dependentValues, String readCsvMode, String writeCsvMode, String overideCsvMode,
			String dataFrameObject, String learnModule, String entityState) {
		super();
		this.regressionSectionCode = regressionSectionCode;
		this.variableGroupOwner = variableGroupOwner;
		this.systemCode = systemCode;
		this.appName = appName;
		this.variableName = variableName;
		this.secretvariable = secretvariable;
		this.independentValues = independentValues;
		this.dependentValues = dependentValues;
		this.readCsvMode = readCsvMode;
		this.writeCsvMode = writeCsvMode;
		this.overideCsvMode = overideCsvMode;
		this.dataFrameObject = dataFrameObject;
		this.learnModule = learnModule;
		this.entityState = entityState;
	}

	public Integer getRegressionSectionCode() {
		return regressionSectionCode;
	}

	public void setRegressionSectionCode(Integer regressionSectionCode) {
		this.regressionSectionCode = regressionSectionCode;
	}

	public String getVariableGroupOwner() {
		return variableGroupOwner;
	}

	public void setVariableGroupOwner(String variableGroupOwner) {
		this.variableGroupOwner = variableGroupOwner;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Integer getVariableName() {
		return variableName;
	}

	public void setVariableName(Integer variableName) {
		this.variableName = variableName;
	}

	public boolean isSecretvariable() {
		return secretvariable;
	}

	public void setSecretvariable(boolean secretvariable) {
		this.secretvariable = secretvariable;
	}

	public boolean isIndependentValues() {
		return independentValues;
	}

	public void setIndependentValues(boolean independentValues) {
		this.independentValues = independentValues;
	}

	public String getDependentValues() {
		return dependentValues;
	}

	public void setDependentValues(String dependentValues) {
		this.dependentValues = dependentValues;
	}

	public String getReadCsvMode() {
		return readCsvMode;
	}

	public void setReadCsvMode(String readCsvMode) {
		this.readCsvMode = readCsvMode;
	}

	public String getWriteCsvMode() {
		return writeCsvMode;
	}

	public void setWriteCsvMode(String writeCsvMode) {
		this.writeCsvMode = writeCsvMode;
	}

	public String getOverideCsvMode() {
		return overideCsvMode;
	}

	public void setOverideCsvMode(String overideCsvMode) {
		this.overideCsvMode = overideCsvMode;
	}

	public String getDataFrameObject() {
		return dataFrameObject;
	}

	public void setDataFrameObject(String dataFrameObject) {
		this.dataFrameObject = dataFrameObject;
	}

	public String getLearnModule() {
		return learnModule;
	}

	public void setLearnModule(String learnModule) {
		this.learnModule = learnModule;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

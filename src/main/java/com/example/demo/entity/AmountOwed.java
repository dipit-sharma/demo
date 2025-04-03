package com.example.demo.entity;

public class AmountOwed {
	private String connectionId;
    private String connectionName;
    private String connectionPhoto;
    private Double totalAmountOwed;

    public AmountOwed(String connectionId, String connectionName, String connectionPhoto, Double totalAmountOwed) {
        this.connectionId = connectionId;
        this.connectionName = connectionName;
        this.connectionPhoto = connectionPhoto;
        this.totalAmountOwed = totalAmountOwed;
    }

	public String getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	public String getConnectionName() {
		return connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
	}

	public String getConnectionPhoto() {
		return connectionPhoto;
	}

	public void setConnectionPhoto(String connectionPhoto) {
		this.connectionPhoto = connectionPhoto;
	}

	public Double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	public void setTotalAmountOwed(Double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
}


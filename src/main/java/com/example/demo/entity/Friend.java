package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "connections")
public class Friend {
	@Column(name = "user_id")
	private String userId;

	@Id
	@Column(name = "connection_id")
	private String connectionId;

	@Column(name = "connected_to")
	private String connectedTo;

	@Column(name = "connected_to_name")
	private String connectedToName;

	@Column(name = "connected_to_photo")
	private String connectedToPhoto;

	@Column(name = "debt")
	private Integer debt;

	@Column(name = "spent")
	private Integer spent;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(String connectionId) {
		this.connectionId = connectionId;
	}

	public String getConnectedTo() {
		return connectedTo;
	}

	public void setConnectedTo(String connectedTo) {
		this.connectedTo = connectedTo;
	}

	public String getConnectedToName() {
		return connectedToName;
	}

	public void setConnectedToName(String connectedToName) {
		this.connectedToName = connectedToName;
	}

	public String getConnectedToPhoto() {
		return connectedToPhoto;
	}

	public void setConnectedToPhoto(String connectedToPhoto) {
		this.connectedToPhoto = connectedToPhoto;
	}

	public Integer getDebt() {
		return debt;
	}

	public void setDebt(Integer debt) {
		this.debt = debt;
	}

	public Integer getSpent() {
		return spent;
	}

	public void setSpent(Integer spent) {
		this.spent = spent;
	}

	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Friend(String userId, String connectionId, String connectedTo, String connectedToName,
			String connectedToPhoto, Integer debt, Integer spent) {
		super();
		this.userId = userId;
		this.connectionId = connectionId;
		this.connectedTo = connectedTo;
		this.connectedToName = connectedToName;
		this.connectedToPhoto = connectedToPhoto;
		this.debt = debt;
		this.spent = spent;
	}
}

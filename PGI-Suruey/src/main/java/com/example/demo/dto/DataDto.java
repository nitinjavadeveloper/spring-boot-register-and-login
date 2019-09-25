package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class DataDto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String statusCode = null;
	private String statusDesc = null;
	private String clientIPAddress = null;
	private String serverIPAddress = null;
	private Integer recordId = null;
	private Long recordIdLong = null;
	private String user = null;
	private String password = null;
	private Long maxId = null;
	private Long minId = null;
	private int maxResults = 0;
	private String source = null;
	
	/*
	 * @OneToMany(targetEntity=DataDto.class, mappedBy="records",
	 * fetch=FetchType.EAGER) private List<Integer> records = null; private
	 * List<String> strRecords = null;
	 */
	private String param = null;
	private byte[] ecnvi = null;
	private String appCode;

	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String inStatusCode) {
		statusCode = inStatusCode;
	}

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String inStatusDesc) {
		statusDesc = inStatusDesc;
	}

	public String getClientIPAddress() {
		return clientIPAddress;
	}

	public void setClientIPAddress(String inClientIPAddress) {
		clientIPAddress = inClientIPAddress;
	}

	public String getServerIPAddress() {
		return serverIPAddress;
	}

	public void setServerIPAddress(String inServerIPAddress) {
		serverIPAddress = inServerIPAddress;
	}

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer inRecordId) {
		recordId = inRecordId;
	}

	public Long getRecordIdLong() {
		return recordIdLong;
	}

	public void setRecordIdLong(Long inRecordIdLong) {
		recordIdLong = inRecordIdLong;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String inUser) {
		user = inUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String inPassword) {
		password = inPassword;
	}

	public Long getMaxId() {
		return maxId;
	}

	public void setMaxId(Long inMaxId) {
		maxId = inMaxId;
	}

	public Long getMinId() {
		return minId;
	}

	public void setMinId(Long inMinId) {
		minId = inMinId;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int inMaxResults) {
		maxResults = inMaxResults;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String inSource) {
		source = inSource;
	}

//	public List<Integer> getRecords() {
//		return records;
//	}
//
//	public void setRecords(List<Integer> inRecords) {
//		records = inRecords;
//	}
//
//	public List<String> getStrRecords() {
//		return strRecords;
//	}
//
//	public void setStrRecords(List<String> inStrRecords) {
//		strRecords = inStrRecords;
//	}

	public String getParam() {
		return param;
	}

	public void setParam(String inParam) {
		param = inParam;
	}

	public byte[] getEcnvi() {
		return ecnvi;
	}

	public void setEcnvi(byte[] inEcnvi) {
		ecnvi = inEcnvi;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String inAppCode) {
		appCode = inAppCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataDto [statusCode=").append(statusCode).append(", statusDesc=").append(statusDesc)
				.append(", clientIPAddress=").append(clientIPAddress).append(", serverIPAddress=")
				.append(serverIPAddress).append(", recordId=").append(recordId).append(", recordIdLong=")
				.append(recordIdLong).append(", user=").append(user).append(", password=").append(password)
				.append(", maxId=").append(maxId).append(", minId=").append(minId).append(", maxResults=")
				.append(maxResults).append(", source=").append(source).append("]");
		return builder.toString();
	}
}

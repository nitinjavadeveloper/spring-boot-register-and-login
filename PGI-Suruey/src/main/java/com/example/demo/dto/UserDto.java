package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.AdminUser;
import com.example.demo.model.NpLoggingHistory;

public class UserDto extends DataDto {
	private static final long serialVersionUID = -7639745416316725832L;

	// it's id dummy field not required

	private String oldPassword = null;
	private String newPassword = null;
	private AdminUser userPojo = null;
	private String searchKey = null;
	private String userId = null;
	private List<AdminUser> userList;
	private String pwdResetLink;
	private NpLoggingHistory logHistory;
	boolean sendResetLink;
	private String stateName;
	private String districtName;
	private String blockName;
	private String panchayatName;
	private String locationType;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public AdminUser getUserPojo() {
		return userPojo;
	}

	public void setUserPojo(AdminUser userPojo) {
		this.userPojo = userPojo;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<AdminUser> getUserList() {
		return userList;
	}

	public void setUserList(List<AdminUser> inUserList) {
		userList = inUserList;
	}

	public String getPwdResetLink() {
		return pwdResetLink;
	}

	public void setPwdResetLink(String inPwdResetLink) {
		pwdResetLink = inPwdResetLink;
	}

	public NpLoggingHistory getLogHistory() {
		return logHistory;
	}

	public void setLogHistory(NpLoggingHistory inLogHistory) {
		logHistory = inLogHistory;
	}

	public boolean isSendResetLink() {
		return sendResetLink;
	}

	public void setSendResetLink(boolean sendResetLink) {
		this.sendResetLink = sendResetLink;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getPanchayatName() {
		return panchayatName;
	}

	public void setPanchayatName(String panchayatName) {
		this.panchayatName = panchayatName;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("UserDto [oldPassword=").append(oldPassword).append(", newPassword=").append(newPassword)
				.append(", userPojo=").append(userPojo).append(", searchKey=").append(searchKey).append(", userId=")
				.append(userId).append("]");
		return builder.toString();
	}
}

package com.pheonix.insuranceaccounts.pojo;

public class Account {
	
	private String accountNo;
	private String accountType;
	private String accountId;
	private String accountName;
	private String accountStatus;
	private Balance balances;
	
	public Account(String accountNo,String accountType, String accountId, String accountName, 
			String accountStatus, Balance balances) {
		this.accountId = accountId;
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountName = accountName;
		this.accountStatus = accountStatus;
		this.balances = balances;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public Balance getBalances() {
		return balances;
	}
	public void setBalances(Balance balances) {
		this.balances = balances;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", accountId=" + accountId
				+ ", accountName=" + accountName + ", accountStatus=" + accountStatus + ", balances=" + balances + "]";
	}
	
	

}

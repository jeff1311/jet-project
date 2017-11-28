package com.jet.pojo;

public class EmailModel {
	private String senderEmail;
	private String senderNickName;
	private String receiverEmail;
	private String receiverNickName;
	private String title;
	private String contenct;
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getSenderNickName() {
		return senderNickName;
	}
	public void setSenderNickName(String senderNickName) {
		this.senderNickName = senderNickName;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	public String getReceiverNickName() {
		return receiverNickName;
	}
	public void setReceiverNickName(String receiverNickName) {
		this.receiverNickName = receiverNickName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContenct() {
		return contenct;
	}
	public void setContenct(String contenct) {
		this.contenct = contenct;
	}
	
}

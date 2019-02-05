package com.cg.eis.bean;

import java.time.LocalDateTime;

public class CustomerDetails {

		private String cusName;
		private String cusMail;
		private String cusPhone;
		private int purchaseId;
		private LocalDateTime purchaseTime;
		private int cusMobileId;
		public CustomerDetails(String cusName, String cusMail, String cusPhone, int purchaseId,
				LocalDateTime purchaseTime, int cusMobileId) {
			super();
			this.cusName = cusName;
			this.cusMail = cusMail;
			this.cusPhone = cusPhone;
			this.purchaseId = purchaseId;
			this.purchaseTime = purchaseTime;
			this.cusMobileId = cusMobileId;
		}
		public String getCusName() {
			return cusName;
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
		public String getCusMail() {
			return cusMail;
		}
		public void setCusMail(String cusMail) {
			this.cusMail = cusMail;
		}
		public String getCusPhone() {
			return cusPhone;
		}
		public void setCusPhone(String cusPhone) {
			this.cusPhone = cusPhone;
		}
		public int getPurchaseId() {
			return purchaseId;
		}
		public void setPurchaseId(int purchaseId) {
			this.purchaseId = purchaseId;
		}
		public LocalDateTime getPurchaseTime() {
			return purchaseTime;
		}
		public void setPurchaseTime(LocalDateTime purchaseTime) {
			this.purchaseTime = purchaseTime;
		}
		public int getCusMobileId() {
			return cusMobileId;
		}
		public void setCusMobileId(int cusMobileId) {
			this.cusMobileId = cusMobileId;
		}
		
}

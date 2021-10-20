package com.paywharf.ordershadingjdbcdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
		
		private long id;
		private String orderNo;
		private String totalAmount;
		private String convenienceFee;
		private String gstFee;
		private String msfFee;
		private String msfGstFee;
		private String payAmount;
		private String refAmtBal;
		private String currencyName;
		private String meTransReqType;
		private String recurringPeriod;
		private String recurringDay;
		private String noOfRecurring;
		private String mid;
		private String addField1;
		private String addField2;
		private String addField3;
		private String addField4;
		private String addField5;
		private String addField6;
		private String addField7;
		private String addField8;
		private String addField9;
		private String Descrption;
		private String HoldDate;
		private String ReleaseDate;
		private String ResponseDescription;
		private String StatusDate;
		private String rrn;
		private String source;
		private Date reqInitiateDate;
		private String txnDate;
		private String txnRespDate;
		private String paymentType;
		private String network;
		private String emailInvoice;
		private String mobileInvoice;
		private String mobileNo;
		private String emailId;
		private String responseUrl;
		private String tid;
		private String meTrnRefId;
		private String respCode;
		private String respMessage;
		private String respAuthCode;
		private String respHashValidated;
		private String respErrorMessage;
		private String SettlementStatus;
		private String Txnststatusdate;
		private String bsfRatePerc;
		private String bsfRateFixed;
		private String bsfGST;
		private String profitLoss;
		private String profitLossGST;
		private String settlementAmt;
		private String settStatus;
		private String settlementDate;
		private String settlementGenStatus;
		private String refundAmt;
		private String refundDate;
		private String UtrNumber;
		private String batchNo;
		private String claimGenStatus;
		private String refundStatus;
		private String payoutDate;
		private String commission;
		private String bankRate;
		private String bankFee;
		private String bankGST;
		private String bankCharge;
		private String settByBank;
		private String agpBankCode;
		private String procName;
		private String procRefId;
		private String msfRatePerc;
		private String convRatePerc;
		private String settReadFlag;
		
		
		
		
		
		
		
		/*For S2s Added by Jayesh*/
		
		public String getSettReadFlag() {
			return settReadFlag;
		}
		public void setSettReadFlag(String settReadFlag) {
			this.settReadFlag = settReadFlag;
		}
		public String getBankFee() {
			return bankFee;
		}
		public void setBankFee(String bankFee) {
			this.bankFee = bankFee;
		}
		public String getProcName() {
			return procName;
		}
		public void setProcName(String procName) {
			this.procName = procName;
		}
		public String getProcRefId() {
			return procRefId;
		}
		public void setProcRefId(String procRefId) {
			this.procRefId = procRefId;
		}
		public String getMsfRatePerc() {
			return msfRatePerc;
		}
		public void setMsfRatePerc(String msfRatePerc) {
			this.msfRatePerc = msfRatePerc;
		}
		public String getConvRatePerc() {
			return convRatePerc;
		}
		public void setConvRatePerc(String convRatePerc) {
			this.convRatePerc = convRatePerc;
		}
		public String getAgpBankCode() {
			return agpBankCode;
		}
		public void setAgpBankCode(String agpBankCode) {
			this.agpBankCode = agpBankCode;
		}
		public String getBankRate() {
			return bankRate;
		}
		public void setBankRate(String bankRate) {
			this.bankRate = bankRate;
		}
		public String getBankGST() {
			return bankGST;
		}
		public void setBankGST(String bankGST) {
			this.bankGST = bankGST;
		}
		public String getBankCharge() {
			return bankCharge;
		}
		public void setBankCharge(String bankCharge) {
			this.bankCharge = bankCharge;
		}
		public String getSettByBank() {
			return settByBank;
		}
		public void setSettByBank(String settByBank) {
			this.settByBank = settByBank;
		}
		public String getCommission() {
			return commission;
		}
		public void setCommission(String commission) {
			this.commission = commission;
		}
		public String getPayoutDate() {
			return payoutDate;
		}
		public void setPayoutDate(String payoutDate) {
			this.payoutDate = payoutDate;
		}
		public String getRefundStatus() {
			return refundStatus;
		}
		public void setRefundStatus(String refundStatus) {
			this.refundStatus = refundStatus;
		}
		private String s2sRespMessage;
		private String s2sRespDate;
		private Integer s2sFlag = 0;
		
		public String getAddField9() {
			return addField9;
		}
		public void setAddField9(String addField9) {
			this.addField9 = addField9;
		}
		public String getDescrption() {
			return Descrption;
		}
		public void setDescrption(String descrption) {
			Descrption = descrption;
		}
		public String getHoldDate() {
			return HoldDate;
		}
		public void setHoldDate(String holdDate) {
			HoldDate = holdDate;
		}
		public String getReleaseDate() {
			return ReleaseDate;
		}
		public void setReleaseDate(String releaseDate) {
			ReleaseDate = releaseDate;
		}
		public String getResponseDescription() {
			return ResponseDescription;
		}
		public void setResponseDescription(String responseDescription) {
			ResponseDescription = responseDescription;
		}
		public String getStatusDate() {
			return StatusDate;
		}
		public void setStatusDate(String statusDate) {
			StatusDate = statusDate;
		}
		public String getTxnststatusdate() {
			return Txnststatusdate;
		}
		public void setTxnststatusdate(String txnststatusdate) {
			Txnststatusdate = txnststatusdate;
		}
		public String getBsfRatePerc() {
			return bsfRatePerc;
		}
		public void setBsfRatePerc(String bsfRatePerc) {
			this.bsfRatePerc = bsfRatePerc;
		}
		public String getBsfRateFixed() {
			return bsfRateFixed;
		}
		public void setBsfRateFixed(String bsfRateFixed) {
			this.bsfRateFixed = bsfRateFixed;
		}
		public String getBsfGST() {
			return bsfGST;
		}
		public void setBsfGST(String bsfGST) {
			this.bsfGST = bsfGST;
		}
		public String getProfitLoss() {
			return profitLoss;
		}
		public void setProfitLoss(String profitLoss) {
			this.profitLoss = profitLoss;
		}
		public String getProfitLossGST() {
			return profitLossGST;
		}
		public void setProfitLossGST(String profitLossGST) {
			this.profitLossGST = profitLossGST;
		}
		public String getSettlementAmt() {
			return settlementAmt;
		}
		public void setSettlementAmt(String settlementAmt) {
			this.settlementAmt = settlementAmt;
		}
		public String getSettStatus() {
			return settStatus;
		}
		public void setSettStatus(String settStatus) {
			this.settStatus = settStatus;
		}
		public String getSettlementDate() {
			return settlementDate;
		}
		public void setSettlementDate(String settlementDate) {
			this.settlementDate = settlementDate;
		}
		public String getSettlementGenStatus() {
			return settlementGenStatus;
		}
		public void setSettlementGenStatus(String settlementGenStatus) {
			this.settlementGenStatus = settlementGenStatus;
		}
		public String getRefundAmt() {
			return refundAmt;
		}
		public void setRefundAmt(String refundAmt) {
			this.refundAmt = refundAmt;
		}
		public String getRefundDate() {
			return refundDate;
		}
		public void setRefundDate(String refundDate) {
			this.refundDate = refundDate;
		}
		public String getUtrNumber() {
			return UtrNumber;
		}
		public void setUtrNumber(String utrNumber) {
			UtrNumber = utrNumber;
		}
		public String getBatchNo() {
			return batchNo;
		}
		public void setBatchNo(String batchNo) {
			this.batchNo = batchNo;
		}
		public String getClaimGenStatus() {
			return claimGenStatus;
		}
		public void setClaimGenStatus(String claimGenStatus) {
			this.claimGenStatus = claimGenStatus;
		}

		
		public Date getReqInitiateDate() {
			return reqInitiateDate;
		}
		public void setReqInitiateDate(Date reqInitiateDate) {
			this.reqInitiateDate = reqInitiateDate;
		}
		public String getMsfFee() {
			return msfFee;
		}
		public void setMsfFee(String msfFee) {
			this.msfFee = msfFee;
		}
		public String getMsfGstFee() {
			return msfGstFee;
		}
		public void setMsfGstFee(String msfGstFee) {
			this.msfGstFee = msfGstFee;
		}
		public String getTxnRespDate() {
			return txnRespDate;
		}
		public void setTxnRespDate(String txnRespDate) {
			this.txnRespDate = txnRespDate;
		}
		public String getPaymentType() {
			return paymentType;
		}
		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}
		public String getNetwork() {
			return network;
		}
		public void setNetwork(String network) {
			this.network = network;
		}
		public String getConvenienceFee() {
			return convenienceFee;
		}
		public void setConvenienceFee(String convenienceFee) {
			this.convenienceFee = convenienceFee;
		}
		public String getGstFee() {
			return gstFee;
		}
		public void setGstFee(String gstFee) {
			this.gstFee = gstFee;
		}
		public String getPayAmount() {
			return payAmount;
		}
		public void setPayAmount(String payAmount) {
			this.payAmount = payAmount;
		}
		public String getRrn() {
			return rrn;
		}
		public void setRrn(String rrn) {
			this.rrn = rrn;
		}
		public String getTxnDate() {
			return txnDate;
		}
		public void setTxnDate(String txnDate) {
			this.txnDate = txnDate;
		}
		public String getRefAmtBal() {
			return refAmtBal;
		}
		public void setRefAmtBal(String refAmtBal) {
			this.refAmtBal = refAmtBal;
		}
		public String getSettlementStatus() {
			return SettlementStatus;
		}
		public void setSettlementStatus(String settlementStatus) {
			SettlementStatus = settlementStatus;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getEmailInvoice() {
			return emailInvoice;
		}
		public void setEmailInvoice(String emailInvoice) {
			this.emailInvoice = emailInvoice;
		}
		public String getMobileInvoice() {
			return mobileInvoice;
		}
		public void setMobileInvoice(String mobileInvoice) {
			this.mobileInvoice = mobileInvoice;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMeTrnRefId() {
			return meTrnRefId;
		}
		public void setMeTrnRefId(String meTrnRefId) {
			this.meTrnRefId = meTrnRefId;
		}
		public String getRespCode() {
			return respCode;
		}
		public void setRespCode(String respCode) {
			this.respCode = respCode;
		}
		public String getRespMessage() {
			return respMessage;
		}
		public void setRespMessage(String respMessage) {
			this.respMessage = respMessage;
		}
		public String getRespAuthCode() {
			return respAuthCode;
		}
		public void setRespAuthCode(String respAuthCode) {
			this.respAuthCode = respAuthCode;
		}
		public String getRespHashValidated() {
			return respHashValidated;
		}
		public void setRespHashValidated(String respHashValidated) {
			this.respHashValidated = respHashValidated;
		}
		public String getRespErrorMessage() {
			return respErrorMessage;
		}
		public void setRespErrorMessage(String respErrorMessage) {
			this.respErrorMessage = respErrorMessage;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getOrderNo() {
			return orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getCurrencyName() {
			return currencyName;
		}
		public void setCurrencyName(String currencyName) {
			this.currencyName = currencyName;
		}
		public String getMeTransReqType() {
			return meTransReqType;
		}
		public void setMeTransReqType(String meTransReqType) {
			this.meTransReqType = meTransReqType;
		}
		public String getRecurringPeriod() {
			return recurringPeriod;
		}
		public void setRecurringPeriod(String recurringPeriod) {
			this.recurringPeriod = recurringPeriod;
		}
		public String getRecurringDay() {
			return recurringDay;
		}
		public void setRecurringDay(String recurringDay) {
			this.recurringDay = recurringDay;
		}
		public String getNoOfRecurring() {
			return noOfRecurring;
		}
		public void setNoOfRecurring(String noOfRecurring) {
			this.noOfRecurring = noOfRecurring;
		}
		public String getMid() {
			return mid;
		}
		public void setMid(String mid) {
			this.mid = mid;
		}
		public String getAddField1() {
			return addField1;
		}
		public void setAddField1(String addField1) {
			this.addField1 = addField1;
		}
		public String getAddField2() {
			return addField2;
		}
		public void setAddField2(String addField2) {
			this.addField2 = addField2;
		}
		public String getAddField3() {
			return addField3;
		}
		public void setAddField3(String addField3) {
			this.addField3 = addField3;
		}
		public String getAddField4() {
			return addField4;
		}
		public void setAddField4(String addField4) {
			this.addField4 = addField4;
		}
		public String getAddField5() {
			return addField5;
		}
		public void setAddField5(String addField5) {
			this.addField5 = addField5;
		}
		public String getAddField6() {
			return addField6;
		}
		public void setAddField6(String addField6) {
			this.addField6 = addField6;
		}
		public String getAddField7() {
			return addField7;
		}
		public void setAddField7(String addField7) {
			this.addField7 = addField7;
		}
		public String getAddField8() {
			return addField8;
		}
		public void setAddField8(String addField8) {
			this.addField8 = addField8;
		}
		public String getResponseUrl() {
			return responseUrl;
		}
		public void setResponseUrl(String responseUrl) {
			this.responseUrl = responseUrl;
		}
		public String getTid() {
			return tid;
		}
		public void setTid(String tid) {
			this.tid = tid;
		}
		
		public Integer getS2sFlag() {
			return s2sFlag;
		}
		public void setS2sFlag(Integer s2sFlag) {
			this.s2sFlag = s2sFlag;
		}
		@Override
		public String toString() {
			return "TransactionRequest [id=" + id + ", orderNo=" + orderNo + ", totalAmount=" + totalAmount
					+ ", convenienceFee=" + convenienceFee + ", gstFee=" + gstFee + ", msfFee=" + msfFee
					+ ", msfGstFee=" + msfGstFee + ", payAmount=" + payAmount + ", refAmtBal=" + refAmtBal
					+ ", currencyName=" + currencyName + ", meTransReqType=" + meTransReqType + ", recurringPeriod="
					+ recurringPeriod + ", recurringDay=" + recurringDay + ", noOfRecurring=" + noOfRecurring + ", mid="
					+ mid + ", addField1=" + addField1 + ", addField2=" + addField2 + ", addField3=" + addField3
					+ ", addField4=" + addField4 + ", addField5=" + addField5 + ", addField6=" + addField6
					+ ", addField7=" + addField7 + ", addField8=" + addField8 + ", addField9=" + addField9
					+ ", Descrption=" + Descrption + ", HoldDate=" + HoldDate + ", ReleaseDate=" + ReleaseDate
					+ ", ResponseDescription=" + ResponseDescription + ", StatusDate=" + StatusDate + ", rrn=" + rrn
					+ ", source=" + source + ", reqInitiateDate=" + reqInitiateDate + ", txnDate=" + txnDate
					+ ", txnRespDate=" + txnRespDate + ", paymentType=" + paymentType + ", network=" + network
					+ ", emailInvoice=" + emailInvoice + ", mobileInvoice=" + mobileInvoice + ", mobileNo=" + mobileNo
					+ ", emailId=" + emailId + ", responseUrl=" + responseUrl + ", tid=" + tid + ", meTrnRefId="
					+ meTrnRefId + ", respCode=" + respCode + ", respMessage=" + respMessage + ", respAuthCode="
					+ respAuthCode + ", respHashValidated=" + respHashValidated + ", respErrorMessage="
					+ respErrorMessage + ", SettlementStatus=" + SettlementStatus + ", Txnststatusdate="
					+ Txnststatusdate + ", bsfRatePerc=" + bsfRatePerc + ", bsfRateFixed=" + bsfRateFixed + ", bsfGST="
					+ bsfGST + ", profitLoss=" + profitLoss + ", profitLossGST=" + profitLossGST + ", settlementAmt="
					+ settlementAmt + ", settStatus=" + settStatus + ", settlementDate=" + settlementDate
					+ ", settlementGenStatus=" + settlementGenStatus + ", refundAmt=" + refundAmt + ", refundDate="
					+ refundDate + ", UtrNumber=" + UtrNumber + ", batchNo=" + batchNo + ", claimGenStatus="
					+ claimGenStatus + ", refundStatus=" + refundStatus + ", payoutDate=" + payoutDate + ", commission="
					+ commission + ", bankRate=" + bankRate + ", bankFee=" + bankFee + ", bankGST=" + bankGST
					+ ", bankCharge=" + bankCharge + ", settByBank=" + settByBank + ", agpBankCode=" + agpBankCode
					+ ", procName=" + procName + ", procRefId=" + procRefId + ", msfRatePerc=" + msfRatePerc
					+ ", convRatePerc=" + convRatePerc + ", settReadFlag=" + settReadFlag + ", s2sRespMessage="
					+ s2sRespMessage + ", s2sRespDate=" + s2sRespDate + ", s2sFlag=" + s2sFlag + "]";
		}
		public String getS2sRespMessage() {
			return s2sRespMessage;
		}
		public void setS2sRespMessage(String s2sRespMessage) {
			this.s2sRespMessage = s2sRespMessage;
		}
		public String getS2sRespDate() {
			return s2sRespDate;
		}
		public void setS2sRespDate(String s2sRespDate) {
			this.s2sRespDate = s2sRespDate;
		}

}

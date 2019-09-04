/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class SavingsAccountApiController {

	@Autowired
	SavingsAccountApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDSavingsAccountActivateOutputModel> activate(@RequestBody BianRequest<SDSavingsAccountActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDSavingsAccountConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSavingsAccountConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRSavingsAccountFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSavingsAccountFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountlien")
	@Fulfill.Exchange
	public BianResponse<BQAccountLienExchangeOutputModel> exchangeAccountlien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAccountLienExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAccountlien(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Exchange
	public BianResponse<BQPaymentsExchangeOutputModel> exchangePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountsweep")
	@Fulfill.Execute
	public BianResponse<BQAccountSweepExecuteOutputModel> executeAccountsweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAccountSweepExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeAccountsweep(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Execute
	public BianResponse<BQDepositsAndWithdrawalsExecuteOutputModel> executeDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsAndWithdrawalsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Execute
	public BianResponse<BQPaymentsExecuteOutputModel> executePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDSavingsAccountFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSavingsAccountFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRSavingsAccountFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRSavingsAccountFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountlien")
	@Fulfill.Initiate
	public BianResponse<BQAccountLienInitiateOutputModel> initiateAccountlien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAccountLienInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAccountlien(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountsweep")
	@Fulfill.Initiate
	public BianResponse<BQAccountSweepInitiateOutputModel> initiateAccountsweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAccountSweepInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAccountsweep(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Initiate
	public BianResponse<BQDepositsAndWithdrawalsInitiateOutputModel> initiateDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDepositsAndWithdrawalsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDepositsandwithdrawals(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Initiate
	public BianResponse<BQIssuedDeviceInitiateOutputModel> initiateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQIssuedDeviceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateIssueddevice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Initiate
	public BianResponse<BQPaymentsInitiateOutputModel> initiatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPaymentsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePayments(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Initiate
	public BianResponse<BQServiceFeesInitiateOutputModel> initiateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServiceFeesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateServicefees(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Request
	public BianResponse<BQIssuedDeviceRequestOutputModel> requestIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDSavingsAccountRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRSavingsAccountFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("accountlien")
	@Fulfill.Retrieve
	public BianResponse<BQAccountLienRetrieveOutputModel> retrieveAccountlien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAccountlien(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("accountsweep")
	@Fulfill.Retrieve
	public BianResponse<BQAccountSweepRetrieveOutputModel> retrieveAccountsweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAccountsweep(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Retrieve
	public BianResponse<BQDepositsAndWithdrawalsRetrieveOutputModel> retrieveDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("interest")
	@Fulfill.Retrieve
	public BianResponse<BQInterestRetrieveOutputModel> retrieveInterest(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInterest(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("issueddevice")
	@Fulfill.Retrieve
	public BianResponse<BQIssuedDeviceRetrieveOutputModel> retrieveIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssueddevice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("payments")
	@Fulfill.Retrieve
	public BianResponse<BQPaymentsRetrieveOutputModel> retrievePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRSavingsAccountFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSavingsAccountFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountlien")
	@Fulfill.Update
	public BianResponse<BQAccountLienUpdateOutputModel> updateAccountlien(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAccountLienUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAccountlien(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("accountsweep")
	@Fulfill.Update
	public BianResponse<BQAccountSweepUpdateOutputModel> updateAccountsweep(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAccountSweepUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAccountsweep(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Update
	public BianResponse<BQDepositsAndWithdrawalsUpdateOutputModel> updateDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsAndWithdrawalsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issueddevice")
	@Fulfill.Update
	public BianResponse<BQIssuedDeviceUpdateOutputModel> updateIssueddevice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssuedDeviceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIssueddevice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("payments")
	@Fulfill.Update
	public BianResponse<BQPaymentsUpdateOutputModel> updatePayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPaymentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

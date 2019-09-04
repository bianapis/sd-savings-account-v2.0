/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SavingsAccountApiService {

	SDSavingsAccountActivateOutputModel activate(SDSavingsAccountActivateInputModel request);
	
	SDSavingsAccountConfigureOutputModel configure(String sdReferenceId, SDSavingsAccountConfigureInputModel request);
	
	CRSavingsAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRSavingsAccountFulfillmentArrangementControlInputModel request);
	
	BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request);
	
	BQDepositsAndWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsAndWithdrawalsExecuteInputModel request);
	
	BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDSavingsAccountFeedbackOutputModel feedback(String sdReferenceId, SDSavingsAccountFeedbackInputModel request);
	
	CRSavingsAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRSavingsAccountFulfillmentArrangementInitiateInputModel request);
	
	BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request);
	
	BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request);
	
	BQDepositsAndWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsAndWithdrawalsInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request);
	
	SDSavingsAccountRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSavingsAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsAndWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRSavingsAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSavingsAccountFulfillmentArrangementUpdateInputModel request);
	
	BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request);
	
	BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request);
	
	BQDepositsAndWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsAndWithdrawalsUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
}

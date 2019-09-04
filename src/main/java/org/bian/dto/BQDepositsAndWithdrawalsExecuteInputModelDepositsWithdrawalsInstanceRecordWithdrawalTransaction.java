package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction
 */
public class BQDepositsAndWithdrawalsExecuteInputModelDepositsWithdrawalsInstanceRecordWithdrawalTransaction   {
  private String withdrawalTransactionSourceReference = null;

  private String withdrawalTransactionWithdrawalType = null;

  private String withdrawalTransactionDescription = null;

  private String withdrawalTransactionAmount = null;

  private String withdrawalTransactionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the target for the withdrawal 
   * @return withdrawalTransactionSourceReference
  **/

  public String getWithdrawalTransactionSourceReference() {
    return withdrawalTransactionSourceReference;
  }

  public void setWithdrawalTransactionSourceReference(String withdrawalTransactionSourceReference) {
    this.withdrawalTransactionSourceReference = withdrawalTransactionSourceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of withdrawal made with the transaction 
   * @return withdrawalTransactionWithdrawalType
  **/

  public String getWithdrawalTransactionWithdrawalType() {
    return withdrawalTransactionWithdrawalType;
  }

  public void setWithdrawalTransactionWithdrawalType(String withdrawalTransactionWithdrawalType) {
    this.withdrawalTransactionWithdrawalType = withdrawalTransactionWithdrawalType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the withdrawal 
   * @return withdrawalTransactionDescription
  **/

  public String getWithdrawalTransactionDescription() {
    return withdrawalTransactionDescription;
  }

  public void setWithdrawalTransactionDescription(String withdrawalTransactionDescription) {
    this.withdrawalTransactionDescription = withdrawalTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The withdrawn amount 
   * @return withdrawalTransactionAmount
  **/

  public String getWithdrawalTransactionAmount() {
    return withdrawalTransactionAmount;
  }

  public void setWithdrawalTransactionAmount(String withdrawalTransactionAmount) {
    this.withdrawalTransactionAmount = withdrawalTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the withdrawal was initiated 
   * @return withdrawalTransactionDate
  **/

  public String getWithdrawalTransactionDate() {
    return withdrawalTransactionDate;
  }

  public void setWithdrawalTransactionDate(String withdrawalTransactionDate) {
    this.withdrawalTransactionDate = withdrawalTransactionDate;
  }


}


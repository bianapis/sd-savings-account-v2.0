package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction
 */
public class BQDepositsAndWithdrawalsRetrieveOutputModelDepositsWithdrawalsInstanceRecordDepositTransaction   {
  private String depositTransactionSourceReference = null;

  private String depositTransactionDepositType = null;

  private String depositTransactionDescription = null;

  private String depositTransactionAmount = null;

  private String depositTransactionDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Identifies the source of the deposit 
   * @return depositTransactionSourceReference
  **/

  public String getDepositTransactionSourceReference() {
    return depositTransactionSourceReference;
  }

  public void setDepositTransactionSourceReference(String depositTransactionSourceReference) {
    this.depositTransactionSourceReference = depositTransactionSourceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of deposit made with the transaction 
   * @return depositTransactionDepositType
  **/

  public String getDepositTransactionDepositType() {
    return depositTransactionDepositType;
  }

  public void setDepositTransactionDepositType(String depositTransactionDepositType) {
    this.depositTransactionDepositType = depositTransactionDepositType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Any necessary details describing the purpose or reference properties of the deposit 
   * @return depositTransactionDescription
  **/

  public String getDepositTransactionDescription() {
    return depositTransactionDescription;
  }

  public void setDepositTransactionDescription(String depositTransactionDescription) {
    this.depositTransactionDescription = depositTransactionDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The deposited amount 
   * @return depositTransactionAmount
  **/

  public String getDepositTransactionAmount() {
    return depositTransactionAmount;
  }

  public void setDepositTransactionAmount(String depositTransactionAmount) {
    this.depositTransactionAmount = depositTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the deposit was initiated 
   * @return depositTransactionDate
  **/

  public String getDepositTransactionDate() {
    return depositTransactionDate;
  }

  public void setDepositTransactionDate(String depositTransactionDate) {
    this.depositTransactionDate = depositTransactionDate;
  }


}


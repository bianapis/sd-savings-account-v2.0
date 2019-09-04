package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordLinkedAccounts;

import javax.validation.Valid;
  
/**
 * BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord
 */
public class BQAccountSweepInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String savingsAccountNumber = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String accountType = null;

  private String accountCurrency = null;

  private String taxReference = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionSetting = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the savings account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return savingsAccountNumber
  **/

  public String getSavingsAccountNumber() {
    return savingsAccountNumber;
  }

  public void setSavingsAccountNumber(String savingsAccountNumber) {
    this.savingsAccountNumber = savingsAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of savings account (e.g. checking, student, small business) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The primary account currency 
   * @return accountCurrency
  **/

  public String getAccountCurrency() {
    return accountCurrency;
  }

  public void setAccountCurrency(String accountCurrency) {
    this.accountCurrency = accountCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRSavingsAccountFulfillmentArrangementInitiateInputModelSavingsAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}


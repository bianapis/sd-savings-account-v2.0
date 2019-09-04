package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration;
import org.bian.dto.BQPaymentsRetrieveOutputModelPaymentsInstanceRecordPaymentTransaction;

import javax.validation.Valid;
  
/**
 * BQPaymentsRetrieveOutputModelPaymentsInstanceRecord
 */
public class BQPaymentsRetrieveOutputModelPaymentsInstanceRecord   {
  private String paymentType = null;

  private String paymentDefinition = null;

  private String paymentProcessingOptionDefinition = null;

  private String paymentProcessingOptionSetting = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration paymentConfiguration = null;

  private BQPaymentsRetrieveOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of payment transaction (e.g. customer payment, standing order, direct debit, bill pay) 
   * @return paymentType
  **/

  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the type of payment including processing rules and guidelines 
   * @return paymentDefinition
  **/

  public String getPaymentDefinition() {
    return paymentDefinition;
  }

  public void setPaymentDefinition(String paymentDefinition) {
    this.paymentDefinition = paymentDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the processing option and impact (e.g. frequency and cumulative amount constraints) 
   * @return paymentProcessingOptionDefinition
  **/

  public String getPaymentProcessingOptionDefinition() {
    return paymentProcessingOptionDefinition;
  }

  public void setPaymentProcessingOptionDefinition(String paymentProcessingOptionDefinition) {
    this.paymentProcessingOptionDefinition = paymentProcessingOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The option setting 
   * @return paymentProcessingOptionSetting
  **/

  public String getPaymentProcessingOptionSetting() {
    return paymentProcessingOptionSetting;
  }

  public void setPaymentProcessingOptionSetting(String paymentProcessingOptionSetting) {
    this.paymentProcessingOptionSetting = paymentProcessingOptionSetting;
  }


  /**
   * Get paymentConfiguration
   * @return paymentConfiguration
  **/

  public BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration getPaymentConfiguration() {
    return paymentConfiguration;
  }

  public void setPaymentConfiguration(BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration paymentConfiguration) {
    this.paymentConfiguration = paymentConfiguration;
  }


  /**
   * Get paymentTransaction
   * @return paymentTransaction
  **/

  public BQPaymentsRetrieveOutputModelPaymentsInstanceRecordPaymentTransaction getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(BQPaymentsRetrieveOutputModelPaymentsInstanceRecordPaymentTransaction paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
  }


}


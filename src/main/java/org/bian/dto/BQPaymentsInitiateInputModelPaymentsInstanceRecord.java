package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration;

import javax.validation.Valid;
  
/**
 * BQPaymentsInitiateInputModelPaymentsInstanceRecord
 */
public class BQPaymentsInitiateInputModelPaymentsInstanceRecord   {
  private String paymentType = null;

  private String paymentDefinition = null;

  private String paymentProcessingOptionSetting = null;

  private BQPaymentsInitiateInputModelPaymentsInstanceRecordPaymentConfiguration paymentConfiguration = null;


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


}


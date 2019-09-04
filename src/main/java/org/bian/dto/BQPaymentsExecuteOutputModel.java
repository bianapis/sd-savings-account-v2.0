package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPaymentsExecuteOutputModelPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPaymentsExecuteOutputModel
 */
public class BQPaymentsExecuteOutputModel   {
  private BQPaymentsExecuteOutputModelPaymentsInstanceRecord paymentsInstanceRecord = null;

  private String paymentsExecuteActionTaskReference = null;

  private Object paymentsExecuteActionTaskRecord = null;

  private String paymentsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get paymentsInstanceRecord
   * @return paymentsInstanceRecord
  **/

  public BQPaymentsExecuteOutputModelPaymentsInstanceRecord getPaymentsInstanceRecord() {
    return paymentsInstanceRecord;
  }

  public void setPaymentsInstanceRecord(BQPaymentsExecuteOutputModelPaymentsInstanceRecord paymentsInstanceRecord) {
    this.paymentsInstanceRecord = paymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Payments instance execute service call 
   * @return paymentsExecuteActionTaskReference
  **/

  public String getPaymentsExecuteActionTaskReference() {
    return paymentsExecuteActionTaskReference;
  }

  public void setPaymentsExecuteActionTaskReference(String paymentsExecuteActionTaskReference) {
    this.paymentsExecuteActionTaskReference = paymentsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return paymentsExecuteActionTaskRecord
  **/

  public Object getPaymentsExecuteActionTaskRecord() {
    return paymentsExecuteActionTaskRecord;
  }

  public void setPaymentsExecuteActionTaskRecord(Object paymentsExecuteActionTaskRecord) {
    this.paymentsExecuteActionTaskRecord = paymentsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Payments execute transaction/record 
   * @return paymentsExecuteRecordReference
  **/

  public String getPaymentsExecuteRecordReference() {
    return paymentsExecuteRecordReference;
  }

  public void setPaymentsExecuteRecordReference(String paymentsExecuteRecordReference) {
    this.paymentsExecuteRecordReference = paymentsExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}


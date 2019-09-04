package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDepositsAndWithdrawalsUpdateOutputModel
 */
public class BQDepositsAndWithdrawalsUpdateOutputModel   {
  private BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord = null;

  private String depositsAndWithdrawalsUpdateActionTaskReference = null;

  private Object depositsAndWithdrawalsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get depositsWithdrawalsInstanceRecord
   * @return depositsWithdrawalsInstanceRecord
  **/

  public BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord getDepositsWithdrawalsInstanceRecord() {
    return depositsWithdrawalsInstanceRecord;
  }

  public void setDepositsWithdrawalsInstanceRecord(BQDepositsAndWithdrawalsUpdateInputModelDepositsWithdrawalsInstanceRecord depositsWithdrawalsInstanceRecord) {
    this.depositsWithdrawalsInstanceRecord = depositsWithdrawalsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return depositsAndWithdrawalsUpdateActionTaskReference
  **/

  public String getDepositsAndWithdrawalsUpdateActionTaskReference() {
    return depositsAndWithdrawalsUpdateActionTaskReference;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskReference(String depositsAndWithdrawalsUpdateActionTaskReference) {
    this.depositsAndWithdrawalsUpdateActionTaskReference = depositsAndWithdrawalsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return depositsAndWithdrawalsUpdateActionTaskRecord
  **/

  public Object getDepositsAndWithdrawalsUpdateActionTaskRecord() {
    return depositsAndWithdrawalsUpdateActionTaskRecord;
  }

  public void setDepositsAndWithdrawalsUpdateActionTaskRecord(Object depositsAndWithdrawalsUpdateActionTaskRecord) {
    this.depositsAndWithdrawalsUpdateActionTaskRecord = depositsAndWithdrawalsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepUpdateInputModelAccountSweepInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepUpdateOutputModel
 */
public class BQAccountSweepUpdateOutputModel   {
  private BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord = null;

  private String accountSweepUpdateActionTaskReference = null;

  private Object accountSweepUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get accountSweepInstanceRecord
   * @return accountSweepInstanceRecord
  **/

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecord getAccountSweepInstanceRecord() {
    return accountSweepInstanceRecord;
  }

  public void setAccountSweepInstanceRecord(BQAccountSweepUpdateInputModelAccountSweepInstanceRecord accountSweepInstanceRecord) {
    this.accountSweepInstanceRecord = accountSweepInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountSweepUpdateActionTaskReference
  **/

  public String getAccountSweepUpdateActionTaskReference() {
    return accountSweepUpdateActionTaskReference;
  }

  public void setAccountSweepUpdateActionTaskReference(String accountSweepUpdateActionTaskReference) {
    this.accountSweepUpdateActionTaskReference = accountSweepUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountSweepUpdateActionTaskRecord
  **/

  public Object getAccountSweepUpdateActionTaskRecord() {
    return accountSweepUpdateActionTaskRecord;
  }

  public void setAccountSweepUpdateActionTaskRecord(Object accountSweepUpdateActionTaskRecord) {
    this.accountSweepUpdateActionTaskRecord = accountSweepUpdateActionTaskRecord;
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


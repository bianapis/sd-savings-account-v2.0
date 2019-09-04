package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienUpdateInputModelAccountLienInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAccountLienUpdateOutputModel
 */
public class BQAccountLienUpdateOutputModel   {
  private BQAccountLienUpdateInputModelAccountLienInstanceRecord accountLienInstanceRecord = null;

  private String accountLienUpdateActionTaskReference = null;

  private Object accountLienUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get accountLienInstanceRecord
   * @return accountLienInstanceRecord
  **/

  public BQAccountLienUpdateInputModelAccountLienInstanceRecord getAccountLienInstanceRecord() {
    return accountLienInstanceRecord;
  }

  public void setAccountLienInstanceRecord(BQAccountLienUpdateInputModelAccountLienInstanceRecord accountLienInstanceRecord) {
    this.accountLienInstanceRecord = accountLienInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return accountLienUpdateActionTaskReference
  **/

  public String getAccountLienUpdateActionTaskReference() {
    return accountLienUpdateActionTaskReference;
  }

  public void setAccountLienUpdateActionTaskReference(String accountLienUpdateActionTaskReference) {
    this.accountLienUpdateActionTaskReference = accountLienUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return accountLienUpdateActionTaskRecord
  **/

  public Object getAccountLienUpdateActionTaskRecord() {
    return accountLienUpdateActionTaskRecord;
  }

  public void setAccountLienUpdateActionTaskRecord(Object accountLienUpdateActionTaskRecord) {
    this.accountLienUpdateActionTaskRecord = accountLienUpdateActionTaskRecord;
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


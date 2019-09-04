package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAccountLienExchangeOutputModel
 */
public class BQAccountLienExchangeOutputModel   {
  private String accountLienExchangeActionTaskReference = null;

  private Object accountLienExchangeActionTaskRecord = null;

  private String accountLienExchangeActionResponse = null;

  private String accountLienInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Account Lien instance exchange service call 
   * @return accountLienExchangeActionTaskReference
  **/

  public String getAccountLienExchangeActionTaskReference() {
    return accountLienExchangeActionTaskReference;
  }

  public void setAccountLienExchangeActionTaskReference(String accountLienExchangeActionTaskReference) {
    this.accountLienExchangeActionTaskReference = accountLienExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return accountLienExchangeActionTaskRecord
  **/

  public Object getAccountLienExchangeActionTaskRecord() {
    return accountLienExchangeActionTaskRecord;
  }

  public void setAccountLienExchangeActionTaskRecord(Object accountLienExchangeActionTaskRecord) {
    this.accountLienExchangeActionTaskRecord = accountLienExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return accountLienExchangeActionResponse
  **/

  public String getAccountLienExchangeActionResponse() {
    return accountLienExchangeActionResponse;
  }

  public void setAccountLienExchangeActionResponse(String accountLienExchangeActionResponse) {
    this.accountLienExchangeActionResponse = accountLienExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Account Lien instance (e.g. accepted, rejected, verified) 
   * @return accountLienInstanceStatus
  **/

  public String getAccountLienInstanceStatus() {
    return accountLienInstanceStatus;
  }

  public void setAccountLienInstanceStatus(String accountLienInstanceStatus) {
    this.accountLienInstanceStatus = accountLienInstanceStatus;
  }


}


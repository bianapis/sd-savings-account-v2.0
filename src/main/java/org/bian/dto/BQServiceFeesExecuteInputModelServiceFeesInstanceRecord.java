package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord;
import org.bian.dto.BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteInputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteInputModelServiceFeesInstanceRecord   {
  private BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile = null;

  private BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord = null;


  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  **/

  public BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(BQServiceFeesInitiateInputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  **/

  public BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(BQServiceFeesExecuteInputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


}


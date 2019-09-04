package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord;
import org.bian.dto.BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile;

import javax.validation.Valid;
  
/**
 * BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord
 */
public class BQServiceFeesExecuteOutputModelServiceFeesInstanceRecord   {
  private BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile = null;

  private BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord = null;


  /**
   * Get feeConfigurationProfile
   * @return feeConfigurationProfile
  **/

  public BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile getFeeConfigurationProfile() {
    return feeConfigurationProfile;
  }

  public void setFeeConfigurationProfile(BQServiceFeesInitiateOutputModelServiceFeesInstanceRecordFeeConfigurationProfile feeConfigurationProfile) {
    this.feeConfigurationProfile = feeConfigurationProfile;
  }


  /**
   * Get feeApplicationRecord
   * @return feeApplicationRecord
  **/

  public BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord getFeeApplicationRecord() {
    return feeApplicationRecord;
  }

  public void setFeeApplicationRecord(BQServiceFeesExecuteOutputModelServiceFeesInstanceRecordFeeApplicationRecord feeApplicationRecord) {
    this.feeApplicationRecord = feeApplicationRecord;
  }


}


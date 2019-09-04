package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord;

import javax.validation.Valid;
  
/**
 * BQAccountSweepExecuteInputModelAccountSweepInstanceRecord
 */
public class BQAccountSweepExecuteInputModelAccountSweepInstanceRecord   {
  private BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord = null;


  /**
   * Get sweepApplicationRecord
   * @return sweepApplicationRecord
  **/

  public BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord getSweepApplicationRecord() {
    return sweepApplicationRecord;
  }

  public void setSweepApplicationRecord(BQAccountSweepUpdateInputModelAccountSweepInstanceRecordSweepApplicationRecord sweepApplicationRecord) {
    this.sweepApplicationRecord = sweepApplicationRecord;
  }


}


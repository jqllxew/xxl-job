package com.xxl.job.admin.core.model;

import java.util.List;

/**
 * @author jqllxew
 * @date 2024/6/26
 */
public class FlagVO {

    private List<Long> flagIds;

    private Integer jobGroup;

    public List<Long> getFlagIds() {
        return flagIds;
    }

    public void setFlagIds(List<Long> flagIds) {
        this.flagIds = flagIds;
    }

    public Integer getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(int jobGroup) {
        this.jobGroup = jobGroup;
    }
}

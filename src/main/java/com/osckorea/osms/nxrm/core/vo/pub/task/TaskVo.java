package com.osckorea.osms.nxrm.core.vo.pub.task;

import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class TaskVo {
    private String id;
    private String name;
    private String type;
    private String message;
    private String currentState;
    private String lastRunResult;
    private Timestamp nextRun;
    private Timestamp lastRun;
}

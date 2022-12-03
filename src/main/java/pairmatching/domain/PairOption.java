package pairmatching.domain;

import pairmatching.domain.command.CourseCommand;
import pairmatching.domain.command.LevelCommand;
import pairmatching.domain.command.MissionCommand;

public class PairOption {

    private final CourseCommand course;
    private final LevelCommand level;
    private final MissionCommand mission;

    public PairOption(CourseCommand course,
                      LevelCommand level,
                      MissionCommand mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }
}

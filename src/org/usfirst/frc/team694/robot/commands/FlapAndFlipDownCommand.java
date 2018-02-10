package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.RobotMap;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FlapAndFlipDownCommand extends CommandGroup {

    public FlapAndFlipDownCommand() {
        addParallel(new CrabArmFlapOutCommand(), RobotMap.PRE_FLIP_WAIT_TIME + RobotMap.POST_FLIP_WAIT_TIME);
        addSequential(new TimedSpatulaFlipDownCommand());
    }
}

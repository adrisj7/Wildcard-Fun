package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CrabArmFlapCommand extends Command {

    public CrabArmFlapCommand() {
        requires(Robot.crabArm);
    }

    protected void initialize() {
        //TODO: Figure out how long we want to run the spatula
        setTimeout(1);
    }

    protected void execute() {
        Robot.crabArm.deacquire();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        Robot.crabArm.stop();
    }
}

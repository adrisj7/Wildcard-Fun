package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class BITCOINAutomationOnCommand extends InstantCommand {
    public BITCOINAutomationOnCommand() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called once when the command executes
    protected void initialize() {
        Robot.acquirer.isBITCOINAutomation = true;
    }

}

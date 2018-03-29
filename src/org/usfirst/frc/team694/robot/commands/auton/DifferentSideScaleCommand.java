package org.usfirst.frc.team694.robot.commands.auton;

import org.usfirst.frc.team694.robot.Robot;
import org.usfirst.frc.team694.robot.commands.LiftMoveToHeightCommand;
import org.usfirst.frc.team694.robot.commands.QuisitorDeacquireCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DifferentSideScaleCommand extends CommandGroup {

    public DifferentSideScaleCommand() {
        // Add Commands here:
        addParallel(new DriveStraightRampDownOnlyCommand(235));
        //TODO: Make constructor for allowing differing inital speeds for ramping
        addSequential(new LiftMoveToHeightCommand(5));
        
        addSequential(new DrivetrainDriveCurveCommand(69.4));//Distance? Ramping or no Ramping?
        addSequential(new DriveStraightRampDownOnlyCommand(-234));
        addSequential(new DrivetrainRotateAbsoluteDegreesPIDCommand(Robot.isRobotOnRight ? -45 : 45));
        
        addParallel(new LiftMoveToHeightCommand(75));//TODO: Ask engineering
        addSequential(new DriveStraightPIDCommand(55, 0.3));
        
        addSequential(new QuisitorDeacquireCommand(), 2);
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
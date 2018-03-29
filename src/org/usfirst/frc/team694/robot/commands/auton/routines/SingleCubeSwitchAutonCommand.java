package org.usfirst.frc.team694.robot.commands.auton.routines;

import org.usfirst.frc.team694.robot.commands.LiftMoveToHeightCommand;
import org.usfirst.frc.team694.robot.commands.QuisitorDeacquireCommand;
import org.usfirst.frc.team694.robot.commands.auton.DriveStraightPIDCommand;
import org.usfirst.frc.team694.robot.commands.auton.DrivetrainMoveInchesEncoderCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SingleCubeSwitchAutonCommand extends CommandGroup {

    public SingleCubeSwitchAutonCommand() {
        
        addParallel(new LiftMoveToHeightCommand(0.0)); //TODO: Find a height for the lift to move to.
        addSequential(new DrivetrainMoveInchesEncoderCommand(0.6, 10.0));
        //addSequential(new ArcCommand(90.0)); TODO: Use an arc command here when we get to making one.
        addSequential(new DrivetrainMoveInchesEncoderCommand(0.6, 42.0));
        //addSequential(new ArcCommand(0.0)); TODO
        addSequential(new DriveStraightPIDCommand(72.0, 0.6));
        addSequential(new QuisitorDeacquireCommand());
        
    }
}

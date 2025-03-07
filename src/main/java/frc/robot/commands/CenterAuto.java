// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.swervedrive.SwerveSubsystem;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.AutoIntakeRun;
import frc.robot.commands.AutoArmRun;

public class CenterAuto extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param Drivebase
   * @param m_intake 
   * @param m_Arm The drivetrain subsystem on which this command will run
   */
  public CenterAuto(SwerveSubsystem Drivebase, Arm m_Arm, Intake m_intake) {
    addCommands(
      Drivebase.getAutonomousCommand("Straight"),
      new AutoArmRun(m_Arm, 1.5),
      new AutoIntakeRun(m_intake, 3));
   
  }
}
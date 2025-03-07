// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import swervelib.math.Matter;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean constants. This
 * class should not be used for any other purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants
{

  public static final double ROBOT_MASS = (148 - 20.3) * 0.453592; // 32lbs * kg per pound
  public static final Matter CHASSIS    = new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), ROBOT_MASS);
  public static final double LOOP_TIME  = 0.13; //s, 20ms + 110ms sprk max velocity lag
  public static final double MAX_SPEED  = Units.feetToMeters(9);
  //Auto constants
  public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
  public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;
  // Maximum speed of the robot in meters per second, used to limit acceleration.

  // Intake Subsystem
  public static int kHighIntakeID = 10; // CAN value of kHighIntakeID
  public static final double kIntakeSpeed = .16; // Update this with your desired intake speed
  public static final double kIntakeIn = kIntakeSpeed;
  public static final double kIntakeOut = -kIntakeSpeed;
  public static final double kAlgaeSpeed = .64; // Update this with your desired intake speed
  public static final double kAlgaeIn = kAlgaeSpeed;
  public static final double kAlgaeOut = -kAlgaeSpeed;
  public static final double kAutoSpeed = .32; // Update this with your desired intake speed

   // Matthew's real arm Subsystem
   public static int kArmID = 9; // CAN value of kHighIntakeID
   public static final double kArmSpeed = .2; // Update this with your desired arm speed
   public static final double kArmIn = kArmSpeed;
   public static final double kArmOut = -kArmSpeed;
   public static final double kArmAutoOut = -.12;
 
// Climb Subsystem
public static int kClimbID = 11; // CAN value of kHighIntakeID
public static final double kClimbSpeed = .37; // Update this with your desired intake speed
public static final double kClimbIn = kClimbSpeed;
public static final double kClimbOut = -kClimbSpeed;


   // Miscellanous
   public static final double kStopSpeed = 0.0; // stop motor speed

//  public static final class AutonConstants
//  {
//
//    public static final PIDConstants TRANSLATION_PID = new PIDConstants(0.7, 0, 0);
//    public static final PIDConstants ANGLE_PID       = new PIDConstants(0.4, 0, 0.01);
//  }

  public static final class DrivebaseConstants
  {

    // Hold time on motor brakes when disabled
    public static final double WHEEL_LOCK_TIME = 10; // seconds
  }

  public static final class AutoConstants {
    public static final double kMaxSpeedMetersPerSecond = Constants.kPhysicalMaxSpeedMetersPerSecond / 4;
    public static final double kMaxAngularSpeedRadiansPerSecond = //
            Constants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
    public static final double kMaxAccelerationMetersPerSecondSquared = 3;
    public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
    public static final double kPXController = 1.5;
    public static final double kPYController = 1.5;
    public static final double kPThetaController = 3;

    public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
  }
  public static class OperatorConstants
  {

    // Joystick Deadband
    public static final double DEADBAND        = 0.1;
    public static final double LEFT_Y_DEADBAND = 0.1;
    public static final double RIGHT_X_DEADBAND = 0.1;
    public static final double TURN_CONSTANT    = 6;
  }

  public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(19);
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(19);
        // Distance between front and back wheels
        public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
                new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(kWheelBase / 2, kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
                new Translation2d(-kWheelBase / 2, kTrackWidth / 2));
}
}
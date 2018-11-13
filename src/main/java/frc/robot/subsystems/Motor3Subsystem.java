/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * A simple motor control subsystem.
 */
public class Motor3Subsystem extends Subsystem {
  TalonSRX m_talon = new TalonSRX(3);   // This subsystem has a motor controller with CAN id 3.

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void start() {
    // start motor by setting power to 20%
    m_talon.set(ControlMode.PercentOutput, 0.2);
  }

  public void stop() {
    // stop motor by setting power to 0%
    m_talon.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

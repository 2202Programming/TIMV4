// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Flywheel extends SubsystemBase {
  /** Creates a new Flywheel. */
  private WPI_TalonFX frontMotor;
  private WPI_TalonFX backMotor;

  public Flywheel(WPI_TalonFX frontMotor, WPI_TalonFX backMotor) {
    this.backMotor = backMotor;
    this.frontMotor = frontMotor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void spinSpeed(double speed) {
    frontMotor.set(speed);
    backMotor.set(speed);
  }

  public void spinPower(double power) {
    frontMotor.set(ControlMode.PercentOutput, power);
    backMotor.set(ControlMode.PercentOutput, power);
  }

}

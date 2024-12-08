// Intake Main

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    TalonFX intakeMotor = new TalonFX(2);
    public static DigitalInput intakeSensor = new DigitalInput(1);

    public Intake() {};

    public void sensorRun(double speed) {
        if (!intakeSensor.get()) {
            intakeMotor.set(speed);
        }
        else {
            intakeMotor.set(0);
        }
    }

    public void run(double speed) {
        intakeMotor.set(speed);
    }
}

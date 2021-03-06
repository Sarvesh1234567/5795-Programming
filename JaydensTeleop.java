import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp


public class JaydensTeleop extends OpMode {
    DcMotor Jaydensbackmotorleft, Jaydensbackmotorright;
    Servo Jaydensclaw, Jaydensarm;


    public void init() {
        Jaydensbackmotorleft = hardwareMap.dcMotor.get("JaydensleftMotor");
        Jaydensbackmotorright = hardwareMap.dcMotor.get("JaydensrightMotor");

        Jaydensbackmotorleft.setDirection(DcMotorSimple.Direction.REVERSE);

        Jaydensclaw = hardwareMap.servo.get("JaydensClaw");
        Jaydensarm = hardwareMap.servo.get("JaydensArm");
    }

    public void loop() {
        Jaydensbackmotorleft.setPower(gamepad1.left_stick_y + gamepad1.right_stick_x);
        Jaydensbackmotorright.setPower(-gamepad1.left_stick_y - gamepad1.right_stick_x);


        if (gamepad1.dpad_up) {
            Jaydensarm.setPosition(97);
        }

        else if (gamepad1.dpad_down) {
            Jaydensarm.setPosition(-97);
        }



    }

}



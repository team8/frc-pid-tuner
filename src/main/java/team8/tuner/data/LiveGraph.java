package team8.tuner.data;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import org.littletonrobotics.junction.Logger;

public class LiveGraph {

	private static Logger logger = Logger.getInstance();

	private LiveGraph() {
	}

	public static void add(String name) {
		add(name, true);
	}

	public static void add(String name, double val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, double[] val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, boolean val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, Pose2d val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, Pose3d[] val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, SwerveModuleState[] val) {
		logger.recordOutput(name, val);
	}

	public static void add(String name, Rotation2d val) {
		logger.recordOutput(name, val.getDegrees());
	}
}

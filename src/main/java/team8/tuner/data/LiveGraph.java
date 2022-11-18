package team8.tuner.data;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import org.littletonrobotics.junction.Logger;

public class LiveGraph {

	private static NetworkTable sLiveTable = NetworkTableInstance.getDefault().getTable("control-center-live");

	private LiveGraph() {
	}

	public static void add(String key, double value) {
		sLiveTable.getEntry(key).setDouble(value);
		Logger.getInstance().recordOutput(key, value);
	}

	public static void add(String key, boolean value) {
		sLiveTable.getEntry(key).setBoolean(value);
		Logger.getInstance().recordOutput(key, value);
	}
}

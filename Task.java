import java.awt.*;
abstract class Task {
	public long startTime;
	public int priority;
	public int repeat;
	public abstract void start();
	public boolean canStart() {
		return startTime > System.currentTimeMillis();
	}

	public static long addTimeToNow(int hours, int minutes, int seconds) {
		long time = System.currentTimeMillis();
		time += hours   * 1000 * 60 * 60;
		time += minutes * 1000 * 60;
		time += seconds * 1000;
		return time;
	}
}
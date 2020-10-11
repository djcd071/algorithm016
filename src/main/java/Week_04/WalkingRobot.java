package Week_04;

/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class WalkingRobot {

	public int robotSim(int[] commands, int[][] obstacles) {
		int x = 0;
		int y = 0;

		int direction = 0;

		int maxDist = 0;

		for (int i =0; i< commands.length; i++) {

			if (commands[i] < 0) {
				direction = getNewDirection(direction, commands[i]);
			} else {

				x = getNewX(commands[i], x, y,  direction, obstacles);
				y = getNewY(commands[i], y, x, direction, obstacles);

				maxDist = Math.max(maxDist, x*x+y*y);

			}

		}

		return maxDist;

	}

	int getNewX(int cmd, int x, int y, int direction, int[][] obstacles) {

		if (direction == 1) { // east

			int obsX = 30001;

			for (int[] loc: obstacles ) {
				if (y == loc[1]) {
					if (loc[0] > x && loc[0] <= x+cmd) {
						obsX = Math.min(obsX, loc[0]);
					}
				}
			}

			if (obsX > x && obsX <= x+cmd) {
				x = obsX -1;
			} else {
				x = x + cmd;
			}
		}

		if (direction == 3) { //west

			int obsX = -30001;

			for (int[] loc: obstacles ) {
				if (y == loc[1]) {
					if (loc[0] < x && loc[0] >= x-cmd) {
						obsX = Math.max(obsX, loc[0]);
					}
				}
			}

			if (obsX < x && obsX >= x-cmd) {
				x = obsX +1;
			} else {
				x = x - cmd;
			}

		}

		return x;

	}

	int getNewY(int cmd, int y, int x, int direction, int[][] obstacles) {

		if (direction == 0) { // north

			int obsY = 30001;

			for (int[] loc: obstacles ) {
				if (x == loc[0]) {
					if (loc[1] > y && loc[1] <= y+cmd) {
						obsY = Math.min(obsY, loc[1]);
					}
				}
			}

			if (obsY > y && obsY <= y+cmd) {
				y = obsY -1;
			} else {
				y = y + cmd;
			}
		}

		if (direction == 2) { //south

			int obsY = -30001;

			for (int[] loc: obstacles ) {
				if (x == loc[0]) {
					if (loc[1] < y && loc[1] >= y-cmd) {
						obsY = Math.max(obsY, loc[1]);
					}
				}
			}

			if (obsY < y && obsY >= y-cmd) {
				y = obsY +1;
			} else {
				y = y - cmd;
			}

		}

		return y;

	}

	int getNewDirection(int direction, int cmd) {
		if (cmd == -1) {
			direction++;
		}

		if (cmd == -2) {
			direction--;
		}

		if (direction == 4 ) {
			direction = 0;
		}

		if (direction == -1) {
			direction = 3;
		}

		return direction;
	}
}

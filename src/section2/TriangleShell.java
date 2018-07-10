package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot Jeff = new Robot();

	void go() {
		Jeff.hide();
		Jeff.penDown();
		Jeff.setPenWidth(5);
		Jeff.moveTo(800,550);

		// 6. Make the robot go as fast as possible
		Jeff.setSpeed(150);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;

		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {

			// 9. Change the color of the pen to a random color
			Jeff.setRandomPenColor();

			// 8. Increase the length variable by 10
			length += 10;

			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
			Jeff.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		for (int j = 0; j < 3; j++) {
			Jeff.move(length);
			Jeff.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}

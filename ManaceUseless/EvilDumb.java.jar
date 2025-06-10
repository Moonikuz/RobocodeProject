package Manaceuseless;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * EvilDumb - a robot by (your name here)
 */
public class EvilDumb extends AdvancedRobot
{
	/**
	 * run: EvilDumb's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			getX();
            getY();
			getHeading();
            getGunHeading();
            getRadarHeading();
			getBattleFieldWidth();
            getBattleFieldHeight();
			setAhead(40);
			setTurnGunRight(110);
			execute();
		    setAhead(50);
			setTurnGunRight(80);
			execute();
			setBack(40);
			setTurnGunRight(90);
			execute();
			setAhead(30);
			setTurnLeft(41);
			execute();
		    setTurnRight(38);
	        setAhead(40);
			execute();
			setTurnLeft(70);
			setAhead(50);
			execute();
			setTurnLeft(10000);
		    setMaxVelocity(5);
		    ahead(10000);
		    execute();
				
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		setFire(1);
		setBack(60);
		setTurnLeft(41);
		execute();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		setTurnLeft(10000);
		setMaxVelocity(5);
		ahead(100);
		execute();
		
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		setBack(40);
		setTurnRight(110);
		execute();
		ahead(80);
	}	
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
}

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
			setTurnRight(10000);
		    setMaxVelocity(5);
		    ahead(200);
		    execute();
			setTurnGunRight(80);
			setBack(40);
			execute();
			setTurnGunRight(10000);
		    setMaxVelocity(5);
		    ahead(200);
			execute();
				
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fireBullet(1);
        setBack(90);
		setTurnLeft(89);
		execute();
		setTurnRight(70);
		setAhead(70);
		execute();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		setTurnRight(80);
		setBack(30);
		execute();
        setTurnGunLeft(10000);
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
		setTurnRight(90);
		execute();
		ahead(80);
	}	
	public void onHitRobot(HitRobotEvent e) {
        fire(3);
		setBack(60);
		setTurnRight(60);
		execute();
	}
}

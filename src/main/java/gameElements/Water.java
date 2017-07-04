package gameElements;

import java.awt.Point;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Game Element Water
 * 
 * <p>
 * This class is a subclass of Game Items. It has the ID 0 and it has no impact
 * at all, if the player hits water on the shootingArea.
 *
 * <p>
 * Water uses in his constructor {@link #Water} the constructor
 * {@link #AGameItems} to set the ID. Use {@link #waterImpact} to get the impact
 * of the water.
 * 
 * <p>
 *
 * @author Lea Baumgärtner
 * @version 1.0
 */

public class Water extends AGameItem {

	private static final Logger logger = LogManager.getLogger(Water.class);

	boolean hide;
	boolean destroy;
	Point p;
	String name;

	/**
	 * Set name of a WaterField
	 * 
	 * @param name
	 */
	public Water(String name) {
		this.name = name;
		hide = true;
		destroy = false;
	}

	/**
	 * Set the visibility of the Water
	 * 
	 * @param hide
	 * 
	 * @return hide
	 */
	@Override
	public boolean isHidden(boolean hide) {
		logger.info("The method Water.isHidden has been called!");
		return hide;
	}

	/**
	 * Return the noPoints of a WaterField if it is shot.
	 * 
	 * @return noPoints
	 */
	@Override
	public int getScore() {
		logger.info("The method Water.getScore has been called!");
		logger.info("The player gets 0 points.");
		int noPoints = 0;
		return noPoints;
	}

	/**
	 * Sets the destruction of a WaterField
	 * 
	 * @param destroy
	 * @return destroy
	 * 
	 */
	@Override
	public boolean isDestroyed(boolean destroy) {
		logger.info("The method Water.isDestroyed has been called!");
		return destroy;
	}

	/**
	 * Returns ID of the Water
	 * 
	 * @return 0
	 */
	@Override
	public int getID() {
		logger.info("The method Water.getID has been called!");
		logger.info("ID = 0 should be returned!");
		return 0;
	}

	/**
	 * Sets the position of a water field
	 * 
	 * @param p
	 */
	@Override
	public void setPosition(Point p) {
		logger.info("The method Water.setPosition has been called!");
		this.p = p;

	}

	/**
	 * Returns the position of a water field
	 * 
	 * @return p
	 */
	@Override
	public Point getPosition() {
		logger.info("The method Water.getPosition has been called!");
		return p;
	}

	/**
	 * Returns X-coordinate of the position of a water field
	 * 
	 * @return p.x
	 */
	@Override
	public int getXPosition() {
		logger.info("The method Water.getXPosition has been called!");
		return p.x;
	}

	/**
	 * Returns Y-coordinate of the position of a water field
	 * 
	 * @return p.y
	 */
	@Override
	public int getYPosition() {
		logger.info("The method Water.getYPosition has been called!");
		return p.y;
	}

	/**
	 * Returns size of a water field
	 * 
	 * @return 1
	 */
	@Override
	public int getSize() {
		logger.info("The method Water.getSize has been called!");
		return 1;
	}

}
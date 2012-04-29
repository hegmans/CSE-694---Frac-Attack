package edu.osu.cse694;

/**
 * A class containing a player's name, age, rank, and high score.
 */
public class PlayerProfile {
	private String name;
	private int age;
	private Rank rank;
	private int highScore;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            the player's name
	 * @param age
	 *            the player's age
	 */
	public PlayerProfile(String name, int age) {
		this.name = name;
		this.age = age;
		this.highScore = 0;
		this.rank = Rank.beginner;
	}

	/**
	 * Returns the player's name.
	 * 
	 * @return player name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the player's age.
	 * 
	 * @return player age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * Returns the player's high score.
	 * 
	 * @return player high score
	 */
	public int getHighScore() {
		return this.highScore;
	}

	/**
	 * Sets the player's high score.
	 * 
	 * @param highScore
	 *            the new high score
	 */
	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	/**
	 * Returns the player's rank.
	 * 
	 * @return player rank
	 */
	public Rank getRank() {
		return this.rank;
	}

	/**
	 * Promotes the player to the next rank. Does nothing if the player is
	 * already of expert rank.
	 */
	public void promote() {
		switch (this.rank) {
		case beginner:
			this.rank = Rank.intermediate;
			break;
		case intermediate:
			this.rank = Rank.advanced;
			break;
		case advanced:
			this.rank = Rank.expert;
			break;
		}
	}
}

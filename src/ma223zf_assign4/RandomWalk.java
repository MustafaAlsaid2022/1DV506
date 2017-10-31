package ma223zf_assign4;

import java.util.Random;

public class RandomWalk implements RndWalk {
	
	private int XPos;
	private int YPos;
	private int maxOfSteps;
	private int numOfSteps = 0;
	private int sizeOfPlan;
	private int randomDirection;

	Random randomStep = new Random();





	public RandomWalk(int max, int size) {

		this.maxOfSteps = max;
		this.sizeOfPlan = size;
		this.XPos = 0;
		this.YPos = 0;

	}

	public String toString() {

		return "Number of steps so far : " + numOfSteps + "\n" + "Current position: " + "(" + this.XPos + ","
				+ this.YPos + ")";
	}

	public void takeStep() {

		randomDirection = randomStep.nextInt(4);

		switch (randomDirection) {

		case 0:
			this.XPos += 1; // Move Right.
			numOfSteps++;
			break;

		case 1:
			this.YPos += 1; // Move Up.
			numOfSteps++;
			break;

		case 2:
			this.XPos -= 1; // Move Left.
			numOfSteps++;
			break;

		case 3:
			this.YPos -= 1; // Move Down.
			numOfSteps++;
			break;
		}
	}

	public boolean moreSteps() {
		if (numOfSteps < maxOfSteps)
			return true;
		return false;
	}

	public boolean inBounds() {
		if (XPos < sizeOfPlan && XPos > -sizeOfPlan && YPos < sizeOfPlan && YPos > -sizeOfPlan)
			return true;
		return false;
	}

	public void walk() {	//Perform walk if it is in bound or there are more steps.
		while (inBounds() && moreSteps()) {
			takeStep();

		}

	}

	public void reset() {

		numOfSteps = 0;
		XPos = 0;
		YPos = 0;
	}

}



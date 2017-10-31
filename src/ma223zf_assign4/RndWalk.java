package ma223zf_assign4;

public interface RndWalk {
	
	String toString();	
	void takeStep();		//Take one step.	
	boolean moreSteps();	//Return true if there more steps.
	boolean inBounds();		//Return true if the person in bound.
	void walk();			//Run the walk method.
	void reset();			//Reset counters.


}

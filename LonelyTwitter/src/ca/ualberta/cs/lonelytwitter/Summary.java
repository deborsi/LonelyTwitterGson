package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;


public class Summary implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7441454300463013631L;
	
	private long avgLength;
	
	public long getAvgLength()
	{
		return avgLength;
	}
	
	public void setAvgLength(long avgLength)
	{ 
		this.avgLength = avgLength;
	}
}

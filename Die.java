public class Die 
{
	private int face;
	
	
	public Die()
	{
		face = 1;
	}
	
	public Die(int face)
	{
		this.face = face;
	}
	
	public int roll()
	{
		face = (int)(Math.random() * 6) + 1;
		return face;
	}
	
	public int getFace()
	{
		return face;
	}
	
	public void setFace(int f)
	{
		face = f;
	}
	
	public String toString()
	{
		return "Face: " + face;
	}
	
	
	
}
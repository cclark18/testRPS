import com.butts.rockpaperscissors.RPSUtils;

import junit.framework.Assert;
import android.test.AndroidTestCase;


public class TestRPSUtils extends AndroidTestCase {
	public void testGetWinner0(){
		Assert.assertEquals("Nobody", RPSUtils.getWinner("rock", "rock"));
	}
	public void testGetWinner1(){
		Assert.assertEquals("You", RPSUtils.getWinner("rock", "paper"));
	}
	public void testGetWinner2(){
		Assert.assertEquals("Android", RPSUtils.getWinner("rock", "scissors"));
	}
	public void testGetWinner3(){
		Assert.assertEquals("Android", RPSUtils.getWinner("paper", "rock"));
	}
	public void testGetWinner4(){
		Assert.assertEquals("Nobody", RPSUtils.getWinner("paper", "paper"));
	}
	public void testGetWinner5(){
		Assert.assertEquals("You", RPSUtils.getWinner("paper", "scissors"));
	}
	public void testGetWinner6(){
		Assert.assertEquals("You", RPSUtils.getWinner("scissors", "rock"));
	}
	public void testGetWinner7(){
		Assert.assertEquals("Android", RPSUtils.getWinner("scissors", "paper"));
	}
	public void testGetWinner8(){
		Assert.assertEquals("Nobody", RPSUtils.getWinner("scissors", "scissors"));
	}
	public void testGetWinner9(){
		Assert.assertEquals("error", RPSUtils.getWinner("aasd", "rock"));
	}
	public void testGetWinner10(){
		Assert.assertEquals("error", RPSUtils.getWinner("paper", "gsdfs"));
	}
	public void testGetWinner11(){
		Assert.assertEquals("error", RPSUtils.getWinner("aasd", "dsfa"));
	}
}

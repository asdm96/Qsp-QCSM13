package demo.actiTime.GenericUtils;

public class ProjectUtility {
	public void sleepInseconds(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

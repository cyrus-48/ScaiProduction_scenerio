package cCS210;

public class Screen implements ScreenSpec {
    String resolution;
	int refreshRate;
	int responseTime;

	// a constructor to set the parameters
	public Screen(String resolution, int refreshRate, int responseTime) {
		this.resolution = resolution;
		this.refreshRate = refreshRate;
		this.responseTime = responseTime;
	}

	@Override
//method to get the resolution
	public String getResolution() {
		return resolution;
	}

	@Override
//method to get the refresh rate
	public int getRefreshRate() {

		return refreshRate;
	}

	@Override
// method to get the response time
	public int getResponseTime() {
		return responseTime;
	}

	@Override
// toString method to return the values set to the nethod
	public String toString() {

		return "Resolution    : " + resolution + "\n" + "Refresh Rate : " + refreshRate + "\n" + "Response Time : "
				+ responseTime + "\n";
	}
}

    


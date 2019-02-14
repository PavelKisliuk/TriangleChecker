public class TrianglePropertyTable {
	private String information;
	private String property;

	public TrianglePropertyTable(String information, String property)
	{
		this.information = information;
		this.property = property;
	}

	public void setProperty(String property)
	{
		this.property = property;
	}

	public String getInformation() {
		return this.information;
	}

	public String getProperty() {
		return this.property;
	}
}

package demo;

import demo.Description.Color;

@Description(author = @Author(group = "", name = ""),value="222",arrays={"a","b"},color=Color.BLACK)
public class Utility {
	@Author(name = "test", group = "com")
	public String work() {
		return "work..";
	}
}

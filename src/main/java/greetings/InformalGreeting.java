package greetings;

@Informal
public class InformalGreeting extends Greeting {
	@Override
	public String greet(String name) {
		return "Hi, " + name + "!";
	}
}

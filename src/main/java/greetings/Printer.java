package greetings;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Printer {
	@Inject @Informal
	Greeting greeting;
	
	private String name;
	private String salutation;
	
	public String createSalutation() {
		this.salutation = greeting.greet(name);
		
		return null;
	}
	
	public String getSalutation() {
		return salutation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

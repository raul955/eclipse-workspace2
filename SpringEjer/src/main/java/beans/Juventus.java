package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("barcelona")
public class Juventus implements IEquipo {

	@Override
	public String mostrar() {
		return "Juventus";
	}

}

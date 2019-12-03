package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("randomname")
//@Qualifier("randomname")
public class Barcelona implements IEquipo {

	@Override
	public String mostrar() {
		
		return "Barcelona";
	}

}

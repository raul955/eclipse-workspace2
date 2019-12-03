package beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class RaulBeanPostProcessor implements BeanPostProcessor{

	
	//sirve para poder codificar alguna lógica adicional antes y después de la inicialización
	//y destrucción del bean
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("INTERFAZ Después de la inicializacion " + nombreBean);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("INTERFAZ Antes de la inicializacion " + nombreBean);
		return bean;
	}

}

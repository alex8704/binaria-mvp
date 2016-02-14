package co.com.binaria.mvp.dispatch;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import co.com.binaria.mvp.PresenterBuilder;
import co.com.binaria.mvp.ViewBuilder;
import co.com.binaria.mvp.ViewProvider;

public class ViewProviderImpl implements ViewProvider, BeanPostProcessor{
	private ViewBuilder viewBuilder;
	private PresenterBuilder presenterBuilder;
	private ViewBuilder viewConfigurer;
	private PresenterBuilder presenterConfigurer;
	
	//init-method
	protected void init(){
		
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

}

package web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LogManager.getLogger();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("startTimeController", System.currentTimeMillis());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		long startTimeController = Long.valueOf(request.getAttribute("startTimeController").toString());
		Thread.sleep(3000);
		int totalTime = (int) ((System.currentTimeMillis() - startTimeController) / 1000);
		modelAndView.addObject("totalTime", totalTime);
		logger.info(handler + ":  post handle method, totalTime passed: " + totalTime +"sec");

	}

}

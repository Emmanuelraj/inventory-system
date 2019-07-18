package com.example.inventorysystem.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class InventorySystemInterceptor implements HandlerInterceptor
{
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)	throws Exception 
	{
		
		
		System.out.println("preHandle method");
		
		Calendar cal = Calendar.getInstance();
		
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); //getting the day which request is made
		
		
		if(dayOfWeek ==1)  // 1 means sunday 2 means monday ...7 saturday
		{
			response.getWriter().write("Today website closed");
			
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception 
	{
	   System.out.println("postHandle method");	
	
	//This method get called after spring mvc view executes method for request
	   
	   
		
	}
	
	
	
	//@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("after completion method in interceptor");
		// TODO Auto-generated method stub
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	
	

}

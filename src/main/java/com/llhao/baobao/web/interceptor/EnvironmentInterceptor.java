package com.llhao.baobao.web.interceptor;

import com.llhao.baobao.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by llhao on 2017/4/14.
 */
public class EnvironmentInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        return true;
    }
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}

package com.mwb.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpRequest;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by admin on 2019/2/11.
 */
@Component

public class MyFilter extends ZuulFilter{

    @Override
    public String filterType() {
        //过滤器类型，一共有4种不同周期的类型，pre:路由之前；routing:路由之时；post:代表路由之后；error:错误时调用

        return "pre";
    }

    @Override
    public int filterOrder() { //过滤器使用顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
        //是否允许过滤，为true，即始终过滤
    }

    @Override
    public Object run() throws ZuulException {
        //过滤器的具体逻辑，以下的内容大致是，有test参数允许访问，没有test参数不允许访问
        RequestContext requestContent= RequestContext.getCurrentContext();
        HttpServletRequest request=requestContent.getRequest();
        Object o=request.getParameter("test");
        if(o==null){
            requestContent.setSendZuulResponse(false);
            requestContent.setResponseStatusCode(401);
            try{
                System.out.print(requestContent.getResponse().toString());
                requestContent.getResponse().getWriter().write("test is empty");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        return null;
    }
}

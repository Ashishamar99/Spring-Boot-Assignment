package com.brillio.technical_tracker.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class RouteFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}

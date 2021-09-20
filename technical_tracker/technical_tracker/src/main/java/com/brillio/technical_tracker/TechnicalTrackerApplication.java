package com.brillio.technical_tracker;

import com.brillio.technical_tracker.filter.ErrorFilter;
import com.brillio.technical_tracker.filter.PostFilter;
import com.brillio.technical_tracker.filter.PreFilter;
import com.brillio.technical_tracker.filter.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class TechnicalTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalTrackerApplication.class, args);
	}

	@Bean
	public PostFilter getPostFilter(){
		return new PostFilter();
	}

	@Bean
	public ErrorFilter getErrorFilter(){
		return new ErrorFilter();
	}

	@Bean
	public PreFilter getPreFilter(){
		return new PreFilter();
	}

	@Bean
	public RouteFilter getRouteFilter(){
		return new RouteFilter();
	}

}

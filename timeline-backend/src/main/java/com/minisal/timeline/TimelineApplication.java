package com.minisal.timeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class TimelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimelineApplication.class, args);
	}


	// 跨域访问设置
	@Configuration
	public class CorsConfig {
		private CorsConfiguration buildConfig() {
			CorsConfiguration corsConfiguration = new CorsConfiguration();
			corsConfiguration.addAllowedOrigin("*"); // 1允许任何域名使用
			corsConfiguration.addAllowedHeader("*"); // 2允许任何头
			corsConfiguration.addAllowedMethod("*"); // 3允许任何方法（post、get等）
			return corsConfiguration;
		}

		@Bean
		public CorsFilter corsFilter() {
			UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
			source.registerCorsConfiguration("/**", buildConfig()); // 4
			return new CorsFilter(source);
		}
	}
}



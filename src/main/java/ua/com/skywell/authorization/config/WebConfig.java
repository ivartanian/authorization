//package ua.com.skywell.authorization.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.*;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import javax.sql.DataSource;
//
//@Configuration
////@EnableWebMvc
//@ComponentScan(basePackages = "ua.com.skywell.authorization")
//@PropertySource({"classpath:persistence.properties"})
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
//
//    @Override
//    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    @Override
//    public void addViewControllers(final ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/oauthTemp");
//    }
//
//    @Override
//    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//    }
//
////    @Autowired
////    private Environment env;
////
////    @Bean
////    public DataSource dataSource() {
////        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
////        dataSource.setUrl(env.getProperty("jdbc.url"));
////        dataSource.setUsername(env.getProperty("jdbc.user"));
////        dataSource.setPassword(env.getProperty("jdbc.pass"));
////        return dataSource;
////    }
//}
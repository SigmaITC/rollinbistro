package se.sigmaitc.rollinbistro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan( basePackages = {"se.sigmaitc.rollinbistro.entity"} )
public class App {
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    public App() {
        System.out.println("init App");
    }
    
//    @Bean
//    ServletRegistrationBean h2servletRegistration(){
//        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
//        registrationBean.addUrlMappings("/console/*");
//        return registrationBean;
//    }
}

package egovframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

import egovframework.com.config.EgovWebApplicationInitializer;

/**
 * Spring Boot Main Class
 * 
 * <pre>
 * &#064;ServletComponentScan
 * 	: basePackages 하위 서블릿컴포넌트(필터, 서블릿, 리스너)를 스캔해서 빈으로 등록한다.
 *    다만 서블릿컴포넌트를 그냥 등록하는게 아니고 해당 서블릿컴포넌트 클래스에는 아래와 같이 별도의 어노테이션이 추가되어 있어야 한다.
      필터: &#064;WebFilter
	  서블릿: &#064;WebServlet
	  리스너: &#064;WebListener
	  이는 SpringBoot의 내장톰캣을 사용하는 경우에만 동작한다.
 * </pre>
 * @author ecbank
 */
@ServletComponentScan(basePackages = {"egovframework,net.ecbank"})
@SpringBootApplication
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication {
	public static void main(String[] args) {
		System.out.println("##### EgovBootApplication Start #####");

		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		//springApplication.setLogStartupInfo(false);
		springApplication.run(args);

		System.out.println("##### EgovBootApplication End #####");
	}

}

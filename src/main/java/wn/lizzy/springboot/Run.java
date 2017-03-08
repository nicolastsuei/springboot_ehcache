package wn.lizzy.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication申明让spring boot自动给程序进行必要的配置，
	@SpringBootApplication
	等价于
	@Configuration
	@EnableAutoConfiguration
	@ComponentScan
 * Run.java
 * @author cuilj  2017年3月8日--上午10:56:27
 *
 */
@SpringBootApplication
public class Run 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Run.class, args);
    }
}

package ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableCircuitBreaker 注解开启断路器功能
 * @EnableDiscoveryClient 注解开启客户端消费者
 * @author Administrator
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class RibbonApplication {

	/**
	 * 创建RestTemplate实例，并通过@LoadBalanced注解开启均衡负载能力
	 * 
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

}

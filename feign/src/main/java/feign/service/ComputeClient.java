package feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import feign.ComputeClientHystrix;

/**
 * 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
 * fallback=ComputeClientHystrix.class,指定熔断处理类
 * 通过Spring MVC的注解来配置compute-service服务下的具体实现。
 * @author Administrator
 *
 */
@FeignClient(value = "compute-service",fallback=ComputeClientHystrix.class)
public interface ComputeClient {

	@RequestMapping(value = "/add",method = RequestMethod.GET)
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
	
}

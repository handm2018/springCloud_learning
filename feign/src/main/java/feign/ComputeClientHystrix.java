package feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import feign.service.ComputeClient;

@Component
public class ComputeClientHystrix implements ComputeClient {

	public Integer add(@RequestParam(value = "a")Integer a,@RequestParam(value = "b") Integer b) {
		return -9999;
	}

}

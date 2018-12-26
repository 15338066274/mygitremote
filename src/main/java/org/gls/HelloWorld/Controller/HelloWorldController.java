package org.gls.HelloWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@ResponseBody	//有了ResponseBody注解，可以把返回内容直接输出到页面
	@RequestMapping("helloWorld")
	public String helloWorld() {
		return "hello world;hello spring boot";
	}
}	//传统写法：org.gls.HelloWorld.Controller手工写到scan扫描器中（即加入spring容器）
	//spring boot自动配置：将org.gls.HelloWorld;及org.gls.HelloWorld.xxx纳入spring容器

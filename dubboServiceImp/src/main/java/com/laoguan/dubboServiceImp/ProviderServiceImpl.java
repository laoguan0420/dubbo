package com.laoguan.dubboServiceImp;

import com.laoguan.dubboService.IProviderService;

/**
 * Hello world!
 *
 */
public class ProviderServiceImpl implements IProviderService
{

	public String sayHello(String name) {
		
		return "Hello Provider1" + name;
	}
}

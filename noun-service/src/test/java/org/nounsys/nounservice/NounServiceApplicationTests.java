package org.nounsys.nounservice;

import org.junit.jupiter.api.Test;
import org.nounsys.nounservice.bussiness.UserPayService;
import org.nounsys.nounservice.bussiness.UserPayServiceStrategyFactory;
import org.nounsys.nounservice.bussiness.impl.VipPayService;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class NounServiceApplicationTests {
	@Test
	void contextLoads() {
		calPrice();
	}

	public  void calPrice() {
		BigDecimal orderPrice = new BigDecimal("100");
		String vipType = "Vip";
		//指定用户类型，获得相对应的策略
		UserPayService strategy = UserPayServiceStrategyFactory.getByUserType(vipType);
		System.out.println(strategy.quote(new BigDecimal(100)));
	}
}

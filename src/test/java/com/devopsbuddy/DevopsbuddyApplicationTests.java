package com.devopsbuddy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.devopsbuddy.backend.service.I18NService;

/**
 * 
 * @author Narendra
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DevopsbuddyApplication.class)
@WebAppConfiguration
public class DevopsbuddyApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
	}

}

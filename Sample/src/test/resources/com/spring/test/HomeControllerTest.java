/*package com.mvc.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;

@RunWith(SpringJUnit4ClassRunner.class)
public class HomeControllerTest extends AbstractContextControllerTests {

	private MockMvc mockMvc;

	private User user;

	// @Autowired
	// private HomeService homeService;
	//
	// @Autowired
	// private HomeController homeController;

	@Before
	public void setup() {
		// this.mockMvc =
		// MockMvcBuilders.standaloneSetup(homeController).build();
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
		user = new User();
		user.setFirstName("nag12");
		user.setLastName("anchala");
		user.setEmail("anr1@lsnsoft.in");
		// MockitoAnnotations.initMocks(this);

	}

	// @Test
	// public void printMsgTest() throws Exception {
	// Mockito.when(this.homeService.printMsg("Helloooo")).thenReturn(
	// "Testing Controllerrrrrrr");
	// ResultActions resultActions = this.mockMvc.perform(post("/info/{name}",
	// "Helloooo"));
	// ResultActions result = resultActions.andDo(print());
	// System.out.println("ResultActions : " + result.toString());
	// ResultActions ra = resultActions.andExpect(status().isOk());
	// System.out.println("ResultActions : " + ra.toString());
	// }

	@Test
	public void saveUserTest() throws Exception {
		// Mockito.when(homeService.saveUser(any(User.class))).thenReturn(user);
		
		 * ResultActions resultActions = mockMvc.perform(post("/user/info")
		 * .contentType(MediaType.APPLICATION_JSON) .param("fristName",
		 * user.getFirstName()) .param("lastName", user.getLastName())
		 * .param("email", user.getEmail())); ResultActions result =
		 * resultActions.andDo(print()); System.out.println("ResultActions : " +
		 * result.toString()); ResultActions ra =
		 * resultActions.andExpect(status().isOk());
		 * System.out.println("ResultActions : " + ra.toString()); String s =
		 * resultActions.andReturn().getResponse().getContentAsString();
		 * System.out.println("MVC Response is: " + s);
		 

		ResultActions resultActions = mockMvc
				.perform(
						post("/user/info")
								.contentType(MediaType.APPLICATION_JSON)
								.param("firstName", user.getFirstName())
								.param("lastName", user.getLastName())
								.param("email", user.getEmail()))
				
				 * .content("{ \"firstName\":\"nags\"\", \"lastName":\"indras",
				 * \"email":\"nagindras@mail"}".getBytes())
				 .andDo(print())
				// System.out.println("ResultActions : " + result.toString());
				.andExpect(status().isOk());
		// System.out.println("ResultActions : " + ra.toString());

		System.out.println("response is:");
		System.out.println(resultActions.andReturn().getResponse()
				.getContentAsString());
		System.out.println(1);
	}
	// @Configuration
	// static class HomeControllerTestConfiguration {
	//
	// @Bean
	// public HomeService homeService() {
	// return Mockito.mock(HomeService.class);
	// }
	//
	// }
}
*/
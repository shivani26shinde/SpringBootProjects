Difficulties:

1. SpringBoot war deploy to tomcat:

	Was giving--- resource not found
	
	Solution: 
	
	//Adding this SpringBootServletInitializer and the configure method
	
	@SpringBootApplication
	
	public class Application extends SpringBootServletInitializer 
	{ 
		@Override
		
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
			return application.sources(Application.class);
			
		}

		public static void main(String[] args) throws Exception {
		
			SpringApplication.run(Application.class, args);
			
		} 	
	}
	
2. Tomcat Username and Password:

	Change it in the tomcat--conf---tomcat-users file
	
3. Converting application to War

	JAVA_HOME path verification
	
	Add packaging war to POM file
	
	cmd: mvnw clean ---- mvwn install --- war file gets installed to target folder
	
4. Add Tomcat dependency in the POM file

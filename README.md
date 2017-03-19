# SpringBootProjects

Basic understanding about SpringBoot using the Spring Tool Suite

1. SpringApplication.run(App.class,args)

	This is a static class with static method run and it has static annotation SpringApplication
	
	Sets ups default config since, springboot favours convention over cofig
	
	Starts spring application context i.e.container
	
	Performs, class path scan...depending on what annotation given
	
	Starts Tomcat server
	
SpringBoot--startalone ie. dont have to create servlet container


2. Controller--java class--with annotation---tells what url it is and what should be the output


3. If no dependency mentioned and just the parent is present, then the parent will inform maven which jars are to be downloaded once the dependency is written. So, it does the configuration/setup and once the dependency description is given, it will tell maven to download it.(parent kind of tells the version,etc)


4. Bill of Materials---Combination of jars(working well together)
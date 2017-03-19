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


5. Embedded Tomcat Server(included)

	No installation/deployment
	
	Everything is in one package--servlet config is now application config
	
	Standalone--easy to apply,develop,deploy
	
	Advantage for microservice architecture--convinient--as only 1 command required
	

6. View Tier--handled by MVC---Lets you build controllers that map requests


7. For RestAPI:

	Identify resources--like "Topic" in the code
	
	GET --- for root URL say "/topics"---then design API to get all the resources related to that URL 	
	(Root URL name is same as the resource)
	
	POST --- creating a new topic
	
	PUT --- /topics/id---updates id element
	
	DELETE -- /topics/id---deletes id element

	
Business service--Singleton i.e. other classes will access only the instance(one instance only) created by spring.

To ask spring for it -- create a private variable and use annotation "@Autowired", this is dependency injection.

In brief: when spring will see "Service" annotation it will create a single instance and when it will see in any other class "Autowired" annotation, it will inject the instance to the given variable. 

8. Creating a Business Service
	
	Create a java class
	
	Give annotation "@Service"
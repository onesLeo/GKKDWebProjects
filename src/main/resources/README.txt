> first of all if the clicking menu doesn't work, check the version of the webjars and bootstrap version on 
  pagebootstrap.html to make sure they are match
  
> second : make sure that the order of bootstrap correct
	for example the correct order supposed to be	
	----------------------------------------------------------------------------
	<script th:src="@{/js/jquery.js}"></script>
	<script th:src="@{/webjars/jquery/3.1.1/jquery.min.js}"></script>
	<script th:src="@{/js/jquery-ui-1.10.4.min.js}"></script>
	<!-- bootstrap -->
	<script type="text/javascript"
		th:src="@{/webjars/bootstrap/3.3.7/js/bootstrap.min.js}"></script>
	----------------------------------------------------------------------------
	
	those script example is on the home.html
	
	and for the bootstrap css supposed to be like this:
	----------------------------------------------------------------------------	
	<link rel="stylesheet" type="text/css" th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap.min.css}" />
	<link rel="stylesheet" type="text/css" th:href="@{/webjars/bootstrap/3.3.7/css/bootstrap-theme.css}" />
	----------------------------------------------------------------------------
	the bootstrap.min comes first and followed by bootstrap-theme.css
	
	
	==========================NEXT TO DO==========================
	1. implement userdetailservice -->>(DONE)
		- Need to make sure the other ROLE whether working well or not
	2. create relation database of the church -->>(DONE)
		>> Landing Page (All churches information)
	3. Form Registration new congregation & Service Report & 
		>> Make two tabs <<
		- Registration if there is a new congregation
		- Data ibadah
	4. VIP Form Data
	5. Crew Form & Crew Categories
	6. Data kehadiran
	7. Roles Form
	8. zoned crew from
	9. Schedule Form
	10. The Levites Form
	11. Event Crew Form
	12. Report
		- Kehadiran Ibadah n Crew
		- VIP List 
	13. Contact Us
	
	
	==========================ERROR AFTER SOME CHANGES==================
	- Major changes is in POM.xml about spring security version and spring version itself
		- changing the security version to cater GrantedAuthority, the GrantedAuthority not found in spring 
		  security version 3
	- also adding corsFilter tomcat on POM doesnt work (the error while running web app is 
		 java.lang.ClassNotFoundException: org.springframework.web.filter.CorsFilter)
		 - this issue happens because of spring version, the error is gone when spring version is changed to 4.3.1
		  then another issue is rise 
		  NoSuchMethodError: org.springframework.web.bind.annotation.RequestMapping.path()[Ljava/lang/String maybe 
		  it's because of the version of spring also
		  
			-> this is solved when deleted server and create new server  
	==========================Specifications==================
	1. Spring mvc, spring security 
	2. CSS bootstrap
	3. thymeleaf
	4. SQL Server
	5. Hikari DBCP		
	==========================PROGRESS==================
	1. Login screen and Login With userdetails
	2. Menu All FORM input (form_data_ibadah.html, form_crew.html) 
	3. Template has been grouped in 1 place (Header, Body, Scripts)
	4. package naming has been fixed
	5. adding message properties internationalization purpose	
	
	
	
	TEMPLATE PROBLEM
	>> if you have long name of the link probably will break down into two rows, thus will affect link 
	  below the yet in the <b>style.css</b> need to check more in the id "sub-menu" & "sub"
	  
	  
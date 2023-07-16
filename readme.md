*Project Details: **Maven Project***

We are adding plugin extensions to a POS system (Floreant POS), but the system (POS) tries to validate the extensions lisence.
To override this, we are planning to extend the licence manager class (AbstractFloreantPlugin) with the class LisenceUtilExtender, so that it doesnt check for any lisences.

AbstractFloreantPlugin is originally stored and imported from http://orodev.net:8081/nexus/content/groups/public/com/orocube/orocube-common-classes/1.4.2/[orocube-common-classes-1.4.2.jar](http://orodev.net:8081/nexus/content/groups/public/com/orocube/orocube-common-classes/1.4.2/orocube-common-classes-1.4.2.jar) as a POM dependency.

***Error***:

    [ERROR] C:\Users\Dell\Desktop\floreantpos-2019-fattire-master\src\com\floreantpos\util\LisenceUtilExtender.java:[25,18] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol:   class licensemanager                                                                                                                                                                                                                                
    [ERROR]   location: package com.orocube                                                                                                                                                                                                                                 
    [ERROR] \util\LisenceUtilExtender.java:[31,50] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol: class AbstractFloreantPlugin                                                                                                                                                                                                                          
    [ERROR] \util\LisenceUtilExtender.java:[31,84] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol: class FloreantPlugin                                                                                                                                                                                                                                  
    [ERROR] \util\LisenceUtilExtender.java:[60,20] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol:   class Component                                                                                                                                                                                                                                     
    [ERROR]   location: class LisenceUtilExtender                                                                                                                                                                                                                           
    [ERROR] \util\LisenceUtilExtender.java:[92,44] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol:   class JDialog                                                                                                                                                                                                                                       
    [ERROR]   location: class LisenceUtilExtender                                                                                                                                                                                                                           
    [ERROR] \util\LisenceUtilExtender.java:[96,11] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol:   class List                                                                                                                                                                                                                                          
    [ERROR]   location: class LisenceUtilExtender                                                                                                                                                                                                                           
    [ERROR] \LisenceUtilExtender.java:[96,16] error: cannot find symbol                                                                                                                       
    [ERROR]   symbol:   class AbstractAction                                                                                                                                                                                                                                
    [ERROR]   location: class LisenceUtilExtender     



***File Structure***

 1. [LisenceUtilExtender.java](https://github.com/hrithikM31/java_comp_err/blob/main/LisenceUtilExtender.java "LisenceUtilExtender.java"): Class with override methods
 2. [pom.xml](https://github.com/hrithikM31/java_comp_err/blob/main/pom.xml "pom.xml"): Original POM.XML file (before making any edits to accomodate the new class)
 3. [new - Pom.xml](https://github.com/hrithikM31/java_comp_err/blob/main/new%20-%20Pom.xml)	: POM.XML with changes to accomodate LisenceUtilExtender
 
 Changes to POM.xml
 *DEPENDENCIES*
 

		    <dependency>
    			<groupId>org.hibernate</groupId>
    			<artifactId>hibernate</artifactId>
    			<version>3.2.6.ga</version>
    			<exclusions>
    				<exclusion>
    					<groupId>javax.transaction</groupId>
    					<artifactId>jta</artifactId>
    				</exclusion>
    				<exclusion>
    					<artifactId>commons-collections</artifactId>
    					<groupId>commons-collections</groupId>
    				</exclusion>
    			</exclusions>
    		</dependency>
    		<dependency>
    			<groupId>javax.transaction</groupId>
    			<artifactId>jta</artifactId>
    			<version>1.1</version>
    		</dependency>
    		<dependency>
    			<groupId>org.hibernate</groupId>
    			<artifactId>hibernate-annotations</artifactId>
    			<version>3.3.1.GA</version>
    		</dependency>
    		<dependency>
    			<groupId>commons-lang</groupId>
    			<artifactId>commons-lang</artifactId>
    			<version>2.6</version>
    		</dependency>
    		<dependency>
    			<groupId>net.xeoh</groupId>
    			<artifactId>jspf.core</artifactId>
    			<version>1.0.2</version>
    		</dependency>
    		<dependency>
    			<groupId>com.orocube</groupId>
    			<artifactId>lm-util</artifactId>
    			<version>3.1.3</version>
    		</dependency>


 *REPOSITORIES*

		    <repository>
    			<id>oro</id>
    			<url>http://orodev.net:8081/nexus/content/groups/public/</url>
    			<releases>
    				<enabled>true</enabled>
    			</releases>
    			<snapshots>
    				<enabled>true</enabled>
    			</snapshots>
    		</repository>


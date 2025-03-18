# Log4JProject_Secure

Report

	Application logging can be a very useful and important strategy if it is implemented properly. A Java logging framework is a great feature which allows developers to easily locate and get information about errors that might be occurring in order to debug and/or audit applications. Java loggers allow developers to understand what may be occurring in an application by providing records that show specific errors and unusual events (Chand 2019). Apache Log4j2 is a very popular, industrial-grade logging framework that is the most popular because of its flexibility and simplicity to use (Apache 2024). Log4j2 is by Apache Software Solutions and is an improvement of its predecessor Log4j.
	Log4j2 addresses security concerns associated with Log4j. Log4j’s JNDI feature allows for attackers to maliciously utilize the JNDI lookup in order to execute arbitrary code from an LDAP server. Attackers can gain a SMTPS connection due to improper validation of the certification with host mismatch in the SMTP appender (Apache 2024). This allows for interception by man-in-the-middle attacks which may result in the leak of any log messages sent. Attackers are able to gain access via remote code execution. This vulnerability is knowns as CVE-2021-44228 aka “Log4Shell,” and it affects the log4j-core JAR file (Apache 2024). The mitigation for this vulnerability is that it is recommends users upgrade to Log4j2 2.17.1, 2.12.4 or 2.3.2, as Log4j 1 has reached end of life. 
	Log4j2 has improved performance, support and mitigation measures for improved security. By utilizing the newest version, developers are able to enjoy the benefits that come from using a logger, while also maintaining a strong security posture.  I envision using Log4j2 in my career as a software developer because it seems there are many advantageous aspects to utilizing it such as: ease of troubleshooting, great performance, asynchronous logging, extensibility, options for configurations, cross-language use, as well as no vendor lock in for this service. Log4j2 allows developers to implement a simple and effective logging solution that provides many benefits for the production environments.
 This program features a random number generator. I implemented a logger that provides information about the program. In order to secure this program I located and updated the pom.xml file's log4j version being used from 2.11.2 to 2.17.1. By doing so I ensured the program is utilizing a version that is recommended and deemed safe by the CISA website.

 Bibliography

Avramovic, Slavisa. May 11, 2024. Intro to Log4j2- Appenders, Layouts and Filters. Baeldung. https://www.baeldung.com/log4j2-appenders-layouts-filters.

Apache. 2024. Logging Services. https://logging.apache.org/log4j/2.x/.

Apache. 2024. Logging Services. https://logging.apache.org/log4j/2.12.x/.

Apache. 2024. Logging Services. https://logging.apache.org/security.html.

Chand, Swatee. 2019. What Is a Logger in Java and Why Do You Use It? Medium. https://medium.com/edureka/logger-in-java-4898c667d34c.

CISA. April 8, 2022. Apache Log4j Vulnerability Guidance. https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance.

Geeks for Geeks. August 28, 2023. What Is Log4j2 and How to Configure Log4j2 with Java in Maven Project? Geeks for Geeks. https://www.geeksforgeeks.org/what-is-log4j2-and-how-to-configure-log4j2-with-java-in-maven-project/.

HitSubscribe. October 12, 2023. How Log4J2 Works: 10 Ways to Get the Most Out of It. Stackify. https://stackify.com/log4j2-java/.

Mkyong. March 29, 2019. Apache Log4j 2 Tutorials. Mkyong.com. https://mkyong.com/logging/apache-log4j-2-tutorials/.

SolarWinds. Logging in Java- Best Practices and Tips. January 18, 2024. https://www.papertrail.com/solution/tips/logging-in-java-best-practices-and-tips/.

# com.web.crawler
## A simple selenium/java com.web.crawler

### Dependencies:
All depndencies Jars and chromedriver executable have been included into the project.
### Prerequisites:
Latest version of Chrome needs to be installed on the machine (75 at the time the project was compiled)
Latest Java version is needed
### How to Run:
I have provided a ```config.properties``` file to include any configurations you want.

```url```: base url for the crawler. "Default = https://www.google.com/"
```statusCode```: Status code to search for the good unbroken links. "Default = 200”
```asset```: This is the type of links you want the page to search for. Either JS, IMAGES, CSS, or PAGES. “Default = PAGES”
```maxLinksPerPage```: maximum good links each parent page should retrieve. “Default = 2”
```maxDepth```: maximum depth of the traversal. “Default = 3”  

To build a JAR simply use the main class Crawler.java for artifact build. I also included one Jar with the project

### Output
The results of the program are displayed into the console using slf4j/log4J library
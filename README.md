<div align="center">
  <h1>JAVA-SERVICE-CALCULATOR</h1>  
  <p>
    A simple API to do common math operations in JAVA.
  </p>
</div>

<!-- Getting Started -->
## Getting Started

<!-- Prerequisites -->
### Prerequisites

Apache Netbeans 14
https://netbeans.apache.org/

This project uses JDK 18
https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html

Apache Tomcat 8.5.82
https://tomcat.apache.org/download-80.cgi

<!-- Run Locally -->
### Run Locally

Clone the project

```bash
  https://github.com/DanielEscobar21/JAVA-SERVICE-CALCULATOR.git
```

Go to the project directory

```bash
  cd JAVA-SERVICE-CALCULATOR
```
Add the libraries in the /lib directory to the project

![image](https://user-images.githubusercontent.com/70600889/187324688-c75500f8-4b67-470b-8b67-141b8c869666.png)

Add the Apache Tomcat server in the Services section of Netbeans

![image](https://user-images.githubusercontent.com/70600889/187322615-7fa43e68-cd58-40c7-994f-8f270b07decf.png)

For testing you can use the following routes on Postman
```bash
  http://your-host:8080/JAVA_SERVICE_CALCULATOR/service/operation/sum  --for Sum
  http://your-host:8080/JAVA_SERVICE_CALCULATOR/service/operation/subs  --for Subtract
  http://your-host:8080/JAVA_SERVICE_CALCULATOR/service/operation/multiply  --for Multiply
  http://your-host:8080/JAVA_SERVICE_CALCULATOR/service/operation/divide  --for Divide
```
Use the following example in json for the operation you want
```bash
{
    "number1": 123,
    "number2": 420
}
```

<!-- Contact -->
## Author and contributors 

Emmanuel Herrera - guerreroherrerafcoemmanuel@gmail.com

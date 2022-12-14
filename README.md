# Aws-beanstalk-example
aws-beanstalk-example : API that will use a string as input and does a find and replace for certain words and outputs the result. For example: replace Google for Google©
# What's Here
buildspec.yml - this file is used by AWS CodeBuild to build the web application     
pom.xml - this file is the Maven Project Object Model for the web application      
src/main - this directory contains your Java service source files     
src/test - this directory contains your Java service unit test files    
 
# Aws Service used in development 
# Code Pipeline -
 Code Commit,Code build, Code Deploy
# Elastic beanstalk - Paas
  To deploy application.
  
# Postman Project
https://www.getpostman.com/collections/de6bda0d55b71eed3485

# Request - 
curl --location --request POST 'http://kapildeloitteapp-env.eba-ryhgwq4v.us-east-1.elasticbeanstalk.com/append-copyright-symbol' \
--header 'Content-Type: text/plain' \
--data-raw 'We really like the new security features of Google Cloud'

# Response -
We really like the new security features of Google© Cloud

# What is next  - Serverless 
Elastic Beanstalk is great, it handles the deployment,capacity provisioning, load balancing, auto-scaling, and health monitoring but still you are paying for resource when your application is not running so lets see serverless solution for this usage case.

[https://github.com/kdwivedi13/deloitteapp-kapil-serverless]


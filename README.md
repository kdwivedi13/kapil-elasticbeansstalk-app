#Welcome to the AWS CodeStar sample web application
#What's Here
This sample includes:

README.md - this file
.ebextensions/ - this directory contains the Java configuration file that allows AWS Elastic Beanstalk to deploy your Java application
buildspec.yml - this file is used by AWS CodeBuild to build the web application
pom.xml - this file is the Maven Project Object Model for the web application
src/main - this directory contains your Java service source files
src/test - this directory contains your Java service unit test files


aws-beanstalk-example : API that will use a string as input and does a find and replace for certain words and outputs the result. For example: replace Google for Google©

Request - curl --location --request POST 'http://kapildeloitteapp-env.eba-ryhgwq4v.us-east-1.elasticbeanstalk.com/append-copyright-symbol'
--header 'Content-Type: text/plain'
--data-raw 'We really like the new security features of Google Cloud'

Response - We really like the new security features of Google© Cloud


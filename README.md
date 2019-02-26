# PostcodeAPI
API Req
-httpurlconnection for creating connection and setting api request to “GET”
- BufferedReader to Read the stream and output the JSON result 


Started : 

System.out.println(response.toString());
To see I was getting the JSON Response 

Then turn it into String method (getRequest)
To return string


Created get postcode method to get the JSON response using the get request. Method  This is where the postcode will be parsed in through the main class. This method is responsible for getting the output of the api Request using the getRequest method and outputting the Results nicely formatted using the parseResponse method. 


Parsing the json output (parseResoonse method)
-research 
JSON lib called org.json 
You downloaded the Jar file and imported it into the package libraries Using your IntelliJ IDE 

- Looked up how to use this lib 
- JsonObjects can be created using string json 
- JsonObject was created using the json output passed into the method (string json)
- Using the Json Object I was able to print out different properties of the object in my case it was the different results 
- I used self analysis to decide the most important results to display and would seem too hideous ti display all results 

Getting Input

This will be used to get users input of the postcode to enter. Added in Main class



Improvements

Separated parsing response and doing get request into different classes for better neatness.

Self reflection 

Time management



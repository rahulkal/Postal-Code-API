# Postal-Code-API
The repository contains two apis
1. To store the suburbs and postal code.
  A city has multiple postal codes. I have created a suburb data model in which postal code mapped against city and it is persisted in spring boot's in memory H2 database.
  API received a list of Suburb objects and stored in db.
2. To get the Suburbs based on postal code range
  This API returns unique and alphabetically sorted list of suburbs which lies in the provided postal code range, also a number which is sum of number of all the characters in the suburbs.
  
  

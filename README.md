# Automation Project - HORUS demo [Selenium | Java | TestNG | POM | Maven | Jenkins]

### 🌟 Project Title: 
Automation framework  for testing of [HORUS]()

## ⚙️ Tools, Languages Frameworks used:

The project uses the following tools, frameworks:

| # | Tech/Tools | Name               | Version |
| -------- |-------- |--------------------| -------- |
| 1 | Programming language    | Java               | 17.0.8    | 
| 2 | Automation tool    | Selenium webdriver | 14.4.1     |
| 3 | Testing framework | TestNG             | 7.8.0 |
| 4 | Build Tool | Maven              | 3.9.4 |
| 5 | IDE | Intellije Idea     | 2023-09 |
| 6 | Reporting tool | Extent Reports     | 5.1.1 |
 
## 📜 Project Structure : 
Following is the folder structure for this project : <br>


## 📜 Dependency using in the project:
Following are the dependencies added to the pom.xml for this project : <br>

| # | Name |  Version |
| -------- | -------- | -------- |
| 1 | Selenium java | 14.4.1 |
| 3 | TestNG | 7.8.0 |
| 4 | Extent Reports | 5.1.1 |
  
![image](https://github.com/itsamul/automation-framework-pom-selenium-java-testng-guru99bank/assets/85364800/4006aef3-7836-4c50-a5a3-bab987a00771)

## 📜 Design Pattern used - Page Object Model:

**Page Object Model (POM)**: Implement the POM design pattern. This pattern involves creating separate classes for each distinct page or section of the website under test.<br>

**Page Classes**: Each page class encapsulates the web elements and methods required to interact with those elements on that specific page. This separation of concerns improves code maintainability.

Pages classes are saved under following path : "/horus/src/main/java/horus/pages/" <br>


## 📜 Test cases :

**Test Classes:** Test classes that correspond to different test scenarios or functionalities are created. Tests classes are saved under following path : "/horus/src/test/java/horus/testcases/" <br> 

[ADD IMAGE]
<br>

Following are the test cases covered in the this Project:

[ADD TEST CASES ]

**TestNG Annotations:** TestNG annotations like @Test, @BeforeMethod, and @AfterMethod are used to organize test methods, setup, and teardown logic. <br>

**Page Object Usage:** In your test methods, initialize and use the page objects to interact with web elements on the pages under test.

## 📜 Test Data:

**Test Data:** Test data such as user id and password are saved in data.properties file, Other information like customer detials and account details are stored in data providers class.<br>

**DataProvider.java:**
![image](https://github.com/itsamul/automation-framework-pom-selenium-java-testng-guru99bank/assets/85364800/af121f3e-e699-418d-936b-3383e879cf6f)

**data.properties file:**
![image](https://github.com/itsamul/automation-framework-pom-selenium-java-testng-guru99bank/assets/85364800/56fea09f-5ad6-4efe-b8c4-efb5621a9a70)

## 📜 Reporting:

**Test Reporting:** Implemented test reporting using third-party reporting frameworks - ExtentReports. <br>
Reports are saved in the following location : "/guru99bankdemo/Reports/"<br>
<img width="400" alt="OHpyaBzM2K" src="https://github.com/itsamul/automation-framework-pom-selenium-java-testng-horus/assets/85364800/1a8c8e2e-07e8-4f79-b593-ee51292e62a0"> <br>

Extent Report opened automatically on the default browser after the execution is completed.<br>
<img width="1260" alt="chrome_S2hWiML0zU" src="https://github.com/itsamul/automation-framework-pom-selenium-java-testng-horus/assets/85364800/255c891a-b1f9-41da-a4f7-554982433861">
<img width="1260" alt="chrome_BniXRJRHB0" src="https://github.com/itsamul/automation-framework-pom-selenium-java-testng-horus/assets/85364800/bbdaf290-f562-442d-899b-d094d44990b4">

## 🏃 Running the project:

### 🧪 Cloning the repository:
1. Clone  project from Github [ADD GITHUB URL]<br> 
  
2. Navigate to the cloned directory<br> 
  ```
    cd Horus-Hybrid-Automation-Framework
  ```   
3. Compile maven dependencies<br> 
  ```
    $ mvn compile
  ```


### Running the Tests Locally:
Step 1. Navigate to the cloned directory<br> 
  ```
    cd Horus-Hybrid-Automation-Framework
  ```  
Step 2: Open command prompt and run the following command <br>
  ```
    mvn clean test
  ```  
  
Shown below is the execution screenshot triggered by the above command : <br>

[ADD SCREENSHOT]

Step 3: Extent Report open automatically on the default browser after the execution is completed.<br>

[ADD SCREENSHOT]
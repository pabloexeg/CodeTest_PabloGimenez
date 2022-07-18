## Repository Name: 
CodeTest_PabloGimenez

## Description:
This repository has the answers and code for CodeTest to Role SDET

## Installation:
We need to install the following tools.  
->Maven  
->Java (JDK,JRE - 1.8)

You need to create the environment variables.  
->JAVA_HOME  
->MAVEN_HOME  

->Steps to run the code  
*-Clone the Code  
*-After cloned the project. Open the prompt where you cloned it  
*-Run the following command "mvn package"  
*-Check the test ran correctly

## License 
OpenSource

## Answers
Followign are the answear of each Task.  
  
Task 1 - Automated web testing   
	 With a test automation framework of selenium with java, test Wikipedia's search feature by searching for "Voyager 1" and add assertions for the same.  
	Answer: Download the repository and Run the Project  
  
Task 2 - Automation  
	 How to switch from frame to main window? With syntax.  
	Answer:	driver.switchTo().frames();           // Switch to window to frame  
		driver.switchTo().defaultContent();  // Switch to Frame to window  
  
Task 3 - There are 10 pages in same window, an image is present in any page out of ten pages in same window. How will you validate this scenario with example?  
	> Answer: I will get the amount of frames in the page. I will do a for loop and switchTo() for each frame and check if image present. Repeat this process until locate the image and after that finish the loop  
  
Task 4 - Can we call parent class constructor in sub class constructor i.e constructor chaining by using super keyword?  
	Answer: Yes, we can  
  
		class Animal {  
  
		  //constructor of class Animal  
		  Animal() {  
			System.out.println("I am an animal");  
		  }  
		}  
  
		class Dog extends Animal {  
  
		  //constructor of class Dog  
		  Dog() {  
			//calling constructor of the superclass  
			super();  
			System.out.println("I am a dog");  
		  }  
		}  
		  
Task 5 - DB Connection  
	 How would you write a code for DB connection?  
	Answer: Check the code. I created a class with DB connection  
  
Task 6 - Automate API   
Given the REST API: https://developers.giphy.com/docs/api/endpoint#search  
And this call to retrieve a list of GIFs: http://api.giphy.com/v1/gifs/search?q=funny+dog&api_key=dc6zaTOxFJmzC  
Your task is to extensively Automate that API endpoint with assertions using java programming language. You can use the provided api_key: it's a public key for testing out that API.  
  
	Answer: I didn't automate Api testing before. I tried to solve it but I couldn't it due to deadline to delivery the CodeTest   
  
Task 7 - Given a string say "CODE". Now create a new string with duplicates of each character in the original string and to it append the reverse of the same string (with duplicates) excluding the last character.  ex: step: CCOODDEE > Step: EEDDOOCC > finalResult: EEDDOOC  
	Answer: Check the code. I created a test with this.  
  
Task 8 -We have 10 numbers 1-10 and one button. I want to delete those numbers but should delete only even numbers – what should be the best ways to delete by clicking on the button. For eg: if i click on button then alternate number should be deleted.  
	Answer: My understanding about this question. I will get the array of number after the user clicked in the button. And all Integers number I will divide for 2 by % operator. If the rest is equal 0, so the number is dividible by 2 and it is even number  
  
Task 9 -How to read Excel data through hash map?  
	Answer: Using org.apache.poi library  
								
		FileInputStream file = new FileInputStream("somePath\\fileTest.xlsx");  
		XSSFWorkbook workBook = new XSSFWorkbook(file);  
		XSSFSheet fileSheet = workBook.getSheet("Sheet1");  
		  
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();  
		
		for (int r = 0; r <= fileSheet.getLastRowNum(); r++) {  
			int key = (int)fileSheet.getRow(r)  
						  .getCell(0)  
						  .getNumericCellValue();  
			String value = fileSheet.getRow(r)  
							   .getCell(1)  
							   .getStringCellValue();  
			hashMap.put(key, value);  
		}  
		
Task 10 -While running script, you have observed "NoSuchElementException". But you have taken the correct locator(ID, XPATh or CSS). Still, you are facing the same issue. What might be the reason?  
	Answer: The reason could be the element is not loaded yet. So, we can add a "wait" to wait until element is present  
 

	



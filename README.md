# JavaScript Alerts Handling with Selenium

This project demonstrates how to handle JavaScript alerts, confirmation dialogs, and prompts using Selenium WebDriver in a Maven-based Java application.

## Test Website

All tests are run against the public demo site:
[https://the-internet.herokuapp.com/javascript\_alerts](https://the-internet.herokuapp.com/javascript_alerts)

This site is ideal for practicing JavaScript alert handling.

## Test Cases Implemented

### Test Case 1: Simple Alert

* Action: Clicks on `Click for JS Alert`.
* Alert Handling: Accepts the alert.
* Verification: Checks if the result text is:
  You successfully clicked an alert
* Log: Simple alert accepted and verified.

### Test Case 2: Confirmation Alert

* Action: Clicks on `Click for JS Confirm`.
* Alert Handling: Dismisses the alert.
* Verification: Checks if the result text is:
  You clicked: Cancel
* Log: Confirmation alert dismissed and verified.

### Test Case 3: Prompt Alert

* Action: Clicks on `Click for JS Prompt`.
* Alert Handling: Sends the text `AutomationTest` and accepts it.
* Verification: Checks if the result text is:
  You entered: AutomationTest
* Log: Prompt alert input submitted and verified.

## Tech Stack

* Language: Java
* Build Tool: Maven
* Browser Automation: Selenium WebDriver
* Browser: Google Chrome (via WebDriverManager)

## How to Run

### 1. Prerequisites

* Java 8 or later
* Maven installed
* Chrome browser
* Internet connection

### 2. Clone the Repository

git clone [https://github.com/Thirishaa/javascript-alerts-selenium.git](https://github.com/Thirishaa/javascript-alerts-selenium.git)
cd javascript-alerts-selenium

### 3. Build the Project

mvn clean compile

### 4. Run the Tests

mvn exec\:java -Dexec.mainClass="com.worldline.selinium.javascript.assessment1.JavaScriptAlertsTest"

## Project Structure

src/
└── main/
└── java/
└── com/
└── worldline/
└── selinium/
└── javascript/
└── assessment1/
└── JavaScriptAlertsTest.java

## Output Sample

Simple alert accepted and verified.
Confirmation alert dismissed and verified.
Prompt alert input submitted and verified.


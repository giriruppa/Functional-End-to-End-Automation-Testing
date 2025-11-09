# Shine Jobs  Automation


## 📝 **Project Description: Shine Job Portal Automation using Selenium**

### **Overview:**

The **Shine Job Portal Automation** project automates the end-to-end process of logging into the **Shine.com** job portal, searching for jobs based on specified criteria, and applying for a job automatically.
This project is implemented using **Selenium WebDriver with Java** and demonstrates how automation testing tools can simulate real-world user actions on dynamic websites.

The automation covers the complete user workflow — from launching the browser and logging in to searching for a job and applying for it.

---

### **Step-by-Step Process Description:**

#### **1. Launching the Browser and Opening Shine.com**

* The script starts by configuring the system path for **ChromeDriver**.
* It launches the **Google Chrome browser**, maximizes the window, and sets an **implicit wait** to handle web page loading delays.
* The automation then navigates to the official **Shine.com** website (`https://www.shine.com/`) and confirms that the page has successfully loaded.

---

#### **2. Logging into Shine**

* The script locates and clicks on the **Login button** on the homepage using XPath.
* Once the login form appears, it fills in the **registered email ID** and **password** using the element locators (`id_email_login`, `id_password`).
* After entering the credentials, it waits for the **Login/Submit button** to become clickable and clicks it using **WebDriverWait** and **ExpectedConditions**.
* A confirmation message is displayed in the console once the login is successful.

---

#### **3. Searching for Jobs**

* After logging in, the automation clicks on the **Job Search** input field.
* It enters the **job title** as `"Software Tester"` using both `Actions` class (to simulate keyboard typing) and direct element access for reliability.
* Then, it enters the **location** as `"Hyderabad"` in the location field.
* The **experience** field is filled with `"2"` years to filter the results for experienced roles.
* Finally, the **Search button** is clicked to initiate the job search operation.

---

#### **4. Applying for a Job**

* Once the job results page is loaded, the script locates the first **“Apply”** button available in the job listings using XPath.
* It clicks the Apply button to simulate applying for the first job on the list.
* This step represents the automation of the job application process, though the final confirmation or resume upload (if required) can be handled manually or extended in future enhancements.

---

#### **5. Ending the Automation**

* After completing the job application process, the script waits for a few seconds to ensure the action completes successfully.
* It then closes the browser using `driver.quit()` and displays a confirmation message indicating that the automation has finished.

---

### **Technologies and Tools Used:**

* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **Browser Driver:** ChromeDriver
* **Browser:** Google Chrome
* **Wait Mechanisms:** Implicit Wait, Explicit Wait (`WebDriverWait`)
* **Other Classes Used:** `Actions`, `JavascriptExecutor` (optional for scrolling)

---

### **Key Features:**

✅ Fully automates login and job search process on Shine.com
✅ Handles dynamic web elements using XPath and ID locators
✅ Uses both implicit and explicit waits for reliable synchronization
✅ Performs form filling and button click operations automatically
✅ Demonstrates practical use of Selenium WebDriver for real-world web automation

---

### **Learning Outcomes:**

This project helped in understanding:

* The use of **Selenium WebDriver** for automating modern web applications.
* Handling **web page synchronization issues** using waits.
* Automating **form inputs**, **button clicks**, and **navigation flows**.
* Managing dynamic and interactive content on job portals.

---

### **Future Enhancements:**

🔹 Automate the **resume upload** and **profile update** process.
🔹 Implement **data-driven testing** using Excel or CSV for multiple job roles.
🔹 Capture screenshots after each major step for reporting.
🔹 Integrate with **TestNG or Jenkins** for scheduled job applications.

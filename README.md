# Functional-End-to-End-Automation-Testing
Automated web testing using Selenium WebDriver in Java to validate real-world workflows on Swiggy (food ordering) and Shine Jobs (job search &amp; application). Includes functional and end-to-end UI automation


---

# 🚀 Selenium Web Automation Projects

### Tools & Technologies

* **IDE:** Eclipse / IntelliJ
* **Automation Tool:** Selenium WebDriver
* **Language:** Java
* **Browser:** Chrome
* **Recording Tool:** Screen Recorder (OBS / Loom / Screencast-O-Matic)

---

## 📁 Projects Included

### 🥗 1. Swiggy Food Ordering Automation

**Website:** [https://www.swiggy.com](https://www.swiggy.com)
**Objective:** Automate the online food ordering flow on Swiggy.

#### ✅ Steps Automated

1. Launch Swiggy website and **log in** (manual OTP entry required).
2. **Validate** page title and current URL.
3. **Enter delivery location** (e.g., Bengaluru).
4. **Search for a restaurant** (e.g., Domino’s Pizza).
5. **Select and add** the second food item from the list.
6. **Increase item quantity** to 2 in the cart.
7. **Enter new delivery address** and save it.
8. **Proceed to payment page** (without completing payment).
9. Capture **screenshots and console logs** at key stages.

---

### 💼 2. Shine Jobs Application Automation

**Website:** [https://www.shine.com](https://www.shine.com)
**Objective:** Automate the process of searching and applying for a job.

#### ✅ Steps Automated

1. Launch Shine Jobs and **log in** with valid credentials.
2. **Search for a “Software Tester”** job in *Hyderabad* with *2 years of experience.*
3. **Select the second job** from the search results.
4. **Apply** for the selected job and verify the status.
5. Print confirmation messages and take screenshots.

#### 🧾 Console Logs

![WhatsApp Image 2025-09-23 at 22 58 27_03db1126](https://github.com/user-attachments/assets/abc13dae-8978-40ee-bca2-e81dea1e3b63)

---

## 🧰 Project Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/<your-username>/Selenium-Web-Automation-Projects.git
   ```
2. Open the project in **Eclipse** or **IntelliJ IDEA**.
3. Add **Selenium WebDriver JAR files** to your project’s build path.
4. Update the **ChromeDriver path** inside the script:

   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
   ```
5. Run the Java class file for:

   * `SwiggyAutomation.java`
   * `ShineJobsAutomation.java`

---


---

## 🧠 Key Learnings

* Web element identification using XPath, CSS Selectors, and dynamic locators.
* Handling **dynamic waits**, **alerts**, and **manual OTP pauses**.
* Screenshot capture and **console logging**.
* Navigating complex UIs and maintaining active sessions.
* Creating **reusable automation scripts** for different domains.

---


## 🧪 Type of Testing for my Selenium Projects

### **1️⃣ Functional Testing**

* ✅ **Main Category**
* You’re verifying that each feature of the web application (login, search, add to cart, apply for job) works as expected.
* **Goal:** Ensure the system behaves according to its functional requirements.

> Example:
>
> * Checking if "Add to Cart" increases item count correctly on Swiggy.
> * Checking if “Apply” actually submits the job application on Shine.

---

### **2️⃣ End-to-End (E2E) Testing**

* You’re automating **the entire user journey** — from opening the website to reaching the payment or confirmation page.
* **Goal:** Validate that all integrated components (login → search → select → apply/order → confirm) work together smoothly.

> Example:
> Automating the *complete order placement flow* till payment page on Swiggy.

---

### **3️⃣ UI (User Interface) Testing**

* Selenium WebDriver interacts with **buttons, dropdowns, text fields, and modals** — making this a form of **UI testing**.
* **Goal:** Verify that the front-end elements function and respond correctly.

> Example:
> Ensuring “Add” and “Proceed to Pay” buttons are clickable and navigate properly.

---

### **4️⃣ Smoke / Sanity Testing (in context)**

* Since your scripts quickly verify if **major functionalities** work (login, search, add, apply), these can also be used as **smoke or sanity tests** in a CI/CD environment.

> Example:
> A smoke test that checks whether Swiggy’s login and cart flow are operational before deploying changes.

---

### **5️⃣ Regression Testing**

* If these scripts are re-run after code changes or UI updates, they serve as **regression tests** to ensure no new bugs were introduced.

---

## 💡 Summary Table

| Type of Testing          | Description                                         | Applies to Your Projects          |
| ------------------------ | --------------------------------------------------- | --------------------------------- |
| **Functional Testing**   | Validates individual features (login, search, etc.) | ✅ Yes                             |
| **End-to-End Testing**   | Tests complete user flows                           | ✅ Yes                             |
| **UI Testing**           | Verifies interface elements and interactions        | ✅ Yes                             |
| **Smoke/Sanity Testing** | Quick health checks for major functions             | ⚙️ Optional                       |
| **Regression Testing**   | Ensures features still work after updates           | ⚙️ Optional (if re-run regularly) |

---

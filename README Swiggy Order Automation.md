
##📝 **Project Description: Swiggy Order Automation using Selenium**

### **Overview:**

The **Swiggy Order Automation** project automates the process of ordering food from the Swiggy website using **Selenium WebDriver with Java**. This automation script simulates a real user’s journey — from launching the browser and logging into Swiggy to setting the delivery location, searching for a restaurant, and adding food items to the cart.

The goal of this automation is to demonstrate how Selenium can interact with complex, dynamic web applications involving pop-ups, delays, search functionalities, and user inputs.

---

### **Step-by-Step Description:**

#### **1. Launching the Browser and Opening Swiggy**

* The script begins by launching the **Google Chrome browser** using the `ChromeDriver`.
* It opens the **Swiggy homepage** (`https://www.swiggy.com/`) and maximizes the browser window for full visibility.
* The script then prints the current **page title** and **URL** to confirm the correct page has loaded.

#### **2. Login Process**

* The automation clicks on the **Login button** using its XPath locator.
* It waits for the **login pop-up** to appear and then enters the user’s **mobile number** in the input field.
* The **Continue** button is clicked to proceed with OTP verification.
* Since OTP entry requires manual human input, the script pauses for **30 seconds** to allow the user to enter the OTP manually.
* Once OTP verification is complete, the user is successfully logged in, and the script confirms it in the console.

#### **3. Setting the Delivery Location**

* The automation clicks on the **Change Location** or “Other” option in the header.
* It finds the location input box (with placeholder *“Search for area, street name..”*) and types the desired delivery city — for example, **“Bengaluru”**.
* After waiting for the location suggestions to appear, it selects the **first suggested option** automatically.
* A confirmation message appears in the console indicating that the delivery location is successfully set.

#### **4. Searching for a Restaurant**

* Once the location is set, the script clicks the **Search** icon on the homepage.
* In the **search input field**, it types the restaurant name, e.g., **“Domino’s Pizza”**.
* The automation waits for the search results to load and then clicks on the **first restaurant** result from the list.
* A confirmation message logs that the restaurant has been successfully opened.

#### **5. Selecting and Adding a Food Item (Optional / Commented Section)**

* The code also includes an optional (commented) section that:

  * Fetches all menu items listed on the restaurant’s page.
  * Prints the names of all available food items.
  * Selects the **second food item** in the list.
  * Clicks on the **“ADD”** button to add it to the cart.
  * Finally, clicks on the **“View Cart”** button to open the cart page.

#### **6. Finalization**

* The script completes the automation steps without immediately closing the browser (`driver.quit()` is commented out), allowing manual verification of the result.
* If all steps run successfully, the console displays messages confirming each completed stage (✅).

---

### **Technologies Used:**

* **Programming Language:** Java
* **Automation Framework:** Selenium WebDriver
* **Browser:** Google Chrome
* **Testing Tool:** ChromeDriver

---

### **Key Features:**

✅ Launches and controls Chrome browser automatically
✅ Logs in using user’s phone number and waits for manual OTP entry
✅ Automatically sets delivery location
✅ Searches for a restaurant and selects it
✅ (Optional) Adds an item to the cart and views it
✅ Handles dynamic elements and waiting using `Thread.sleep()`

---

### **Learning Outcome:**

This project demonstrates:

* Handling **dynamic web elements** using XPath.
* Managing **pop-ups** and **manual OTP delays**.
* Performing **end-to-end automation** for a real-world application.
* Using **Selenium waits** and **WebDriver controls** effectively.

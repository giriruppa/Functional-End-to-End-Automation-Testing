package swiggyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyOrderAutomation {
    public static void main(String[] args) {
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open Swiggy website
            driver.get("https://www.swiggy.com/");
            driver.manage().window().maximize();

            // 2. Print page title & URL
            System.out.println("Page Title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // 3. Click on Login button
            WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/ul/li[2]"));
            loginBtn.click();

            // 4. Enter phone number
            Thread.sleep(2000); // wait for popup
            WebElement phoneInput = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/form/div[1]/div/input"));
            phoneInput.sendKeys("8978304323"); // <-- put your number

            // 5. Click continue (to receive OTP)
            WebElement continueBtn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div/form/div[2]/a"));
            continueBtn.click();

            // 6. Pause for OTP (manual entry required)
            System.out.println("⚠️ Please enter OTP manually within 30 seconds...");
            Thread.sleep(30000); // waits 30 sec for OTP entry

            // 7. Confirm login
            System.out.println("✅ Login process completed (if OTP entered).");

        } catch (Exception e) {
            e.printStackTrace();
        } 
        
        ////////////////////////////////////////////////////////////////////////////
    
        /////////////////////////////////////Third step setup location /////////////////////
       try {
            // 1. Click on the "Other" or "Change Location" button to show input
    	   Thread.sleep(1000);
            WebElement changeLocationBtn = driver.findElement(
                By.xpath("/html/body/div[1]/div[1]/header/div/div/div")
            );
            changeLocationBtn.click();

            Thread.sleep(1000); // wait for input field to appear

            // 2. Locate the input box for delivery location
            WebElement locationInput = driver.findElement(
                By.xpath("//input[@placeholder='Search for area, street name..']")
            );

            locationInput.clear();
            locationInput.sendKeys("Bengaluru");

            Thread.sleep(2000); // wait for dropdown suggestions

            // 3. Click the first suggestion directly
            WebElement firstSuggestion = driver.findElement(
                By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[3]/div/div/div[1]")
            );
            firstSuggestion.click();

            System.out.println("✅ Delivery location set to Bengaluru (first suggestion clicked)");

        } catch (Exception e) {
            System.out.println("❌ Could not set delivery location automatically. Please set it manually.");
            e.printStackTrace();
        }
        
        /////////////////////////////////////////////fourth step search for restaurtant////////////////////////////////////////////////////

        try {
            Thread.sleep(2000); // wait for page to load properly

            // 1. Click on the search button/icon
            WebElement searchBtn = driver.findElement(
                By.xpath("//span[normalize-space()='Search']") // This is the search icon div
            );
            searchBtn.click();

            Thread.sleep(1000); // wait for search input to appear

            // 2. Locate the search input box
            WebElement searchInput = driver.findElement(
                By.xpath("//input[@placeholder='Search for restaurants and food']") // Swiggy search box
            );
            searchInput.sendKeys("Domino’s Pizza");
            searchInput.click();

            Thread.sleep(2000); // wait for search suggestions/results to appear

            // 3. Click on the first restaurant from the search results
            WebElement firstRestaurant = driver.findElement(
                By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/button[1] ")
                ////a[contains(@aria-label,"Restaurant name: Domino's Pizza,")]//div[@class='_9uBgV']
                // <-- This is example XPath for first restaurant; check in browser if it works for you
            );
            firstRestaurant.click();
            Thread.sleep(2000); 
            WebElement firstRestaurantClick = driver.findElement(
                    By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[3]/div[1]")
                    ////a[contains(@aria-label,"Restaurant name: Domino's Pizza,")]//div[@class='_9uBgV']
                    // <-- This is example XPath for first restaurant; check in browser if it works for you
                );
                firstRestaurantClick.click();

            
            System.out.println("✅ First restaurant selected: Domino's Pizza");
            
            
        } catch (Exception e) {
            System.out.println("❌ Could not search/select restaurant automatically. Please do it manually.");
            e.printStackTrace();
        }
        
        ///////////////////////////////fifth step i.e  Select the second food item ///////////////////////
      /*  try {
            Thread.sleep(3000); // wait for restaurant menu to load

            // 1. Locate the list of food items
            java.util.List<WebElement> foodItems = driver.findElements(
                By.xpath("//div[contains(@class,'_1RPOp')]") // This selects all menu item containers
            );

            // 2. Select the second food item
            WebElement secondFoodItem = foodItems.get(1); // index starts at 0
            String foodName = secondFoodItem.findElement(By.xpath(".//h3")).getText(); // get food name
            System.out.println("Selected Food Item: " + foodName);

            // 3. Click "Add" button for the second food item
            WebElement addBtn = secondFoodItem.findElement(By.xpath(".//button[contains(text(),'ADD')]"));
            addBtn.click();

            Thread.sleep(2000); // wait for item to be added

            // 4. Click "View Cart"
            WebElement viewCartBtn = driver.findElement(
                By.xpath("//div[contains(@class,'_2wg_t')]//span[contains(text(),'View Cart')]")
            );
            viewCartBtn.click();

            System.out.println("✅ Food item added to cart and opened View Cart");

        } catch (Exception e) {
            System.out.println("❌ Could not add food item to cart automatically. Please do it manually.");
            e.printStackTrace();
        }*/
        
      /*  try {
            Thread.sleep(3000); // wait for restaurant menu to load

            // 1. Locate all food item containers (each menu block)
            java.util.List<WebElement> foodItems = driver.findElements(
                By.xpath("//div[contains(@class,'_1RPOp')]") // each menu item container
            );

            System.out.println("Total food items found: " + foodItems.size());

            // 2. Loop and print all item names
            for (int i = 0; i < foodItems.size(); i++) {
                try {
                    String foodName = foodItems.get(i).findElement(By.xpath(".//h3")).getText();
                    System.out.println((i + 1) + ". " + foodName);
                } catch (Exception ignore) {
                    System.out.println((i + 1) + ". [Name not found]");
                }
            }

            // 3. Example: Select the 2nd food item
            if (foodItems.size() > 1) {
                WebElement secondFoodItem = foodItems.get(1); // index starts at 0
                String foodName = secondFoodItem.findElement(By.xpath(".//h3")).getText();
                System.out.println("👉 Selected Food Item: " + foodName);

                // 4. Click "Add" inside the same container
                WebElement addBtn = secondFoodItem.findElement(By.xpath(".//button[contains(text(),'ADD')]"));
                addBtn.click();

                Thread.sleep(2000); // wait for item to be added

                // 5. Click "View Cart"
                WebElement viewCartBtn = driver.findElement(
                    By.xpath("//div[contains(@class,'_2wg_t')]//span[contains(text(),'View Cart')]")
                );
                viewCartBtn.click();

                System.out.println("✅ Food item added to cart and opened View Cart");
            }

        } catch (Exception e) {
            System.out.println("❌ Could not list or add food items.");
            e.printStackTrace();
        }


*/
        
        

        finally {
            // Do NOT close browser yet, because session is needed for next steps
            // driver.quit(); <-- we will use this later after automation ends
        	
        	
        }
    }
}

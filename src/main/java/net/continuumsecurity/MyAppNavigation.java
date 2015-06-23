/*
 * Copyright (c) 2014 ContinuumSecurity www.continuumsecurity.net
 *
 * The contents of this file are subject to the GNU Affero General Public
 * License version 3 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * The Initial Developer of the Original Code is ContinuumSecurity.
 * Portions created by ContinuumSecurity are Copyright (C)
 * ContinuumSecurity SLNE. All Rights Reserved.
 *
 * Contributor(s): Stephen de Vries
 */

package net.continuumsecurity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;


//public class MyAppNavigation {
//    WebDriver driver;
//    final static String BASE_URL = "http://localhost:8080/bodgeit/";
//    final static String LOGOUT_URL = "http://localhost:8080/bodgeit/logout.jsp";
//    final static String USERNAME = "bobby@continuumsecurity.net";
//    final static String PASSWORD = "tables";
    
public class MyAppNavigation {
    WebDriver driver;
    final static String BASE_URL = "http://dev-cloud-auto2:7070/universal-inbox/outbox";
    final static String LOGOUT_URL = "http://dev-cloud-auto2:7070/universal-inbox/logout.jsp";
    final static String USERNAME = "donotreply+1515@lifeimage.com";
    final static String PASSWORD = "lifeimage1_new";


    public MyAppNavigation(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("login_username")).clear();
        driver.findElement(By.id("login_username")).sendKeys(USERNAME);
        driver.findElement(By.id("login_password")).clear();
        driver.findElement(By.id("login_password")).sendKeys(PASSWORD);
        driver.findElement(By.name("submit")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

    //public void registerUser() {
    //    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //    driver.get(BASE_URL+"register.jsp");
    //    driver.findElement(By.id("username")).clear();
    //    driver.findElement(By.id("username")).sendKeys(USERNAME);
    //    driver.findElement(By.id("password1")).clear();
    //    driver.findElement(By.id("password1")).sendKeys(PASSWORD);
    //    driver.findElement(By.id("password2")).clear();
    //    driver.findElement(By.id("password2")).sendKeys(PASSWORD);
    //    driver.findElement(By.id("submit")).click();
    //}

    //public void navigateBeforeLogin() {
    //    driver.get(BASE_URL);
    //    driver.findElement(By.linkText("Home")).click();
    //    driver.findElement(By.linkText("Doodahs")).click();
    //    driver.findElement(By.linkText("Zip a dee doo dah")).click();
    //    driver.findElement(By.linkText("About Us")).click();
    //    driver.findElement(By.linkText("Scoring page")).click();
    //    driver.findElement(By.linkText("Your Basket")).click();
    //    driver.findElement(By.linkText("Search")).click();
    //    driver.findElement(By.name("q")).clear();
    //    driver.findElement(By.name("q")).sendKeys("test");
    //    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

    public void navigateBeforeLogin() {
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("lifeIMAGE.com")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //driver.findElement(By.linkText("Solutions")).click();
        //driver.findElement(By.linkText("Doodahs")).click();
        //driver.findElement(By.linkText("Zip a dee doo dah")).click();
        //driver.findElement(By.linkText("About Us")).click();
        //driver.findElement(By.linkText("Scoring page")).click();
        //driver.findElement(By.linkText("Your Basket")).click();
        //driver.findElement(By.linkText("Search")).click();
        //driver.findElement(By.name("q")).clear();
        //driver.findElement(By.name("q")).sendKeys("test");
        //driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        //Make sure we're on the page we're supposed to be on
        //verifyTextPresent("Customers");
    //    driver.findElement(By.linkText("Search")).click();
    //    driver.findElement(By.linkText("Advanced Search")).click();
    //    driver.findElement(By.id("product")).clear();
    //    driver.findElement(By.id("product")).sendKeys("test");
    //    driver.findElement(By.id("desc")).clear();
    //    driver.findElement(By.id("desc")).sendKeys("test");
    //    driver.findElement(By.id("type")).clear();
    //   driver.findElement(By.id("type")).sendKeys("test");
    //    driver.findElement(By.id("price")).clear();
    //    driver.findElement(By.id("price")).sendKeys("test");
    //    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

        //Make sure we're on the page we're supposed to be on
    //    verifyTextPresent("Results Found");
    }

    public void navigateAfterLogin() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='nav-container']/div/div/ul/li[2]/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div/div/ul/li[3]/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[2]/div/h2")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[2]/div/ul/li/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[2]/div/ul/li[2]/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[2]/div/ul/li[3]/div/span[2]")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[3]/div/h2")).click();
        driver.findElement(By.xpath("//div[@id='nav-container']/div[3]/div/ul/li/div/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// ERROR: Caught exception [unknown command []]

    }

    public void verifyTextPresent(String text) {
        if (!this.driver.getPageSource().contains(text)) throw new RuntimeException("Expected text: ["+text+"] was not found.");
    }
}

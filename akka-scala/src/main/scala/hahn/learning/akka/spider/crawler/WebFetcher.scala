package hahn.learning.akka.spider.crawler

import com.gargoylesoftware.htmlunit.BrowserVersion
import org.openqa.selenium.By
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}

/**
  * Created by jianghan on 16-6-15.
  */
object WebFetcher extends App {

  val url = "http://huaban.com/explore/yanchuhaibao/"
  val driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_45)
  driver.get(url)
  val myWait = new WebDriverWait(driver, 20)

  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page")))
  val content = driver.getPageSource
  println("Start")
  println(content)
  println("End")
  driver.close

}

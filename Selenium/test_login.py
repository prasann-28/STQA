# Generated by Selenium IDE
import pytest
import time
import json
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class TestLogin():
  def setup_method(self, method):
    self.driver = webdriver.Chrome()
    self.vars = {}
  
  def teardown_method(self, method):
    self.driver.quit()
  
  def wait_for_window(self, timeout = 2):
    time.sleep(round(timeout / 1000))
    wh_now = self.driver.window_handles
    wh_then = self.vars["window_handles"]
    if len(wh_now) > len(wh_then):
      return set(wh_now).difference(set(wh_then)).pop()
  
  def test_login(self):
    self.driver.get("https://phptravels.com/demo")
    self.driver.set_window_size(1440, 819)
    self.vars["window_handles"] = self.driver.window_handles
    self.driver.find_element(By.CSS_SELECTOR, ".wow:nth-child(2) small:nth-child(1)").click()
    self.vars["win5355"] = self.wait_for_window(2000)
    self.vars["root"] = self.driver.current_window_handle
    self.driver.switch_to.window(self.vars["win5355"])
    self.driver.switch_to.window(self.vars["root"])
    self.driver.find_element(By.CSS_SELECTOR, ".wow:nth-child(2) .col-md-10").click()
    self.driver.switch_to.window(self.vars["win5355"])
    self.driver.find_element(By.NAME, "email").click()
    self.driver.find_element(By.NAME, "email").send_keys("admin@phptravels.com")
    self.driver.switch_to.window(self.vars["root"])
    self.driver.find_element(By.CSS_SELECTOR, ".wow:nth-child(2) .col-md-10").click()
    self.driver.switch_to.window(self.vars["win5355"])
    self.driver.find_element(By.NAME, "password").click()
    self.driver.find_element(By.NAME, "password").send_keys("demoadmin")
    self.driver.find_element(By.CSS_SELECTOR, ".btn-default > .ladda-label").click()
    element = self.driver.find_element(By.LINK_TEXT, "Logout")
    actions = ActionChains(self.driver)
    actions.move_to_element(element).perform()
    self.driver.find_element(By.LINK_TEXT, "Logout").click()
  

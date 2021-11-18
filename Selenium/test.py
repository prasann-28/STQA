import time
from selenium import webdriver
from selenium.webdriver.common.keys import Keys

chrdriv = "./chromedriver"
driver = webdriver.Chrome(chrdriv)
driver.get('http://www.facebook.com/')

email = '9075029921'

driver.find_element_by_id('email').send_keys(email)
# driver.find_element_by_id('')

driver.find_element_by_id('pass').send_keys('Ssp14822831')

loginButton = driver.find_element_by_name('login')
loginButton.click()



notification = driver.find_element_by_xpath('//*[@id="mount_0_0_yb"]/div/div[1]/div/div[2]/div[4]/div[1]/div[1]/span/div/a')
notification.click()
time.sleep(4)

Feature: Flipkart.iphonepurchase

 Scenario Outline: iphonepurchase
 
 		
 		Given user login to flipkart"<username>","<password>"
 		And user search iphone mobile"<mobile>"
 		And user select the iphone
 		And user click addtocart
 		Then user click placeorder
 		
 		Examples:
 		|username|password|mobile|
 		|mani@gmail.com|123456|iphone|
 		
# product-coupon-microservice
Applies coupon to a product being purchased online

To complete the operation, follow the below steps
(1) create 2 tables product and coupon in your choice of databse (this project uses Mysql)

(2) please add some coupons to your coupon database table by making a POST call to http://localhost:9091/api/coupons. Below is the JSON body to be sent
    {
      "code": "SUPERSALE",
      "discount": 10,
      "expDate": "12/12/2020" 
    }

(3) go to application.properties file and correct the spring.datasource values

(4) make a POST call to http://localhost:9090/api/products and send below JSON body
    {
      "name":"MacBook",
      "description":"Apple MacBook",
      "price":2000,
      "couponCode":"SUPERSALE" 
    }

(4) a response like below will be received
    {
      "id": 2,
      "name": "MacBook",
      "description": "Apple MacBook",
      "price": 1990.000,
      "couponCode": "SUPERSALE"
    }




# product-coupon-microservice
Applies coupon to a product being purchased online

To complete the operation, follow the below steps
-> create 2 tables product and coupon in your choice of databse (this project uses Mysql)
-> go to application.properties file and correct the spring.datasource values
->make a POST call to http://localhost:9090/api/products and send below JSON body
    {
      "name":"MacBook",
      "description":"Apple MacBook",
      "price":2000,
      "couponCode":"SUPERSALE" 
    }

-> you will get a response like 
    {
      "id": 2,
      "name": "MacBook",
      "description": "Apple MacBook",
      "price": 1990.000,
      "couponCode": "SUPERSALE"
    }

NOTE: please add some coupons to your coupon database table by making a POST call to http://localhost:9091/api/coupons. Below is the JSON body to be sent
    {
      "code": "SUPERSALE",
      "discount": 10,
      "expDate": "12/12/2020" 
    }



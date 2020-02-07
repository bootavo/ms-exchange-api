# ms-exchange-api
Project created as a demo, with the aim of being able to make currency exchange

## How to deploy
Go to project directory path

```groovy
mvn clean package
docker build -t api .
docker run -p 8080:8080 api

bonus: If you want to run it in background
docker run -d -p 8080:8080
```

## How to use
You should have a Postamn Client

```json
1.Get Crrency Rates registered (6 in total)

Method Type: GET
Url: http://localhost:8080/api/v1/exchange-rate

2.Register new Currency Rate
Method Type: POST
Url: http://localhost:8080/api/v1/exchange-rate
Body: 
{
	"label":"Test",
	"description": "Test",
	"usd_rate": 1,
	"eur_rate": 0.91,
	"pen_rate": 3.37,
	"mxn_rate": 18.66,
	"jpy_rate": 109.92,
	"gbp_rate": 0.77
}

3. Change Money
Method Type: GET
Url: http://localhost:8080/api/v1/exchange/amount/32.50/currency-in/USD/currency-out/PEN
Currency IN / OU Allowed: USD, EUR, PEN, MXN, JPY, GBP

4. Patch Currency
Method Type: PATCH
Url: http://localhost:8080/api/v1/exchange-rate/7 -> Currency Id
Body: 
{
	"label":"Test 2",
	"description": "USD",
	"usd_rate": 1,
	"eur_rate": 0.91
}
```

## Project Structure

A basic structure to show how it works.

For example:

```
src/main/java/com/exchange/api
    |
    +-- Dockerfile
    +-- pom.xml
    |
    \-- config
        |
        +-- H2Initialize.java
        |
    |
    \-- controller
        |
        +-- ExchangeController.java
        +-- ExchangeRateController.java
        |
    |
    \-- model
        |
        +-- Exchange.java
        +-- ExchangeRate.java
        +-- Response.java
        |
    |
    \-- repository
        |
        +-- ExchangeRepository.java
        +-- ExchangeRateRepository.java
        |
    \-- service
        |
        +-- ExchangeInterface.java
        +-- ExchangeRateInterface.java
        |
        \-- impl
            |
            +-- ExchangeImpl.java
            +-- ExchangeRateImpl.json
            |
   |
    \-- util
        |
        +-- Constants.java
        +-- DateHelper.java
        +-- ExchangeHelper.java
        +-- NamingHelper.java
        +-- NullAwareBeanUtilsBean.java
        +-- ResponseHelper.java
        +-- UUIDHelper.java
        |
        
```

Thanks.

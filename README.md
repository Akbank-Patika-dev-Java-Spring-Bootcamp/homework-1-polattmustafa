## General Info
This project is a simple spring boot project that 
adds and brings in and updates the country's president for countries

## Technologies
Project is created with:
- Java 17
- Maven 4
- Spring Boot 3.0.6
- PostgreSQL

## Setup
To run this project;
- clone the repo with git
- Run `mvn clean install` in the root directory, you should open skip tests mode
- you should press run button or shift+f10

### To send request
- To save country post request url -> http://localhost:8084/api/country
```
exapmle request json data:
{
    "name": "Germany",
    "president": "Olaf"
}
```
```
exapmle output:
{
    "id": 2,
    "name": "Germany",
    "president": "Olaf"
}
```

- To get countries get request url -> http://localhost:8084/api/country
```
exapmle output:
[
    {
        "id": 2,
        "name": "Germany",
        "president": "Olaf"
    },
    {
        "id": 1,
        "name": "Turkiye",
        "president": "Polat"
    },
    {
        "id": 52,
        "name": "France",
        "president": "Macron"
    }
]
```

- To get a country get request url -> http://localhost:8084/api/country/{id}
```
example output:
{
    "id": 2,
    "name": "Germany",
    "president": "Olaf"
}
```

- To update country's president put request url -> http://localhost:8084/api/country/{id}?president={name}
```
example output:
{
    "id": 1,
    "name": "Turkiye",
    "president": "Mustafa"
}
```

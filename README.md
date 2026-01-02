Product Management REST API

This project is a Spring Boot backend application developed to manage products using CRUD operations.
It demonstrates how to build a clean RESTful API with proper layering, exception handling, database integration, and API documentation.

The application allows users to create, get, update, and delete products, and all endpoints are tested and documented using Swagger UI.
-----------------------------------------------------------------------------------------------------------------------------------------
🚀 Technologies Used

I. Java 17

II. Spring Boot

III. Spring Web (REST API)

IV. Spring Data JPA

V.  H2 In-Memory Database

VI. Swagger / Springdoc OpenAPI

-------------------------------------------------------------------------------------------------------------------------------------------

Application Features:

1. RESTful API architecture

2. CRUD operations for Product entity

3. Custom exception handling

4. H2 in-memory database for persistence

5. Swagger UI for API testing and documentation
-------------------------------------------------------------------------------------------------------------------------------------------



🔗 API Endpoints

Create - POST "/" - to Create Product. As a parameter it will take a product in json format and return a response if there is no problem.
<img width="1600" height="735" alt="image" src="https://github.com/user-attachments/assets/7f5e3740-8826-4370-90a5-7c7e7fdd2499" />

Get - GET "/{id}" - to get specific product by id. if there is no product with specific id, it will return us a ProductNotFound Exception.
<img width="1600" height="721" alt="image" src="https://github.com/user-attachments/assets/6d186d3e-db46-4e25-b5ca-64b2898abba8" />

Update - PUT "{id}" - The endpoint will update the product by getting it’s id. We are getting new product details from RequestBody as JSON.
<img width="881" height="748" alt="image" src="https://github.com/user-attachments/assets/935d3be1-f820-448f-b507-b07a2a1b020a" />
<img width="1588" height="535" alt="image" src="https://github.com/user-attachments/assets/a5527e3e-e97e-4c04-a281-31fb268705b0" />


Get - GET "/" - We are listing all the products.
<img width="1588" height="598" alt="image" src="https://github.com/user-attachments/assets/b0b37e11-cd92-4966-a74a-45bf54aef6d2" />



Delete - DELETE "/{id}" - to delete the product by id. If there is no product with specific id, it will return us a ProductNotFound Exception.
<img width="1590" height="657" alt="image" src="https://github.com/user-attachments/assets/73d4d43c-f367-4bd4-a3a3-e5716645e685" />
<img width="1588" height="535" alt="image" src="https://github.com/user-attachments/assets/55322870-57bb-4863-be64-a74548b9ba91" />

Let's look at exception handling:
It means when specific ID product is not found, the program throws ProductNotFoundException.
<img width="1335" height="727" alt="image" src="https://github.com/user-attachments/assets/b5d9692d-a030-4e71-9897-beb5057bba2d" />

----------------------------------------------------------------------------------------------------------------------------------------------
📄 Example JSON Request Bodies:
Create - POST

{

"name" : "Example Product Name"

}
<img width="1600" height="735" alt="image" src="https://github.com/user-attachments/assets/434d6056-2a8b-459d-ad68-22ef49613a29" />

Update - PUT

{

"name" : "New Product Name",

"id" : productID

}
<img width="881" height="748" alt="image" src="https://github.com/user-attachments/assets/9c957192-22d2-45bc-8b2e-69f60210a1c4" />
<img width="1588" height="535" alt="image" src="https://github.com/user-attachments/assets/f0fc7ae5-d7ed-40b8-90b0-593ad8d0398e" />

Clone the repository git clone: https://github.com/subkhannn/FinalProject2



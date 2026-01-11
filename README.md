# E-Commerce Microservice Platform


---

## Visual Tour

### Products – `http://localhost:4200/products`
Product catalog .

<img width="1810" height="742" alt="image" src="https://github.com/user-attachments/assets/2a66ce17-5070-4d98-8b91-e21955d94440" />



### Customers – `http://localhost:4200/customers`
Customer directory .

<img width="801" height="328" alt="image" src="https://github.com/user-attachments/assets/4664014c-df18-4fc4-bc69-e1393683170a" />

### Orders Timeline – `http://localhost:4200/orders/<customerId>`
Timeline of bills for a given customer.

<img width="1792" height="702" alt="image" src="https://github.com/user-attachments/assets/4e466517-322f-4274-829d-bddadedbf6eb" />

### Order Details – `http://localhost:4200/order-details/<billId>`
Detailed bill with line items and totals.

<img width="1872" height="863" alt="image" src="https://github.com/user-attachments/assets/fd366abb-b201-40a9-b515-e8d2b05355cf" />

### Eureka Dashboard – `http://localhost:8761`
Service discovery status page.

<img width="1821" height="815" alt="image" src="https://github.com/user-attachments/assets/2c7a87b8-f83d-4870-9ee3-bbc0afddcca5" />


### REST APIs via Gateway
- Customers – `http://localhost:8888/customer-service/api/customers`

<img width="1446" height="967" alt="image" src="https://github.com/user-attachments/assets/451832c0-8560-4280-8a2c-639d8a448e7c" />

- Inventory – `http://localhost:8888/inventory-service/api/products`

<img width="1210" height="838" alt="image" src="https://github.com/user-attachments/assets/9a2af456-e627-4303-a522-d3bba1babfd8" />

- Billing – `http://localhost:8888/billing-service/api/bills`

<img width="1158" height="859" alt="image" src="https://github.com/user-attachments/assets/af5988c5-bd27-48ff-aa2e-d24f943a8de4" />

---


---



## Technology Highlights

- **Spring Boot 3.x / Java 21**
- **Spring Cloud 2025.x** (Config, Netflix Eureka, Gateway, OpenFeign)
- **Maven** build + wrapper scripts for every service
- **Angular 17** with standalone components, HttpClient, Bootstrap 5
- **Responsive design** with hero sections, card grids, and status states
- **H2** in-memory databases with Spring Data REST for rapid prototyping
- **Bootstrap** Bootstrap features style web graphics
---

## Getting Started

### Prerequisites
- Java 21+
- Maven 3.9+
- Node.js 18+ & npm 10+

### Clone
```bash
git clone <repo-url>
cd micro-service-full-projet-main
```

---

## Running the Microservices

> Recommend starting a terminal per service (or use Spring Boot dashboard). Order matters: infrastructure before domain services.

1. **Discovery Service**
   ```bash
   cd micro-service/discovery-service
   ./mvnw spring-boot:run
   # http://localhost:8761
   ```
2. **Config Service**
   ```bash
   cd micro-service/config-service
   ./mvnw spring-boot:run
   ```
3. **Gateway Service**
   ```bash
   cd micro-service/gateway-service
   ./mvnw spring-boot:run
   # Gateway available on http://localhost:8888
   ```
4. **Customer Service**
   ```bash
   cd micro-service/customer-service
   ./mvnw spring-boot:run
   ```
5. **Inventory Service**
   ```bash
   cd micro-service/inventory-service
   ./mvnw spring-boot:run
   ```
6. **Billing Service**
   ```bash
   cd micro-service/billing-service
   ./mvnw spring-boot:run
   ```

All services fetch configuration from the Git-backed config repo declared in `config-service` (`micro-service/config-repo` by default).

---

## Running the Angular Frontend

```bash
cd ecom-web-app
npm install
npm run start
# Angular dev server on http://localhost:4200
```

Screens currently implemented:
- `/products` – Product catalog in responsive cards
- `/customers` – Customer directory with CTA for orders
- `/orders/:customerId` – Timeline of all bills for a given customer
- `/order-details/:billId` – Detailed bill summary with itemized totals

The UI consumes data via the Spring Cloud Gateway (`http://localhost:8888/...`) so ensure the back end is up before browsing.

---

#

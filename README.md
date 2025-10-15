# TradeFlow

TradeFlow is a **B2B e-commerce backend** built with **Java and Spring Boot**.  
It provides a scalable and modular architecture for managing users, vendors, products, and orders in a business-to-business e-commerce environment.

---

## Features

- **User Management**
  - Registration & login with role-based access (Admin, Vendor, Buyer)
  - Profile management

- **Product Management**
  - CRUD operations for products and categories
  - Stock management

- **Order Management**
  - Cart management
  - Order creation and status updates
  - Payment status handling (mock for now)

- **Vendor Management**
  - Vendor registration approval
  - Vendor dashboard for managing products and orders

- **Search & Filter**
  - Search products by name or category
  - Filter products by price, stock, ratings

- **Reports (Future Enhancement)**
  - Sales reports
  - Inventory reports

---

## Tech Stack

- **Backend:** Java 17, Spring Boot  
- **Database:** H2 (development) / MySQL or PostgreSQL (production)  
- **Security:** Spring Security + JWT  
- **Build Tool:** Maven  
- **Testing:** JUnit, Mockito  

---

## Project Structure

- `controller` – Handles API requests  
- `service` – Business logic  
- `repository` – Database interactions  
- `model/entity` – Database models  
- `dto` – Data Transfer Objects  
- `config` – Security & app configurations  

---

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/TradeFlow.git

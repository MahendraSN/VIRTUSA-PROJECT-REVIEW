# VIRTUSA-PROJECT-REVIEW

# Online Retail Sales Analysis

## Project Overview
This project is built using MySQL to analyze online retail sales data.  
The project demonstrates database creation, table relationships, data insertion, and business analysis using SQL queries.

---

# Technologies Used
- MySQL
- VS Code
- SQLTools Extension

---

# Database Tables

## 1. Customers
Stores customer details.

| Column | Description |
|---|---|
| customer_id | Unique customer ID |
| name | Customer name |
| city | Customer city |

---

## 2. Products
Stores product details.

| Column | Description |
|---|---|
| product_id | Unique product ID |
| name | Product name |
| category | Product category |
| price | Product price |

---

## 3. Orders
Stores customer order details.

| Column | Description |
|---|---|
| order_id | Unique order ID |
| customer_id | Customer reference |
| order_date | Order date |

---

## 4. Order_Items
Stores ordered product details.

| Column | Description |
|---|---|
| order_item_id | Unique item ID |
| order_id | Order reference |
| product_id | Product reference |
| quantity | Product quantity |

---

# Features
- Create relational database
- Insert sample retail data
- Analyze sales using SQL
- Generate business insights
- Practice SQL joins and aggregation

---

# SQL Concepts Used
- CREATE DATABASE
- CREATE TABLE
- PRIMARY KEY
- FOREIGN KEY
- INSERT INTO
- SELECT
- JOIN
- GROUP BY
- ORDER BY
- SUM()
- LEFT JOIN

---

# Analysis Queries

## 1. Top Selling Products
Find products with highest sales quantity.

## 2. Most Valuable Customers
Identify customers spending the most money.

## 3. Monthly Revenue
Calculate revenue generated every month.

## 4. Category-wise Sales Analysis
Analyze sales based on product category.

## 5. Inactive Customers
Find customers who never placed orders.

---

# How to Run Project

## Step 1
Open MySQL Command Line Client or VS Code SQLTools.

## Step 2
Run the SQL file.

```sql
SOURCE project.sql;
```

OR copy and execute the queries manually.

---

# Sample Queries

```sql
SELECT * FROM Customers;
```

```sql
SELECT * FROM Products;
```

```sql
SELECT * FROM Orders;
```

```sql
SELECT * FROM Order_Items;
```

---

# Expected Output
- Structured retail database
- Sales analysis reports
- Customer insights
- Revenue analysis
- SQL query execution results

---

# Project Outcome
This project helps in understanding:
- Database management
- Relational database concepts
- SQL query writing
- Business data analysis
- Real-world retail analytics

---

# Author
Mahendra SN

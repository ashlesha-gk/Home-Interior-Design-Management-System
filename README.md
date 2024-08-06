# Home-Interior-Design-Management-System

## Overview
The Home Interior Design Management System is a DBMS-based mini-project developed using Apache NetBeans and Java. This system is designed to manage and streamline the various aspects of a home interior design business. It includes functionalities for managing clients, designers, inventory, projects, and suppliers. The backend is powered by MySQL, and the system uses JDBC for database connectivity.

## Features
User Authentication: Secure login system for accessing the application.
Client Management: Add, update, and manage client information.
Designer Management: Track and manage designers, including their assigned projects.
Inventory Management: Manage inventory items and track supplies.
Project Management: Create, update, and track the status of projects (not started, in progress, finished).
Supplier Management: Manage supplier information and their inventory contributions.

## Database Schema
The database includes the following tables:
- Login: Stores user authentication details.
- Clients: Contains client information.
- Designers: Stores information about designers.
- Inventory: Manages inventory items.
- Projects: Contains project details and statuses.
- Suppliers: Manages supplier information.
### Views
- Project_Designers_View: Shows the relationship between projects and their assigned designers.
- Supplier_Inventory_View: Displays the inventory items provided by each supplier.
- Total_Designers_View: Provides a summary of all designers.

## Technologies Used
- Java: Used for the core application logic.
- Apache NetBeans: IDE for designing and developing the application.
- MySQL: Database for storing all application data.
- JDBC (Java Database Connectivity): For connecting and interacting with the MySQL database.

## Setup and Installation
### Prerequisites
- JDK (Java Development Kit) installed
- Apache NetBeans IDE installed
- MySQL server installed and running

 ### Steps
1. #### Clone the Repository:
bash
Copy code
git clone https://github.com/your-username/home-interior-design-management-system.git

2. #### Open the Project in NetBeans:
- Open Apache NetBeans.
- Go to File > Open Project and select the cloned repository.

3. #### Configure the Database:
- Create a MySQL database and import the provided SQL scripts to set up the tables and views.
- Update the database connection details in the application (JDBC URL, username, password).

4. #### Run the Application:
- Right-click the project in NetBeans and select Run.

## Usage
- **Login:** Enter your credentials to access the system.
- **Navigate:** Use the menu to navigate through clients, designers, inventory, projects, and suppliers.
- **CRUD Operations:** Perform Create, Read, Update, and Delete operations on the respective entities.

## Contributing
If you would like to contribute to this project, please fork the repository and create a pull request. For major changes, please open an issue to discuss what you would like to change.

## License
This project is licensed under the MIT License.

## Acknowledgements
Apache NetBeans for providing a robust development environment.
MySQL for database management.

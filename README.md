# P07 – Inheritance (Bank Account System)

## 📌 Overview
This project demonstrates **inheritance in Java** using a real-world banking example.  
The base class `BankAccount` defines common properties and methods (account number, balance, deposit, withdraw).  
Two subclasses extend it with specialized behavior:

- **SavingsAccount** → supports applying interest to the balance  
- **CurrentAccount** → supports overdraft facility (allows withdrawing more than balance up to a limit)

This project is about OOP fundamentals.

---

## 🛠 Concepts Covered
- **Inheritance** – `SavingsAccount` and `CurrentAccount` extend `BankAccount`  
- **Constructor Chaining** – passing values from child classes to parent class constructor  
- **Method Overriding** – redefining `withdraw()` logic in `CurrentAccount`  
- **Encapsulation** – keeping balance/account details private, modifying through methods  

---

## 📂 Project Structure
P07-inheritance/
│── src/
│ ├── BankAccount.java
│ ├── SavingsAccount.java
│ ├── CurrentAccount.java
│ └── Main.java
│── README.md

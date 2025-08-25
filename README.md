# Java-OOP-Assignment

## 🔹 3. Java-OOP-Assignment → `README.md`

# 📝 Java OOP Assignments

![Language](https://img.shields.io/badge/language-Java-orange)
![Repo Size](https://img.shields.io/github/repo-size/Md-sihab11/Java-OOP-Assignment)
![Last Commit](https://img.shields.io/github/last-commit/Md-sihab11/Java-OOP-Assignment)

## 📌 Overview
This repository contains my **Java OOP course assignments**.  
It covers real-world problems using **classes, objects, inheritance, interfaces, polymorphism, abstraction, and file handling**.

## 📂 Folder Structure
1. [Hello.java](Hello.java)
2. [Default_constructor.java](Default_constructor.java)
3.[Types_of_Variable.java](Types_of_Variable.java)

📝 Notes: Variables in Java<br>

-🔑 Local Variable  
-📍 Declared inside a method / constructor / block  
-🗂️ Stored in stack memory  
-⏳ Created when method starts, destroyed when method ends  
-⚠️ Must be initialized (❌ no default value)  
-🎯 Scope → only within that method/block  

-🔑 Instance Variable<br>
-📍 Declared inside a class but outside methods/constructors   
-🗂️ Stored in heap memory (part of object)    
-⏳ Created when object is created, destroyed when object is garbage collected  
-✅ Gets a default value if not initialized (0, null, etc.)  
-🎯 Scope → accessible throughout the object via reference  

-🔎 Internal Breakdown of new Types_of_Variable() <br>

-👉 new keyword JVM কে বলে|  
Heap memory তে Types_of_Variable class এর একটা নতুন object বানাও।  
ওই object এর ভেতরে থাকা সব instance variable (যেমন B) এর জন্য memory allocate করো।  
Initialization দাও (এখানে B = 13)।  

-এই new Types_of_Variable() expression এর result হলো: Heap memory তে একটা object এর reference (address/pointer)।  
-🎯Heap = আসল object (data store হয় এখানে)।  
-🎯Stack = শুধু object এর ঠিকানা (reference variable) থাকে।  
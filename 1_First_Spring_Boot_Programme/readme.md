## 1. What is a Framework?

A **framework** is a platform for developing software applications. It provides a foundation with predefined classes and functions to manage hardware devices, handle user input, and interact with system software.

### Key Features:
- ✅ **Reusable Code:** Code written once can be reused in multiple parts of the application.
- 🛠️ **Standard Structure for Development:** Provides a structure for your application, making it easier to manage.
- 💡 **Simplifies Complex Programming Tasks:** Reduces the complexity of coding by providing built-in functions.
- 📚 **Example Frameworks:** Spring Framework, Angular, Django.

### ❓ **Possible Questions:**
- What are the benefits of using a framework?
- How does a framework differ from a library?

---

## 2. What is Spring Framework? Why is it Popular?

The **Spring Framework** is an open-source Java-based framework used to build robust, secure, and scalable enterprise applications. It provides comprehensive infrastructure support for developing Java applications, making it a popular choice for Java developers worldwide.

### Popular Because:
- ✅ **Lightweight and Modular:** Easy to use with a flexible architecture.
- 🔄 **Supports Dependency Injection (DI) and Inversion of Control (IoC):** Simplifies management of dependencies.
- ☕ **Simplifies Java EE Development:** Reduces boilerplate code and enhances productivity.
- 🔐 **Transaction Management & Security:** Built-in support for handling transactions and securing applications.
- 🤝 **Easy Integration:** Seamlessly integrates with frameworks like Hibernate, Struts, and more.

### ❓ **Possible Questions:**
- What are the core features of the Spring Framework?
- Why is Spring considered lightweight?



## 📊 Difference Between Spring Framework and Spring Boot

| **Aspect**     | **Spring Framework**                        | **Spring Boot**                                |
|----------------|--------------------------------------------|------------------------------------------------|
| **Setup**      | Requires manual configuration              | Auto-configuration, minimal setup required      |
| **Complexity** | More complex due to XML configurations      | Simplified with embedded servers                |
| **Deployment** | Requires external server (Tomcat, etc.)     | Embedded server for easy deployment             |


## 🌱 What is Spring Framework?

The **Spring Framework** is an open-source, Java-based framework used to build robust, secure, and scalable enterprise applications. It provides comprehensive infrastructure support for developing Java applications, making it a popular choice for Java developers worldwide.

### 🚀 **Why is Spring Framework Popular?**
- ✅ **Lightweight and Modular:** Easy to use with a flexible architecture.
- 🔄 **Supports Dependency Injection (DI) and Inversion of Control (IoC):** Simplifies management of dependencies.
- ☕ **Simplifies Java EE Development:** Reduces boilerplate code and enhances productivity.
- 🔐 **Transaction Management & Security:** Built-in support for handling transactions and securing applications.
- 🤝 **Easy Integration:** Seamlessly integrates with frameworks like Hibernate, Struts, and more.

---

## ❓ **Possible Interview Questions**
1. **What are the core features of the Spring Framework?**
2. **Why is Spring considered lightweight?**
3. **How does Dependency Injection work in Spring?**
4. **What is the difference between BeanFactory and ApplicationContext?**
5. **How does Spring handle transactions?**  

# Getting Started with Spring

To get started with Spring, you need to add the necessary dependencies in your `pom.xml` file. Here are the basic dependencies you'll need to get up and running with Spring.

### 1. **Spring Core Dependency**

This is the basic dependency for using core Spring features like Inversion of Control (IoC) and Dependency Injection (DI).

#### Steps to Add Spring Core Dependency:
1. Go to your **Maven Repository** (https://mvnrepository.com/).
2. In the search bar, type `spring-context` to find the latest version of the Spring Core dependency.
3. Copy the dependency XML code for `spring-context` (make sure to get the correct version).
4. Open your `pom.xml` file in your project.
5. Paste the copied dependency inside the `<dependencies>` section of your `pom.xml` file.

Example:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.20</version> <!-- Use the latest version -->
</dependency>


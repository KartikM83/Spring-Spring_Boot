# 1. Introduction to Dependency Injection (DI)

**Dependency Injection (DI)** is a design pattern used to achieve **Inversion of Control (IoC)** in software systems. Instead of creating objects manually within a class, dependencies are injected by the framework (in this case, **Spring**).

### 🚀 **Benefits of Dependency Injection:**
- ✅ **Reduces tight coupling** between classes
- ✅ **Increases code maintainability** and testability
- ✅ **Simplifies** code structure

### ⚡ **Types of Dependency Injection in Spring:**
1. **Constructor Injection**  
   Dependencies are provided through a class constructor.

2. **Setter Injection**  
   Dependencies are injected via public setter methods.

3. **Field Injection** *(commonly used with `@Autowired`)*  
   Dependencies are directly injected into class fields.


# 🚀 Dependency Injection (DI) in Spring Boot

**Dependency Injection (DI)** is a design pattern that helps manage dependencies automatically, reducing tight coupling between classes. In Spring Boot, DI is achieved using annotations like `@Component` and `@Autowired`.

---

## 📦 **Example: Dependency Injection in Spring Boot**

### 1️⃣ **Project Structure:**
src/ └── main/ └── java/ └── org/kartikmankar/spring/ ├── Application.java ├── Alien.java └── Laptop.java
---


---

### 2️⃣ **Application Class - Entry Point**

```java
package org.kartikmankar.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
   public static void main(String[] args) {

      // ✅ Manual Object Creation (Not Recommended in Spring Boot)
//        Alien obj = new Alien();
//        obj.code();

      // ✅ Automatic Object Creation using Spring Boot (Recommended)
      ApplicationContext context = SpringApplication.run(Application.class, args);

      Alien obj1 = context.getBean(Alien.class); // Fetching Alien Bean
      obj1.code();  // This works because of @Component and @Autowired annotations
   }
}
````
### **3️⃣ Alien Class - Dependent on Laptop**

````java
package org.kartikmankar.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Tells Spring to manage the object lifecycle of this class
public class Alien {

   @Autowired // Automatically injects the Laptop dependency
   Laptop laptop;

   public void code() {
      laptop.compile();  // Calls the compile() method from the Laptop class
   }
}
````

### **4️⃣ Laptop Class - The Injected Dependency**

```` java
package org.kartikmankar.spring;

import org.springframework.stereotype.Component;

@Component // Marks this class as a Spring-managed component
public class Laptop {
    public void compile() {
        System.out.println("Laptop is compiling code...");
    }
}
````



# 2️⃣ Understanding `@Component` in Spring

The `@Component` annotation is used to mark a Java class as a **Spring-managed component**. It tells the **Spring container** to automatically detect and register the class as a **bean** during the **component scanning** process.

---

## 🚀 **Key Points About `@Component`:**

- ✅ The class becomes a **Spring-managed bean**.
- ✅ **No need** to manually create objects using the `new` keyword.
- ✅ **Automatically discovered** during component scanning.

---

## 💡 **How It Works:**

When you annotate a class with `@Component`, Spring automatically registers it in the **ApplicationContext** at runtime.

### **Example: Using `@Component` in Spring**

### 📦 **Alien.java**

```java
package org.kartikmankar.spring;

import org.springframework.stereotype.Component;

@Component // Tells Spring to create and manage an object (bean) of this class
public class Alien {
    public void code() {
        System.out.println("Alien is coding...");
    }
}
````


# Understanding @Autowired in Spring

The `@Autowired` annotation allows Spring to resolve and inject the required bean automatically. In your code, it is used for **field injection**.

## Key Features:

- Automatically injects the appropriate bean.
- Reduces boilerplate code for object creation.
- Can be used with fields, constructors, or setter methods.

## Example Code:

```java
@Component
public class Alien {
    @Autowired // Automatically injects Laptop dependency
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
````
# Common Errors & Troubleshooting in Spring @Autowired

## 1. NullPointerException
### Cause:
Occurs if `@Autowired` is missing or if the class isn’t registered as a component.

### Solution:
- Ensure that the class is annotated with `@Component`, `@Service`, `@Repository`, or another Spring stereotype annotation.
- Verify that the bean is being injected properly with `@Autowired`.

## 2. NoSuchBeanDefinitionException
### Cause:
Happens if Spring cannot find the required bean. This could be because the class is not registered or not included in the component scan.

### Solution:
- Ensure that the class is annotated with `@Component` (or other appropriate annotations like `@Service` or `@Repository`).
- Confirm that the package containing the bean is within the component scan path, which you can configure using `@ComponentScan`.

## 3. Circular Dependency
### Cause:
Occurs when two or more beans depend on each other in a loop.

### Solution:
- Check your class dependencies to ensure there is no circular reference.
- Consider using setter injection or the `@Lazy` annotation to break the cycle, or refactor the design to avoid direct dependencies.

---
These are common issues that arise when using `@Autowired`. If troubleshooting these doesn’t resolve the issue, further investigation into bean configuration and Spring context setup may be needed.



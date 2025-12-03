## Overloading (Method Overloading)

Method overloading refers to defining multiple methods that share the **same name** but have **different parameter lists** within a single class.

### Key Characteristics of Overloading:

*   **Signature Requirement:** Overloaded methods must have different **parameter lists**.
*   **Return Type/Modifiers:** You **cannot** overload methods solely based on having different modifiers or different return types.
*   **Location:** Overloaded methods can exist in the **same class**.
*   **Benefit:** Overloading enhances program clarity and readability, especially when different types of parameters are needed for methods that perform the **same function** (e.g., calculating the maximum value for integers, doubles, or triples).

### Method Matching and Resolution:

The Java compiler is responsible for determining which overloaded method to invoke based on the method signature.

1.  **Best Match:** The compiler attempts to find the method that **best matches** a method invocation.
    *   *Example:* If you call `max(3, 4)`, and both `max(int, int)` and `max(double, double)` exist, the `max(int, int)` version is the better match and will be used.
2.  **Type Conversion:** If necessary, Java may perform automatic conversions.
    *   *Example:* If you invoke `max(2, 2.5)`, the integer value `2` is automatically converted into a `double` value, and the `max` method expecting `double` parameters is invoked.
3.  **Ambiguous Invocation (Error):** If there are two or more methods that are possible matches, but the compiler cannot determine which match is the most specific (e.g., conflicting conversion paths), this is referred to as **ambiguous invocation**, and it causes a **compile error**.

---

## Overriding (Method Overriding)

Method overriding is the practice where a **subclass** modifies the implementation of a method that is already defined and accessible in its **superclass**.

### Key Characteristics of Overriding:

*   **Context:** Overridden methods must be in **different classes** that are related by **inheritance**.
*   **Signature Requirement:** The overriding method in the subclass must use the **exact same signature** (name and parameter list) as the method it overrides in the superclass.
*   **Return Type:** The overriding method must have the **same or a compatible return type** (meaning the return type must be a subtype of the overridden method's return type).
*   **Accessibility:** An instance method can be overridden only if it is **accessible**.
    *   A **private method cannot be overridden**, as it is not accessible outside its own class. If a method in a subclass has the same name and signature as a private method in its superclass, the two methods are considered completely unrelated.
    *   A subclass cannot **weaken the accessibility** of a method defined in the superclass (e.g., a `public` method in the superclass cannot be made `protected` or `private` in the subclass).
*   **Static Methods:** A **static method cannot be overridden**. If a subclass redefines a static method from the superclass, the method in the superclass is **hidden**.
*   **Using `super`:** The keyword `super` can be used within the overriding method in the subclass to explicitly invoke the implementation of the method found in the immediate superclass (e.g., `super.toString()`). Using `super.super.methodName()` is a **syntax error**.
*   **Annotation:** Using the **`@Override` annotation** before an overriding method is recommended practice, as it causes the compiler to report an error if the method signature inadvertently fails to match the superclass method (e.g., due to a typo).

### Overriding and Runtime Behavior (Polymorphism and Dynamic Binding)

Overriding is a critical component of two major object-oriented principles: polymorphism and dynamic binding.

1.  **Polymorphism:** This principle means that a **variable of a supertype can refer to a subtype object**. When methods are overridden, polymorphism allows a single method call syntax to execute different implementations based on the object's actual type.
2.  **Dynamic Binding:** When an instance method is invoked from a reference variable, the **actual type** of the object (the class used to create the instance at runtime) determines which implementation of the method is used.
    *   **Method Matching** (Compile Time): The declared type of the reference variable determines which method signature to match.
    *   **Method Binding** (Runtime): The **JVM dynamically binds** the implementation of the method based on the object's actual type. The JVM searches up the inheritance chain, starting from the object's actual class, until it finds the method implementation to invoke.

---

## Overriding vs. Overloading Comparison

| Feature | Method Overloading | Method Overriding |
| :--- | :--- | :--- |
| **Definition** | Defining methods with the same name but different parameter lists. | Providing a new implementation for an inherited method. |
| **Signature** | Must have the **same name** but **different parameter lists**. | Must have the **same signature** (name and parameter list). |
| **Location** | Can be in the same class, or in classes related by inheritance. | Must be in **different classes** related by **inheritance** (subclass/superclass). |
| **Resolution** | Determined by the **compiler** based on the signature (best match). | Determined by the **JVM at runtime** based on the actual object type (dynamic binding). |
| **Pillar of OOP** | Primarily concerned with code readability. | Foundation for **Polymorphism** and **Dynamic Binding**. |

Understanding the distinction is like understanding two different ways to use tools: Overloading is having multiple tools (methods) of the same name but for different jobs (different input types) all organized in one toolbox (class); Overriding is taking a general tool from a basic kit (superclass) and replacing it with a specialized, improved version in your advanced kit (subclass) to ensure that when someone asks for that tool, they get the best possible version for the task at hand.

---

Inheritance is a fundamental and powerful feature in object-oriented programming (OOP), alongside encapsulation and polymorphism, used primarily for reusing software and managing complexity.

Here is an in-depth overview of inheritance:

## I. Definition and Terminology

Inheritance allows a programmer to define a new class based on an existing class. This mechanism prevents redundancy and makes the system easier to comprehend and maintain.

*   **Superclass and Subclass:** When a class ($C_1$) is extended from another class ($C_2$), $C_1$ is called the **subclass** (or child class, derived class, or extended class), and $C_2$ is called the **superclass** (or parent class or base class).
*   **Relationship:** The relationship between a subclass and its superclass is known as the **is-a relationship**. For instance, a `Circle` object is a type of general `GeometricObject`.
*   **Type Hierarchy:** A class defines a type. A type defined by a subclass is called a **subtype**, while a type defined by its superclass is a **supertype**.
*   **Structure:** A subclass typically contains **more information and methods** than its superclass, as it specializes the features inherited from the superclass and often adds new features.

## II. Mechanism and Keywords

### The `extends` Keyword

The keyword **`extends`** is used to define a subclass from a superclass.

*   **Inheritance Scope:** A subclass inherits all accessible data fields and methods from its superclass.
*   **Private Members:** **Private data fields** in the superclass are generally **not accessible directly** in the subclass, but they can be accessed or modified using public accessor or mutator methods (getters and setters) if those methods are defined in the superclass.
*   **Single Inheritance:** Java enforces **single inheritance**, meaning a class may only inherit directly from one superclass. However, multiple inheritance concepts can be achieved through interfaces.
*   **Key Concepts:** Inheritance, along with method overriding, forms the basis for **Polymorphism** and **Dynamic Binding** (discussed in detail in Chapter 11).

### The `super` Keyword

The keyword `super` refers to the superclass of the class in which it appears. It is used for two main purposes: calling superclass constructors and invoking superclass methods.

1.  **Calling Superclass Constructors:**
    *   Superclass constructors are **not inherited** by the subclass.
    *   They must be explicitly invoked from the subclass constructor using `super()` (for the no-arg constructor) or `super(arguments)` (for a parameterized constructor).
    *   This call **must be the first statement** in the subclass constructor.
    *   **Constructor Chaining:** When an instance of a class is created, the constructors of all superclasses along the inheritance chain are implicitly or explicitly invoked, starting from the highest parent class down to the specific subclass. This process is called constructor chaining. If a subclass constructor does not explicitly invoke a superclass constructor, the compiler automatically inserts `super()` as the first statement, invoking the superclass’s no-arg constructor.
    *   **Design Note:** If a class is designed to be extended, it should ideally provide a no-arg constructor to prevent compile errors in subclasses that rely on the implicit `super()` call.

2.  **Calling Superclass Methods:**
    *   `super.method(arguments)` is the syntax used to reference a method defined in the superclass. This is often necessary when a subclass has **overridden** a method and needs to execute the superclass's implementation within the overriding method.

## III. Visibility and Access Control

Inheritance is closely related to visibility modifiers, especially when determining what a subclass can access.

*   **`protected` Modifier:** A **protected** member (data field or method) of a class can be accessed directly from a subclass, regardless of whether the subclass is in the same package or a different package. Protected members are also accessible by any other class within the same package.
*   **Visibility Hierarchy:** Visibility increases in the order: `private`, default (package-private/no modifier), `protected`, and `public`.
*   **Overriding Restriction:** A subclass cannot **weaken the accessibility** of a method defined in the superclass (e.g., a `public` method in the superclass cannot be made `protected` or `private` in the subclass).

## IV. Preventing Extension and Overriding

The `final` modifier can be used to control the ability to extend classes or override methods.

*   **Final Classes:** Using the `final` modifier on a class prevents it from being extended (it cannot be a parent class). Examples of final classes include `Math`, `String`, `StringBuilder`, `StringBuffer`, and all numeric wrapper classes.
*   **Final Methods:** A method defined as **`final`** cannot be overridden by its subclasses.
*   **Final Fields:** The `final` modifier used on a variable (local or data field) indicates that it is a **constant**.

# **Yashika's Java Assignment - Student ID: C0933047**

## **Assignment: Dog and Person Classes with Unit Testing**

### **Overview:**
In this assignment, I was tasked with developing two Java classes, `Dog` and `Person`, each with specific attributes and methods. The assignment also includes writing unit tests to verify the functionality of both classes and submitting the project on GitHub.

- **Dog Class**:
  - Attributes: `String name`, `Integer age`
  - Constructor: `public Dog(String name, Integer age)`

- **Person Class**:
  - Attributes: `String name`, `Integer age`, `Optional<Dog> dog`
  - Constructors: 
    - `public Person(String name, Integer age)`
    - `public Person(String name, Integer age, Dog dog)`
  - Methods:
    - `public boolean hasOldDog()` - Returns `true` if the person owns a dog and the dog is 10 years old or older.
    - `public void changeDogsName(String newName)` - Changes the name of the dog if the person owns one.

### **How to Run the Code and Unit Tests:**

#### **1. Clone the Repository:**
To start, clone the repository using this command:
```bash
git clone https://github.com/yashika34/Assignment1_0933047.git
```

#### **2. Build and Execute the Code:**

- Navigate to the project folder:
  ```bash
  cd Assignment1_0933047
  ```

- If you're using **Maven** for building the project, run the following commands:

  - **To compile and run**:
    ```bash
    mvn clean install
    mvn exec:java
    ```

- Alternatively, you can execute `Main.java` directly from your IDE (Eclipse, IntelliJ, or VS Code).

#### **3. Running the Unit Tests:**

Unit tests for the `Dog` and `Person` classes are located in the `src/test/java` directory. These tests check the functionality of the methods in both classes.

- To run the unit tests with Maven, use:
  ```bash
  mvn test
  ```

- Alternatively, you can run the tests directly from your IDE.

#### **4. Test Coverage:**
The unit tests cover:
- The `hasOldDog()` method in the `Person` class.
- The `changeDogsName()` method.
- The constructors and getter/setter methods for both the `Dog` and `Person` classes.

#### **5. Expected Output:**
- The program will output details about a person, including their dog's name and age, if the person owns a dog.
- The program also performs checks like whether the person has an old dog and allows changing the dog's name.

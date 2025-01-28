# S1.04-Testing-Nivel1-Ej1

#Summary: exercise description

Create a Java class that manages a collection of books in a library. The class should allow adding books, retrieving the list of books, getting a specific book by its position, adding a book at a specific position, and removing a book by title.

Implement the following functionalities:

The class should allow adding books to the collection.
The complete list of books should be retrieved
The title of a book given a position should be retrieved.
The title of a book should be added at a specific position.
The title of a book should be deleted by title.
Verify its correct operation with JUnit:

Verify that the list of books is not null after creating a new object.
Confirm that the list has an expected size after inserting multiple books.
Ensure that the list contains a specific book in its correct position.
Verify that there are no duplicate book titles in the list.
Verify that the title of a book given a specific position can be retrieved.
They ensure that adding a book correctly modifies the list.
They confirm that removing a book decreases the size of the list.
They verify that the list remains alphabetically sorted after adding or removing a book.
#Technologies Used

java 22

#Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

Testing framework: JUnit 5 (Jupiter API).

Build tool: Maven (optional) or manual configuration of the JUnit JAR.

Required dependencies (if using Maven):
Include in your `pom.xml` file:
```xml
    <dependencies>
     <dependency>
     <groupId>org.junit.jupiter</groupId>
     <artifactId>junit-jupiter</artifactId>
     <version>5.9.3</version>
     <scope>test</scope>
     </dependency>
    </dependencies>
```
If you don't use Maven, download the JAR file from Maven Central and manually add it to the project.

#How to run it

1. **Clone or download the repository**:
- Clone the repository:
```bash
git clone https://github.com/your-repository/testing-junit.git
```
- Or download the ZIP file and extract the contents.

2. **Open the project**:
- Use your favorite IDE (such as IntelliJ IDEA or Eclipse).
- Make sure the project is set up correctly and that the dependencies (if you use Maven) are downloaded automatically.

3. **Run the tests**:
- From the IDE:
- Right-click on any test class or the `/src/test/java` package.
- Select the "Run Tests" option.
- From the terminal:
- If you are using Maven, run:
```bash
mvn test
```

4. **View the results**:
- The test results will appear in the IDE console or the terminal, indicating which tests passed and which failed.

#Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit
-m 'Add New Feature'
-Upload the changes to your branch: git push origin feature/NewFeature
-Make a pull request
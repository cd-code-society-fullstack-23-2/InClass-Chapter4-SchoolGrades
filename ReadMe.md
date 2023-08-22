**GradeBook Terminal Application Lab Instructions**

---

**Objective:**  
Develop a simple terminal application to manage a GradeBook. This lab will help you strengthen your understanding of arrays, class interactions, and user input/output in the Java language.

**Classes and Responsibilities:**

1. **Grade**  
   Fields:
   - name: String
   - assignment: String
   - score: Double

2. **GradeBook**  
   Fields:
   - grades: Grade[]

Behaviors/Methods:
- addGrade(Grade): Grade
- clearGradesByAssignment(String): Boolean
- findByNameAndAssignment(String, String): Grade
- findAllByName(String): Grade[]
- findAllByAssignment(String): Grade[]
- averageScoreByAssignment(String): Double

3. **Main**  
   This class will act as the user interface for your application. It will prompt the user to perform various tasks related to the GradeBook.

**Instructions:**

1. **Setup**:
   - Initialize a new Maven project in IntelliJ with JUnit 5 support.
   - Create the two classes (`Grade` and `GradeBook`) with their respective fields and methods.

2. **Development**:

   a. **Grade Class**:  
   Implement the constructors, getters, and setters for the `Grade` class.

   b. **GradeBook Class**:
   - Implement the behaviors/methods mentioned above.
   - Use loops for methods that iterate through the array, and consider handling potential edge cases (e.g., the array being full or an assignment not being found).

   c. **Main Class**:  
   Develop an interactive terminal interface:
   - Use a loop to continually present the user with a menu of options to interact with the GradeBook until they choose to exit.
   - The menu should include options for all of the GradeBook behaviors.
   - Prompt the user for necessary information depending on the chosen operation, like names, assignments, or scores.

3. **Testing**:

   a. **Grade Test Class**:  
   Write tests to confirm the correct functionality of the `Grade` class.

   b. **GradeBook Test Class**:  
   Write tests for each method in the `GradeBook` class. Ensure you cover potential edge cases and usual scenarios.

4. **Run and Verify**:  
   Once your tests pass, use the `Main` class to run your application. Interact with your GradeBook through the terminal to ensure that it behaves as expected.


Happy coding! 🚀👩‍💻📚👨‍💻# InClass-Chapter4-SchoolGrades

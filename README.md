# Car Rental Management System

This project demonstrates the use of the **GRASP Controller Principle** in a Car Rental Management System.

## Principle Applied: Controller
The Controller principle assigns the responsibility of handling user actions to a separate controller class instead of placing it in UI or data classes.

### 1. **With Controller Principle**
- **`RentalController`** class manages car rental and return actions.
- The **Customer** and **Car** classes only handle their own data.
- This ensures **better separation of concerns**, **modularity**, and **maintainability**.

### 2. **Without Controller Principle**
- The **Customer** class directly handles rental logic.
- This **violates separation of concerns**, making the code harder to maintain.

## Benefits of Using Controller
- **Reduces coupling** between objects.
- **Improves code reusability** by centralizing logic.
- **Enhances maintainability** and scalability.

## How to Run
Compile and run `Main.java` in your Java IDE.
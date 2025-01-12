# Badak Programming Language Grammar

## 1. Data Types
```
PrimitiveType:
    int         // Integer numbers
    double      // Floating point numbers
    char        // Single character
    string      // Text string
    bool        // Boolean values
    void        // For functions only
    
ArrayType:
    PrimitiveType[]

DictionaryType:
    dict<Type, Type>
```

## 2. Variables and Constants
```
Declaration:
    Type Identifier;
    Type Identifier = Expression;
    const Type Identifier = Expression;

Array Declaration:
    Type[] Identifier = [Expression, ...];
    Type[] Identifier = new Type[Size];

Dictionary Declaration:
    dict<Type, Type> Identifier = {KeyValue, ...};
    dict<Type, Type> Identifier = {};

KeyValue:
    Expression: Expression
```

## 3. Operators
```
Arithmetic:
    +    // Addition
    -    // Subtraction
    *    // Multiplication
    /    // Division
    %    // Modulus

Comparison:
    <     // Less than
    >     // Greater than
    <=    // Less than or equal
    >=    // Greater than or equal
    ==    // Equal to
    !=    // Not equal to

Logical:
    and   // Logical AND
    or    // Logical OR
    not   // Logical NOT

Assignment:
    =     // Simple assignment
    +=    // Add and assign
    -=    // Subtract and assign
    *=    // Multiply and assign
    /=    // Divide and assign
```

## 4. Functions
```
FunctionDeclaration:
    func ReturnType Identifier(Parameters) {
        Statements
    }

Parameters:
    ε
    Parameter
    Parameter, Parameters

Parameter:
    Type Identifier
```

## 5. Control Structures
```
If Statement:
    if (Expression) {
        Statements
    }
    if (Expression) {
        Statements
    } else {
        Statements
    }

While Loop:
    while (Expression) {
        Statements
    }

For Loop:
    for (Statement; Expression; Statement) {
        Statements
    }
```

## 6. Arrays and Dictionaries
```
ArrayAccess:
    Identifier[Expression]

ArrayMethods:
    .length         // Get array length
    .append(item)   // Add item to end
    .remove(index)  // Remove at index

DictionaryAccess:
    Identifier[Expression]

DictionaryMethods:
    .hasKey(key)    // Check key existence
    .remove(key)    // Remove entry
    .keys()         // Get all keys
    .values()       // Get all values
    .clear()        // Remove all entries
```

## 7. Built-in Functions
```
print(Expression)   // Output to console
input()            // Get user input
```

## 8. Comments
```
SingleLineComment:
    // Comment text

MultiLineComment:
    /* Comment text
       More comment text */
```

## 9. Special Values
```
Literals:
    IntegerLiteral      // e.g., 42
    DoubleLiteral       // e.g., 3.14
    CharLiteral         // e.g., 'A'
    StringLiteral       // e.g., "Hello"
    BooleanLiteral      // true, false
    null                // Null value
```

## 10. Operator Precedence (highest to lowest)
```
1. ()               // Parentheses
2. not             // Logical NOT
3. * / %           // Multiplication, Division, Modulus
4. + -             // Addition, Subtraction
5. < > <= >=       // Comparison operators
6. == !=           // Equality operators
7. and             // Logical AND
8. or              // Logical OR
9. =               // Assignment
```

## 11. Program Structure
```
Program:
    Declarations

Declarations:
    ε
    Declaration Declarations

Declaration:
    FunctionDeclaration
    VariableDeclaration
    ConstantDeclaration
```



# Test Driven Development

```All what you need about Test Driven Development```

# Table of content
- [Behavior Driven Development BDD](#behavior-driven-development-bdd)
- [Test Driven Development TDD](#test-driven-development-tdd)
- [ARRANGE ACT ASSERT Pattern](#arrange-act-assert-pattern)

# Behavior Driven Development BDD
BDD is a development methodology that emphasizes meeting the business needs of the software.

### **BDD syntax** 
BDD is based on words that we often use in real life like **Given, When, Then,** and **And**, which will describe the  behavior of our feature.

For example:

- **Given** a user leaves a comment

- **When** the comment exceeds 1000 characters

- **Then** the comment should not be saved

- **And** the user  should see an error message



# Test Driven Development TDD

 is an approach to software development where you write tests first, then use those tests to drive the design and development of your software application

Here's how the two BDD and TDD work together. You will: 

1. Identify **behaviors**  with BDD.
2. Write **tests** for these behaviors with TDD.

### The Three Rules of TDD
`Robert C. Martin` provides a concise set of rules for practicing TDD :

1. Write production code only to pass a failing unit test.
2. Write no more of a unit test than sufficient to fail (compilation failures are failures).
3. Write no more production code than necessary to pass the one failing unit test.   

### Red, Green, Refactor Cycle
The red, green, refactor approach helps developers compartmentalize their focus into three phases:

**Red —** think about what you want to develop

**Green —** think about how to make your tests pass

**Refactor —** think about how to improve your existing implementation

![image](https://github.com/el-moudni-hicham/test-driven-development/assets/85403056/84ec68ff-4ad1-48af-88ab-23b06a406f1b)



# ARRANGE ACT ASSERT Pattern

There is a standard way to structure a test. This is the AAA Pattern, or Arrange - Act - Assert: 

  * **Arrange :** initialize all necessary inputs and the system to be tested if necessary. 
  * **Act :** Run the system under test with previously initialized inputs into outputs that you keep. 
  * **Assert :** Validate outbounds based on what is expected from your inbounds. You then conclude whether it is a success or a failure.

The figure below illustrates the entire overall architecture of the test :


![image](https://github.com/el-moudni-hicham/test-driven-development/assets/85403056/5f2560ac-d105-48b0-a3dc-0d4813d8d288)




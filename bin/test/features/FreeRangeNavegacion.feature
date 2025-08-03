@Navigation
Feature: Navigation
    Para ver las paginas dentro de Feature
    Sin haber logueado
    I can clicl the navigation bar links

Background: I am on the Free Range Testers web without logging in.
    Given I navigate to www.freerangetesters.com

Scenario Outline: Scenario Outline name: I can access the subpages through the navigation bar
    When I go to <section> using navigation bar  

Examples:
|section  |
|Cursos   |
|Recursos |
|Blog     |
|Udemy    |
|Mentorías|
|Academia |

@Courses
Scenario: Courses are presented correctly to potential costumers
    When I go to Cursos using navigation bar
    And The client selects Introduccion al Testing    

@Plans
Scenario: Users can select a plan to signing up
    When I go to Cursos using navigation bar
    And I select Elegir Plan
    
    
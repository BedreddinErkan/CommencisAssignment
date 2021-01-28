Feature: Contact Form

  Scenario Outline: First Name and Last Name
    Given user on the "contact form" page
    When user send key at "First Name" and "Last Name" field
    And verify "First Name" and "Last Name" field accept max "50" characters
    Then verify "First Name" and "Last Name" field not allow <special characters> and <numbers>
    Examples:
    |special characters   |numbers|
    |*                    |0     |
    |&                    |1     |
    |/                    | 2    |
    |''                   | 3    |
    |%                    |4     |
    |()                   |5     |
    |!                    |6     |
    |^                    |7     |
    |+                    |8     |
    |"                    |9     |

    Scenario:Email Field
      Given user on the "contact form" page
      When user send valid "Email" field
      And verify user should not see "error" text
      When user send invalid "Email" field
      Then verify user should see "error" text

      Scenario: Phone Field
        Given user on the "contact form" page
        When user send "Phone Number" field
        And verify "phone number" field accept max "13" characters
        Then verify phone number should start "+" character

        Scenario: Appointment Date
          Given user on the "contact form" page
          And user should see current day at calendar
          And verify user can not select "date" before the current "date"
          And user should see time at "10.00"
          And verify user can select every hour between "10.00" and "17.00" in weekdays
          Then verify user not select time or date user should see "error" text

    Scenario: Special Offers Checkbox
      Given user on the "contact form" page
      When user should able click "Send updates on special offers" checkbox
      And verify user should see "You will receive the latest updates on our special offers and campagns." massage after submission

            Scenario: Comment Field
              Given user on the "contact form" page
              When user should able send "comment" field
              And verify "comment" field accept max "500" alphanumeric characters
              Then verify user should able submit without writing comment



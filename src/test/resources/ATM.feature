Feature: Account Holder withdraws cash
	As an Account Holder
	I want to withdraw cash from an ATM
	So that I can get money when the bank is closed
 
Scenario Outline: Account has sufficient funds
	Given the account balance is <account_balance>
 		And the card is valid
 		And the machine contains <atm_available>
	When the Account Holder requests <request>
	Then the ATM should dispense <result>
 		And the account balance should be <newBalance>
 		And the card should be returned
 	
 	Examples:
 	|account_balance|atm_available|request|result|newBalance|
 	|100            |100          |20     |20    |80        |
 

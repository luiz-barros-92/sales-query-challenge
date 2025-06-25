## Challenge: Sales Query
[DevSuperior](https://devsuperior.com.br/)\
<br>
You will need to fork the project and implement the queries as requested below:\
<br>
![img](https://github.com/luiz-barros-92/assets/blob/main/challenges/c4/c4.1.png)
<br>
<br>
You will need to implement the following queries:
### Sales report
1. [IN] The user optionally enters the start date, end date and an excerpt of the seller's name.
2.  [OUT] The system displays a paginated list containing the ID, date, amount sold and name of the seller, of the sales that fit the data provided.\
Additional information:
 * If the end date is not informed, consider the current system date. To instantiate the current date, use the command:\
   `LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());`
 * If the start date is not specified, consider the date 1 year before the end date. To instantiate a date with one less year, use the minusYears function:\
   `LocalDate result = minhaData.minusYears(1L);`
 * If the name is not provided, consider the text empty.
 * Tip: receive all data as String in the controller, and perform the above date processing, instantiating LocalDate objects in the service.\
### Sales summary by seller
1. [IN] The user optionally informs the start date and end date.
2. [OUT] The system reports a list containing the name of the salesperson and the total sales of this salesperson in the period reported.\
Additional information:
  * Same as the Sales Report use case

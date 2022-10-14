package com.epam.rd.tasks.sqlqueries;

/**
 * Implement sql queries like described
 */
public class SqlQueries {
    //Select all employees sorted by last name in ascending order
    //language=HSQLDB
    String select01 = "SELECT * FROM EMPLOYEE ORDER BY  LASTNAME ASC ";

    //Select employees having no more than 5 characters in last name sorted by last name in ascending order
    //language=HSQLDB
    String select02 = "SELECT * FROM EMPLOYEE WHERE LENGTH(LASTNAME) <= 5 ORDER BY  LASTNAME ASC ";

    //Select employees having salary no less than 2000 and no more than 3000
    //language=HSQLDB
    String select03 = "SELECT * FROM EMPLOYEE WHERE salary >2000 and salary <= 3000";

    //Select employees having salary no more than 2000 or no less than 3000
    //language=HSQLDB
    String select04 = "SELECT id, LASTNAME, SALARY FROM EMPLOYEE WHERE salary <2000 or salary > 3000 ";

    //Select all employees assigned to departments and corresponding department
    //language=HSQLDB
    String select05 = "SELECT * FROM EMPLOYEE e  JOIN department d on d.id = e.department ";

    //Select all employees and corresponding department name if there is one.
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select06 = "SELECT e.*, d.name AS depname FROM EMPLOYEE e LEFT JOIN DEPARTMENT d on d.id = e.department";

    //Select total salary pf all employees. Name it "total".
    //language=HSQLDB
    String select07 = "SELECT sum(salary) as total FROM employee";

    //Select all departments and amount of employees assigned per department
    //Name column containing name of the department "depname".
    //Name column containing employee amount "staff_size".
    //language=HSQLDB
    String select08 = "SELECT d.id,d.location,  d.name as depname, count(e.salary) as staff_size \n" +
            "FROM department d\n" +
            "         INNER JOIN employee e on d.id = e.department\n" +
            "GROUP BY d.id, d.name";

    //Select all departments and values of total and average salary per department
    //Name column containing name of the department "depname".
    //language=HSQLDB
    String select09 = "SELECT d.id,d.location,  d.name as depname, avg(salary) average, sum(e.salary) as total\n" +
            "            FROM department d\n" +
            "                     INNER JOIN employee e on d.id = e.department\n" +
            "            GROUP BY d.id, d.name";

    //Select lastnames of all employees and lastnames of their managers if an employee has a manager.
    //Name column containing employee's lastname "employee".
    //Name column containing manager's lastname "manager".
    //language=HSQLDB
    String select10 = "SELECT e.lastname employee, (SELECT DISTINCT e2.lastname  FROM employee e2 WHERE e.manager = e2.id)as manager FROM employee e ";


}

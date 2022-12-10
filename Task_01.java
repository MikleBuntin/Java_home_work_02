// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}




public class Task_01 {
    
    let student = {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"};
    let json = JSON.stringify(student);

    StringBuilder str_sql = new StringBuilder("select * from students where");


    class=11 AND DAY=2;


    // sb.append(new Integer(2));
    sb.append("; ");
    sb.append(false);
    sb.append("; ");
    sb.append(Arrays.asList(1,2,3));
    sb.append("; ");


}

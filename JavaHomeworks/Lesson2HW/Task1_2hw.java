// 1 . Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE
// этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// Так поняла, должен получится запрос "select * from students where name = " " and country = " " and city = " " and age = " "

package Homeworks.JavaHomeworks.Lesson2HW;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task1_2hw {
    public static void main(String[] args) throws Exception {

        StringBuilder sql_req = new StringBuilder("select * from students where ");
        // System.out.println(sql_req);

        BufferedReader br = new BufferedReader(new FileReader("Homeworks/JavaHomeworks/Lesson2HW/dataTask1.json"));
        String line = "empty";
        line = br.readLine();
        System.out.println(line); // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        System.out.println();
        // System.out.println(getType(line)); // String
        line = line.replace("{\"", "");
        line = line.replace("}", "");
        line = line.replace("\"", "");
        line = line.replace(", ", " ");
        
        // System.out.println(line);
        String[] arr_line = new String[]{};
        arr_line = line.split(" ");
        // System.out.println(Arrays.toString(arr_line));  
        
        String s_name = "";
        String s_country = "";
        String s_city = "";
        String s_age = "";
        for (String el : arr_line) {
            if (el.startsWith("name:")) s_name = el.substring(5, el.length());
            if (el.startsWith("country:")) s_country = el.substring(8, el.length());
            if (el.startsWith("city:")) s_city = el.substring(5, el.length());
            if (el.startsWith("age:")) s_age = el.substring(4, el.length());
        }
        
        if (s_age.equals("null")) {
            if (s_city.equals("null")) {
                if (s_country.equals("null")) {
                    if (s_name.equals("null")) sql_req.replace(22, 28, "");
                    else sql_req.append("name = \"" + s_name + "\"");
                
                } else if (s_name.equals("null")) sql_req.append("country = \"" + s_country + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and country = \"" + s_country + "\"");
            
            } else {
                if (s_country.equals("null")) {
                    if (s_name.equals("null")) sql_req.append("city = \"" + s_city + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and city = \"" + s_city + "\"");
                } else if (s_name.equals("null")) sql_req.append("country = \"" + s_country + "\" and city = \"" + s_city + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and country = \"" + s_country + "\" and city = \"" + s_city + "\"");
            }

        }
        else {
            if (s_city.equals("null")) {
                if (s_country.equals("null")) {
                    if (s_name.equals("null")) sql_req.append("age = \"" + s_age + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and age = \"" + s_age + "\"");
                } else if (s_name.equals("null")) sql_req.append("country = \"" + s_country + "\" and age = " + s_age + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and country = \"" + s_country + "\" and age = " + s_age + "\"");
        //     }
            } else {
                if (s_country.equals("null")) {
                    if (s_name.equals("null")) sql_req.append("city = \"" + s_city + "\" and age = \"" + s_age + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and city = \"" + s_city + "\" and age = \"" + s_age + "\"");
                } else if (s_name.equals("null")) sql_req.append("country = \"" + s_country + "\" and city = \"" + s_city + "\" and age = \"" + s_age + "\"");
                    else sql_req.append("name = \"" + s_name + "\" and country = \"" + s_country + "\" and city = \"" + s_city + "\" and age = \"" + s_age + "\"");
            }
        }
        System.out.println(sql_req);
        System.out.println();
        br.close();

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
    
}

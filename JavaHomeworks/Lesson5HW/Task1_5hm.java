// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// {Кристина Белова=[123456789, 123456790], Иван Юрин=[123456790], Анна Мусина=[123456789], Светлана Петрова=[123456789, 123456790], Петр Лыков=[123456789, 123456790, 1233456791], Иван Иванов=[123456790], Анна Крутова=[123456789, 123456790]}

package Homeworks.JavaHomeworks.Lesson5HW;

public class Task1_5hm {
    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.addData("Петров Иван", "657-94-07");
        myPhoneBook.addData("Петров Иван", "276-05-38");
        myPhoneBook.addData("Заворов Михаил", "657-93-33");
        myPhoneBook.addData("Боршов Леонид", "276-05-36");
        myPhoneBook.addData("Боршов Леонид", "(985) 647-37-94");
        myPhoneBook.addData("Боршов Леонид", "276-05-38");
        
        myPhoneBook.printPhones("Петров Иван");
        myPhoneBook.printName("276-05-38");

        myPhoneBook.printPb();

    }
    
}

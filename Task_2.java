/**
 * 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
 * Создайте несколько экземпляров этого класса, выведите их в консоль.
 * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст 
 * (или другие параметры на ваше усмотрение).
 */

 import java.util.HashSet;
 import java.util.List;
 import java.util.Scanner;
 
 public class Task_2 {
 public static void main(String[] args) {
 System.out.println("Добро пожаловать в систему котов! ");
 System.out.println("Меню: \n Нажмите 1, чтобы вывести породы всех котов; \n Нажмите 2 для поиска;");
 
 Scanner iScanner = new Scanner(System.in, "cp866");
 int userInput = iScanner.nextInt();
 
 HashSet<cat> catSet = new HashSet<cat>();
 
 cat cat_1 = new cat("Игорь", 14, "green", "british", "m", false, 12344);
 // System.out.println(cat_1.printCat());
 
 cat cat_2 = new cat("Василиса", 44, "brown", "siberian", "f", true, 12345);
 // System.out.println(cat_2.printCat());
 
 cat cat_3 = new cat("Евгений", 2, "black", "russian", "m", true, 12347);
 // System.out.println(cat_3.printCat());
 
 catSet.add(cat_1);
 catSet.add(cat_2);
 catSet.add(cat_3);
 
 switch (userInput) {
 case 1:
 for (cat cat : catSet) {
 System.out.println(cat.breed);
 }
 break;
 case 2:
 System.out.println("Введите гендерную идентичность кота для поиска (f/m): ");
 String genderInput = iScanner.next();
 List<cat> queryCat = cat_3.findCat(catSet, genderInput);
 for (cat cat : queryCat) {
 System.out.println(cat.printCat());
 }
 break;
 
 default:
 System.out.println("There's no such opeartion...");
 return;
 }
 }
 
 }
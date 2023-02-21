import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class cat {
String name;
int age;
String color;
String breed;
String gender;
Boolean purring;
int id;

public cat(String name,
int age,
String color,
String breed,
String gender,
Boolean purring,
int id) {
this.name = name;
this.age = age;
this.gender = gender;
this.breed = breed;
this.color = color;
this.purring = purring;
this.id = id;
}

public String printCat() {
return "Name: " + name + ", breed: " + breed + ", color: " + color + ", age " + age;
}

public List<cat> findCat(HashSet<cat> hashCat, String gender) {
List<cat> catList = new ArrayList<cat>();
for (cat cat : hashCat) {
if (cat.gender.equals(gender)) {
catList.add(cat);
}
}
return catList;
}
}
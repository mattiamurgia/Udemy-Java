import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
Platform p = new Platform("Udemy");
p.addCourse("Data Science", 12.30);
Course c2 = p.addCourse("Java", 15.30);  
p.addCourse("OS", 22.50);
Course c1 = p.getCourseByIndex(0);
c1.addLesson("Basic", 10);
c1.addLesson("Advanced", 12);
c1.addCategory(Category.Math);
c1.addCategory(Category.Science);
c2.addLesson("Object Oriented", 8);
c2.addLesson("Sample of Forza 5", 7);
c2.addCategory(Category.Java);

// ArrayList<Course> coursesFilteredByCategory = p.searchByCategory(Category.Math);
// ArrayList<Course> coursesFilteredByName = p.searchByName("Data");
// System.out.println(coursesFilteredByCategory);
// System.out.println(coursesFilteredByName);
}
}

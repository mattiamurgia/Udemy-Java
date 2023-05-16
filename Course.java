import java.util.ArrayList;

enum Category {Math, Science, Java};

public class Course {
    
    public String name;
    public double price;
    public boolean active = false;
    public ArrayList <Lesson> lessons = new ArrayList<Lesson>();
    public ArrayList<Category> categories = new ArrayList<Category>();

    public Course(String title, double price) {
        this.name = title;
        this.price = price;
    }

    public void addLesson(String name, double duration ) {
        Lesson lesson = new Lesson(name,duration);
        lessons.add(lesson);
    }

    public void addCategory(Category name) {
        categories.add(name);
    
    }
 
    
    

  

}

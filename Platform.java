import java.util.ArrayList;

enum Category {Math, Science, Java};

public class Platform {
    public String namePlatform;
    public ArrayList <Course> courses = new ArrayList <Course>();

    public Platform(String name) {
        this.namePlatform = name;
    }
    
    public Course addCourse(String title, double duration) {
        Course a = new Course(title,duration);
        courses.add(a);
        return a;
        }
    
    public Course getCourseByIndex(int index) {
        return courses.get(index);
    }

   public ArrayList<Course> searchByCategory(Category name) {
        ArrayList<Course> results = new ArrayList<>();
        for(Course courseIes)

        return results;
   }

}
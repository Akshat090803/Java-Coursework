
import java.util.Objects;

public class Student{
    private int id;
    private String name;
    
    public Student(String name,int id){
      this.id=id;
      this.name=name;
    }

    @Override
    public int hashCode() {

      return Objects.hashCode(this.id);
        // int hash = 7;
        // hash = 71 * hash + this.id;
        // return hash;

        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }


}
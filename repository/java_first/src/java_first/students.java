package java_first;

public class students {

	public static void main(String[] args) {
		private String Name;
		private int id;
		private String[] courses;
		
		public students(String Name, int id, String[] courses  ) {
			this.Name = Name;
			this.id= id;
			this.courses = courses;
			
			
		}
	}
	
  public String getName() {
    	   return Name;
       }
       
       public void setName(String Name) {
    	   this.Name = Name;
       }
       
       public int getId() {
    	  return id;
       }
       
       public void setId(int id) {
          this.id = id ;

}
       public String[] getCourses() {
    	   return courses;
    	  
       }
       
       public void setcourses(String[] courses) {
    	   this.courses = courses;
    	   
       }
       
       public void addcrse(String courses) {
    	   String newcourses = new String[courses.length + 1];
    	   for (int i =0; i< courses.length; i++) {
    		   newcourses[i]=courses[i];
       }
            newcourses[courses.length]=crse;
            courses=newcourses;
       }
          public void printinfo() {
        	  System.out.println('name of student:' + Name);
        	  System.out.println('student ID:'+ id);
        	      for (string each courses) {
        	    	  System.out.println(each)
        	      }
        	  
    public class graduatestudent extends students {
        	private String resarea;
        	
        	
        	
        }
       
          }
          public void garduatestudent(String Name, int id, String resarea  ) {
  			this.Name = Name;
  			this.id= id;
  			this.resarea = resarea;
  			
          }
          
	
          public String getResarea() {
       	   return resarea;
          }
  		  
          public void setResarea(String resarea) {
       	   this.resarea= resarea;
          }
          
	
	
	  @override
	  public void printinfo() {
		  System.out.println('name of student:' + Name);
    	  System.out.println('student ID:'+ id);
    	  System.out.println("student's research area" + resarea)
    	  
	  }
	  
	  
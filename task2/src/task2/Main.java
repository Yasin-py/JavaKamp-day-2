package task2;


public class Main {

	public static void main(String[] args) {
		//int courseId, String courseName, String instructorName, int completeRate,String programmingLanguege)
				Courses course1 = new Courses(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#+ANGULAR)","Engin Demirog",10,"C#+ANGULAR");
				Courses course2 = new Courses(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java+REACT)","Engin Demirog",21,"Java+REACT");
		        Courses course3 = new Courses(3,"Programlamaya giri� i�in Temel Kurs","Engin Demirog",100," ");
			
		  
		            Courses [] courses = {course1,course2,course3};   
		        	
		        	for(int i=0; i<courses.length;i++){
		     			System.out.println(i+1 + ". Kursun Ad�: "+courses[i].courseName);
		        
		        	}

		        	// Instructor 
		    		Instructor instructor1 = new Instructor(1, "T�m�");
		    		Instructor instructor2 = new Instructor(2, "Engin Demiro�");
		        
		    		
		    		Instructor[] instructors = {instructor1, instructor2};
		    		
		    		for(Instructor i:instructors) {
		    			System.out.println("E�itmenlerimiz: "+i.instructorName);
		    			
		    		}
			
			 
		    		// CourseManager
		    		CourseManager courseManager = new CourseManager();
		    		courseManager.progressbar(course1);
		    		courseManager.progressbar(course2);
		    		courseManager.progressbar(course3);
			
		    		CourseManager courseManager2 = new CourseManager();
		    		courseManager2.joinTheCourse(course1);
		    		courseManager2.joinTheCourse(course2);
		    		courseManager2.joinTheCourse(course3);
		    		
	}

}

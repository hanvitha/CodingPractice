package tests;


import java.util.*;

class Programmer { 
   ArrayList<String> languagesKnown;
    Programmer(){
        this.languagesKnown = new ArrayList<String>();
       
    }
    public ArrayList<String> getLanguages(){
    	return this.languagesKnown;
    }
    public void addLanguage(String language){
    	if(!this.languagesKnown.contains(language))
    		this.languagesKnown.add(language);
    
    }


}

class ProgrammerTeacher extends Programmer {
	ProgrammerTeacher(){}
    boolean teach(Programmer programmer, String language){
    	if(this.languagesKnown.contains(language)){
            programmer.addLanguage(language);
            return true;
        }
        else
            return false;
    }
    
    public static void main(String[] args) {
      ProgrammerTeacher teacher = new ProgrammerTeacher();
      teacher.addLanguage("Java");

      Programmer programmer = new Programmer();
      teacher.teach(programmer, "Java");

      for(String language : programmer.getLanguages())
          System.out.println(language);
    }
    
    
    
}
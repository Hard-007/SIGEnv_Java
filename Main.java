import java.util.*;


public class Main{
    //Models
    class User{
        int uID;
        String uName;
        String uPasswd;
        String uCategory;

        public String get_uName(){
            return uName;
        }
        public void set_uName(String uName){
            this.uName = uName;
        }
        public String get_uPasswd(){
            return uPasswd;
        }
        public void set_uPasswd(String uPasswd){
            this.uPasswd = uPasswd;
        }
        public String get_uCategory(){
            return uCategory;
        }
        public void set_uCategory(String uCategory){
            this.uCategory = uCategory;
        }
    }
    class Student extends User{
        String regime;
        String curso;
        String anoIngresso;
    }
    class Event{
        int eventID;
        String eventTitle;
        String eventDate;
        String eventTime;
        String eventType;
        String eventDescription;
        String eventSpeakers;
        String eventTargetAudience;
        String eventPartners;

        public String get_eventTitle(){
            return eventTitle;
        }
        public void set_eventTitle(String eventTitle){
            this.eventTitle = eventTitle;
        }
        public String get_eventDate(){
            return eventDate;
        }
        public void set_eventDate(String eventDate){
            this.eventDate = eventDate;
        }
        public String get_eventTime(){
            return eventTime;
        }
        public void set_eventTime(String eventTime){
            this.eventTime = eventTime;
        }
        public String get_eventType(){
            return eventType;
        }
        public void set_eventType(String eventType){
            this.eventType = eventType;
        }
        public String get_eventDescription(){
            return eventDescription;
        }
        public void set_eventDescription(String eventDescription){
            this.eventDescription = eventDescription;
        }
        public String get_eventSpeakers(){
            return eventSpeakers;
        }
        public void set_eventSpeakers(String eventSpeakers){
            this.eventSpeakers = eventSpeakers;
        }
        public String get_eventTargetAudience(){
            return eventTargetAudience;
        }
        public void set_eventTargetAudience(String eventTargetAudience){
            this.eventTargetAudience = eventTargetAudience;
        }
        public String get_eventPartners(){
            return eventPartners;
        }
        public void set_eventPartners(String eventPartners){
            this.eventPartners = eventPartners;
        }
    }
    class Faculty{
        int facultyID;
        String facultyName;
        String facultyLocation;
    }

    class UserController{
        User user[] = new User[100];
        user[0].set_uName("Admin");
        user[0].set_uPasswd("admin123");
        user[0].set_uCategory("Admin");

        public String login(){
            String uname = new Scanner(System.in).nextLine();
            String upasswd = new Scanner(System.in).nextLine();
            String ucategory = new Scanner(System.in).nextLine();

            for(int i=0; i<100; i++){
                if(user[i].get_uName().equals("Admin") && user[i].get_uPasswd().equals("admin123")){
                    return user[i].get_uCategory();
                }
            }
        }
        public void signin(){
            // 
        }
    }

    class EventController{
        public void createEvent(){
            // 
        }
        public void viewEvent(){
            // 
        }
        public void updateEvent(){
            // 
        }
        public void deleteEvent(){
            // 
        }
    }
    
    public Main(){
        System.out.println("SIGEnv - Sys de Gestao de Eventos ");

        Student student[] = new Student[100];
        Event event[] = new Event[100];
    }

    public static void main(String[] args) {
        new Main();        
    }
}
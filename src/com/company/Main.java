package com.company;

public class Main {

    public static void main(String[] args) {
    Newspaper newspaper1 = new Newspaper("NY Times", 2019, 11, 22, false);
    Newspaper newspaper2 = new Newspaper("Helsingin Sanomat", 2008, 7, 3, true);
    Course course = new Course("Maths", "Algebra", "Jarmo", -8);



    System.out.println(course);
    course.setParticipants(course.participants);
    System.out.println(course.hasParticipants());

    System.out.println();

    System.out.println(newspaper1);
    System.out.println(newspaper2);


    }
}


class Course{

    public String topic;
    public String name;
    public String teacher;
    public int participants;

    public Course(String name, String topic, String teacher, int participants){
        this.name = name;
        this.participants = participants;
        this.teacher = teacher;
        this.topic = topic;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }




    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }





    public int getParticipants() {
        return participants;
    }


    public void setParticipants(int participants) {
        this.participants = participants;
        if(participants < 0){
            System.out.println("Number of participants can not be negative");
        }
    }


    public boolean hasParticipants() {
        if(participants <= 0){
            System.out.print("This course has no participants, therefore: ");
            return false;
        }
        System.out.println("this course does have participants, therefore: ");
        return true;


    }
    public String toString() {
        return name + ", " + topic + " ( " + teacher + ", " + participants + " participants" + " )";
    }
}
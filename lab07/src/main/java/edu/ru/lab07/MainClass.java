
package edu.ru.lab07;


public class MainClass {
 
    public static void main(String[] args){
        
        User user01 = new User("Maria", "Chicago");
        Tweet tweet01 = user01.tweet("Hello! This is my first tweet!");
        tweet01.display();
        
        User user02 = new User ("Joe");
        Tweet tweet02 = user02.tweet("Hi! This is Joe!");
        tweet02.display();
        
        
        
        
    }
}

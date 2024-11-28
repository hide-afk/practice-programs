
/* 
This program contais a class named Droid. You can name your Droid, make him perform a task (draining energy), and transfer energy to it ;)
I used this program to test my basic knowledge about Java OOP.
*/

public class Droid {
    String name;
    int batteryLevel;
  
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString(){
      return "Hi! I'm " + name + " a Droid :)";
    }
  
    public void performTask(String task){
      System.out.println(name + " is performing this task: " + task + ".");
      batteryLevel = batteryLevel - 10;
    }
    
    public void energyReport(){
      System.out.println(name + " has " + batteryLevel + " of battery.");
    }
  
    public void energyTransfer(int energyToTransfer){
      batteryLevel = batteryLevel + energyToTransfer;
      System.out.println("Transfering... You transfered " + energyToTransfer + " energy to " + name);
      System.out.println("Now " + name + " has " + batteryLevel + " of energy.");
    }
  
    public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      System.out.println(Codey);
      Codey.performTask("dancing");
      Codey.energyReport();
      Codey.energyTransfer(20);
    }
  } 
  
public class Test extends Thread{
    private int number;

    Test(int number){
        this.number = number;
    }

    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println(this.number);
        }
    }

}

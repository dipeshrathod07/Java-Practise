
class Testing{

    private void show()
    {
        System.out.println("Hi");
    }
    public void show1()
    {
        
        System.out.println("Hello");
    }
    protected void show2()
    {
        System.out.println("holla");
    }

}

public class OppsConcept {

    public static void main(String[] args) {
        
        Testing t = new Testing();
       
        t.show1();
        t.show2();
    }
    
}

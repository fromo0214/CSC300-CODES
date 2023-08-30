
public class Main 
{
    public static void main(String[] args) 
    {
        // var textBox = new TextBox();
        // var control = new UIControl(true);
        // show(control);



        //Lists practice

        // var list = new List();
        // list.add(1);
        // list.add("1");
        // list.add(new User());
        // list.get(0);
        
        // int number = (int)list.get(0);

        GenericList <Integer> numbers = new GenericList<>();
        numbers.add(1);
        numbers.get(0);

        new GenericList<Short>();

        // var list = new GenericList<Integer>();
        // list.add(1);
        // int number = list.get(0);

        //primitive     //ref
        //int           integer
        //float         float
        //boolean       Boolean
    }

//     public static void show(UIControl control)
//     {
//         if(control instanceof TextBox)
//         {
//         var textBox = (TextBox)control;
//         //textBox.setText("Hello World!");
//        System.out.println(control);
//         }
//     }
}
//upcasting: casting an object to one of its super types

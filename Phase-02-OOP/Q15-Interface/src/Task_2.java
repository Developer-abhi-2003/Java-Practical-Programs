public class Task_2 {
    interface Printable{void print();}
    interface Showable{void show();}

    static class Document implements Printable, Showable{
        @Override
        public void print(){
            System.out.println("Printing Document..........");
        }
        @Override
        public void show(){
            System.out.println("Showing Document...........");
        }
    }
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
        d.show();
    }
}

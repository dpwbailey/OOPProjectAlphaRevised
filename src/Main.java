public class Main extends Product implements Item {

  public static void main(String[] args) {

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }

  }

}




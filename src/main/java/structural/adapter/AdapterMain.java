package structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        AdapterTranslate adapter = new AdapterTranslate(new EnglishAdapter(), new JapaneseAdapter());
        adapter.send("xin chao", "Japan");
        adapter.send("xin chao", "English");
    }
}

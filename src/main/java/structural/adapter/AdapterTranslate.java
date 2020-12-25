package structural.adapter;

public class AdapterTranslate {
    EnglishAdapter englishAdapter;
    JapaneseAdapter japaneseAdapter;

    public AdapterTranslate(EnglishAdapter englishAdapter, JapaneseAdapter japaneseAdapter) {
        this.englishAdapter = englishAdapter;
        this.japaneseAdapter = japaneseAdapter;
    }
    public void send(String message,String type){
        if(type.equals("Japan")){
            message = translateJapan(message);
            japaneseAdapter.received(message);
        }
        if(type.equals("English")){
            message=translateEnglish(message);
            englishAdapter.received(message);
        }
    }
    private String translateJapan(String message){
        return "こんにちは";
    }
    private String translateEnglish(String message){
        return "Hello";
    }
}

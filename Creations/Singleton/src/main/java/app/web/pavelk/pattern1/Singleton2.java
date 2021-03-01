package app.web.pavelk.pattern1;

public final class Singleton2 {
    private static volatile Singleton2 instance;

    public String value;

    private Singleton2(String value) {
        this.value = value;
    }

    public static Singleton2 getInstance(String value) {

        Singleton2 result = instance; //Double-Checked Locking
        if (result != null) {
            return result;
        }
        synchronized(Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2(value);
            }
            return instance;
        }
    }
}

package app.web.pavelk.pattern1.decorators;


public interface DataSource {
    void writeData(String data);

    String readData();
}
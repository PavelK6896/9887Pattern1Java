package app.web.pavelk.pattern23;

import java.io.OutputStream;

class NullOutputStream extends OutputStream {
    public void write(int b) {
        // Do nothing
    }
}
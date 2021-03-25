package app.web.pavelk.pattern23;

import java.io.PrintStream;

class NullPrintStream extends PrintStream {
    public NullPrintStream() {
        super(new NullOutputStream());
    }
}
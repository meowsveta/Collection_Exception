import java.io.PrintStream;
import java.io.PrintWriter;

public class MyException extends Exception{

    @Override
    public Throwable getCause(){
        return getCause();
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }

    public MyException(){
        getSuppressed();
    }

    public MyException(String message) {
        super(message);
        printStackTrace();
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
        fillInStackTrace();
        getLocalizedMessage();
    }

    public MyException(Throwable cause) { // причина
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { //
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

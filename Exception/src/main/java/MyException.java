public class MyException extends Exception{

    public MyException(){
        getSuppressed();
    }

    public MyException(String message) { //сообщение
        super(message);
        printStackTrace();
    }

    public MyException(String message, Throwable cause) { // сообщение с причиной
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

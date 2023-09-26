public class MyException extends Exception{

    public MyException(){
    }

    public MyException(String message) { //сообщение
        super(message);
    }

    public MyException(String message, Throwable cause) { // сообщение с причиной
        super(message, cause);
    }

    public MyException(Throwable cause) { // причина
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { //
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

public class ReturnObject {
    // Return a programmer-defined object.
    String msg; // error message
    int severity; // code indicating severity of error

    ReturnObject(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int[] howBad = { 3, 3, 2, 4 };

    ReturnObject getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new ReturnObject(msgs[i], howBad[i]);
        else
            return new ReturnObject("Invalid Error Code", 0);
    }
}

class ErrInfo {
    public static void main(String[] args) {
        var err = new ErrorInfo();
        ReturnObject e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}

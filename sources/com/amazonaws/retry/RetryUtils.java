package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public abstract class RetryUtils {
    public static boolean a(AmazonServiceException amazonServiceException) {
        String a13 = amazonServiceException.a();
        return "RequestTimeTooSkewed".equals(a13) || "RequestExpired".equals(a13) || "InvalidSignatureException".equals(a13) || "SignatureDoesNotMatch".equals(a13);
    }

    public static boolean b(Exception exc) {
        if (exc instanceof AbortedException) {
            return true;
        }
        if (exc.getCause() == null) {
            return false;
        }
        Throwable cause = exc.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }
}

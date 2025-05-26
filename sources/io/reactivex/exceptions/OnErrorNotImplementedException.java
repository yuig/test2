package io.reactivex.exceptions;

/* loaded from: classes4.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    public OnErrorNotImplementedException(Throwable th3) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th3, th3 == null ? new NullPointerException() : th3);
    }
}

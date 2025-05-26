package com.google.zxing;

/* loaded from: classes3.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f34019a;

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f34020b;

    static {
        f34019a = System.getProperty("surefire.test.class.path") != null;
        f34020b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}

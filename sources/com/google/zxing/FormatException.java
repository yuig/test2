package com.google.zxing;

/* loaded from: classes3.dex */
public final class FormatException extends ReaderException {

    /* renamed from: c, reason: collision with root package name */
    public static final FormatException f34018c;

    static {
        FormatException formatException = new FormatException();
        f34018c = formatException;
        formatException.setStackTrace(ReaderException.f34020b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f34019a ? new FormatException() : f34018c;
    }
}

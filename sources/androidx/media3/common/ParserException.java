package androidx.media3.common;

import java.io.IOException;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18743a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18744b;

    public ParserException(String str, Exception exc, boolean z13, int i13) {
        super(str, exc);
        this.f18743a = z13;
        this.f18744b = i13;
    }

    public static ParserException a(String str, RuntimeException runtimeException) {
        return new ParserException(str, runtimeException, true, 1);
    }

    public static ParserException b(String str, Exception exc) {
        return new ParserException(str, exc, true, 4);
    }

    public static ParserException c(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(message != null ? message.concat(" ") : "");
        sb3.append("{contentIsMalformed=");
        sb3.append(this.f18743a);
        sb3.append(", dataType=");
        return a.a.n(sb3, this.f18744b, "}");
    }
}

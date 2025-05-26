package hf;

import gi2.b;
import java.lang.Thread;
import kh2.b0;
import kh2.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes3.dex */
public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final b f68998b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static a f68999c;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f69000a;

    public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f69000a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t13, Throwable e13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13 != null) {
            Throwable th3 = null;
            Throwable th4 = e13;
            loop0: while (true) {
                if (th4 == null || th4 == th3) {
                    break;
                }
                StackTraceElement[] stackTrace = th4.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
                int length = stackTrace.length;
                int i13 = 0;
                while (i13 < length) {
                    StackTraceElement stackTraceElement = stackTrace[i13];
                    i13++;
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "element.className");
                    if (z.p(className, "com.facebook", false)) {
                        b0.e0(e13);
                        g0.g(e13, ff.b.CrashReport).b();
                        break loop0;
                    }
                }
                th3 = th4;
                th4 = th4.getCause();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f69000a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t13, e13);
    }
}

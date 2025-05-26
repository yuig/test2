package org.chromium.base;

import J.N;
import java.lang.Thread;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f97303a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97304b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97305c;

    public JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z13) {
        this.f97303a = uncaughtExceptionHandler;
        this.f97304b = z13;
    }

    @CalledByNative
    public static void installHandler(boolean z13) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z13));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th3) {
        if (!this.f97305c) {
            this.f97305c = true;
            N.MLlibBXh(this.f97304b, th3);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f97303a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th3);
        }
    }
}

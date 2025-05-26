package org.chromium.base;

import J.N;
import android.os.Looper;
import dp2.k;
import dp2.l;
import gi2.b;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class TraceEvent implements AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f97319b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f97320c;

    /* renamed from: a, reason: collision with root package name */
    public final String f97321a;

    public TraceEvent(String str) {
        this.f97321a = str;
        a(str, null);
    }

    public static void a(String str, String str2) {
        Object obj = EarlyTraceEvent.f97302a;
        if (f97319b) {
            b.f0().T(str, str2);
        }
    }

    public static TraceEvent c(String str) {
        Object obj = EarlyTraceEvent.f97302a;
        if (f97319b) {
            return new TraceEvent(str);
        }
        return null;
    }

    @CalledByNative
    public static void dumpViewHierarchy(long j13, Object obj) {
        ApplicationStatus.a();
    }

    @CalledByNative
    public static void setEnabled(boolean z13) {
        if (z13) {
            synchronized (EarlyTraceEvent.f97302a) {
            }
        }
        if (f97319b != z13) {
            f97319b = z13;
            Looper looper = ThreadUtils.a().getLooper();
            if (z13) {
                int i13 = k.f56057a;
            }
            looper.setMessageLogging(null);
        }
        if (f97320c) {
            l.a();
        }
    }

    @CalledByNative
    public static void setEventNameFilteringEnabled(boolean z13) {
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        String str = this.f97321a;
        Object obj = EarlyTraceEvent.f97302a;
        if (f97319b) {
            N.Mw73xTww(str, null, 0L);
        }
    }
}

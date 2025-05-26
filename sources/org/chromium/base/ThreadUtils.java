package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import dp2.l;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.task.PostTask;

/* loaded from: classes2.dex */
public class ThreadUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f97317a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Handler f97318b;

    public static Handler a() {
        if (f97318b != null) {
            return f97318b;
        }
        Looper mainLooper = Looper.getMainLooper();
        synchronized (f97317a) {
            try {
                if (f97318b == null) {
                    Handler handler = new Handler(mainLooper);
                    PostTask.a(handler);
                    f97318b = handler;
                    TraceEvent.f97320c = true;
                    if (TraceEvent.f97319b) {
                        l.a();
                    }
                } else if (f97318b.getLooper() != mainLooper) {
                    throw new RuntimeException("UI thread looper is already set to " + f97318b.getLooper() + " (Main thread looper is " + Looper.getMainLooper() + "), cannot set to new looper " + mainLooper);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f97318b;
    }

    @CalledByNative
    public static boolean isThreadPriorityAudio(int i13) {
        return Process.getThreadPriority(i13) == -16;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i13) {
        Process.setThreadPriority(i13, -16);
    }
}

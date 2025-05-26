package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.appcompat.app.u;
import java.lang.Thread;
import oi.j0;
import oi.t6;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class JavaHandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final HandlerThread f97306a;

    /* renamed from: b, reason: collision with root package name */
    public Throwable f97307b;

    public JavaHandlerThread(String str, int i13) {
        this.f97306a = new HandlerThread(str, i13);
    }

    @CalledByNative
    public static JavaHandlerThread create(String str, int i13) {
        return new JavaHandlerThread(str, i13);
    }

    @CalledByNative
    public final Throwable getUncaughtExceptionIfAny() {
        return this.f97307b;
    }

    @CalledByNative
    public final boolean isAlive() {
        return this.f97306a.isAlive();
    }

    @CalledByNative
    public final void joinThread() {
        boolean z13 = false;
        while (!z13) {
            try {
                this.f97306a.join();
                z13 = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    @CalledByNative
    public final void listenForUncaughtExceptionsForTesting() {
        this.f97306a.setUncaughtExceptionHandler(new u(this, 2));
    }

    @CalledByNative
    public final void quitThreadSafely(long j13) {
        HandlerThread handlerThread = this.f97306a;
        new Handler(handlerThread.getLooper()).post(new j0(this, j13, 5));
        handlerThread.getLooper().quitSafely();
    }

    @CalledByNative
    public final void startAndInitialize(long j13, long j14) {
        HandlerThread handlerThread = this.f97306a;
        if (handlerThread.getState() == Thread.State.NEW) {
            handlerThread.start();
        }
        new Handler(handlerThread.getLooper()).post(new t6(j13, this, 1, j14));
    }
}

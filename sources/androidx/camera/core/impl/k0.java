package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;

/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16898a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16899b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f16900c;

    public k0(long j13, Exception exc) {
        this.f16899b = SystemClock.elapsedRealtime() - j13;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.f16898a = 2;
            this.f16900c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.f16898a = 0;
            this.f16900c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f16900c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.f16898a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f16898a = 1;
        } else {
            this.f16898a = 0;
        }
    }
}

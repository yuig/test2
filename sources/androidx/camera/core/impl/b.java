package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16805a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f16806b;

    public b(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f16805a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f16806b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16805a.equals(bVar.f16805a) && this.f16806b.equals(bVar.f16806b);
    }

    public final int hashCode() {
        return ((this.f16805a.hashCode() ^ 1000003) * 1000003) ^ this.f16806b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f16805a + ", schedulerHandler=" + this.f16806b + "}";
    }
}

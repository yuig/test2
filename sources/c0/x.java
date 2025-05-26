package c0;

import android.os.Handler;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.y1;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x implements h0.k {

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24380b = new androidx.camera.core.impl.c(t.a.class, null, "camerax.core.appConfig.cameraFactoryProvider");

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24381c = new androidx.camera.core.impl.c(t.b.class, null, "camerax.core.appConfig.deviceSurfaceManagerProvider");

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24382d = new androidx.camera.core.impl.c(t.a.class, null, "camerax.core.appConfig.useCaseConfigFactoryProvider");

    /* renamed from: e, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24383e = new androidx.camera.core.impl.c(Executor.class, null, "camerax.core.appConfig.cameraExecutor");

    /* renamed from: f, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24384f = new androidx.camera.core.impl.c(Handler.class, null, "camerax.core.appConfig.schedulerHandler");

    /* renamed from: g, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24385g = new androidx.camera.core.impl.c(Integer.TYPE, null, "camerax.core.appConfig.minimumLoggingLevel");

    /* renamed from: h, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24386h = new androidx.camera.core.impl.c(s.class, null, "camerax.core.appConfig.availableCamerasLimiter");

    /* renamed from: i, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24387i = new androidx.camera.core.impl.c(Long.TYPE, null, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");

    /* renamed from: j, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24388j = new androidx.camera.core.impl.c(z0.class, null, "camerax.core.appConfig.cameraProviderInitRetryPolicy");

    /* renamed from: k, reason: collision with root package name */
    public static final androidx.camera.core.impl.c f24389k = new androidx.camera.core.impl.c(y1.class, null, "camerax.core.appConfig.quirksSettings");

    /* renamed from: a, reason: collision with root package name */
    public final v1 f24390a;

    public x(v1 v1Var) {
        this.f24390a = v1Var;
    }

    public final s b() {
        Object obj;
        androidx.camera.core.impl.c cVar = f24386h;
        v1 v1Var = this.f24390a;
        v1Var.getClass();
        try {
            obj = v1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (s) obj;
    }

    public final t.a c() {
        Object obj;
        androidx.camera.core.impl.c cVar = f24380b;
        v1 v1Var = this.f24390a;
        v1Var.getClass();
        try {
            obj = v1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (t.a) obj;
    }

    @Override // androidx.camera.core.impl.d2
    public final androidx.camera.core.impl.v0 getConfig() {
        return this.f24390a;
    }

    public final long k() {
        androidx.camera.core.impl.c cVar = f24387i;
        Object obj = -1L;
        v1 v1Var = this.f24390a;
        v1Var.getClass();
        try {
            obj = v1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) obj).longValue();
    }

    public final t.b q() {
        Object obj;
        androidx.camera.core.impl.c cVar = f24381c;
        v1 v1Var = this.f24390a;
        v1Var.getClass();
        try {
            obj = v1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (t.b) obj;
    }

    public final t.a s() {
        Object obj;
        androidx.camera.core.impl.c cVar = f24382d;
        v1 v1Var = this.f24390a;
        v1Var.getClass();
        try {
            obj = v1Var.f(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (t.a) obj;
    }
}

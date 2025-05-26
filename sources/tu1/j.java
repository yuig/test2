package tu1;

import android.content.Context;
import ey.v4;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public abstract class j implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f119395a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f119396b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f119397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119398d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f119399e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f119400f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f119401g;

    public j(f cronetEngineFactory, tb0.h crashReporting, Context context, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(cronetEngineFactory, "cronetEngineFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f119395a = cronetEngineFactory;
        this.f119396b = crashReporting;
        this.f119397c = context;
        this.f119398d = z14;
        this.f119399e = xk2.m.b(new v4(z13, this, 2));
        this.f119400f = new AtomicReference(null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f119401g = newSingleThreadExecutor;
    }

    @Override // tu1.g0
    public final void a(String hostUrl) {
        Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
        try {
            b().newUrlRequestBuilder(hostUrl, new e0(), this.f119401g).build().start();
        } catch (Throwable th3) {
            this.f119396b.q(th3, "Failed to warm up host: ".concat(hostUrl), tb0.p.PERFORMANCE);
        }
    }

    @Override // tu1.g0
    public final CronetEngine b() {
        CronetEngine cronetEngine = (CronetEngine) this.f119400f.get();
        if (cronetEngine != null) {
            return cronetEngine;
        }
        throw new IllegalStateException("Engine is not initialized. Ensure engine availability by calling isEngineAvailable. Get engine instance only if isEngineAvailable returns true.");
    }

    @Override // tu1.g0
    public final boolean c() {
        return ((Boolean) this.f119399e.getValue()).booleanValue();
    }

    public final boolean d() {
        boolean z13 = true;
        if (this.f119400f.get() != null) {
            return true;
        }
        synchronized (this) {
            if (this.f119400f.get() != null) {
                return true;
            }
            try {
                this.f119400f.set(this.f119395a.a());
            } catch (Throwable unused) {
                z13 = false;
            }
            return z13;
        }
    }
}

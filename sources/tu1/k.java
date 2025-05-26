package tu1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public abstract class k implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f119403a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f119404b;

    /* renamed from: c, reason: collision with root package name */
    public final v f119405c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f119406d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f119407e;

    public k(f cronetEngineFactory, tb0.h crashReporting, v libraryInstaller) {
        Intrinsics.checkNotNullParameter(cronetEngineFactory, "cronetEngineFactory");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(libraryInstaller, "libraryInstaller");
        this.f119403a = cronetEngineFactory;
        this.f119404b = crashReporting;
        this.f119405c = libraryInstaller;
        this.f119406d = new AtomicReference(null);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f119407e = newSingleThreadExecutor;
    }

    @Override // tu1.g0
    public final void a(String hostUrl) {
        Intrinsics.checkNotNullParameter(hostUrl, "hostUrl");
        try {
            b().newUrlRequestBuilder(hostUrl, new e0(), this.f119407e).build().start();
        } catch (Throwable th3) {
            this.f119404b.q(th3, "Failed to warm up host: ".concat(hostUrl), tb0.p.PERFORMANCE);
        }
    }

    @Override // tu1.g0
    public final CronetEngine b() {
        CronetEngine cronetEngine = (CronetEngine) this.f119406d.get();
        if (cronetEngine != null) {
            return cronetEngine;
        }
        throw new IllegalStateException("Engine is not initialized. Ensure engine availability by calling isEngineAvailable. Get engine instance only if isEngineAvailable returns true.");
    }

    @Override // tu1.g0
    public final boolean c() {
        boolean z13;
        if (((AtomicReference) this.f119405c.f119460c.getValue()).get() != n0.INSTALLED) {
            return false;
        }
        if (this.f119406d.get() == null) {
            synchronized (this) {
                if (this.f119406d.get() == null) {
                    try {
                        this.f119406d.set(this.f119403a.a());
                        z13 = true;
                    } catch (Throwable unused) {
                        z13 = false;
                    }
                    if (!z13) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

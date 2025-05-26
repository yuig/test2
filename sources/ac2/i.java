package ac2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.k4;
import org.chromium.net.CronetEngine;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final tu1.g0 f1971b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1972c;

    /* renamed from: d, reason: collision with root package name */
    public volatile g f1973d;

    public i(k4 videoExperiments, tu1.g0 engineProviderUnified) {
        Intrinsics.checkNotNullParameter(videoExperiments, "videoExperiments");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        this.f1970a = videoExperiments;
        this.f1971b = engineProviderUnified;
    }

    public final g a() {
        if (!this.f1971b.c()) {
            return null;
        }
        vb0.j.f125466a.O("getEngineData", tb0.p.VIDEO_PLAYER);
        if (!this.f1972c) {
            synchronized (this) {
                try {
                    if (!this.f1972c) {
                        this.f1972c = true;
                        CronetEngine b13 = this.f1971b.b();
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
                        this.f1973d = new g(b13, newSingleThreadExecutor);
                    }
                    Unit unit = Unit.f80348a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f1973d;
    }
}

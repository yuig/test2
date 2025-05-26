package qz;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.g0 f105424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f105425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tu1.g0 g0Var, boolean z13, hb0.a aVar) {
        super(aVar);
        this.f105424d = g0Var;
        this.f105425e = z13;
    }

    @Override // hb0.c
    public final void c() {
        tu1.g0 engineProviderUnified = this.f105424d;
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        vb0.j.f125469d = SystemClock.elapsedRealtime();
        engineProviderUnified.a("https://api.pinterest.com/_/_/warm/");
        Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
        vb0.j.f125475j = SystemClock.elapsedRealtime();
        engineProviderUnified.a("https://i.pinimg.com/_/_/warm/");
        if (this.f105425e) {
            Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
            vb0.j.f125475j = SystemClock.elapsedRealtime();
            engineProviderUnified.a("https://v1.pinimg.com/_/_/warm");
        }
    }
}

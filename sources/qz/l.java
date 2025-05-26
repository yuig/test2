package qz;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends hb0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f105412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tu1.g0 f105413e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(tu1.g0 g0Var, hb0.a aVar, int i13) {
        super(aVar);
        this.f105412d = i13;
        this.f105413e = g0Var;
    }

    @Override // hb0.c
    public final void c() {
        int i13 = this.f105412d;
        tu1.g0 engineProviderUnified = this.f105413e;
        switch (i13) {
            case 0:
                if (engineProviderUnified.c()) {
                    Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
                    vb0.j.f125469d = SystemClock.elapsedRealtime();
                    engineProviderUnified.a("https://api.pinterest.com/_/_/warm/");
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(engineProviderUnified, "engineProviderUnified");
                vb0.j.f125475j = SystemClock.elapsedRealtime();
                engineProviderUnified.a("https://i.pinimg.com/_/_/warm/");
                break;
        }
    }
}

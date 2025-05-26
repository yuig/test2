package wi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class m extends l {

    /* renamed from: i, reason: collision with root package name */
    public final String f129972i;

    public m() {
        Intrinsics.checkNotNullParameter("signal_type_ad_manager_s2s", "signalType");
        this.f129972i = "signal_type_ad_manager_s2s";
    }

    public final m b(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f129964a = adUnitId;
        return (bj.o) this;
    }
}

package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f88203a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f88204b;

    public g0(String pinId, i0 pinLoadingStrategy) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinLoadingStrategy, "pinLoadingStrategy");
        this.f88203a = pinId;
        this.f88204b = pinLoadingStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f88203a, g0Var.f88203a) && this.f88204b == g0Var.f88204b;
    }

    @Override // mu.h0
    public final String getPinId() {
        return this.f88203a;
    }

    public final int hashCode() {
        return this.f88204b.hashCode() + (this.f88203a.hashCode() * 31);
    }

    public final String toString() {
        return "PinToLoad(pinId=" + this.f88203a + ", pinLoadingStrategy=" + this.f88204b + ")";
    }

    public /* synthetic */ g0(String str) {
        this(str, i0.NETWORK_ALWAYS);
    }
}

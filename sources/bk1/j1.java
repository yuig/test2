package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final zw.f f23246a;

    public j1(zw.f effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f23246a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f23246a, ((j1) obj).f23246a);
    }

    public final int hashCode() {
        return this.f23246a.hashCode();
    }

    public final zw.f j() {
        return this.f23246a;
    }

    public final String toString() {
        return "WrappedAdsOpenMeasurementSideEffect(effect=" + this.f23246a + ")";
    }
}

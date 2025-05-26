package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final zw.f f59253a;

    public i0(zw.f effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f59253a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f59253a, ((i0) obj).f59253a);
    }

    public final int hashCode() {
        return this.f59253a.hashCode();
    }

    public final zw.f j() {
        return this.f59253a;
    }

    public final String toString() {
        return "AdsOpenMeasurementSideEffect(effect=" + this.f59253a + ")";
    }
}

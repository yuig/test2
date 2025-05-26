package uu;

import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes3.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final pu.a f123114a;

    public b(pu.a adsCoreDisplayState) {
        Intrinsics.checkNotNullParameter(adsCoreDisplayState, "adsCoreDisplayState");
        this.f123114a = adsCoreDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f123114a, ((b) obj).f123114a);
    }

    public final int hashCode() {
        return this.f123114a.hashCode();
    }

    public final String toString() {
        return "SbaAdsStandardDisplayState(adsCoreDisplayState=" + this.f123114a + ")";
    }
}

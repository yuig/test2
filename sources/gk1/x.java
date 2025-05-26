package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f65288a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65289b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65290c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65291d;

    public x(wa2.m pinFeatureConfig, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f65288a = pinFeatureConfig;
        this.f65289b = z13;
        this.f65290c = z14;
        this.f65291d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f65288a, xVar.f65288a) && this.f65289b == xVar.f65289b && this.f65290c == xVar.f65290c && this.f65291d == xVar.f65291d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65291d) + ep.b.e(this.f65290c, ep.b.e(this.f65289b, this.f65288a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnBindFeatureConfig(pinFeatureConfig=");
        sb3.append(this.f65288a);
        sb3.append(", isMutedOnGrid=");
        sb3.append(this.f65289b);
        sb3.append(", showAudioIndicatorOnGrid=");
        sb3.append(this.f65290c);
        sb3.append(", mediaZoneWillDisplayChin=");
        return a.a.r(sb3, this.f65291d, ")");
    }
}

package hk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f69355a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69356b;

    public k(wa2.m pinFeatureConfig, boolean z13) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f69355a = pinFeatureConfig;
        this.f69356b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f69355a, kVar.f69355a) && this.f69356b == kVar.f69356b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69356b) + (this.f69355a.hashCode() * 31);
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f69355a + ", mediaZoneWillDisplayChin=" + this.f69356b + ")";
    }
}

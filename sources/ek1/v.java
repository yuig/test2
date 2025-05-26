package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f59385a;

    /* renamed from: b, reason: collision with root package name */
    public final bb2.i f59386b;

    public v(wa2.m pinFeatureConfig, bb2.i iVar) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f59385a = pinFeatureConfig;
        this.f59386b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f59385a, vVar.f59385a) && Intrinsics.d(this.f59386b, vVar.f59386b);
    }

    public final int hashCode() {
        int hashCode = this.f59385a.hashCode() * 31;
        bb2.i iVar = this.f59386b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f59385a + ", resolvedFixedHeightImageSpec=" + this.f59386b + ")";
    }
}

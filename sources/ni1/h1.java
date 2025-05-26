package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h1 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f90697a;

    public h1(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f90697a = pinFeatureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f90697a, ((h1) obj).f90697a);
    }

    public final int hashCode() {
        return this.f90697a.hashCode();
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f90697a + ")";
    }
}

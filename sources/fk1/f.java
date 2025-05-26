package fk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final wa2.m f62350a;

    public f(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f62350a = pinFeatureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f62350a, ((f) obj).f62350a);
    }

    public final int hashCode() {
        return this.f62350a.hashCode();
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f62350a + ")";
    }
}

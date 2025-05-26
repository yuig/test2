package ck1;

import kotlin.jvm.internal.Intrinsics;
import u50.s;
import wa2.m;

/* loaded from: classes2.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m f27907a;

    public b(m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f27907a = pinFeatureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f27907a, ((b) obj).f27907a);
    }

    public final int hashCode() {
        return this.f27907a.hashCode();
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f27907a + ")";
    }
}

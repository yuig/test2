package dk1;

import kotlin.jvm.internal.Intrinsics;
import u50.s;
import wa2.m;

/* loaded from: classes2.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final m f55162a;

    public c(m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f55162a = pinFeatureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f55162a, ((c) obj).f55162a);
    }

    public final int hashCode() {
        return this.f55162a.hashCode();
    }

    public final String toString() {
        return "OnBindFeatureConfig(pinFeatureConfig=" + this.f55162a + ")";
    }
}

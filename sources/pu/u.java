package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final mu.v f101371a;

    public u(mu.v baseEffect) {
        Intrinsics.checkNotNullParameter(baseEffect, "baseEffect");
        this.f101371a = baseEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f101371a, ((u) obj).f101371a);
    }

    public final int hashCode() {
        return this.f101371a.hashCode();
    }

    public final String toString() {
        return "WrappedBaseEffectRequest(baseEffect=" + this.f101371a + ")";
    }
}

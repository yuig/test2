package gx;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes3.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f66248a;

    public f(k0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f66248a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f66248a, ((f) obj).f66248a);
    }

    public final int hashCode() {
        return this.f66248a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("AdsStlPinalyticsSideEffect(nestedEffect="), this.f66248a, ")");
    }
}

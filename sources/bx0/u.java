package bx0;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f24089a;

    public u(e0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f24089a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f24089a, ((u) obj).f24089a);
    }

    public final int hashCode() {
        return this.f24089a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("STLFocusCarouselPinalyticsSideEffect(nestedEffect="), this.f24089a, ")");
    }
}

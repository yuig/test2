package yw0;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f140303a;

    public j(e0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f140303a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f140303a, ((j) obj).f140303a);
    }

    public final int hashCode() {
        return this.f140303a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("SeeItStyledCarouselPinalyticsSideEffect(nestedEffect="), this.f140303a, ")");
    }
}

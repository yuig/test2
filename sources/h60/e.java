package h60;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes5.dex */
public final class e implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f67794a;

    public e(e0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f67794a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f67794a, ((e) obj).f67794a);
    }

    public final int hashCode() {
        return this.f67794a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsSideEffect(nestedEffect="), this.f67794a, ")");
    }
}

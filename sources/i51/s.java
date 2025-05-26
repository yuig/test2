package i51;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f71603a;

    public s(k0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f71603a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f71603a, ((s) obj).f71603a);
    }

    public final int hashCode() {
        return this.f71603a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsSideEffect(nestedEffect="), this.f71603a, ")");
    }
}

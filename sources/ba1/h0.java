package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f22371a;

    public h0(o82.h0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f22371a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f22371a, ((h0) obj).f22371a);
    }

    public final int hashCode() {
        return this.f22371a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(nestedEffect="), this.f22371a, ")");
    }
}

package kc1;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class t implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f79174a;

    public t(h0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f79174a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f79174a, ((t) obj).f79174a);
    }

    public final int hashCode() {
        return this.f79174a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(nestedEffect="), this.f79174a, ")");
    }
}

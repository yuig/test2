package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f130999a;

    public r0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f130999a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f130999a, ((r0) obj).f130999a);
    }

    public final int hashCode() {
        return this.f130999a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("SearchUserMultiSectionRequest(wrapped="), this.f130999a, ")");
    }
}

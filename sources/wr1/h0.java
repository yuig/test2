package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f130972a;

    public h0(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f130972a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f130972a, ((h0) obj).f130972a);
    }

    public final int hashCode() {
        return this.f130972a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("SearchUserMultiSectionEvent(wrapped="), this.f130972a, ")");
    }
}

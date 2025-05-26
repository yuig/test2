package uu;

import kotlin.jvm.internal.Intrinsics;
import pu.r;
import u50.s;

/* loaded from: classes3.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final r f123115a;

    public c(r inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f123115a = inner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f123115a, ((c) obj).f123115a);
    }

    public final int hashCode() {
        return this.f123115a.hashCode();
    }

    public final String toString() {
        return "WrappedAdsCoreEvent(inner=" + this.f123115a + ")";
    }
}

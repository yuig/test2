package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d1 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.s f59227a;

    public d1(ni1.s registerAttributionSourceEvent) {
        Intrinsics.checkNotNullParameter(registerAttributionSourceEvent, "registerAttributionSourceEvent");
        this.f59227a = registerAttributionSourceEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && Intrinsics.d(this.f59227a, ((d1) obj).f59227a);
    }

    public final int hashCode() {
        return this.f59227a.hashCode();
    }

    public final String toString() {
        return "WrappedRegisterAttributionSource(registerAttributionSourceEvent=" + this.f59227a + ")";
    }
}

package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.s f23273a;

    public n1(ni1.s registerAttributionSourceEvent) {
        Intrinsics.checkNotNullParameter(registerAttributionSourceEvent, "registerAttributionSourceEvent");
        this.f23273a = registerAttributionSourceEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && Intrinsics.d(this.f23273a, ((n1) obj).f23273a);
    }

    public final int hashCode() {
        return this.f23273a.hashCode();
    }

    public final ni1.s j() {
        return this.f23273a;
    }

    public final String toString() {
        return "WrappedRegisterAttributionSource(registerAttributionSourceEvent=" + this.f23273a + ")";
    }
}

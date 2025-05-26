package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final yi1.f0 f59231a;

    public f0(yi1.f0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f59231a = event;
    }

    @Override // u50.t
    public final String a() {
        return a.a.l(super.a(), "(", this.f59231a.a(), ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f59231a, ((f0) obj).f59231a);
    }

    public final int hashCode() {
        return this.f59231a.hashCode();
    }

    public final String toString() {
        return "WrappedPinImageEvent(event=" + this.f59231a + ")";
    }
}

package gu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final du1.b f66150a;

    public m(du1.b wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f66150a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f66150a, ((m) obj).f66150a);
    }

    public final int hashCode() {
        return this.f66150a.hashCode();
    }

    public final String toString() {
        return "WrappedNavigationEffectRequest(wrapped=" + this.f66150a + ")";
    }
}

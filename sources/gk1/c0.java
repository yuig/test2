package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.h f65224a;

    public c0(k92.h wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f65224a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f65224a, ((c0) obj).f65224a);
    }

    public final int hashCode() {
        return this.f65224a.hashCode();
    }

    public final String toString() {
        return "WrappedToastEvent(wrapped=" + this.f65224a + ")";
    }
}

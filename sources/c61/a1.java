package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final mb0.c f26518a;

    public a1(mb0.b wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f26518a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f26518a, ((a1) obj).f26518a);
    }

    public final int hashCode() {
        return this.f26518a.hashCode();
    }

    public final String toString() {
        return "WrappedPreferencesSideEffectRequest(wrapped=" + this.f26518a + ")";
    }
}

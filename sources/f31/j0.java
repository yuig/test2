package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final k51.m f61016a;

    public j0(k51.m effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f61016a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f61016a, ((j0) obj).f61016a);
    }

    public final int hashCode() {
        return this.f61016a.hashCode();
    }

    public final String toString() {
        return "WrappedViewOptionsSideEffectRequest(effect=" + this.f61016a + ")";
    }
}

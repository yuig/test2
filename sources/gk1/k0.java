package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.n f65238a;

    public k0(ni1.l effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f65238a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f65238a, ((k0) obj).f65238a);
    }

    public final int hashCode() {
        return this.f65238a.hashCode();
    }

    public final ni1.n j() {
        return this.f65238a;
    }

    public final String toString() {
        return "WrappedEventBusSideEffectRequest(effect=" + this.f65238a + ")";
    }
}

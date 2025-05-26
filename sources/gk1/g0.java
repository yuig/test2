package gk1;

import kotlin.jvm.internal.Intrinsics;
import so.rd;

/* loaded from: classes2.dex */
public final class g0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final rd f65229a;

    public g0(rd effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f65229a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f65229a, ((g0) obj).f65229a);
    }

    public final int hashCode() {
        return this.f65229a.hashCode();
    }

    public final String toString() {
        return "ExperimentSideEffect(effect=" + this.f65229a + ")";
    }
}

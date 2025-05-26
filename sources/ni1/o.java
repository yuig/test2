package ni1;

import kotlin.jvm.internal.Intrinsics;
import so.rd;

/* loaded from: classes2.dex */
public final class o implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final rd f90758a;

    public o(rd effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f90758a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f90758a, ((o) obj).f90758a);
    }

    public final int hashCode() {
        return this.f90758a.hashCode();
    }

    public final String toString() {
        return "ExperimentSideEffect(effect=" + this.f90758a + ")";
    }
}

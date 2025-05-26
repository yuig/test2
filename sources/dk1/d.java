package dk1;

import kotlin.jvm.internal.Intrinsics;
import so.ld;

/* loaded from: classes2.dex */
public final class d implements e {
    public d() {
        ld effect = ld.f113541a;
        Intrinsics.checkNotNullParameter(effect, "effect");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        ld ldVar = ld.f113541a;
        ((d) obj).getClass();
        return Intrinsics.d(ldVar, ldVar);
    }

    public final int hashCode() {
        return -667422447;
    }

    public final String toString() {
        return "ExperimentSideEffect(effect=" + ld.f113541a + ")";
    }
}

package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements n1 {
    public a1() {
        e31.a effect = e31.a.f57119a;
        Intrinsics.checkNotNullParameter(effect, "effect");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        e31.a aVar = e31.a.f57119a;
        ((a1) obj).getClass();
        return Intrinsics.d(aVar, aVar);
    }

    public final int hashCode() {
        return e31.a.f57119a.hashCode();
    }

    public final String toString() {
        return "ConnectivityEffectRequest(effect=" + e31.a.f57119a + ")";
    }
}

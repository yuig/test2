package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final f31.k0 f128040a;

    public l1(f31.k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f128040a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f128040a, ((l1) obj).f128040a);
    }

    public final int hashCode() {
        return this.f128040a.hashCode();
    }

    public final String toString() {
        return "SearchBarEffectRequest(effect=" + this.f128040a + ")";
    }
}

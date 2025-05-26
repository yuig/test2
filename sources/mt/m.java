package mt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final pu.w f88115a;

    public m(pu.w coreEffect) {
        Intrinsics.checkNotNullParameter(coreEffect, "coreEffect");
        this.f88115a = coreEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f88115a, ((m) obj).f88115a);
    }

    public final int hashCode() {
        return this.f88115a.hashCode();
    }

    public final String toString() {
        return "WrappedCoreEffectRequest(coreEffect=" + this.f88115a + ")";
    }
}

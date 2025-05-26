package ws;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final pu.w f131073a;

    public u(pu.w coreEffect) {
        Intrinsics.checkNotNullParameter(coreEffect, "coreEffect");
        this.f131073a = coreEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f131073a, ((u) obj).f131073a);
    }

    public final int hashCode() {
        return this.f131073a.hashCode();
    }

    public final String toString() {
        return "WrappedCoreEffectRequest(coreEffect=" + this.f131073a + ")";
    }
}

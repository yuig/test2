package r52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f106301a;

    public v(al1.i navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f106301a = navigationEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f106301a, ((v) obj).f106301a);
    }

    public final int hashCode() {
        return this.f106301a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationEffectRequest(navigationEffect="), this.f106301a, ")");
    }
}

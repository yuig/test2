package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f137795a;

    public e0(al1.i navigationEffect) {
        Intrinsics.checkNotNullParameter(navigationEffect, "navigationEffect");
        this.f137795a = navigationEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f137795a, ((e0) obj).f137795a);
    }

    public final int hashCode() {
        return this.f137795a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("WrappedNavigationSideEffect(navigationEffect="), this.f137795a, ")");
    }
}

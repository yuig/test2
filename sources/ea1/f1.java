package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f58051a;

    public f1(al1.a navigationRequest) {
        Intrinsics.checkNotNullParameter(navigationRequest, "navigationRequest");
        this.f58051a = navigationRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f58051a, ((f1) obj).f58051a);
    }

    public final int hashCode() {
        return this.f58051a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(navigationRequest="), this.f58051a, ")");
    }
}

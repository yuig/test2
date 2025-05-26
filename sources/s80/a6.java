package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a6 implements b6 {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.k f111467a;

    public a6(zb0.j request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111467a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6) && Intrinsics.d(this.f111467a, ((a6) obj).f111467a);
    }

    public final int hashCode() {
        return this.f111467a.hashCode();
    }

    public final String toString() {
        return "ShowExitAlertSideEffectRequest(request=" + this.f111467a + ")";
    }
}

package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f138206a;

    public n0(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f138206a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f138206a, ((n0) obj).f138206a);
    }

    public final int hashCode() {
        return this.f138206a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f138206a, ")");
    }
}

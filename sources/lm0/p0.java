package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f83891a;

    public p0(al1.i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83891a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && Intrinsics.d(this.f83891a, ((p0) obj).f83891a);
    }

    public final int hashCode() {
        return this.f83891a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f83891a, ")");
    }
}

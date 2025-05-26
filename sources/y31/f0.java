package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f136794a;

    public f0(al1.a request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f136794a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f136794a, ((f0) obj).f136794a);
    }

    public final int hashCode() {
        return this.f136794a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffect(request="), this.f136794a, ")");
    }
}

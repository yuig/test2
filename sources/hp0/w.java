package hp0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final al1.i f69886a;

    public w(al1.f request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f69886a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f69886a, ((w) obj).f69886a);
    }

    public final int hashCode() {
        return this.f69886a.hashCode();
    }

    public final String toString() {
        return pk2.f.g(new StringBuilder("NavigationSideEffectRequest(request="), this.f69886a, ")");
    }
}

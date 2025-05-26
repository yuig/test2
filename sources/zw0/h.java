package zw0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f142908a;

    public h(h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f142908a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f142908a, ((h) obj).f142908a);
    }

    public final int hashCode() {
        return this.f142908a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(request="), this.f142908a, ")");
    }
}

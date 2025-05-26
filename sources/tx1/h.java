package tx1;

import kotlin.jvm.internal.Intrinsics;
import zy.e0;
import zy.k0;

/* loaded from: classes4.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f119689a;

    public h(e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f119689a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f119689a, ((h) obj).f119689a);
    }

    public final int hashCode() {
        return this.f119689a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f119689a, ")");
    }
}

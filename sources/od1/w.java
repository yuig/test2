package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f94179a;

    public w(zy.e0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f94179a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f94179a, ((w) obj).f94179a);
    }

    public final int hashCode() {
        return this.f94179a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f94179a, ")");
    }
}

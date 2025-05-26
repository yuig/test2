package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f122694a;

    public d0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f122694a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f122694a, ((d0) obj).f122694a);
    }

    public final int hashCode() {
        return this.f122694a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("OrganizeToastRequest(request="), this.f122694a, ")");
    }
}

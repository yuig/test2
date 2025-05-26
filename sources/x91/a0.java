package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f134307a;

    public a0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f134307a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f134307a, ((a0) obj).f134307a);
    }

    public final int hashCode() {
        return this.f134307a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("UnblockToastRequest(request="), this.f134307a, ")");
    }
}

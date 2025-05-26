package fa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f61513a;

    public m0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f61513a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f61513a, ((m0) obj).f61513a);
    }

    public final int hashCode() {
        return this.f61513a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("RemixToastSideEffectRequest(request="), this.f61513a, ")");
    }
}

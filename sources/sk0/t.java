package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f113082a;

    public t(k92.n sharedToastSideEffectRequest) {
        Intrinsics.checkNotNullParameter(sharedToastSideEffectRequest, "sharedToastSideEffectRequest");
        this.f113082a = sharedToastSideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f113082a, ((t) obj).f113082a);
    }

    public final int hashCode() {
        return this.f113082a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSER(sharedToastSideEffectRequest="), this.f113082a, ")");
    }
}

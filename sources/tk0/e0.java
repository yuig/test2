package tk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f117960a;

    public e0(k92.n sharedToastSER) {
        Intrinsics.checkNotNullParameter(sharedToastSER, "sharedToastSER");
        this.f117960a = sharedToastSER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f117960a, ((e0) obj).f117960a);
    }

    public final int hashCode() {
        return this.f117960a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("ToastSER(sharedToastSER="), this.f117960a, ")");
    }
}

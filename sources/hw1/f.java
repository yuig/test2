package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f70476a;

    public f(rx.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f70476a = params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f70476a, ((f) obj).f70476a);
    }

    public final int hashCode() {
        return this.f70476a.hashCode();
    }

    public final String toString() {
        return "FetchProductTagMetrics(params=" + this.f70476a + ")";
    }
}

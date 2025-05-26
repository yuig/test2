package hw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f70486a;

    public n(rx.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f70486a = params;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f70486a, ((n) obj).f70486a);
    }

    public final int hashCode() {
        return this.f70486a.hashCode();
    }

    public final String toString() {
        return "FetchMetrics(params=" + this.f70486a + ")";
    }
}

package dt0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final zy.a f56252a;

    public q(zy.a eventParams) {
        Intrinsics.checkNotNullParameter(eventParams, "eventParams");
        this.f56252a = eventParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f56252a, ((q) obj).f56252a);
    }

    public final int hashCode() {
        return this.f56252a.hashCode();
    }

    public final String toString() {
        return "LogUserEvent(eventParams=" + this.f56252a + ")";
    }
}

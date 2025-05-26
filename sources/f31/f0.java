package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f61001a;

    public f0(h32.i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61001a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f61001a, ((f0) obj).f61001a);
    }

    public final int hashCode() {
        return this.f61001a.hashCode();
    }

    public final String toString() {
        return "LogContentCreateClick(context=" + this.f61001a + ")";
    }
}

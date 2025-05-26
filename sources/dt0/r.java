package dt0;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f56253a;

    public r(i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56253a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f56253a, ((r) obj).f56253a);
    }

    public final int hashCode() {
        return this.f56253a.hashCode();
    }

    public final String toString() {
        return "NavigateToPrivacyAndData(context=" + this.f56253a + ")";
    }
}

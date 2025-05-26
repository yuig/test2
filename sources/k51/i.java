package k51;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f78324a;

    public i(i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78324a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f78324a, ((i) obj).f78324a);
    }

    public final int hashCode() {
        return this.f78324a.hashCode();
    }

    public final String toString() {
        return "LogOptionsActionClick(context=" + this.f78324a + ")";
    }
}

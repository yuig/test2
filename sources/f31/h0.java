package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f61011a;

    public h0(h32.i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61011a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f61011a, ((h0) obj).f61011a);
    }

    public final int hashCode() {
        return this.f61011a.hashCode();
    }

    public final String toString() {
        return "LogVoiceSearchBarClick(context=" + this.f61011a + ")";
    }
}

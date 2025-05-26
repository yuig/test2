package f31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f61015a;

    public i0(h32.i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f61015a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f61015a, ((i0) obj).f61015a);
    }

    public final int hashCode() {
        return this.f61015a.hashCode();
    }

    public final String toString() {
        return "LogVoiceSearchBarIconViewed(context=" + this.f61015a + ")";
    }
}

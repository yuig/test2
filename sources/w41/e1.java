package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final h32.i0 f128000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h32.i0 context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128000b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1) && Intrinsics.d(this.f128000b, ((e1) obj).f128000b);
    }

    public final int hashCode() {
        return this.f128000b.hashCode();
    }

    public final String toString() {
        return "LogNoFiltersEmptyStateCtaTap(context=" + this.f128000b + ")";
    }
}

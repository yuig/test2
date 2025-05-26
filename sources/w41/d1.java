package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends f1 {

    /* renamed from: b, reason: collision with root package name */
    public final h32.i0 f127995b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(h32.i0 context) {
        super(context);
        w31.a filter = w31.a.f127915a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f127995b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        if (!Intrinsics.d(this.f127995b, ((d1) obj).f127995b)) {
            return false;
        }
        w31.a aVar = w31.a.f127915a;
        return Intrinsics.d(aVar, aVar);
    }

    public final int hashCode() {
        return 531526407 + (this.f127995b.hashCode() * 31);
    }

    public final String toString() {
        return "LogFilterEmptyStateCtaTap(context=" + this.f127995b + ", filter=" + w31.a.f127915a + ")";
    }
}

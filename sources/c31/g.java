package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f25581a;

    public g(zy.l innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f25581a = innerEvent;
    }

    @Override // c31.f
    public final u50.s d() {
        return this.f25581a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f25581a, ((g) obj).f25581a);
    }

    public final int hashCode() {
        return this.f25581a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(innerEvent=" + this.f25581a + ")";
    }
}

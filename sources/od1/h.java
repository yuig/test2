package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f94126a;

    public h(zy.l innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f94126a = innerEvent;
    }

    @Override // od1.k
    public final u50.s d() {
        return this.f94126a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f94126a, ((h) obj).f94126a);
    }

    public final int hashCode() {
        return this.f94126a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(innerEvent=" + this.f94126a + ")";
    }
}

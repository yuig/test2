package zw0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f142906a;

    public e(zy.l innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f142906a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f142906a, ((e) obj).f142906a);
    }

    public final int hashCode() {
        return this.f142906a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(innerEvent=" + this.f142906a + ")";
    }
}

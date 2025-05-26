package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final zy.l f26646a;

    public w(zy.l innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f26646a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f26646a, ((w) obj).f26646a);
    }

    public final int hashCode() {
        return this.f26646a.hashCode();
    }

    public final String toString() {
        return "WrappedImpressionEvent(innerEvent=" + this.f26646a + ")";
    }
}

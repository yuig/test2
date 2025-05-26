package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final q1 f98054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q1 startEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98054e = startEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f98054e, ((g) obj).f98054e);
    }

    public final int hashCode() {
        return this.f98054e.hashCode();
    }

    public final String toString() {
        return "RegisterRecordStartEvent(startEvent=" + this.f98054e + ")";
    }
}

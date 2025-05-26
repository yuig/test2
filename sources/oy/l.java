package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final a2 f98133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a2 endEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98133e = endEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f98133e, ((l) obj).f98133e);
    }

    public final int hashCode() {
        return this.f98133e.hashCode();
    }

    public final String toString() {
        return "VideoEndRecordEvent(endEvent=" + this.f98133e + ")";
    }
}

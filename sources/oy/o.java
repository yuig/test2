package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final b2 f98157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b2 startEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98157e = startEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f98157e, ((o) obj).f98157e);
    }

    public final int hashCode() {
        return this.f98157e.hashCode();
    }

    public final String toString() {
        return "VideoStartRecordEvent(startEvent=" + this.f98157e + ")";
    }
}

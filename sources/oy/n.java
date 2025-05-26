package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final i2 f98146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i2 startEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98146e = startEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f98146e, ((n) obj).f98146e);
    }

    public final int hashCode() {
        return this.f98146e.hashCode();
    }

    public final String toString() {
        return "VideoExportStartRecordEvent(startEvent=" + this.f98146e + ")";
    }
}

package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final h2 f98142e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h2 endEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98142e = endEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f98142e, ((m) obj).f98142e);
    }

    public final int hashCode() {
        return this.f98142e.hashCode();
    }

    public final String toString() {
        return "VideoExportEndRecordEvent(endEvent=" + this.f98142e + ")";
    }
}

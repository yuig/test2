package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final h1 f98026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h1 endEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98026e = endEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f98026e, ((d) obj).f98026e);
    }

    public final int hashCode() {
        return this.f98026e.hashCode();
    }

    public final String toString() {
        return "PartUploadEndRecordEvent(endEvent=" + this.f98026e + ")";
    }
}

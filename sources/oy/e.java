package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final k1 f98031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k1 startEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98031e = startEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f98031e, ((e) obj).f98031e);
    }

    public final int hashCode() {
        return this.f98031e.hashCode();
    }

    public final String toString() {
        return "PartUploadStartRecordEvent(startEvent=" + this.f98031e + ")";
    }
}

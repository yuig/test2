package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final s0 f98004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s0 endEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98004e = endEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f98004e, ((b) obj).f98004e);
    }

    public final int hashCode() {
        return this.f98004e.hashCode();
    }

    public final String toString() {
        return "ImageEndRecordEvent(endEvent=" + this.f98004e + ")";
    }
}

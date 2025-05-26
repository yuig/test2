package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final n1 f98042e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n1 endEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        this.f98042e = endEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f98042e, ((f) obj).f98042e);
    }

    public final int hashCode() {
        return this.f98042e.hashCode();
    }

    public final String toString() {
        return "RegisterRecordEndEvent(endEvent=" + this.f98042e + ")";
    }
}

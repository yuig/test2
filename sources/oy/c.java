package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends ey.w1 implements m1 {

    /* renamed from: e, reason: collision with root package name */
    public final x0 f98018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x0 startEvent) {
        super(2, 0);
        Intrinsics.checkNotNullParameter(startEvent, "startEvent");
        this.f98018e = startEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f98018e, ((c) obj).f98018e);
    }

    public final int hashCode() {
        return this.f98018e.hashCode();
    }

    public final String toString() {
        return "ImageStartRecordEvent(startEvent=" + this.f98018e + ")";
    }
}

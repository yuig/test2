package ek1;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59333a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f59334b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59335c;

    /* renamed from: d, reason: collision with root package name */
    public final q8.c0 f59336d;

    public r0(String pinUid, d4 viewType, int i13, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59333a = pinUid;
        this.f59334b = viewType;
        this.f59335c = i13;
        this.f59336d = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f59333a, r0Var.f59333a) && this.f59334b == r0Var.f59334b && this.f59335c == r0Var.f59335c && Intrinsics.d(this.f59336d, r0Var.f59336d);
    }

    public final int hashCode() {
        return this.f59336d.hashCode() + ep.b.b(this.f59335c, (this.f59334b.hashCode() + (this.f59333a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LogImgPlaceHolderImgLoadNetworkStartEvent(pinUid=" + this.f59333a + ", viewType=" + this.f59334b + ", slotIndex=" + this.f59335c + ", perfEventTime=" + this.f59336d + ")";
    }
}

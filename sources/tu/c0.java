package tu;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes3.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final w f119270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119271b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119272c;

    /* renamed from: d, reason: collision with root package name */
    public final long f119273d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119274e;

    /* renamed from: f, reason: collision with root package name */
    public final long f119275f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f119276g;

    public c0(w pinData, String str, boolean z13, long j13, boolean z14, long j14, boolean z15) {
        Intrinsics.checkNotNullParameter(pinData, "pinData");
        this.f119270a = pinData;
        this.f119271b = str;
        this.f119272c = z13;
        this.f119273d = j13;
        this.f119274e = z14;
        this.f119275f = j14;
        this.f119276g = z15;
    }

    public static c0 b(c0 c0Var, w wVar, String str, boolean z13, long j13, boolean z14, int i13) {
        w pinData = (i13 & 1) != 0 ? c0Var.f119270a : wVar;
        String str2 = (i13 & 2) != 0 ? c0Var.f119271b : str;
        boolean z15 = (i13 & 4) != 0 ? c0Var.f119272c : z13;
        long j14 = (i13 & 8) != 0 ? c0Var.f119273d : j13;
        boolean z16 = c0Var.f119274e;
        long j15 = c0Var.f119275f;
        boolean z17 = (i13 & 64) != 0 ? c0Var.f119276g : z14;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(pinData, "pinData");
        return new c0(pinData, str2, z15, j14, z16, j15, z17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f119270a, c0Var.f119270a) && Intrinsics.d(this.f119271b, c0Var.f119271b) && this.f119272c == c0Var.f119272c && this.f119273d == c0Var.f119273d && this.f119274e == c0Var.f119274e && this.f119275f == c0Var.f119275f && this.f119276g == c0Var.f119276g;
    }

    public final int hashCode() {
        int hashCode = this.f119270a.hashCode() * 31;
        String str = this.f119271b;
        return Boolean.hashCode(this.f119276g) + a.a.c(this.f119275f, ep.b.e(this.f119274e, a.a.c(this.f119273d, ep.b.e(this.f119272c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "AdsWebBrowserVMState(pinData=" + this.f119270a + ", url=" + this.f119271b + ", isSkipOutboundPinClickEvent=" + this.f119272c + ", chromeClickthroughStartTimeNs=" + this.f119273d + ", shouldLogIabTimeSpent=" + this.f119274e + ", iabDurationStartTime=" + this.f119275f + ", shouldLogFullyVisibleEvents=" + this.f119276g + ")";
    }

    public /* synthetic */ c0() {
        this(new v(), null, false, 0L, false, 0L, true);
    }
}

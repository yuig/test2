package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ew1 {

    /* renamed from: a, reason: collision with root package name */
    public final wn0 f4974a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4975b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4976c;

    public ew1(wn0 paidV2Info, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(paidV2Info, "paidV2Info");
        this.f4974a = paidV2Info;
        this.f4975b = z13;
        this.f4976c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew1)) {
            return false;
        }
        ew1 ew1Var = (ew1) obj;
        return Intrinsics.d(this.f4974a, ew1Var.f4974a) && this.f4975b == ew1Var.f4975b && this.f4976c == ew1Var.f4976c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f4974a.hashCode() * 31;
        boolean z13 = this.f4975b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode + i13) * 31;
        boolean z14 = this.f4976c;
        return i14 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final String toString() {
        wn0 wn0Var = this.f4974a;
        boolean z13 = this.f4975b;
        boolean z14 = this.f4976c;
        StringBuilder sb3 = new StringBuilder("PerAppIdV2(paidV2Info=");
        sb3.append(wn0Var);
        sb3.append(", pubOption=");
        sb3.append(z13);
        sb3.append(", userOption=");
        return a.a.r(sb3, z14, ")");
    }
}

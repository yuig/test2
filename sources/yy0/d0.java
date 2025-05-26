package yy0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class d0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f140437a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f140438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f140439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f140440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f140441e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f140442f;

    /* renamed from: g, reason: collision with root package name */
    public final int f140443g;

    public d0(Map experimentsGroupInfo, l0 pinalyticsVMState, boolean z13, boolean z14, boolean z15, boolean z16, int i13) {
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f140437a = experimentsGroupInfo;
        this.f140438b = pinalyticsVMState;
        this.f140439c = z13;
        this.f140440d = z14;
        this.f140441e = z15;
        this.f140442f = z16;
        this.f140443g = i13;
    }

    public static d0 b(d0 d0Var, l0 l0Var, int i13, int i14) {
        Map experimentsGroupInfo = d0Var.f140437a;
        if ((i14 & 2) != 0) {
            l0Var = d0Var.f140438b;
        }
        l0 pinalyticsVMState = l0Var;
        boolean z13 = d0Var.f140439c;
        boolean z14 = d0Var.f140440d;
        boolean z15 = d0Var.f140441e;
        boolean z16 = d0Var.f140442f;
        if ((i14 & 64) != 0) {
            i13 = d0Var.f140443g;
        }
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new d0(experimentsGroupInfo, pinalyticsVMState, z13, z14, z15, z16, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f140437a, d0Var.f140437a) && Intrinsics.d(this.f140438b, d0Var.f140438b) && this.f140439c == d0Var.f140439c && this.f140440d == d0Var.f140440d && this.f140441e == d0Var.f140441e && this.f140442f == d0Var.f140442f && this.f140443g == d0Var.f140443g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140443g) + ep.b.e(this.f140442f, ep.b.e(this.f140441e, ep.b.e(this.f140440d, ep.b.e(this.f140439c, jq.b.a(this.f140438b, this.f140437a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NuxUseCasePickerVMState(experimentsGroupInfo=");
        sb3.append(this.f140437a);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f140438b);
        sb3.append(", inBatchRepinsExp=");
        sb3.append(this.f140439c);
        sb3.append(", inShowSelectOverlayExp=");
        sb3.append(this.f140440d);
        sb3.append(", inShortUseCaseNamesExp=");
        sb3.append(this.f140441e);
        sb3.append(", inCoverPinOutageFixExp=");
        sb3.append(this.f140442f);
        sb3.append(", minSelectedUseCases=");
        return a.a.n(sb3, this.f140443g, ")");
    }
}

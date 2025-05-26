package y52;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f137802a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.l0 f137803b;

    /* renamed from: c, reason: collision with root package name */
    public final int f137804c;

    /* renamed from: d, reason: collision with root package name */
    public final String f137805d;

    /* renamed from: e, reason: collision with root package name */
    public final String f137806e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f137807f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f137808g;

    public h0(d params, zy.l0 pinalyticsVMState, int i13, String link, String inviteCode, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        this.f137802a = params;
        this.f137803b = pinalyticsVMState;
        this.f137804c = i13;
        this.f137805d = link;
        this.f137806e = inviteCode;
        this.f137807f = z13;
        this.f137808g = z14;
    }

    public static h0 b(h0 h0Var, boolean z13, boolean z14, int i13) {
        d params = h0Var.f137802a;
        zy.l0 pinalyticsVMState = h0Var.f137803b;
        int i14 = h0Var.f137804c;
        String link = h0Var.f137805d;
        String inviteCode = h0Var.f137806e;
        if ((i13 & 32) != 0) {
            z13 = h0Var.f137807f;
        }
        boolean z15 = z13;
        if ((i13 & 64) != 0) {
            z14 = h0Var.f137808g;
        }
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
        return new h0(params, pinalyticsVMState, i14, link, inviteCode, z15, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f137802a, h0Var.f137802a) && Intrinsics.d(this.f137803b, h0Var.f137803b) && this.f137804c == h0Var.f137804c && Intrinsics.d(this.f137805d, h0Var.f137805d) && Intrinsics.d(this.f137806e, h0Var.f137806e) && this.f137807f == h0Var.f137807f && this.f137808g == h0Var.f137808g;
    }

    @Override // y52.i0
    public final zy.l0 h() {
        return this.f137803b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137808g) + ep.b.e(this.f137807f, cb.d(this.f137806e, cb.d(this.f137805d, ep.b.b(this.f137804c, jq.b.a(this.f137803b, this.f137802a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    @Override // y52.i0
    public final int j() {
        return this.f137804c;
    }

    @Override // y52.i0
    public final d k() {
        return this.f137802a;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Loaded(params=");
        sb3.append(this.f137802a);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f137803b);
        sb3.append(", tooltipShowCount=");
        sb3.append(this.f137804c);
        sb3.append(", link=");
        sb3.append(this.f137805d);
        sb3.append(", inviteCode=");
        sb3.append(this.f137806e);
        sb3.append(", isLinkCopied=");
        sb3.append(this.f137807f);
        sb3.append(", isVideoShared=");
        return a.a.r(sb3, this.f137808g, ")");
    }
}

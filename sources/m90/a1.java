package m90;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f86618a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86619b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86620c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f86621d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f86622e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f86623f;

    public a1(e0 mode, boolean z13, boolean z14, o82.j0 listVMState, zy.l0 pinalyticsState, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f86618a = mode;
        this.f86619b = z13;
        this.f86620c = z14;
        this.f86621d = listVMState;
        this.f86622e = pinalyticsState;
        this.f86623f = experimentsGroupInfo;
    }

    public static a1 b(a1 a1Var, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        e0 mode = a1Var.f86618a;
        boolean z13 = a1Var.f86619b;
        boolean z14 = a1Var.f86620c;
        if ((i13 & 8) != 0) {
            j0Var = a1Var.f86621d;
        }
        o82.j0 listVMState = j0Var;
        if ((i13 & 16) != 0) {
            l0Var = a1Var.f86622e;
        }
        zy.l0 pinalyticsState = l0Var;
        Map experimentsGroupInfo = a1Var.f86623f;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new a1(mode, z13, z14, listVMState, pinalyticsState, experimentsGroupInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f86618a, a1Var.f86618a) && this.f86619b == a1Var.f86619b && this.f86620c == a1Var.f86620c && Intrinsics.d(this.f86621d, a1Var.f86621d) && Intrinsics.d(this.f86622e, a1Var.f86622e) && Intrinsics.d(this.f86623f, a1Var.f86623f);
    }

    public final int hashCode() {
        return this.f86623f.hashCode() + jq.b.a(this.f86622e, ep.b.c(this.f86621d.f93634a, ep.b.e(this.f86620c, ep.b.e(this.f86619b, this.f86618a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "CollageContentBrowseVMState(mode=" + this.f86618a + ", allowCarousel=" + this.f86619b + ", isOnboarding=" + this.f86620c + ", listVMState=" + this.f86621d + ", pinalyticsState=" + this.f86622e + ", experimentsGroupInfo=" + this.f86623f + ")";
    }
}

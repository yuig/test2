package w90;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f128536a;

    /* renamed from: b, reason: collision with root package name */
    public final String f128537b;

    /* renamed from: c, reason: collision with root package name */
    public final d32.c f128538c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f128539d;

    /* renamed from: e, reason: collision with root package name */
    public final o82.j0 f128540e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f128541f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f128542g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f128543h;

    /* renamed from: i, reason: collision with root package name */
    public final lb0.r f128544i;

    public g0(String str, String str2, d32.c entryPointSource, boolean z13, o82.j0 listVMState, zy.l0 pinalyticsState, Map experimentsGroupInfo, boolean z14, lb0.r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f128536a = str;
        this.f128537b = str2;
        this.f128538c = entryPointSource;
        this.f128539d = z13;
        this.f128540e = listVMState;
        this.f128541f = pinalyticsState;
        this.f128542g = experimentsGroupInfo;
        this.f128543h = z14;
        this.f128544i = prefsManagerUser;
    }

    public static g0 b(g0 g0Var, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        String str = g0Var.f128536a;
        String str2 = g0Var.f128537b;
        d32.c entryPointSource = g0Var.f128538c;
        boolean z13 = g0Var.f128539d;
        if ((i13 & 16) != 0) {
            j0Var = g0Var.f128540e;
        }
        o82.j0 listVMState = j0Var;
        if ((i13 & 32) != 0) {
            l0Var = g0Var.f128541f;
        }
        zy.l0 pinalyticsState = l0Var;
        Map experimentsGroupInfo = g0Var.f128542g;
        boolean z14 = g0Var.f128543h;
        lb0.r prefsManagerUser = g0Var.f128544i;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        return new g0(str, str2, entryPointSource, z13, listVMState, pinalyticsState, experimentsGroupInfo, z14, prefsManagerUser);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f128536a, g0Var.f128536a) && Intrinsics.d(this.f128537b, g0Var.f128537b) && this.f128538c == g0Var.f128538c && this.f128539d == g0Var.f128539d && Intrinsics.d(this.f128540e, g0Var.f128540e) && Intrinsics.d(this.f128541f, g0Var.f128541f) && Intrinsics.d(this.f128542g, g0Var.f128542g) && this.f128543h == g0Var.f128543h && Intrinsics.d(this.f128544i, g0Var.f128544i);
    }

    public final int hashCode() {
        String str = this.f128536a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f128537b;
        return this.f128544i.hashCode() + ep.b.e(this.f128543h, a.c.e(this.f128542g, jq.b.a(this.f128541f, ep.b.c(this.f128540e.f93634a, ep.b.e(this.f128539d, (this.f128538c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "CollageDraftPickerVMState(sourceId=" + this.f128536a + ", shuffleAssetId=" + this.f128537b + ", entryPointSource=" + this.f128538c + ", isLaunchPointCutoutTool=" + this.f128539d + ", listVMState=" + this.f128540e + ", pinalyticsState=" + this.f128541f + ", experimentsGroupInfo=" + this.f128542g + ", isFromPinOverFlow=" + this.f128543h + ", prefsManagerUser=" + this.f128544i + ")";
    }
}

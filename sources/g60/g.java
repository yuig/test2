package g60;

import com.pinterest.api.model.q30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final q30 f63710a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f63711b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63712c;

    public g(q30 pinCluster, l0 pinalyticsVMState, String str) {
        Intrinsics.checkNotNullParameter(pinCluster, "pinCluster");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f63710a = pinCluster;
        this.f63711b = pinalyticsVMState;
        this.f63712c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f63710a, gVar.f63710a) && Intrinsics.d(this.f63711b, gVar.f63711b) && Intrinsics.d(this.f63712c, gVar.f63712c);
    }

    public final int hashCode() {
        int a13 = jq.b.a(this.f63711b, this.f63710a.hashCode() * 31, 31);
        String str = this.f63712c;
        return a13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinClusterVMState(pinCluster=");
        sb3.append(this.f63710a);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f63711b);
        sb3.append(", navigationSource=");
        return a.a.p(sb3, this.f63712c, ")");
    }

    public /* synthetic */ g(q30 q30Var, l0 l0Var, String str, int i13) {
        this(q30Var, (i13 & 2) != 0 ? new l0((h32.i0) null, 3) : l0Var, (i13 & 4) != 0 ? null : str);
    }
}

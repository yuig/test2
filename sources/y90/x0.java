package y90;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f138266a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.l0 f138267b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f138268c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f138269d;

    public x0(String itemId, zy.l0 pinalyticsState, boolean z13, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f138266a = itemId;
        this.f138267b = pinalyticsState;
        this.f138268c = z13;
        this.f138269d = experimentsGroupInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f138266a, x0Var.f138266a) && Intrinsics.d(this.f138267b, x0Var.f138267b) && this.f138268c == x0Var.f138268c && Intrinsics.d(this.f138269d, x0Var.f138269d);
    }

    public final int hashCode() {
        return this.f138269d.hashCode() + ep.b.e(this.f138268c, jq.b.a(this.f138267b, this.f138266a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CollageEffectsVMState(itemId=" + this.f138266a + ", pinalyticsState=" + this.f138267b + ", showExtraTools=" + this.f138268c + ", experimentsGroupInfo=" + this.f138269d + ")";
    }
}

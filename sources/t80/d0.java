package t80;

import java.util.AbstractMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class d0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f116684a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f116685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f116686c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f116687d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f116688e;

    public /* synthetic */ d0(int i13, l0 l0Var, AbstractMap abstractMap, int i14) {
        this("", false, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? new l0((h32.i0) null, 3) : l0Var, (i14 & 16) != 0 ? z0.d() : abstractMap);
    }

    public static d0 b(d0 d0Var, boolean z13, l0 l0Var, int i13) {
        String userId = d0Var.f116684a;
        if ((i13 & 2) != 0) {
            z13 = d0Var.f116685b;
        }
        boolean z14 = z13;
        int i14 = d0Var.f116686c;
        if ((i13 & 8) != 0) {
            l0Var = d0Var.f116687d;
        }
        l0 pinalyticsState = l0Var;
        Map experimentsGroupInfo = d0Var.f116688e;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new d0(userId, z14, i14, pinalyticsState, experimentsGroupInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f116684a, d0Var.f116684a) && this.f116685b == d0Var.f116685b && this.f116686c == d0Var.f116686c && Intrinsics.d(this.f116687d, d0Var.f116687d) && Intrinsics.d(this.f116688e, d0Var.f116688e);
    }

    public final int hashCode() {
        return this.f116688e.hashCode() + jq.b.a(this.f116687d, ep.b.b(this.f116686c, ep.b.e(this.f116685b, this.f116684a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "EmptyCollageCarouselVMState(userId=" + this.f116684a + ", contentLoading=" + this.f116685b + ", userDraftCount=" + this.f116686c + ", pinalyticsState=" + this.f116687d + ", experimentsGroupInfo=" + this.f116688e + ")";
    }

    public d0(String userId, boolean z13, int i13, l0 pinalyticsState, Map experimentsGroupInfo) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f116684a = userId;
        this.f116685b = z13;
        this.f116686c = i13;
        this.f116687d = pinalyticsState;
        this.f116688e = experimentsGroupInfo;
    }
}

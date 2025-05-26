package h60;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f67798a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67799b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67800c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f67801d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f67802e;

    /* renamed from: f, reason: collision with root package name */
    public final String f67803f;

    public g(ArrayList arrayList, boolean z13, boolean z14, Integer num, String str, int i13) {
        this((i13 & 1) != 0 ? q0.f80391a : arrayList, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? null : num, new l0((h32.i0) null, 3), (i13 & 32) != 0 ? null : str);
    }

    public static g b(g gVar, boolean z13, boolean z14, l0 l0Var, int i13) {
        List clusters = gVar.f67798a;
        if ((i13 & 2) != 0) {
            z13 = gVar.f67799b;
        }
        boolean z15 = z13;
        if ((i13 & 4) != 0) {
            z14 = gVar.f67800c;
        }
        boolean z16 = z14;
        Integer num = gVar.f67801d;
        if ((i13 & 16) != 0) {
            l0Var = gVar.f67802e;
        }
        l0 pinalyticsVMState = l0Var;
        String str = gVar.f67803f;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(clusters, "clusters");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new g(clusters, z15, z16, num, pinalyticsVMState, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f67798a, gVar.f67798a) && this.f67799b == gVar.f67799b && this.f67800c == gVar.f67800c && Intrinsics.d(this.f67801d, gVar.f67801d) && Intrinsics.d(this.f67802e, gVar.f67802e) && Intrinsics.d(this.f67803f, gVar.f67803f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f67800c, ep.b.e(this.f67799b, this.f67798a.hashCode() * 31, 31), 31);
        Integer num = this.f67801d;
        int a13 = jq.b.a(this.f67802e, (e13 + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.f67803f;
        return a13 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PinClusterCarouselVMState(clusters=" + this.f67798a + ", userHasBoards=" + this.f67799b + ", userHasCreatedAllClusters=" + this.f67800c + ", topPadding=" + this.f67801d + ", pinalyticsVMState=" + this.f67802e + ", navigationSource=" + this.f67803f + ")";
    }

    public g(List clusters, boolean z13, boolean z14, Integer num, l0 pinalyticsVMState, String str) {
        Intrinsics.checkNotNullParameter(clusters, "clusters");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f67798a = clusters;
        this.f67799b = z13;
        this.f67800c = z14;
        this.f67801d = num;
        this.f67802e = pinalyticsVMState;
        this.f67803f = str;
    }
}

package mu;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f88252a;

    /* renamed from: b, reason: collision with root package name */
    public final long f88253b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88254c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88255d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f88256e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f88257f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f88258g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88259h;

    public x(g0 g0Var, zy.l0 l0Var, boolean z13, int i13, int i14) {
        this((i14 & 1) != 0 ? new g0("") : g0Var, 0L, kotlin.collections.q0.f80391a, 0, (i14 & 16) != 0 ? new zy.l0((h32.i0) null, 3) : l0Var, false, (i14 & 64) != 0 ? false : z13, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? 0 : i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [mu.h0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public static x b(x xVar, f0 f0Var, long j13, ArrayList arrayList, int i13, zy.l0 l0Var, boolean z13, int i14) {
        f0 pinData = (i14 & 1) != 0 ? xVar.f88252a : f0Var;
        long j14 = (i14 & 2) != 0 ? xVar.f88253b : j13;
        ArrayList carouselData = (i14 & 4) != 0 ? xVar.f88254c : arrayList;
        int i15 = (i14 & 8) != 0 ? xVar.f88255d : i13;
        zy.l0 pinalyticsVMState = (i14 & 16) != 0 ? xVar.f88256e : l0Var;
        boolean z14 = (i14 & 32) != 0 ? xVar.f88257f : z13;
        boolean z15 = xVar.f88258g;
        int i16 = xVar.f88259h;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(pinData, "pinData");
        Intrinsics.checkNotNullParameter(carouselData, "carouselData");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new x(pinData, j14, carouselData, i15, pinalyticsVMState, z14, z15, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f88252a, xVar.f88252a) && this.f88253b == xVar.f88253b && Intrinsics.d(this.f88254c, xVar.f88254c) && this.f88255d == xVar.f88255d && Intrinsics.d(this.f88256e, xVar.f88256e) && this.f88257f == xVar.f88257f && this.f88258g == xVar.f88258g && this.f88259h == xVar.f88259h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88259h) + ep.b.e(this.f88258g, ep.b.e(this.f88257f, jq.b.a(this.f88256e, ep.b.b(this.f88255d, ep.b.c(this.f88254c, a.a.c(this.f88253b, this.f88252a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "AdsBaseVmState(pinData=" + this.f88252a + ", fragmentOnViewCreatedTime=" + this.f88253b + ", carouselData=" + this.f88254c + ", currentScrollingModuleIndex=" + this.f88255d + ", pinalyticsVMState=" + this.f88256e + ", isScrollingModuleInitialized=" + this.f88257f + ", isCCTEnabled=" + this.f88258g + ", deviceHeight=" + this.f88259h + ")";
    }

    public x(h0 pinData, long j13, List carouselData, int i13, zy.l0 pinalyticsVMState, boolean z13, boolean z14, int i14) {
        Intrinsics.checkNotNullParameter(pinData, "pinData");
        Intrinsics.checkNotNullParameter(carouselData, "carouselData");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f88252a = pinData;
        this.f88253b = j13;
        this.f88254c = carouselData;
        this.f88255d = i13;
        this.f88256e = pinalyticsVMState;
        this.f88257f = z13;
        this.f88258g = z14;
        this.f88259h = i14;
    }
}

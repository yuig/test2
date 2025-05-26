package xs;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes3.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f135723a;

    /* renamed from: b, reason: collision with root package name */
    public final long f135724b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f135725c;

    /* renamed from: d, reason: collision with root package name */
    public final long f135726d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f135727e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f135728f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f135729g;

    public g0(String uid, long j13, e0 bottomSheetState, long j14, boolean z13, HashMap auxDataForLogging, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(auxDataForLogging, "auxDataForLogging");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f135723a = uid;
        this.f135724b = j13;
        this.f135725c = bottomSheetState;
        this.f135726d = j14;
        this.f135727e = z13;
        this.f135728f = auxDataForLogging;
        this.f135729g = pinalyticsVMState;
    }

    public static g0 b(g0 g0Var, e0 e0Var, long j13, int i13) {
        String uid = g0Var.f135723a;
        long j14 = g0Var.f135724b;
        if ((i13 & 4) != 0) {
            e0Var = g0Var.f135725c;
        }
        e0 bottomSheetState = e0Var;
        if ((i13 & 8) != 0) {
            j13 = g0Var.f135726d;
        }
        boolean z13 = g0Var.f135727e;
        HashMap auxDataForLogging = g0Var.f135728f;
        l0 pinalyticsVMState = g0Var.f135729g;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(auxDataForLogging, "auxDataForLogging");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new g0(uid, j14, bottomSheetState, j13, z13, auxDataForLogging, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f135723a, g0Var.f135723a) && this.f135724b == g0Var.f135724b && this.f135725c == g0Var.f135725c && this.f135726d == g0Var.f135726d && this.f135727e == g0Var.f135727e && Intrinsics.d(this.f135728f, g0Var.f135728f) && Intrinsics.d(this.f135729g, g0Var.f135729g);
    }

    public final int hashCode() {
        return this.f135729g.hashCode() + a.c.d(this.f135728f, ep.b.e(this.f135727e, a.a.c(this.f135726d, (this.f135725c.hashCode() + a.a.c(this.f135724b, this.f135723a.hashCode() * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CartingBottomSheetVMState(uid=" + this.f135723a + ", delayedAnimationStartTime=" + this.f135724b + ", bottomSheetState=" + this.f135725c + ", bottomSheetExpandStartTime=" + this.f135726d + ", isAnalyticSignupSuccessPageSent=" + this.f135727e + ", auxDataForLogging=" + this.f135728f + ", pinalyticsVMState=" + this.f135729g + ")";
    }
}

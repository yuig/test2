package nt;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f92224b;

    /* renamed from: c, reason: collision with root package name */
    public final a f92225c;

    /* renamed from: d, reason: collision with root package name */
    public final long f92226d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92227e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f92228f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.l0 f92229g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f92230h;

    public x0(String uid, long j13, a bottomSheetState, long j14, boolean z13, HashMap auxDataForLogging, zy.l0 pinalyticsVMState, boolean z14) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(auxDataForLogging, "auxDataForLogging");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f92223a = uid;
        this.f92224b = j13;
        this.f92225c = bottomSheetState;
        this.f92226d = j14;
        this.f92227e = z13;
        this.f92228f = auxDataForLogging;
        this.f92229g = pinalyticsVMState;
        this.f92230h = z14;
    }

    public static x0 b(x0 x0Var, long j13, a aVar, long j14, boolean z13, HashMap hashMap, boolean z14, int i13) {
        String uid = x0Var.f92223a;
        long j15 = (i13 & 2) != 0 ? x0Var.f92224b : j13;
        a bottomSheetState = (i13 & 4) != 0 ? x0Var.f92225c : aVar;
        long j16 = (i13 & 8) != 0 ? x0Var.f92226d : j14;
        boolean z15 = (i13 & 16) != 0 ? x0Var.f92227e : z13;
        HashMap auxDataForLogging = (i13 & 32) != 0 ? x0Var.f92228f : hashMap;
        zy.l0 pinalyticsVMState = x0Var.f92229g;
        boolean z16 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? x0Var.f92230h : z14;
        x0Var.getClass();
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(auxDataForLogging, "auxDataForLogging");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new x0(uid, j15, bottomSheetState, j16, z15, auxDataForLogging, pinalyticsVMState, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f92223a, x0Var.f92223a) && this.f92224b == x0Var.f92224b && this.f92225c == x0Var.f92225c && this.f92226d == x0Var.f92226d && this.f92227e == x0Var.f92227e && Intrinsics.d(this.f92228f, x0Var.f92228f) && Intrinsics.d(this.f92229g, x0Var.f92229g) && this.f92230h == x0Var.f92230h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92230h) + jq.b.a(this.f92229g, a.c.d(this.f92228f, ep.b.e(this.f92227e, a.a.c(this.f92226d, (this.f92225c.hashCode() + a.a.c(this.f92224b, this.f92223a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LeadGenBottomSheetVMState(uid=");
        sb3.append(this.f92223a);
        sb3.append(", delayedAnimationStartTime=");
        sb3.append(this.f92224b);
        sb3.append(", bottomSheetState=");
        sb3.append(this.f92225c);
        sb3.append(", bottomSheetExpandStartTime=");
        sb3.append(this.f92226d);
        sb3.append(", isAnalyticSignupSuccessPageSent=");
        sb3.append(this.f92227e);
        sb3.append(", auxDataForLogging=");
        sb3.append(this.f92228f);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f92229g);
        sb3.append(", hasSubmittedForm=");
        return a.a.r(sb3, this.f92230h, ")");
    }
}

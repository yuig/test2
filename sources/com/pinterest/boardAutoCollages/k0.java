package com.pinterest.boardAutoCollages;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import fa0.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ml0.t0;
import ny0.a1;
import ny0.b1;
import ny0.d1;
import o82.m3;
import qm0.i2;
import qm0.k2;

/* loaded from: classes5.dex */
public final /* synthetic */ class k0 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44576a;

    public /* synthetic */ k0(int i13) {
        this.f44576a = i13;
    }

    @Override // o82.m3
    public final int a(int i13, l82.i0 i0Var) {
        switch (this.f44576a) {
            case 0:
                Intrinsics.checkNotNullParameter((d) i0Var, "<anonymous parameter 1>");
                return 100;
            case 1:
                h90.c vmState = (h90.c) i0Var;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                if (vmState instanceof h90.b) {
                    return 444555666;
                }
                if (vmState instanceof h90.a) {
                    return 333444555;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Intrinsics.checkNotNullParameter((xa0.f) i0Var, "<anonymous parameter 1>");
                return 0;
            case 3:
                Intrinsics.checkNotNullParameter((z0) i0Var, "<anonymous parameter 1>");
                return 1000;
            case 4:
                xa0.f vmState2 = (xa0.f) i0Var;
                Intrinsics.checkNotNullParameter(vmState2, "vmState");
                if (Intrinsics.d(vmState2, xa0.d.f134398a) || (vmState2 instanceof xa0.e)) {
                    return 0;
                }
                if (vmState2 instanceof xa0.c) {
                    return 1;
                }
                if (vmState2 instanceof xa0.b) {
                    return 2;
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                Intrinsics.checkNotNullParameter((t0) i0Var, "<anonymous parameter 1>");
                return 1003;
            case 6:
                lm0.f0 item = (lm0.f0) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                return item.f83863b;
            case 7:
                lm0.c0 item2 = (lm0.c0) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                return item2.f83851c;
            case 8:
                Intrinsics.checkNotNullParameter((qm0.a) i0Var, "<anonymous parameter 1>");
                return 1000;
            case 9:
                Intrinsics.checkNotNullParameter((k2) i0Var, "<anonymous parameter 1>");
                return 1001;
            case 10:
                Intrinsics.checkNotNullParameter((i2) i0Var, "<anonymous parameter 1>");
                return 1003;
            case 11:
                Intrinsics.checkNotNullParameter((ys0.r) i0Var, "<anonymous parameter 1>");
                return RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION;
            case 12:
                Intrinsics.checkNotNullParameter((xs0.h) i0Var, "<anonymous parameter 1>");
                return 9992;
            case 13:
                Intrinsics.checkNotNullParameter((bt0.l) i0Var, "item");
                return 44;
            case 14:
                Intrinsics.checkNotNullParameter((ct0.u) i0Var, "<anonymous parameter 1>");
                return 1;
            case 15:
                Intrinsics.checkNotNullParameter((ct0.u) i0Var, "<anonymous parameter 1>");
                return 1;
            case 16:
                Intrinsics.checkNotNullParameter((dt0.b0) i0Var, "<anonymous parameter 1>");
                return RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION;
            case 17:
                Intrinsics.checkNotNullParameter((xs0.g0) i0Var, "<anonymous parameter 1>");
                return 9991;
            case 18:
                tx0.q item3 = (tx0.q) i0Var;
                Intrinsics.checkNotNullParameter(item3, "item");
                return tx0.z.f119683a[item3.f119670b.ordinal()] == 1 ? 296 : 294;
            case 19:
                Intrinsics.checkNotNullParameter((d1) i0Var, "<anonymous parameter 1>");
                return 539204;
            case 20:
                Intrinsics.checkNotNullParameter((ny0.a0) i0Var, "<anonymous parameter 1>");
                return 539203;
            case 21:
                Intrinsics.checkNotNullParameter((a1) i0Var, "<anonymous parameter 1>");
                return 539205;
            case 22:
                Intrinsics.checkNotNullParameter((b1) i0Var, "<anonymous parameter 1>");
                return 539206;
            case 23:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "<anonymous parameter 1>");
                return 20086;
            case 24:
                Intrinsics.checkNotNullParameter((iz0.e0) i0Var, "<anonymous parameter 1>");
                return 60086;
            case 25:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "<anonymous parameter 1>");
                return 40086;
            case 26:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "item");
                return 30086;
            case 27:
                Intrinsics.checkNotNullParameter((iz0.f0) i0Var, "<anonymous parameter 1>");
                return 50086;
            case 28:
                Intrinsics.checkNotNullParameter((iz0.d0) i0Var, "<anonymous parameter 1>");
                return 70086;
            default:
                Intrinsics.checkNotNullParameter((c31.s) i0Var, "<anonymous parameter 1>");
                return Integer.MAX_VALUE;
        }
    }
}

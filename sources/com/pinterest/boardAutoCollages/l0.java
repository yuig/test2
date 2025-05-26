package com.pinterest.boardAutoCollages;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import m90.f1;
import m90.h1;
import m90.j1;
import m90.k1;
import o82.t1;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 implements o82.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44579a;

    public /* synthetic */ l0(int i13) {
        this.f44579a = i13;
    }

    @Override // o82.i
    public final o82.j a(int i13, l82.i0 i0Var) {
        boolean z13 = true;
        switch (this.f44579a) {
            case 0:
                Intrinsics.checkNotNullParameter((d) i0Var, "<anonymous parameter 1>");
                return t1.f93713a;
            case 1:
                h90.n0 item = (h90.n0) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof h90.m0) {
                    return new o82.j(true, ((h90.m0) item).f68274a.f42868z == z32.m0.STRUCTURED_FEED_CAROUSEL, false, true, false, true, 44);
                }
                return t1.f93713a;
            case 2:
                k1 item2 = (k1) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                if (!(item2 instanceof j1) && !(item2 instanceof f1)) {
                    return item2 instanceof h1 ? o82.j.a(t1.f93715c, false, true, true, 47) : t1.f93716d;
                }
                return t1.f93713a;
            case 3:
                ea0.a0 item3 = (ea0.a0) i0Var;
                Set set = ea0.v.f58002a;
                Intrinsics.checkNotNullParameter(item3, "item");
                return item3 instanceof ea0.w ? t1.f93713a : item3 instanceof ea0.x ? o82.j.a(t1.f93715c, false, true, true, 47) : t1.f93716d;
            case 4:
                lm0.f0 item4 = (lm0.f0) i0Var;
                Intrinsics.checkNotNullParameter(item4, "item");
                int i14 = item4.f83863b;
                if (i14 != 72 && i14 != 86753093) {
                    z13 = false;
                }
                return o82.j.a(t1.f93713a, z13, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 5:
                Intrinsics.checkNotNullParameter(i0Var, "<anonymous parameter 1>");
                return new o82.j(false, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            case 6:
                Intrinsics.checkNotNullParameter((iz0.d0) i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            case 7:
                Intrinsics.checkNotNullParameter((iz0.e0) i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            case 8:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "<anonymous parameter 1>");
                return t1.f93713a;
            case 9:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            case 10:
                Intrinsics.checkNotNullParameter((iz0.t) i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            case 11:
                Intrinsics.checkNotNullParameter((iz0.f0) i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            case 12:
                Intrinsics.checkNotNullParameter((c31.s) i0Var, "<anonymous parameter 1>");
                return new o82.j(true, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 13:
                Intrinsics.checkNotNullParameter((s52.q) i0Var, "<anonymous parameter 1>");
                return new o82.j(true, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 14:
                Intrinsics.checkNotNullParameter(i0Var, "<anonymous parameter 1>");
                return new o82.j(false, false, false, false, false, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            case 15:
                o82.j jVar = t1.f93713a;
                Intrinsics.checkNotNullParameter(i0Var, "<anonymous parameter 1>");
                return t1.f93713a;
            case 16:
                o82.j jVar2 = t1.f93713a;
                Intrinsics.checkNotNullParameter(i0Var, "<anonymous parameter 1>");
                return t1.f93715c;
            default:
                o82.j jVar3 = t1.f93713a;
                Intrinsics.checkNotNullParameter(i0Var, "<anonymous parameter 1>");
                return t1.f93714b;
        }
    }
}

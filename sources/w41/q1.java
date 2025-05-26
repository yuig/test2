package w41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o82.m3;

/* loaded from: classes5.dex */
public final /* synthetic */ class q1 implements m3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128070a;

    public /* synthetic */ q1(int i13) {
        this.f128070a = i13;
    }

    @Override // o82.m3
    public final int a(int i13, l82.i0 i0Var) {
        switch (this.f128070a) {
            case 0:
                Intrinsics.checkNotNullParameter((v0) i0Var, "<anonymous parameter 1>");
                return 122333;
            case 1:
                Intrinsics.checkNotNullParameter((x91.u) i0Var, "<anonymous parameter 1>");
                return 100;
            case 2:
                Intrinsics.checkNotNullParameter((ba1.d) i0Var, "item");
                return 0;
            case 3:
                Intrinsics.checkNotNullParameter((ma1.w) i0Var, "<anonymous parameter 1>");
                return 1;
            case 4:
                Intrinsics.checkNotNullParameter((ma1.q) i0Var, "<anonymous parameter 1>");
                return 100;
            case 5:
                com.pinterest.feature.settings.notifications.o0 item = (com.pinterest.feature.settings.notifications.o0) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof com.pinterest.feature.settings.notifications.k0) {
                    return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
                }
                if (item instanceof com.pinterest.feature.settings.notifications.l0) {
                    return 100;
                }
                if (item instanceof com.pinterest.feature.settings.notifications.m0) {
                    return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
                }
                if (item instanceof com.pinterest.feature.settings.notifications.n0) {
                    return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                rb1.o item2 = (rb1.o) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                rb1.p q13 = item2.q();
                if (q13 != null) {
                    return q13.f125212g;
                }
                return 14;
            case 7:
                Intrinsics.checkNotNullParameter((kc1.b) i0Var, "<anonymous parameter 1>");
                return 12;
            case 8:
                Intrinsics.checkNotNullParameter((zw0.t) i0Var, "<anonymous parameter 1>");
                return 1001;
            case 9:
                Intrinsics.checkNotNullParameter((zw0.t) i0Var, "<anonymous parameter 1>");
                return 1001;
            case 10:
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.a0) i0Var, "item");
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
            case 11:
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.b0) i0Var, "item");
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
            case 12:
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.y) i0Var, "item");
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
            case 13:
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.e0) i0Var, "item");
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE;
            case 14:
                Intrinsics.checkNotNullParameter((com.pinterest.feature.unauth.sba.y) i0Var, "item");
                return RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE;
            case 15:
                Intrinsics.checkNotNullParameter((wr1.f1) i0Var, "<anonymous parameter 1>");
                return 1;
            case 16:
                Intrinsics.checkNotNullParameter((s02.k) i0Var, "<anonymous parameter 1>");
                return 0;
            case 17:
                Intrinsics.checkNotNullParameter((r52.a) i0Var, "<anonymous parameter 1>");
                return 30032002;
            case 18:
                Intrinsics.checkNotNullParameter((s52.q) i0Var, "<anonymous parameter 1>");
                return 326537;
            default:
                Intrinsics.checkNotNullParameter((ad2.j) i0Var, "item");
                return 100;
        }
    }
}

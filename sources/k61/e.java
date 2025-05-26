package k61;

import android.view.View;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.g3;
import lh0.z3;
import yw0.l;
import yw0.m;

/* loaded from: classes5.dex */
public final class e extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78403i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f78404j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(h hVar, int i13) {
        super(2);
        this.f78403i = i13;
        this.f78404j = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i13 = this.f78403i;
        h hVar = this.f78404j;
        switch (i13) {
            case 0:
                v7 board = (v7) obj;
                View view = (View) obj2;
                Intrinsics.checkNotNullParameter(board, "board");
                Intrinsics.checkNotNullParameter(view, "view");
                hVar.P.d(new m10.b(view, board));
                return Unit.f80348a;
            default:
                dl1.s model = (dl1.s) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(model, "model");
                vh vhVar = (vh) model;
                w0 e13 = hVar.O.e();
                if (e13 == null || (str = e13.G) == null) {
                    str = "";
                }
                String str2 = str;
                Integer valueOf = Integer.valueOf(intValue);
                l lVar = l.SEARCH;
                g3 g3Var = hVar.Q;
                g3Var.getClass();
                z3 z3Var = a4.f83297a;
                g1 g1Var = (g1) g3Var.f83374a;
                return new m(vhVar, str2, valueOf, lVar, g1Var.o("android_ways_to_style_ui_v2_search", "enabled", z3Var) || g1Var.l("android_ways_to_style_ui_v2_search"), g3Var.q("enabled_cta") || g3Var.q("employees"), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_SHOW_GRID_ACTIONS_FULL_SPAN);
        }
    }
}

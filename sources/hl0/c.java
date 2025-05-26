package hl0;

import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69458i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f69459j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(v vVar, int i13) {
        super(0);
        this.f69458i = i13;
        this.f69459j = vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f69458i;
        v vVar = this.f69459j;
        switch (i13) {
            case 0:
                v7 v7Var = vVar.K;
                if (v7Var == null) {
                    return null;
                }
                nk1.g gVar = new nk1.g(vVar.getPinalytics(), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                yk1.v viewResources = vVar.f69546u;
                Intrinsics.checkNotNullParameter(viewResources, "viewResources");
                i92.k toastUtils = vVar.f69541q;
                Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
                return new nk1.b(v7Var, gVar, new xb0.a(vVar, 19), new oh1.u(16, toastUtils, viewResources), vVar.f69533m);
            case 1:
                return Boolean.valueOf(vVar.K3());
            default:
                vVar.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.VIEW, (r18 & 2) != 0 ? null : u0.BOARD_FILTER_FAVORITE_EMPTY_STATE, (r18 & 4) != 0 ? null : g0.BOARD_PINS_GRID, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return Unit.f80348a;
        }
    }
}

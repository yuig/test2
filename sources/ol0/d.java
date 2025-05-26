package ol0;

import a.cb;
import android.content.Context;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.edit.BoardEditFeatureLocation;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import cp.b0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f96356j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(0);
        this.f96355i = i13;
        this.f96356j = fVar;
    }

    public final Unit b() {
        v7 v7Var;
        int i13 = this.f96355i;
        f fVar = this.f96356j;
        switch (i13) {
            case 3:
                fVar.R0 = true;
                ll0.f fVar2 = fVar.Q0;
                if (fVar2 == null) {
                    return null;
                }
                GestaltSwitch gestaltSwitch = fVar.H0;
                if (gestaltSwitch == null) {
                    Intrinsics.r("allowHomefeedRecommendationsSwitch");
                    throw null;
                }
                boolean z13 = gestaltSwitch.l().f96708a;
                d0 d0Var = fVar2.f83803b.f122379a;
                Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                d0Var.N(z13 ? f1.TOGGLE_ON : f1.TOGGLE_OFF, u0.BOARD_ALLOW_HOMEFEED_RECS, null, null, false);
                return Unit.f80348a;
            default:
                fVar.R0 = true;
                ll0.f fVar3 = fVar.Q0;
                if (fVar3 == null) {
                    return null;
                }
                GestaltSwitch gestaltSwitch2 = fVar.F0;
                if (gestaltSwitch2 == null) {
                    Intrinsics.r("secretToggleSwitch");
                    throw null;
                }
                boolean z14 = gestaltSwitch2.l().f96708a;
                if (fVar3.isBound()) {
                    if (z14 || (v7Var = fVar3.f83814m) == null || !kh2.d.M0(v7Var)) {
                        v7 v7Var2 = fVar3.f83814m;
                        if (v7Var2 != null && Intrinsics.d(v7Var2.X0(), Boolean.TRUE)) {
                            f fVar4 = (f) ((com.pinterest.feature.board.edit.a) fVar3.getView());
                            String string = fVar4.getString(x0.are_you_sure_text);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            String string2 = fVar4.getString(a70.c.make_board_secret_warning);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = fVar4.getString(a70.c.make_secret);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            yb0.n h83 = fVar4.h8(string, string2, string3);
                            h83.f138513j = new a(fVar4, 6);
                            h83.f138514k = new a(fVar4, 7);
                            cb.x(h83, fVar4.f7());
                        }
                    } else {
                        f fVar5 = (f) ((com.pinterest.feature.board.edit.a) fVar3.getView());
                        String string4 = fVar5.getString(a70.c.board_make_public);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        String string5 = fVar5.getString(a70.c.make_board_public_check);
                        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                        String string6 = fVar5.getString(a70.c.make_public);
                        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        yb0.n h84 = fVar5.h8(string4, string5, string6);
                        h84.f138513j = new a(fVar5, 4);
                        h84.f138514k = new a(fVar5, 5);
                        h84.f138517n = false;
                        cb.x(h84, fVar5.f7());
                    }
                }
                return Unit.f80348a;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f96355i) {
            case 0:
                HashMap hashMap = new HashMap();
                int i13 = f.V0;
                hashMap.put("board_id", this.f96356j.d8());
                break;
            case 1:
                m226invoke();
                break;
            case 2:
                m226invoke();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                m226invoke();
                break;
            default:
                m226invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m226invoke() {
        int i13 = this.f96355i;
        f fVar = this.f96356j;
        switch (i13) {
            case 1:
                ll0.f fVar2 = fVar.Q0;
                if (fVar2 != null) {
                    fVar2.f83803b.f122379a.Z(u0.EDIT_BOARD_HEADER_BUTTON, (HashMap) fVar2.f83819r.getValue());
                    com.pinterest.feature.board.edit.a aVar = (com.pinterest.feature.board.edit.a) fVar2.getViewIfBound();
                    if (aVar != null) {
                        String boardId = fVar2.f83802a;
                        Intrinsics.checkNotNullParameter(boardId, "boardId");
                        w f73 = ((f) aVar).f7();
                        NavigationImpl w13 = Navigation.w1(BoardEditFeatureLocation.BOARD_HEADER_IMAGE_SELECTOR_FRAGMENT);
                        w13.m0("com.pinterest.EXTRA_BOARD_ID", boardId);
                        f73.d(w13);
                        break;
                    }
                }
                break;
            case 2:
                ll0.f fVar3 = fVar.Q0;
                if (fVar3 != null) {
                    fVar3.f83803b.f122379a.Z(u0.DELETE_BOARD_HEADER_BUTTON, (HashMap) fVar3.f83819r.getValue());
                    com.pinterest.feature.board.edit.a aVar2 = (com.pinterest.feature.board.edit.a) fVar3.getViewIfBound();
                    if (aVar2 != null) {
                        f fVar4 = (f) aVar2;
                        w f74 = fVar4.f7();
                        Context requireContext = fVar4.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        yb0.n nVar = new yb0.n(requireContext);
                        String string = fVar4.getString(x0.are_you_sure_text);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        nVar.w(string);
                        nVar.u(fVar4.getString(a70.c.board_header_image_delete_description));
                        String string2 = fVar4.getString(x0.remove);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        nVar.q(string2);
                        String string3 = fVar4.getString(x0.cancel);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        nVar.m(string3);
                        nVar.setFocusable(true);
                        nVar.setFocusableInTouchMode(true);
                        nVar.requestFocus();
                        nVar.r(new d(fVar4, 5));
                        nVar.n(new d(fVar4, 6));
                        f74.d(new yb0.e(nVar));
                        d0.B(fVar4.s7(), f1.VIEW, g0.CONFIRM_DELETE_BOARD_HEADER_SHEET, null, fVar4.getO0(), 20);
                        break;
                    }
                }
                break;
            case 3:
            case 4:
            default:
                ll0.f fVar5 = fVar.Q0;
                if (fVar5 != null) {
                    fVar5.f83803b.f122379a.h(g0.CONFIRM_DELETE_BOARD_HEADER_SHEET, u0.CANCEL_BUTTON, (HashMap) fVar5.f83819r.getValue());
                    break;
                }
                break;
            case 5:
                ll0.f fVar6 = fVar.Q0;
                if (fVar6 != null) {
                    fVar6.f83803b.f122379a.h(g0.CONFIRM_DELETE_BOARD_HEADER_SHEET, u0.REMOVE_BUTTON, (HashMap) fVar6.f83819r.getValue());
                    fVar6.f83810i.o(fVar6.f83802a).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(fVar6, 11), new zk0.b(23, new ll0.c(fVar6, 3)));
                    break;
                }
                break;
        }
    }
}

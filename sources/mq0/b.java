package mq0;

import android.content.Context;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.components.users.LegoUserRep;
import dq0.i;
import h32.f1;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import oa2.s;
import r41.k;
import so.oa;
import tk2.e;
import x02.x2;
import xv.g;
import z40.d0;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f88059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f88060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LegoUserRep f88061c;

    public b(d0 d0Var, g gVar, LegoUserRep legoUserRep) {
        this.f88059a = d0Var;
        this.f88060b = gVar;
        this.f88061c = legoUserRep;
    }

    @Override // oa2.s
    public final void G1() {
    }

    @Override // oa2.s
    public final void a0() {
        k kVar = k.f106176a;
        k.f106176a.d(this.f88059a.a(), r41.b.Unknown);
    }

    @Override // oa2.s
    public final void k() {
        String a13 = this.f88059a.a();
        g gVar = this.f88060b;
        x2 x2Var = (x2) gVar.f136005c;
        wy0 wy0Var = (wy0) x2Var.O(a13);
        if (wy0Var != null) {
            boolean booleanValue = wy0Var.s2().booleanValue();
            LegoUserRep legoUserRep = this.f88061c;
            Object obj = gVar.f136004b;
            Object obj2 = gVar.f136006d;
            if (booleanValue) {
                ((xj2.b) obj2).a(x2Var.h0(wy0Var).r(e.f118017c).l(wj2.c.a()).o(new i(26, c.f88064l), new i(27, c.f88065m)));
                legoUserRep.G0(new yl1.b(bs1.c.j2(new String[0], x0.block), true, null, null, yl1.d.SECONDARY.getColorPalette(), null, null, null, 0, null, 1004));
                Context context = kb0.a.f79058b;
                ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(legoUserRep.getResources().getString(x0.comment_block_user_undo_toast, wy0Var.Z2()));
                ((nx.d0) obj).h0((r18 & 1) != 0 ? f1.TAP : f1.USER_UNBLOCK, (r18 & 2) != 0 ? null : u0.USER_UNBLOCK_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                return;
            }
            ((xj2.b) obj2).a(x2Var.a0(wy0Var, "message", (String) gVar.f136007e).r(e.f118017c).l(wj2.c.a()).o(new i(24, c.f88062j), new i(25, c.f88063k)));
            legoUserRep.G0(new yl1.b(bs1.c.j2(new String[0], x0.unblock), true, null, null, yl1.d.SECONDARY.getColorPalette(), null, null, null, 0, null, 1004));
            Context context2 = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().m(legoUserRep.getResources().getString(x0.comment_block_user_confirm_toast, wy0Var.Z2()));
            ((nx.d0) obj).h0((r18 & 1) != 0 ? f1.TAP : f1.USER_BLOCK, (r18 & 2) != 0 ? null : u0.USER_BLOCK_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    @Override // oa2.s
    public final void l1() {
        k kVar = k.f106176a;
        k.f106176a.d(this.f88059a.a(), r41.b.Unknown);
    }

    @Override // oa2.s
    public final void y2(oa2.i previewImagePosition) {
        Intrinsics.checkNotNullParameter(previewImagePosition, "previewImagePosition");
    }
}

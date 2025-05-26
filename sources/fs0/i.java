package fs0;

import android.widget.RelativeLayout;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.gridactions.modal.view.OverflowMenu;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;

/* loaded from: classes5.dex */
public final class i extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f62848a;

    /* renamed from: b, reason: collision with root package name */
    public final v7 f62849b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f62850c;

    /* renamed from: d, reason: collision with root package name */
    public final yk1.v f62851d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f62852e;

    /* renamed from: f, reason: collision with root package name */
    public final ok1.d f62853f;

    /* renamed from: g, reason: collision with root package name */
    public final ok1.f f62854g;

    /* renamed from: h, reason: collision with root package name */
    public ek2.f f62855h;

    /* renamed from: i, reason: collision with root package name */
    public kk2.l f62856i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String sourceId, v7 board, wy0 user, yk1.a viewResources, uk1.d presenterPinalytics, uj2.q networkStateStream) {
        super(presenterPinalytics, networkStateStream);
        m60.w eventManager = m60.u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        ok1.d boardFollowActions = new ok1.d(new nk1.g(presenterPinalytics.f122379a, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, 6);
        ok1.f userFollowActions = new ok1.f(new nk1.g(presenterPinalytics.f122379a, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, false, null, 62);
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardFollowActions, "boardFollowActions");
        Intrinsics.checkNotNullParameter(userFollowActions, "userFollowActions");
        this.f62848a = sourceId;
        this.f62849b = board;
        this.f62850c = user;
        this.f62851d = viewResources;
        this.f62852e = eventManager;
        this.f62853f = boardFollowActions;
        this.f62854g = userFollowActions;
    }

    public static String s3(wy0 wy0Var) {
        String U2 = wy0Var.U2();
        String P3 = wy0Var.P3();
        String Z2 = wy0Var.Z2();
        return (Z2 == null || z.j(Z2)) ? (U2 == null || z.j(U2)) ? (P3 == null || z.j(P3)) ? "" : StringsKt.i0(P3).toString() : StringsKt.i0(U2).toString() : StringsKt.i0(Z2).toString();
    }

    public final void q3() {
        if (isBound()) {
            m60.w wVar = ((OverflowMenu) ((cs0.c) getView())).f45710e;
            if (wVar != null) {
                wVar.d(new jc0.s(true, 0));
            } else {
                Intrinsics.r("eventManager");
                throw null;
            }
        }
    }

    @Override // yk1.p
    public final void r3(cs0.c view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        OverflowMenu overflowMenu = (OverflowMenu) view;
        gs0.c cVar = overflowMenu.f45709d;
        if (cVar == null) {
            Intrinsics.r("viewCreator");
            throw null;
        }
        overflowMenu.addView(cVar.c(0, overflowMenu.f45708c));
        ArrayList options = new ArrayList();
        wy0 wy0Var = this.f62850c;
        Boolean R2 = wy0Var.R2();
        Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
        boolean booleanValue = R2.booleanValue();
        yk1.v vVar = this.f62851d;
        if (booleanValue) {
            options.add(new cs0.b(bz1.c.contextmenu_unfollow_user, bz1.a.ic_person_unfollow_nonpds, ((yk1.a) vVar).f139224a.getString(bz1.c.unfollow_pin_user, s3(wy0Var)), new g(this, 0)));
        } else {
            v7 v7Var = this.f62849b;
            Boolean V0 = v7Var.V0();
            Intrinsics.checkNotNullExpressionValue(V0, "getFollowedByMe(...)");
            if (V0.booleanValue()) {
                options.add(new cs0.b(bz1.c.contextmenu_unfollow_board, bz1.a.ic_board_unfollow_nonpds, ((yk1.a) vVar).f139224a.getString(bz1.c.unfollow_pin_board, s3(wy0Var), v7Var.j1()), new g(this, 1)));
            }
        }
        if (!options.isEmpty()) {
            Intrinsics.checkNotNullParameter(options, "options");
            Iterator it = options.iterator();
            while (it.hasNext()) {
                cs0.b option = (cs0.b) it.next();
                Intrinsics.checkNotNullParameter(option, "option");
                gs0.c cVar2 = overflowMenu.f45709d;
                if (cVar2 == null) {
                    Intrinsics.r("viewCreator");
                    throw null;
                }
                String string = overflowMenu.getResources().getString(option.f53122a);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                RelativeLayout b13 = gs0.c.b(cVar2, string, option.f53124c, null, 4);
                b13.setOnClickListener(new lj0.a(option, 24));
                overflowMenu.addView(b13);
            }
        }
    }
}

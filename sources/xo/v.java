package xo;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.activity.board.ManageBoardCollaboratorContactView;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.js;
import com.pinterest.api.model.ob0;
import com.pinterest.api.model.sb0;
import com.pinterest.api.model.t20;
import com.pinterest.api.model.tb0;
import com.pinterest.api.model.ub0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeTextView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import qa2.h0;
import qa2.j0;
import qa2.s1;
import qa2.v1;
import so.ba;
import u50.f0;
import we1.a2;

/* loaded from: classes3.dex */
public final class v extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135564d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final List f135565e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f135566f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f135567g;

    public v(List collaboratorsContacts, ap.o uploadContactsUtil, d0 listener) {
        Intrinsics.checkNotNullParameter(collaboratorsContacts, "collaboratorsContacts");
        Intrinsics.checkNotNullParameter(uploadContactsUtil, "uploadContactsUtil");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f135565e = collaboratorsContacts;
        this.f135566f = uploadContactsUtil;
        this.f135567g = listener;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f135564d) {
        }
        return this.f135565e.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final int g(int i13) {
        switch (this.f135564d) {
            case 1:
                ob0 ob0Var = (ob0) this.f135565e.get(i13);
                if ((ob0Var != null ? (v7) ob0Var.a(new sb0()) : null) == null) {
                    if ((ob0Var != null ? (f30) ob0Var.a(new ub0()) : null) == null) {
                        if ((ob0Var != null ? (t20) ob0Var.a(new tb0()) : null) != null) {
                        }
                    }
                }
                break;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        int i14 = 0;
        switch (this.f135564d) {
            case 0:
                w holder = (w) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                TypeAheadItem user = (TypeAheadItem) this.f135565e.get(i13);
                Intrinsics.checkNotNullParameter(user, "user");
                ManageBoardCollaboratorContactView manageBoardCollaboratorContactView = holder.f135568u;
                manageBoardCollaboratorContactView.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                String string = user.n();
                Intrinsics.checkNotNullExpressionValue(string, "getTitle(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                pk.a0.q(manageBoardCollaboratorContactView.f34842b, new f0(string));
                String string2 = "@" + user.k();
                Intrinsics.checkNotNullParameter(string2, "string");
                pk.a0.q(manageBoardCollaboratorContactView.f34843c, new f0(string2));
                String l13 = user.l();
                if (l13 != null) {
                    manageBoardCollaboratorContactView.f34841a.H2(new t(l13, user, i14));
                }
                manageBoardCollaboratorContactView.f34844d.g(new u(this, i13, holder, i14));
                return;
            case 1:
                kz0.k holder2 = (kz0.k) y2Var;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                ob0 item = (ob0) this.f135565e.get(i13);
                int g13 = g(i13);
                nx.d0 pinalytics = (nx.d0) this.f135566f;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                KeyEvent.Callback callback = holder2.f19717a;
                kz0.m mVar = holder2.f81168w;
                if (g13 == 43) {
                    Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.component.board.view.LegoBoardRep");
                    LegoBoardRep legoBoardRep = (LegoBoardRep) callback;
                    v7 board = item != null ? (v7) item.a(new sb0()) : null;
                    Intrinsics.f(board);
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(legoBoardRep, "<this>");
                    Intrinsics.checkNotNullParameter(board, "board");
                    Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
                    legoBoardRep.a0(new qc2.d(), new kz0.j(mVar, 1));
                    b60.b bVar = mVar.f81175d;
                    if (bVar == null) {
                        Intrinsics.r("activeUserManager");
                        throw null;
                    }
                    wy0 f13 = ((b60.d) bVar).f();
                    Resources resources = legoBoardRep.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    pb0.d dVar = mVar.f81176e;
                    if (dVar == null) {
                        Intrinsics.r("fuzzyDateFormatter");
                        throw null;
                    }
                    legoBoardRep.d0(ph.a.J0(board, f13, resources, null, dVar, ka2.a.a(ka2.a.f78935q, dc0.q.Default, false, false, 65534), Integer.valueOf(i13), null, 448));
                    HashMap hashMap = new HashMap();
                    hashMap.put("board_id", board.getUid());
                    hashMap.put("grid_index", String.valueOf(i13));
                    legoBoardRep.setOnClickListener(new androidx.media3.ui.q(pinalytics, hashMap, mVar, board, 8));
                    c0.d.t2(pinalytics, f1.VIEW, g0.PEAR_QUIZ_BOARD_FEED, u0.PEAR_QUIZ_BOARD, hashMap);
                    return;
                }
                if (g13 != 44) {
                    return;
                }
                Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.ui.grid.PinGridCell");
                h0 h0Var = (h0) callback;
                f30 f30Var = item != null ? (f30) item.a(new ub0()) : null;
                Intrinsics.f(f30Var);
                o2 o2Var = holder2.f81167v ? (o2) holder2.f81166u.getValue() : null;
                int i15 = kz0.m.f81171j;
                mVar.getClass();
                if (h0Var instanceof v1) {
                    SbaPinRep sbaPinRep = (SbaPinRep) h0Var;
                    wa2.m mVar2 = new wa2.m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    ni1.d0 d0Var = mVar.f81179h;
                    if (d0Var == null) {
                        Intrinsics.r("pgcVMStateConverterFactory");
                        throw null;
                    }
                    int i16 = 2;
                    ni1.c0 a13 = ((ba) d0Var).a(mVar2, new sp.e(pinalytics, i16), new sp.f(pinalytics, i16));
                    if (o2Var != null) {
                        sbaPinRep.bindDisplayState(o2Var.b(a13.a(i13, f30Var), false));
                    }
                } else if (h0Var instanceof qa2.o) {
                    h0Var.setPinalytics(pinalytics);
                    h0Var.setPin(f30Var, i13);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("pin_id", f30Var.getUid());
                hashMap2.put("grid_index", String.valueOf(i13));
                c0.d.u2(pinalytics, f1.VIEW, g0.FLOWED_PIN, null, hashMap2, 4);
                return;
            default:
                cf1.a holder3 = (cf1.a) y2Var;
                Intrinsics.checkNotNullParameter(holder3, "holder");
                js badgeDetail = (js) this.f135565e.get(i13);
                Intrinsics.checkNotNullParameter(badgeDetail, "badgeDetail");
                String text = badgeDetail.e();
                Intrinsics.checkNotNullExpressionValue(text, "getLabel(...)");
                InspirationalBadgeTextView inspirationalBadgeTextView = holder3.f27642u;
                inspirationalBadgeTextView.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                pk.a0.p(inspirationalBadgeTextView.f48534a, text);
                inspirationalBadgeTextView.setOnClickListener(new a2(holder3, 5));
                return;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        View legoBoardRep;
        int i14 = this.f135564d;
        Object obj = this.f135566f;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(parent, "parent");
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new w(new ManageBoardCollaboratorContactView(bs1.c.k0(context)));
            case 1:
                Intrinsics.checkNotNullParameter(parent, "parent");
                if (i13 == 43) {
                    Context context2 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    legoBoardRep = new LegoBoardRep(context2);
                } else if (i13 == 44) {
                    j0 j0Var = ((kz0.m) this.f135567g).f81177f;
                    if (j0Var == null) {
                        Intrinsics.r("pinGridCellFactory");
                        throw null;
                    }
                    Context context3 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    legoBoardRep = (View) ((qa2.d) j0Var).a(context3, true);
                } else if (i13 != 104) {
                    legoBoardRep = new View(parent.getContext());
                } else {
                    Context context4 = parent.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    legoBoardRep = new b01.o(context4, (nx.d0) obj);
                }
                return new kz0.k((kz0.m) this.f135567g, legoBoardRep);
            default:
                Intrinsics.checkNotNullParameter(parent, "parent");
                InspirationalBadgeTextView inspirationalBadgeTextView = new InspirationalBadgeTextView(new m.e(parent.getContext(), eo1.f.LegoText_WithPadding_Bold_Size100));
                Context context5 = inspirationalBadgeTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                if (pk.a0.q0(context5)) {
                    Context context6 = inspirationalBadgeTextView.getContext();
                    int i15 = eo1.b.color_themed_light_gray;
                    Object obj2 = d5.a.f53679a;
                    inspirationalBadgeTextView.b(context6.getColor(i15));
                } else {
                    inspirationalBadgeTextView.a((String) obj);
                }
                inspirationalBadgeTextView.setMinimumHeight(bs1.c.W(parent, zb2.b.inspirational_badge_height));
                return new cf1.a(inspirationalBadgeTextView, (View.OnClickListener) this.f135567g);
        }
    }

    public v(List badges, String str, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f135565e = badges;
        this.f135566f = str;
        this.f135567g = onClickListener;
    }

    public v(kz0.m mVar, List objects, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(objects, "objects");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f135567g = mVar;
        this.f135565e = objects;
        this.f135566f = pinalytics;
    }
}

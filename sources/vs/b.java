package vs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y2;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b1;
import com.pinterest.api.model.ec;
import com.pinterest.api.model.f1;
import com.pinterest.api.model.js;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.create.collaboratorview.view.BoardCreateCollaboratorView;
import com.pinterest.feature.shopping.verifiedmerchant.inspirationalbadges.view.InspirationalBadgeTextView;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.GlideWebImageView;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kh2.u2;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import lq0.x0;
import lq0.y0;
import qa2.s1;

/* loaded from: classes3.dex */
public final class b extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126469d = 1;

    /* renamed from: e, reason: collision with root package name */
    public Object f126470e;

    /* renamed from: f, reason: collision with root package name */
    public Object f126471f;

    public b() {
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        switch (this.f126469d) {
            case 1:
                b1 b1Var = (b1) this.f126470e;
                List i13 = b1Var != null ? b1Var.i() : null;
                if (i13 == null) {
                    i13 = q0.f80391a;
                }
                break;
        }
        return ((List) this.f126470e).size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        List i14;
        f1 f1Var;
        ec ecVar;
        Object obj;
        String c13;
        int i15 = 1;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        String str = null;
        switch (this.f126469d) {
            case 0:
                a viewHolder = (a) y2Var;
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                pk.a0.p(viewHolder.f126466u, (String) ((Pair) ((List) this.f126470e).get(i13)).f80346a);
                pk.a0.p(viewHolder.f126467v, (String) ((Pair) ((List) this.f126470e).get(i13)).f80347b);
                ((GestaltIconButton) viewHolder.f19717a.findViewById(ps.p.copy)).u(new uq.u(viewHolder, this, i13, z13 ? 1 : 0));
                return;
            case 1:
                ys.a holder = (ys.a) y2Var;
                Intrinsics.checkNotNullParameter(holder, "holder");
                b1 b1Var = (b1) this.f126470e;
                u50.r rVar = (u50.r) this.f126471f;
                if (b1Var == null || (i14 = b1Var.i()) == null || (f1Var = (f1) i14.get(i13)) == null) {
                    return;
                }
                String k13 = f1Var.k();
                if (k13 == null) {
                    k13 = "";
                }
                pk.a0.p(holder.f140107u, k13);
                List i16 = f1Var.i();
                if (i16 != null) {
                    Iterator it = i16.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((ec) obj).f() == ec.a.PICKUP) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ecVar = (ec) obj;
                } else {
                    ecVar = null;
                }
                View view = holder.f19717a;
                GestaltText gestaltText = holder.f140108v;
                if (ecVar != null) {
                    String e13 = ecVar.e();
                    if (e13 == null) {
                        e13 = view.getResources().getString(ps.s.fullfilment_option_pickup);
                    }
                    Intrinsics.f(e13);
                    pk.a0.p(gestaltText, e13);
                } else {
                    pk.a0.k0(gestaltText);
                }
                Double m13 = f1Var.m();
                if (!(!(m13.doubleValue() == 0.0d))) {
                    m13 = null;
                }
                if (m13 != null) {
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                    currencyInstance.setMaximumFractionDigits(2);
                    currencyInstance.setCurrency(Currency.getInstance(f1Var.l()));
                    str = currencyInstance.format(m13.doubleValue());
                }
                GestaltText gestaltText2 = holder.f140109w;
                if (str != null) {
                    pk.a0.p(gestaltText2, str);
                } else {
                    gestaltText2.setVisibility(4);
                }
                e0.t.g(holder.f140110x, new hs.a(5, holder, f1Var));
                view.setOnClickListener(new xo.u((Object) rVar, (Object) b1Var, i13, (int) (z14 ? 1 : 0)));
                return;
            case 2:
                ak0.d holder2 = (ak0.d) y2Var;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                TypeAheadItem user = (TypeAheadItem) ((List) this.f126470e).get(i13);
                h91.a selectedContacts = (h91.a) this.f126471f;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
                BoardCreateCollaboratorView boardCreateCollaboratorView = holder2.f15463u;
                boardCreateCollaboratorView.getClass();
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
                String n13 = user.n();
                Intrinsics.checkNotNullExpressionValue(n13, "getTitle(...)");
                pk.a0.p(boardCreateCollaboratorView.f45153b, n13);
                pk.a0.p(boardCreateCollaboratorView.f45154c, a.a.j("@", user.k()));
                String l13 = user.l();
                if (l13 != null) {
                    boardCreateCollaboratorView.f45152a.H2(new xo.t(l13, user, i15));
                }
                boardCreateCollaboratorView.f45156e = user;
                bp.j jVar = new bp.j(20, boardCreateCollaboratorView, selectedContacts);
                GestaltButtonToggle gestaltButtonToggle = boardCreateCollaboratorView.f45155d;
                u2.x(gestaltButtonToggle.t(jVar), ak0.c.f15462i);
                if (selectedContacts.f68312a.values().contains(user)) {
                    u2.x(gestaltButtonToggle, new jc0.m(z15 ? 1 : 0, 7));
                    return;
                }
                return;
            case 3:
                x0 holder3 = (x0) y2Var;
                Intrinsics.checkNotNullParameter(holder3, "holder");
                v7 boardInput = (v7) ((List) this.f126470e).get(i13);
                Intrinsics.checkNotNullParameter(boardInput, "board");
                y0 y0Var = holder3.f84453u;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(boardInput, "boardInput");
                y0Var.f84460d = boardInput;
                if (boardInput == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                String b13 = boardInput.b1();
                if (b13 == null || b13.length() == 0) {
                    v7 v7Var = y0Var.f84460d;
                    if (v7Var == null) {
                        Intrinsics.r("board");
                        throw null;
                    }
                    c13 = v7Var.c1();
                } else {
                    v7 v7Var2 = y0Var.f84460d;
                    if (v7Var2 == null) {
                        Intrinsics.r("board");
                        throw null;
                    }
                    c13 = v7Var2.b1();
                }
                GlideWebImageView glideWebImageView = y0Var.f84458b;
                glideWebImageView.loadUrl(c13);
                glideWebImageView.setVisibility(0);
                y0Var.setOnClickListener(new lj0.a(y0Var, 19));
                v7 v7Var3 = y0Var.f84460d;
                if (v7Var3 != null) {
                    y0Var.f84459c.setText(v7Var3.j1());
                    return;
                } else {
                    Intrinsics.r("board");
                    throw null;
                }
            default:
                cf1.c holder4 = (cf1.c) y2Var;
                Intrinsics.checkNotNullParameter(holder4, "holder");
                js jsVar = (js) ((List) this.f126470e).get(i13);
                InspirationalBadgeTextView inspirationalBadgeTextView = holder4.f27645u;
                String text = jsVar.e();
                Intrinsics.checkNotNullExpressionValue(text, "getLabel(...)");
                inspirationalBadgeTextView.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                pk.a0.p(inspirationalBadgeTextView.f48534a, text);
                InspirationalBadgeTextView inspirationalBadgeTextView2 = holder4.f27645u;
                Context context = inspirationalBadgeTextView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (pk.a0.q0(context)) {
                    Context context2 = inspirationalBadgeTextView2.getContext();
                    int i17 = zb2.a.profile_inspiration_badge_background_explainer;
                    Object obj2 = d5.a.f53679a;
                    inspirationalBadgeTextView2.b(context2.getColor(i17));
                } else {
                    inspirationalBadgeTextView2.a((String) this.f126471f);
                }
                String d2 = jsVar.d();
                Intrinsics.checkNotNullExpressionValue(d2, "getDescription(...)");
                pk.a0.p(holder4.f27646v, d2);
                return;
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView viewGroup, int i13) {
        switch (this.f126469d) {
            case 0:
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(ps.q.ads_debug_info_item, (ViewGroup) viewGroup, false);
                Intrinsics.f(inflate);
                return new a(inflate);
            case 1:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(ps.q.ads_carting_retailer_item, (ViewGroup) viewGroup, false);
                Intrinsics.f(inflate2);
                return new ys.a(inflate2);
            case 2:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new ak0.d(new BoardCreateCollaboratorView(bs1.c.k0(context)));
            case 3:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context2 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new x0(new y0(context2, (g70.h) this.f126471f));
            default:
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Context context3 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                View view = LayoutInflater.from(bs1.c.k0(context3)).inflate(zb2.d.modal_verified_merchant_badge_item, (ViewGroup) viewGroup, false);
                Intrinsics.f(view);
                Intrinsics.checkNotNullParameter(view, "view");
                cf1.c cVar = new cf1.c(view);
                View findViewById = view.findViewById(zb2.c.badge_modal_item_label);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                cVar.f27645u = (InspirationalBadgeTextView) findViewById;
                View findViewById2 = view.findViewById(zb2.c.badge_modal_item_description);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                cVar.f27646v = (GestaltText) findViewById2;
                return cVar;
        }
    }

    public b(ArrayList dataSet, i92.k toastUtils) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f126470e = dataSet;
        this.f126471f = toastUtils;
    }

    public b(List boards, g70.h boardNavigator) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f126470e = boards;
        this.f126471f = boardNavigator;
    }

    public b(List contacts, h91.a selectedContacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        this.f126470e = contacts;
        this.f126471f = selectedContacts;
    }

    public b(List badges, String str) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f126470e = badges;
        this.f126471f = str;
    }
}

package hl0;

import a.cb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.boardpreview.view.ShareBoardUpsellView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.x;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.report.library.model.ReportData;
import df.j1;
import dl1.s0;
import h32.d4;
import h32.f1;
import h32.i0;
import h32.u0;
import i32.b1;
import i32.y0;
import i32.z0;
import j1.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kl0.z;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m60.w;
import m60.x0;
import nx.f0;
import pk.a0;
import qa2.h0;
import rg0.m0;
import wt1.c0;
import wt1.y;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f69462j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(v vVar, int i13) {
        super(1);
        this.f69461i = i13;
        this.f69462j = vVar;
    }

    public final void b(Throwable it) {
        int i13 = this.f69461i;
        v vVar = this.f69462j;
        switch (i13) {
            case 8:
                vVar.N3();
                break;
            case 9:
                vVar.f69541q.i(((yk1.a) vVar.f69546u).f139224a.getString(x0.generic_error));
                break;
            case 10:
                vVar.f69541q.i(((yk1.a) vVar.f69546u).f139224a.getString(x0.generic_error));
                break;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                vVar.W = false;
                vVar.f69541q.i(((yk1.a) vVar.f69546u).f139224a.getString(x0.generic_error));
                break;
            default:
                yk1.v vVar2 = vVar.f69546u;
                oo1.j.r(((yk1.a) vVar2).f139224a.getString(x0.pinmarklet_generic_error), it);
                vVar.W = false;
                break;
        }
    }

    public final void e(c0 c0Var) {
        Iterable feedItems;
        String str;
        List y13;
        f30 f30Var;
        int i13 = this.f69461i;
        v vVar = this.f69462j;
        switch (i13) {
            case 4:
                tl1.i iVar = c0Var.f131096b;
                wt1.o oVar = iVar instanceof wt1.o ? (wt1.o) iVar : null;
                if (oVar == null || (feedItems = oVar.f131124b) == null) {
                    feedItems = q0.f80391a;
                }
                if (vVar.f69515d) {
                    bl0.a aVar = vVar.Q;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(feedItems, "feedItems");
                    Iterator it = feedItems.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dl1.s sVar = (dl1.s) it.next();
                            if (sVar instanceof f30) {
                                str = ((f30) sVar).getUid();
                            } else {
                                if (sVar instanceof ba) {
                                    ba baVar = (ba) sVar;
                                    Integer x13 = baVar.x();
                                    Intrinsics.checkNotNullExpressionValue(x13, "getPinCount(...)");
                                    if (x13.intValue() > 0 && (y13 = baVar.y()) != null && (f30Var = (f30) CollectionsKt.firstOrNull(y13)) != null) {
                                        str = f30Var.getUid();
                                    }
                                }
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                aVar.f23477a.g(f1.SEO_LANDING_PAGE_VIEW, null, ep.b.o("first_pin_id", str), false);
                            }
                        }
                    }
                }
                vVar.J3();
                vVar.n4();
                break;
            default:
                if (c0Var instanceof wt1.p) {
                    if (vVar.G.G.isSelectAllBackendToggled()) {
                        tl1.i iVar2 = c0Var.f131096b;
                        wt1.o oVar2 = iVar2 instanceof wt1.o ? (wt1.o) iVar2 : null;
                        List list = oVar2 != null ? oVar2.f131124b : null;
                        if (list != null) {
                            ArrayList newPins = new ArrayList();
                            for (Object obj : list) {
                                if (obj instanceof f30) {
                                    newPins.add(obj);
                                }
                            }
                            rk0.j jVar = vVar.G;
                            jVar.getClass();
                            Intrinsics.checkNotNullParameter(newPins, "newPins");
                            jVar.E.addAll(newPins);
                            jVar.n();
                            break;
                        }
                    }
                } else if (c0Var instanceof y) {
                    vVar.J3();
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.pinterest.feature.board.detail.a aVar;
        d4 d4Var;
        x xVar;
        y0 y0Var;
        rg0.n experienceValue;
        int i13;
        ur0.e g13;
        View view;
        View view2;
        View D;
        Drawable drawable;
        ur0.e g14;
        Context context;
        com.pinterest.feature.board.detail.a aVar2;
        int i14;
        View rootView;
        int i15 = this.f69461i;
        v vVar = this.f69462j;
        switch (i15) {
            case 0:
                cl0.a option = (cl0.a) obj;
                Intrinsics.checkNotNullParameter(option, "option");
                com.pinterest.feature.board.detail.a aVar3 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                if (aVar3 != null) {
                    ((z) aVar3).x2();
                }
                int i16 = d.f69460a[option.ordinal()];
                String str = vVar.f69509a;
                w wVar = vVar.P;
                switch (i16) {
                    case 1:
                        wVar.d(Navigation.z0((ScreenLocation) com.pinterest.screens.q.f51212b.getValue(), str));
                        break;
                    case 2:
                        vVar.j4();
                        break;
                    case 3:
                        vVar.j4();
                        break;
                    case 4:
                        vVar.X = false;
                        NavigationImpl z03 = Navigation.z0((ScreenLocation) com.pinterest.screens.q.f51215e.getValue(), str);
                        z03.z(com.pinterest.feature.board.organize.f.BOARD_ORGANIZE_MODE_MERGE.ordinal(), "com.pinterest.EXTRA_BOARD_ORGANIZE_MODE");
                        wVar.d(z03);
                        break;
                    case 5:
                        vVar.T3();
                        break;
                    case 6:
                        vVar.getPinalytics().X(u0.UNARCHIVE_BOARD_BUTTON);
                        v7 v7Var = vVar.K;
                        if (v7Var != null && (aVar = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound()) != null) {
                            String boardName = v7Var.j1();
                            Intrinsics.checkNotNullExpressionValue(boardName, "getName(...)");
                            z zVar = (z) aVar;
                            Intrinsics.checkNotNullParameter(boardName, "boardName");
                            Context requireContext = zVar.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            String string = zVar.getResources().getString(y60.e.unarchive_board_message);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            SpannableStringBuilder D2 = f0.h.D(requireContext, string, boardName);
                            String string2 = zVar.getString(y60.e.unarchive_board_title);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            String string3 = zVar.getString(d70.g.unarchive_confirm);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            yb0.n l93 = zVar.l9(string2, D2, string3);
                            l93.f138513j = new kl0.d(zVar, 9);
                            cb.x(l93, zVar.f7());
                            break;
                        }
                        break;
                    case 7:
                        v.u3(vVar);
                        break;
                    case 8:
                        v.u3(vVar);
                        break;
                    case 9:
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) com.pinterest.screens.q.f51219i.getValue());
                        i0 p13 = vVar.getPinalytics().p();
                        v7 v7Var2 = vVar.K;
                        String uid = v7Var2 != null ? v7Var2.getUid() : null;
                        if (uid == null) {
                            uid = "";
                        }
                        String name = (p13 == null || (d4Var = p13.f67081a) == null) ? null : d4Var.name();
                        w13.w0(new ReportData.BoardReportData(uid, name != null ? name : "", "REPORT_BOARD"), "com.pinterest.EXTRA_REPORT_DATA");
                        wVar.d(w13);
                        break;
                }
                return Unit.f80348a;
            case 1:
                Boolean bool = (Boolean) obj;
                xu1.f fVar = vVar.R;
                Intrinsics.f(bool);
                fVar.a(bool.booleanValue());
                return Unit.f80348a;
            case 2:
                if (vVar.isBound()) {
                    super/*wk1.q*/.onRecyclerRefresh();
                }
                return Unit.f80348a;
            case 3:
                x02.z zVar2 = (x02.z) obj;
                x xVar2 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                if (xVar2 != null) {
                    ((nl1.d) xVar2).Y6(i.f69468m);
                }
                if (Intrinsics.d(zVar2.f131541a.getUid(), vVar.f69509a)) {
                    vVar.M.dispose();
                }
                return Unit.f80348a;
            case 4:
                e((c0) obj);
                return Unit.f80348a;
            case 5:
                e((c0) obj);
                return Unit.f80348a;
            case 6:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                jl0.b bVar = vVar.f69537o;
                v7 v7Var3 = (v7) it.f55286b;
                bVar.getClass();
                return Boolean.valueOf(jl0.b.b(vVar.f69509a, v7Var3));
            case 7:
                s0 s0Var = (s0) obj;
                vVar.O = vVar.f69533m.t();
                int i17 = r.f69495a[s0Var.f55285a.ordinal()];
                if (i17 == 1) {
                    v7 v7Var4 = (v7) s0Var.f55286b;
                    if (vVar.isBound()) {
                        vVar.s4(v7Var4);
                    }
                } else if (i17 == 2 && (xVar = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound()) != null) {
                    ((nl1.d) xVar).Y6(i.f69474s);
                }
                return Unit.f80348a;
            case 8:
                b((Throwable) obj);
                return Unit.f80348a;
            case 9:
                b((Throwable) obj);
                return Unit.f80348a;
            case 10:
                b((Throwable) obj);
                return Unit.f80348a;
            case 11:
                b((Throwable) obj);
                return Unit.f80348a;
            case 12:
                if (vVar.isBound() && (experienceValue = ((dh0.d) vVar.f69544s).c((y0Var = y0.ANDROID_BOARD_TAKEOVER))) != null) {
                    com.pinterest.feature.board.detail.d.f45198a.getClass();
                    List list = com.pinterest.feature.board.detail.c.f45185b;
                    int i18 = experienceValue.f108060b;
                    if (list.contains(Integer.valueOf(i18))) {
                        com.pinterest.feature.board.detail.a aVar4 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                        if (aVar4 != null) {
                            z zVar3 = (z) aVar4;
                            Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
                            View view3 = zVar3.getView();
                            ViewGroup viewGroup = (view3 == null || (rootView = view3.getRootView()) == null) ? null : (ViewGroup) rootView.findViewById(y60.c.board_detail_view_container);
                            if (viewGroup == null) {
                                i14 = i18;
                            } else {
                                Context requireContext2 = zVar3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                                ViewGroup viewGroup2 = viewGroup;
                                i14 = i18;
                                hk0.j jVar = new hk0.j(requireContext2, viewGroup, experienceValue, zVar3.n9(), zVar3.s7(), new kl0.v(zVar3, 0), new kl0.v(zVar3, 1));
                                zVar3.f80149r1 = jVar;
                                zVar3.f80147p1 = jVar.h();
                                Resources resources = zVar3.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                int L = a0.L(resources, 8.0f);
                                int i19 = hf0.b.f69004d;
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((((hf0.b.f69002b - ((i19 + 1) * L)) * 2) / i19) - L, -2);
                                layoutParams.gravity = 81;
                                View view4 = zVar3.f80147p1;
                                if (view4 != null) {
                                    viewGroup2.addView(view4, layoutParams);
                                }
                            }
                            i13 = i14;
                        } else {
                            i13 = i18;
                        }
                    } else {
                        i13 = i18;
                        int i23 = 6;
                        if (kh2.s0.B0(i13)) {
                            com.pinterest.feature.board.detail.a aVar5 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                            if (aVar5 != null) {
                                z zVar4 = (z) aVar5;
                                Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
                                if (zVar4.f80148q1 == null && (context = zVar4.getContext()) != null) {
                                    ag2.e eVar = experienceValue.f108068j;
                                    m0 m0Var = eVar instanceof m0 ? (m0) eVar : null;
                                    if (m0Var != null) {
                                        nx.d dVar = new nx.d();
                                        dVar.put("board_id", zVar4.n9());
                                        com.pinterest.feature.board.detail.b bVar2 = zVar4.f80145n1;
                                        bs1.c.G1("board_session_id", bVar2 != null ? ((v) bVar2).f69511b : null, dVar);
                                        bs1.c.G1("destination_board_id", m0Var.f108058f, dVar);
                                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = bs1.c.X(zVar4, eo1.c.space_200);
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = bs1.c.X(zVar4, eo1.c.space_200);
                                        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = bs1.c.X(zVar4, eo1.c.space_1400);
                                        layoutParams2.f17677l = 0;
                                        ShareBoardUpsellView shareBoardUpsellView = new ShareBoardUpsellView(i23, context, (AttributeSet) null);
                                        shareBoardUpsellView.x(m0Var);
                                        shareBoardUpsellView.L(new v0(zVar4, shareBoardUpsellView, experienceValue, dVar, 8));
                                        shareBoardUpsellView.D(new q4.h(zVar4, shareBoardUpsellView, experienceValue, dVar, m0Var, 4));
                                        ConstraintLayout constraintLayout = zVar4.S1;
                                        if (constraintLayout == null) {
                                            Intrinsics.r("boardContainer");
                                            throw null;
                                        }
                                        constraintLayout.addView(shareBoardUpsellView, layoutParams2);
                                        zVar4.f80148q1 = shareBoardUpsellView;
                                        experienceValue.i(dVar);
                                    }
                                }
                            }
                        } else {
                            i32.l lVar = i32.l.ANDROID_HIDE_BOARD_FOLLOW;
                            if (i13 == lVar.getValue()) {
                                v7 v7Var5 = vVar.K;
                                if (v7Var5 != null && !kh2.w.i0(v7Var5)) {
                                    wy0 f13 = ((b60.d) vVar.f69535n).f();
                                    if ((f13 != null ? f13.P2() : 0).intValue() > 0) {
                                        com.pinterest.feature.board.detail.a aVar6 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                        if (aVar6 != null) {
                                            z zVar5 = (z) aVar6;
                                            if (zVar5.f80151t1 != null) {
                                                zVar5.p9();
                                                zf0.f.a(zVar5.f80151t1);
                                            }
                                            g14 = ur0.g.g(y0Var, zVar5, null);
                                            zVar5.f80151t1 = g14;
                                        }
                                        com.pinterest.feature.board.detail.a aVar7 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                        if (aVar7 != null) {
                                            z.x9((z) aVar7, lVar, 6000L);
                                        }
                                    }
                                }
                            } else {
                                i32.l lVar2 = i32.l.ANDROID_GROUP_BOARD_REACTION_MIGRATION_MODAL;
                                if (i13 == lVar2.getValue()) {
                                    com.pinterest.feature.board.detail.a aVar8 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                    if (aVar8 != null) {
                                        z zVar6 = (z) aVar8;
                                        rg0.n b13 = j1.D0(y0Var, lVar2) ? ((dh0.d) zVar6.p9().f141904a).b(y0Var) : null;
                                        if (b13 != null) {
                                            Drawable drawable2 = zVar6.getResources().getDrawable(y60.b.ic_circle_with_heart_nonpds, zVar6.requireContext().getTheme());
                                            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                            Intrinsics.checkNotNullExpressionValue(drawable2, "apply(...)");
                                            LayerDrawable layerDrawable = (LayerDrawable) drawable2;
                                            layerDrawable.findDrawableByLayerId(y60.c.heart).setTint(zVar6.getResources().getColor(eo1.b.color_black_900, zVar6.requireContext().getTheme()));
                                            layerDrawable.findDrawableByLayerId(y60.c.circle).setTint(zVar6.getResources().getColor(eo1.b.color_gray_100, zVar6.requireContext().getTheme()));
                                            Drawable drawable3 = zVar6.getResources().getDrawable(y60.b.ic_circle_with_star_nonpds, zVar6.requireContext().getTheme());
                                            drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
                                            Intrinsics.checkNotNullExpressionValue(drawable3, "apply(...)");
                                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable3;
                                            layerDrawable2.findDrawableByLayerId(y60.c.circle).setTint(zVar6.getResources().getColor(eo1.b.color_gray_100, zVar6.requireContext().getTheme()));
                                            layerDrawable2.findDrawableByLayerId(y60.c.star).setTint(zVar6.getResources().getColor(eo1.b.color_black_900, zVar6.requireContext().getTheme()));
                                            SpannableString spannableString = new SpannableString(zVar6.getString(y60.e.group_board_reaction_migration_title));
                                            ImageSpan imageSpan = new ImageSpan(drawable2, 0);
                                            ImageSpan imageSpan2 = new ImageSpan(drawable3, 0);
                                            int L2 = StringsKt.L(spannableString, "%1$s", 0, false, 6);
                                            int L3 = StringsKt.L(spannableString, "%2$s", 0, false, 6);
                                            if (L3 < 0 || L2 < 0) {
                                                spannableString = null;
                                            } else {
                                                spannableString.setSpan(imageSpan, L2, L2 + 4, 17);
                                                spannableString.setSpan(imageSpan2, L3, L3 + 4, 17);
                                            }
                                            Intrinsics.checkNotNullExpressionValue(zVar6.requireContext(), "requireContext(...)");
                                            Context context2 = zVar6.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(context2, "requireContext(...)");
                                            int i24 = m60.s0.ic_pad_star_nonpds;
                                            int i25 = eo1.b.color_themed_icon_default;
                                            Intrinsics.checkNotNullParameter(context2, "context");
                                            Object obj2 = d5.a.f53679a;
                                            Drawable drawable4 = context2.getDrawable(i24);
                                            Intrinsics.checkNotNullParameter(context2, "context");
                                            if (drawable4 != null) {
                                                int color = i25 == 0 ? context2.getColor(df0.a.f54892a) : context2.getColor(i25);
                                                Intrinsics.checkNotNullParameter(context2, "context");
                                                if (color == 0) {
                                                    color = context2.getColor(df0.a.f54892a);
                                                }
                                                drawable = drawable4.mutate();
                                                drawable.setTint(color);
                                            } else {
                                                drawable = null;
                                            }
                                            Intrinsics.f(drawable);
                                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                            String string4 = zVar6.getString(y60.e.group_board_reaction_migration_subtitle);
                                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                            SpannableString M = f0.h.M(drawable, string4);
                                            if (spannableString != null) {
                                                Context requireContext3 = zVar6.requireContext();
                                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                                yb0.n nVar = new yb0.n(requireContext3);
                                                nVar.w(spannableString);
                                                nVar.u(M);
                                                String string5 = zVar6.getString(x0.got_it_simple);
                                                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                                                nVar.m(string5);
                                                kh2.r.r(nVar.h(), fm1.c.GONE);
                                                nVar.setFocusable(true);
                                                nVar.setFocusableInTouchMode(true);
                                                nVar.requestFocus();
                                                nVar.f138514k = new xa0.m(6, zVar6, b13);
                                                zVar6.f7().d(new yb0.e(nVar));
                                                b13.g();
                                            }
                                        }
                                    }
                                } else if (i13 == i32.l.ANDROID_BOARD_SHOP_TOOL_TOOLTIP.getValue()) {
                                    com.pinterest.feature.board.detail.a aVar9 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                    if (aVar9 != null) {
                                        z zVar7 = (z) aVar9;
                                        if (zVar7.f80151t1 != null) {
                                            zVar7.p9();
                                            zf0.f.a(zVar7.f80151t1);
                                        }
                                        FloatingToolbarView floatingToolbarView = zVar7.P1;
                                        if (floatingToolbarView == null) {
                                            Intrinsics.r("bottomFloatingToolbarCard");
                                            throw null;
                                        }
                                        zVar7.f80151t1 = ur0.g.g(y0Var, zVar7, floatingToolbarView.D(sk0.c.SHOP));
                                    }
                                } else {
                                    ag2.e eVar2 = experienceValue.f108068j;
                                    if (eVar2 == null || !(eVar2 instanceof eg0.e)) {
                                        com.pinterest.feature.board.detail.a aVar10 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                        if (aVar10 != null) {
                                            z zVar8 = (z) aVar10;
                                            if (zVar8.f80151t1 != null) {
                                                zVar8.p9();
                                                zf0.f.a(zVar8.f80151t1);
                                            }
                                            g13 = ur0.g.g(y0Var, zVar8, null);
                                            zVar8.f80151t1 = g13;
                                        }
                                    } else {
                                        com.pinterest.feature.board.detail.a aVar11 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                        if (aVar11 != null) {
                                            z zVar9 = (z) aVar11;
                                            Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
                                            ag2.e eVar3 = experienceValue.f108068j;
                                            eg0.e eVar4 = eVar3 instanceof eg0.e ? (eg0.e) eVar3 : null;
                                            if (eVar4 != null) {
                                                b1.Companion.getClass();
                                                b1 a13 = z0.a(eVar4.f58899e);
                                                int i26 = a13 != null ? kl0.f.f80078b[a13.ordinal()] : -1;
                                                if (i26 == 1) {
                                                    view = null;
                                                    view2 = zVar9.E1;
                                                    if (view2 == null) {
                                                        Intrinsics.r("overflowButton");
                                                        throw null;
                                                    }
                                                } else if (i26 != 2) {
                                                    if (i26 == 3) {
                                                        view = null;
                                                        FloatingToolbarView floatingToolbarView2 = zVar9.P1;
                                                        if (floatingToolbarView2 == null) {
                                                            Intrinsics.r("bottomFloatingToolbarCard");
                                                            throw null;
                                                        }
                                                        D = floatingToolbarView2.D(sk0.c.ORGANIZE);
                                                    } else if (i26 != 4) {
                                                        if (i26 != 5) {
                                                            view2 = null;
                                                        } else {
                                                            FloatingToolbarView floatingToolbarView3 = zVar9.P1;
                                                            if (floatingToolbarView3 == null) {
                                                                Intrinsics.r("bottomFloatingToolbarCard");
                                                                throw null;
                                                            }
                                                            view2 = floatingToolbarView3.D(sk0.c.ADD);
                                                        }
                                                        view = null;
                                                    } else {
                                                        view = null;
                                                        FloatingToolbarView floatingToolbarView4 = zVar9.P1;
                                                        if (floatingToolbarView4 == null) {
                                                            Intrinsics.r("bottomFloatingToolbarCard");
                                                            throw null;
                                                        }
                                                        D = floatingToolbarView4.D(sk0.c.MORE_IDEAS);
                                                    }
                                                    view2 = D;
                                                } else {
                                                    view = null;
                                                    view2 = zVar9.F1;
                                                    if (view2 == null) {
                                                        Intrinsics.r("shareButton");
                                                        throw null;
                                                    }
                                                }
                                                if (view2 != null) {
                                                    kg.a.X(experienceValue, y0Var, new WeakReference(zVar9), view, view2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i32.l lVar3 = i32.l.ANDROID_ORGANIZE_BOARD_PINS_TOOLTIP;
                    if (i13 == lVar3.getValue()) {
                        com.pinterest.feature.board.detail.a aVar12 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                        if (aVar12 != null) {
                            z.x9((z) aVar12, lVar3, 5000L);
                        }
                    } else {
                        i32.l lVar4 = i32.l.ANDROID_BOARD_PERMISSIONS_TOOLTIP;
                        if (i13 == lVar4.getValue()) {
                            com.pinterest.feature.board.detail.a aVar13 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                            if (aVar13 != null) {
                                z.x9((z) aVar13, lVar4, 5000L);
                            }
                        } else if (i13 == i32.l.ANDROID_BOARD_FAVORITE_BUTTON_TOOLTIP.getValue()) {
                            com.pinterest.feature.board.detail.a aVar14 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                            if (aVar14 != null) {
                                z zVar10 = (z) aVar14;
                                h0 r93 = zVar10.r9();
                                if (r93 != null) {
                                    zVar10.y9(r93);
                                } else {
                                    zVar10.addScrollListener(zVar10.X1);
                                }
                            }
                        } else {
                            i32.l lVar5 = i32.l.ANDROID_SG_BOARD_VIEW_EDUCATION_UPSELL;
                            if (i13 == lVar5.getValue()) {
                                com.pinterest.feature.board.detail.a aVar15 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                                if (aVar15 != null) {
                                    z zVar11 = (z) aVar15;
                                    v7 a14 = ew.a(zVar11.n9());
                                    rg0.n b14 = j1.D0(y0Var, lVar5) ? ((dh0.d) zVar11.p9().f141904a).b(y0Var) : null;
                                    if (b14 != null && a14 != null) {
                                        w f73 = zVar11.f7();
                                        f0 f0Var = zVar11.Y0;
                                        if (f0Var == null) {
                                            Intrinsics.r("pinalyticsFactory");
                                            throw null;
                                        }
                                        f73.d(new jc0.v(new zp.l(a14, f0Var), false, 0L, 30));
                                        b14.g();
                                        zp.m.a(a14);
                                    }
                                }
                            } else {
                                i32.l lVar6 = i32.l.ANDROID_BOARD_PREVIEW_SHARE_SIMPLE_TOOLTIP;
                                if (i13 == lVar6.getValue() && (aVar2 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound()) != null) {
                                    z zVar12 = (z) aVar2;
                                    GestaltIconButton gestaltIconButton = zVar12.F1;
                                    if (gestaltIconButton == null) {
                                        Intrinsics.r("shareButton");
                                        throw null;
                                    }
                                    ur0.e r13 = ur0.g.g(y0Var, zVar12, gestaltIconButton);
                                    zVar12.f80151t1 = r13;
                                    if (r13 != null) {
                                        zVar12.p9();
                                        Intrinsics.checkNotNullParameter(r13, "r");
                                        new Handler(Looper.getMainLooper()).post(r13);
                                    }
                                    z.x9(zVar12, lVar6, 5000L);
                                }
                            }
                        }
                    }
                }
                return Unit.f80348a;
            case 13:
                oo1.j.s(vVar.P, null, (z40.n) obj);
                vVar.W = false;
                return Unit.f80348a;
            default:
                b((Throwable) obj);
                return Unit.f80348a;
        }
    }
}

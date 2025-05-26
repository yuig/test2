package jh0;

import an0.q;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.q0;
import bp.j;
import co2.y;
import co2.z;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.adscarousel.view.AdsCarouselContainerViewCreator;
import com.pinterest.feature.board.common.newideas.view.BoardMoreIdeasHeaderView;
import com.pinterest.feature.board.common.newideas.view.MoreIdeasBoardNameTextView;
import com.pinterest.feature.board.create.namingview.view.BoardCreateBoardNameSuggestionCell;
import com.pinterest.feature.board.detail.header.view.lego.LegoBoardDetailHeader;
import com.pinterest.feature.board.detail.moreboardsview.BoardMoreBoardsView;
import com.pinterest.feature.board.organize.view.BoardAndSectionOrganizeCell;
import com.pinterest.feature.browser.view.InAppBrowserFragment;
import com.pinterest.feature.browser.view.InAppBrowserView;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import com.pinterest.feature.pin.create.view.CreateBoardSectionCell;
import com.pinterest.feature.qcm.analytics.AdsQcmAnalytics$QcmItemClickPayload;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import com.pinterest.navigation.Navigation;
import h32.y3;
import hk0.l;
import ho0.i;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.s;
import lh0.a4;
import lh0.g1;
import lh0.t;
import lh0.z3;
import m60.w;
import pi0.f;
import pk.a0;
import so.n6;
import so.oa;
import tj0.k;
import un0.h;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f76213j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i13) {
        super(0);
        this.f76212i = i13;
        this.f76213j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f76212i;
        Object obj = this.f76213j;
        switch (i13) {
            case 1:
                return Boolean.valueOf(((hs.d) obj).b());
            case 8:
                t tVar = ((BoardMoreIdeasHeaderView) obj).f45134i;
                if (tVar == null) {
                    Intrinsics.r("experiments");
                    throw null;
                }
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) tVar.f83479a;
                return Boolean.valueOf(g1Var.o("hfp_secret_board_tabs_android", "enabled", z3Var) || g1Var.l("hfp_secret_board_tabs_android"));
            default:
                return Boolean.valueOf(Intrinsics.d(((LegoFloatingBottomActionBar) obj).f45455i, "ads"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 6;
        int i14 = this.f76212i;
        byte b13 = 0;
        int i15 = 1;
        byte b14 = 0;
        byte b15 = 0;
        byte b16 = 0;
        Object obj = this.f76213j;
        switch (i14) {
            case 0:
                m165invoke();
                return Unit.f80348a;
            case 1:
                return invoke();
            case 2:
                m165invoke();
                return Unit.f80348a;
            case 3:
                AdsCarouselContainerViewCreator adsCarouselContainerViewCreator = (AdsCarouselContainerViewCreator) obj;
                return new f(adsCarouselContainerViewCreator.getContext(), adsCarouselContainerViewCreator.getPinalytics(), adsCarouselContainerViewCreator.getScope(), (String) null, 24);
            case 4:
                m165invoke();
                return Unit.f80348a;
            case 5:
                return new cj0.e((cj0.f) obj, b13 == true ? 1 : 0);
            case 6:
                m165invoke();
                return Unit.f80348a;
            case 7:
                Context requireContext = ((tj0.d) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new BoardMoreIdeasHeaderView(i13, requireContext, (AttributeSet) (b14 == true ? 1 : 0));
            case 8:
                return invoke();
            case 9:
                k kVar = (k) obj;
                Context requireContext2 = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                MoreIdeasBoardNameTextView moreIdeasBoardNameTextView = new MoreIdeasBoardNameTextView(i13, requireContext2, (AttributeSet) (b15 == true ? 1 : 0));
                Navigation navigation = kVar.I;
                String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_BOARD_NAME") : null;
                if (v03 != null) {
                    a0.p(moreIdeasBoardNameTextView.f45136a, v03);
                }
                k3.R1(moreIdeasBoardNameTextView, v03 != null);
                return moreIdeasBoardNameTextView;
            case 10:
                return (GestaltSearchGuide) ((BoardCreateBoardNameSuggestionCell) obj).findViewById(x60.c.board_name_suggestion_text_view);
            case 11:
                switch (i14) {
                    case 11:
                        return com.bumptech.glide.d.Z((fk0.k) obj, "product_tag_parent_pin_id", "");
                    default:
                        xk xkVar = ((wo0.e) obj).E;
                        if (xkVar != null) {
                            return xkVar.n();
                        }
                        return null;
                }
            case 12:
                m165invoke();
                return Unit.f80348a;
            case 13:
                m165invoke();
                return Unit.f80348a;
            case 14:
                m165invoke();
                return Unit.f80348a;
            case 15:
                BoardMoreBoardsView boardMoreBoardsView = (BoardMoreBoardsView) obj;
                Context context = boardMoreBoardsView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                w wVar = boardMoreBoardsView.f45235d;
                if (wVar != null) {
                    return ph.a.w(context, wVar);
                }
                Intrinsics.r("eventManager");
                throw null;
            case 16:
                m165invoke();
                return Unit.f80348a;
            case 17:
                em0.d dVar = (em0.d) obj;
                Context requireContext3 = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                BoardAndSectionOrganizeCell boardAndSectionOrganizeCell = new BoardAndSectionOrganizeCell(i13, requireContext3, (AttributeSet) (b16 == true ? 1 : 0));
                boardAndSectionOrganizeCell.f45299d.u(new j(23, dVar, boardAndSectionOrganizeCell));
                return boardAndSectionOrganizeCell;
            case 18:
                y92.e eVar = ((um0.a) obj).f122680a;
                ar0.c cVar = new ar0.c();
                cVar.f20371c = -1;
                cVar.f20370b = eVar;
                return new q0(cVar);
            case 19:
                return (f30) ((v) obj).removeFirst();
            case 20:
                TextPaint textPaint = ((q) obj).f15689r;
                if (textPaint != null) {
                    return Float.valueOf(textPaint.getTextSize());
                }
                Intrinsics.r("textPaint");
                throw null;
            case 21:
                m165invoke();
                return Unit.f80348a;
            case 22:
                m165invoke();
                return Unit.f80348a;
            case 23:
                h hVar = (h) obj;
                String str = hVar.f122833a;
                wk1.c cVar2 = hVar.f122836d;
                return new jj0.c(str, hVar.f122843k, hVar.f122837e, new un0.a(hVar, 2), new oj0.h(hVar.getPresenterPinalytics(), hVar.f122852t, hVar.f122853u, hVar.f122851s, hVar.L, hVar.f122854v), hVar, hVar.F, a.a.p(new StringBuilder("board/sections/"), hVar.f122834b, "/ideas/feed/"), hVar.f122838f, ((n6) hVar.f122847o).a(hVar.getPresenterPinalytics(), hVar.P, cVar2.f130131b, cVar2.f130137h), cVar2.f130131b.f103320a, hVar.f122855w);
            case 24:
                ho0.k kVar2 = (ho0.k) obj;
                Context requireContext4 = kVar2.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                CreateBoardSectionCell createBoardSectionCell = new CreateBoardSectionCell(requireContext4);
                createBoardSectionCell.setOnClickListener(new i(kVar2, i15));
                return createBoardSectionCell;
            case 25:
                y3 y3Var = h32.a4.Companion;
                h32.a4 a4Var = h32.a4.BROWSER;
                int O = com.bumptech.glide.d.O((InAppBrowserFragment) obj, "com.pinterest.EXTRA_IN_APP_BROWSER_VIEW_PARAMETER_TYPE", a4Var.getValue());
                y3Var.getClass();
                h32.a4 a13 = y3.a(O);
                return a13 == null ? a4Var : a13;
            case 26:
                InAppBrowserView inAppBrowserView = (InAppBrowserView) obj;
                return new to0.w(new f0(), ViewConfiguration.get(inAppBrowserView.getContext()).getScaledTouchSlop(), inAppBrowserView);
            case 27:
                switch (i14) {
                    case 11:
                        return com.bumptech.glide.d.Z((fk0.k) obj, "product_tag_parent_pin_id", "");
                    default:
                        xk xkVar2 = ((wo0.e) obj).E;
                        if (xkVar2 != null) {
                            return xkVar2.n();
                        }
                        return null;
                }
            case 28:
                mp0.d dVar2 = (mp0.d) obj;
                a11.d dVar3 = dVar2.f87902g;
                if (dVar3 != null) {
                    return dVar3.a(dVar2.f87899d);
                }
                Intrinsics.r("clickthroughHelperFactory");
                throw null;
            default:
                return invoke();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m165invoke() {
        String string;
        int i13 = this.f76212i;
        Object obj = this.f76213j;
        switch (i13) {
            case 0:
                ((e) obj).f76214a.g();
                return;
            case 2:
                oi0.a aVar = (oi0.a) obj;
                l51.a aVar2 = aVar.f95302a;
                boolean z13 = aVar.f95304c;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter("STLV3_CLOSEUP_ITEM_CLICK", "eventName");
                if (aVar2.d()) {
                    wr.c.a(aVar2.f81587d, new AdsQcmAnalytics$QcmItemClickPayload("STLV3_CLOSEUP_ITEM_CLICK", z13), null, null, 14);
                }
                aVar.f95304c = false;
                return;
            case 4:
                super/*aj0.b*/.p3();
                return;
            case 6:
                pj0.s sVar = (pj0.s) obj;
                List list = pj0.s.f100264r;
                if (sVar.isBound()) {
                    ((nl1.d) ((mj0.c) sVar.getView())).D5();
                    return;
                }
                return;
            case 12:
                ((fk0.q) obj).D5();
                return;
            case 13:
                ((l) obj).k();
                return;
            case 14:
                mk0.e eVar = ((LegoBoardDetailHeader) obj).H;
                if (eVar != null) {
                    eVar.r3();
                    return;
                }
                return;
            case 16:
                dm0.d dVar = (dm0.d) obj;
                if (dVar.isBound()) {
                    dVar.f55340c.a();
                    wy0 f13 = ((b60.d) dVar.f55342e).f();
                    String uid = f13 != null ? f13.getUid() : null;
                    if (uid == null) {
                        uid = "";
                    }
                    pg0.d event = new pg0.d(uid);
                    uk2.f fVar = m22.a.f85712a;
                    Intrinsics.checkNotNullParameter(event, "event");
                    m22.a.f85712a.c(event);
                    com.pinterest.feature.board.organize.c cVar = (com.pinterest.feature.board.organize.c) dVar.getView();
                    bq.b newSortingOption = bq.b.CUSTOM;
                    boolean z14 = dVar.f55348k != newSortingOption;
                    em0.d dVar2 = (em0.d) cVar;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(newSortingOption, "newSortingOption");
                    String string2 = dVar2.getString(newSortingOption.getTitleId());
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    Context context = kb0.a.f79058b;
                    i92.k E2 = ((oa) ((j92.a) ep.b.g(j92.a.class))).E2();
                    if (z14) {
                        string = dVar2.getString(h70.c.board_reorder_confirmation, string2);
                    } else {
                        string = dVar2.getString(h70.c.board_reorder_changes_saved);
                    }
                    E2.m(string);
                    dVar.f55345h.d(new za.c(Navigation.w1((ScreenLocation) com.pinterest.screens.v.f51438a.getValue())));
                    return;
                }
                return;
            case 21:
                ((fn0.c) obj).f62608b.stop();
                return;
            default:
                bn0.c cVar2 = ((in0.f) obj).f72811c;
                if (cVar2 != null) {
                    z zVar = cVar2.f23565a;
                    if (zVar == null) {
                        Intrinsics.r("scope");
                        throw null;
                    }
                    if (dl2.b.x1(zVar)) {
                        z zVar2 = cVar2.f23565a;
                        if (zVar2 != null) {
                            ((y) zVar2).r(null);
                            return;
                        } else {
                            Intrinsics.r("scope");
                            throw null;
                        }
                    }
                    return;
                }
                Intrinsics.r("callback");
                throw null;
        }
    }
}

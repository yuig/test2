package pv0;

import android.content.Context;
import android.content.Intent;
import cn1.o;
import cn1.r;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.dr;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vx;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import com.pinterest.ui.imageview.WebImageView;
import dl1.t;
import h32.f1;
import h32.u0;
import i92.k;
import ja.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk2.e0;
import k22.m;
import kh2.g0;
import kh2.s0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.w;
import nv0.g;
import nv0.h;
import nv0.l;
import nv0.n;
import nx.d0;
import om0.m1;
import qv0.u;
import qz.f0;
import rq.y;
import wk1.i;
import wk1.q;
import wt1.c0;
import zp.j;

/* loaded from: classes5.dex */
public final class d extends q implements nv0.b, l, gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f101442a;

    /* renamed from: b, reason: collision with root package name */
    public final x f101443b;

    /* renamed from: c, reason: collision with root package name */
    public final ag1.b f101444c;

    /* renamed from: d, reason: collision with root package name */
    public final w f101445d;

    /* renamed from: e, reason: collision with root package name */
    public final k f101446e;

    /* renamed from: f, reason: collision with root package name */
    public final m f101447f;

    /* renamed from: g, reason: collision with root package name */
    public final e12.e f101448g;

    /* renamed from: h, reason: collision with root package name */
    public final nt0.d f101449h;

    /* renamed from: i, reason: collision with root package name */
    public final b60.b f101450i;

    /* renamed from: j, reason: collision with root package name */
    public ln0 f101451j;

    /* renamed from: k, reason: collision with root package name */
    public String f101452k;

    /* renamed from: l, reason: collision with root package name */
    public final ov0.b f101453l;

    /* renamed from: m, reason: collision with root package name */
    public final ov0.d f101454m;

    /* renamed from: n, reason: collision with root package name */
    public final ov0.b f101455n;

    /* renamed from: o, reason: collision with root package name */
    public v7 f101456o;

    /* renamed from: p, reason: collision with root package name */
    public u f101457p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f101458q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(du0.b presenterPinalytics, t storyPinLocalDataRepository, x recentlyUsedStickersDataProvider, ag1.b dataManager, w eventManager, k toastUtils, m userService, e12.e myUserService, uj2.q networkStateStream, nt0.d animatedStickerRepository, b60.b activeUserManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(recentlyUsedStickersDataProvider, "recentlyUsedStickersDataProvider");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(myUserService, "myUserService");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(animatedStickerRepository, "animatedStickerRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f101442a = storyPinLocalDataRepository;
        this.f101443b = recentlyUsedStickersDataProvider;
        this.f101444c = dataManager;
        this.f101445d = eventManager;
        this.f101446e = toastUtils;
        this.f101447f = userService;
        this.f101448g = myUserService;
        this.f101449h = animatedStickerRepository;
        this.f101450i = activeUserManager;
        this.f101452k = "";
        this.f101453l = new ov0.b(this, this, this);
        Intrinsics.checkNotNullParameter(this, "actionListener");
        ov0.d dVar = new ov0.d("storypins/stickers/search/", new ke0.a[]{gh0.b.U()}, null, null, null, null, null, null, 0L, 2044);
        dVar.E = "";
        f0 f0Var = new f0();
        f0Var.e("query", "");
        dVar.f49121k = f0Var;
        dVar.o(4, new nv0.a(this, 2));
        dVar.o(6, new pk0.b(21));
        this.f101454m = dVar;
        this.f101455n = new ov0.b(this);
    }

    @Override // nv0.b
    public final void L2(ig1.b action) {
        tp pageData;
        int B;
        Intrinsics.checkNotNullParameter(action, "action");
        int i13 = 20;
        if (action instanceof g) {
            g gVar = (g) action;
            zq zqVar = gVar.f92357b;
            if (!g0.e0(zqVar)) {
                v3(gVar);
                return;
            }
            nt0.d dVar = this.f101449h;
            if (dVar.d(zqVar)) {
                v3(gVar);
                return;
            }
            GestaltSpinner gestaltSpinner = ((qv0.g) ((n) getView())).G0;
            if (gestaltSpinner == null) {
                Intrinsics.r("overlayGestaltSpinner");
                throw null;
            }
            s0.w(gestaltSpinner, qv0.d.f105164k);
            dVar.a(zqVar, new m1(i13, this, action), new au0.a(this, 9));
            return;
        }
        if (!(action instanceof nv0.e)) {
            if (!(action instanceof h)) {
                if ((action instanceof nv0.f) || !(action instanceof nv0.d)) {
                    return;
                }
                t3();
                getPresenterPinalytics().f122379a.X(u0.IDEA_PIN_STICKER_SEATCH_CANCEL_BUTTON);
                return;
            }
            qv0.g gVar2 = (qv0.g) ((n) getView());
            gVar2.getClass();
            dr category = ((h) action).f92359b;
            Intrinsics.checkNotNullParameter(category, "category");
            NavigationImpl U8 = gVar2.U8(d2.h());
            U8.m0("com.pinterest.EXTRA_IDEA_PIN_STICKER_CATEGORY_ID", category.getF39332b());
            U8.m0("com.pinterest.EXTRA_IDEA_PIN_STICKER_CATEGORY_NAME", category.s());
            gVar2.M1(U8);
            d0 d0Var = getPresenterPinalytics().f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            d0Var.b0(u0.IDEA_PIN_STICKER_CATEGORY_BUTTON, h32.g0.IDEA_PIN_STICKER_CATEGORY, category.getF39332b(), false);
            return;
        }
        int interactiveStickerType = ((nv0.e) action).f92355b.getInteractiveStickerType();
        int value = a42.l.MENTION.getValue();
        k kVar = this.f101446e;
        if (interactiveStickerType == value) {
            ln0 ln0Var = this.f101451j;
            pageData = ln0Var != null ? ln0Var.getPageData() : null;
            int E = pageData != null ? pageData.E() : 0;
            ln0 ln0Var2 = this.f101451j;
            B = ln0Var2 != null ? ln0Var2.C() : 0;
            if (E >= 5) {
                kVar.h(aq1.h.at_mention_tag_limit_per_idea_pin_page);
            } else if (B >= 20) {
                kVar.h(aq1.h.at_mention_tag_limit_per_pin);
            } else {
                qv0.g gVar3 = (qv0.g) ((n) getView());
                gVar3.getClass();
                gVar3.M1(gVar3.U8(d2.i()));
            }
            getPresenterPinalytics().f122379a.F(h32.g0.IDEA_PIN_STICKER_INTERACTIVE, u0.STORY_PIN_MENTION_BUTTON);
            return;
        }
        int value2 = a42.l.PRODUCT_TAG.getValue();
        int i14 = 3;
        b60.b bVar = this.f101450i;
        if (interactiveStickerType == value2) {
            ln0 ln0Var3 = this.f101451j;
            pageData = ln0Var3 != null ? ln0Var3.getPageData() : null;
            int K = pageData != null ? pageData.K() : 0;
            ln0 ln0Var4 = this.f101451j;
            B = ln0Var4 != null ? ln0Var4.E() : 0;
            if (K >= 5) {
                kVar.h(aq1.h.product_tag_limit_per_idea_pin_page);
            } else if (B >= 20) {
                kVar.h(aq1.h.product_tag_limit_per_pin);
            } else {
                b60.d dVar2 = (b60.d) bVar;
                wy0 f13 = dVar2.f();
                if (f13 == null || !Intrinsics.d(f13.c3(), Boolean.FALSE)) {
                    qv0.g gVar4 = (qv0.g) ((n) getView());
                    gVar4.getClass();
                    gVar4.M1(gVar4.U8(d2.p()));
                } else {
                    wy0 f14 = dVar2.f();
                    if (f14 != null) {
                        String f39332b = f14.getF39332b();
                        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                        xj2.c o13 = this.f101447f.w(f39332b, n00.b.a(n00.c.USER_HAS_CONFIRMED_EMAIL_FIELDS)).r(tk2.e.f118017c).l(wj2.c.a()).o(new ev0.g(22, new a(this, i14)), new ev0.g(23, new y(7, f14)));
                        Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                        addDisposable(o13);
                    }
                }
            }
            getPresenterPinalytics().f122379a.F(h32.g0.IDEA_PIN_STICKER_INTERACTIVE, u0.STORY_PIN_PRODUCT_TAGGING_BUTTON);
            return;
        }
        if (interactiveStickerType == a42.l.VIRTUAL_TRY_ON.getValue()) {
            ln0 ln0Var5 = this.f101451j;
            pageData = ln0Var5 != null ? ln0Var5.getPageData() : null;
            int J2 = pageData != null ? pageData.J() : 0;
            ln0 ln0Var6 = this.f101451j;
            B = ln0Var6 != null ? ln0Var6.F() : 0;
            if (J2 >= 3) {
                kVar.h(aq1.h.vto_product_tag_limit_per_idea_pin_page);
            } else if (B >= 10) {
                kVar.h(aq1.h.vto_product_tag_limit_per_pin);
            } else {
                qv0.g gVar5 = (qv0.g) ((n) getView());
                gVar5.getClass();
                gVar5.M1(gVar5.U8(d2.r()));
            }
            getPresenterPinalytics().f122379a.F(h32.g0.IDEA_PIN_STICKER_INTERACTIVE, u0.IDEA_PIN_VTO_ADD_STICKER_BUTTON);
            return;
        }
        if (interactiveStickerType != a42.l.BOARD_STICKER.getValue()) {
            if (interactiveStickerType == a42.l.IMAGE_STICKER.getValue()) {
                if (Intrinsics.d(this.f101458q, Boolean.TRUE)) {
                    qv0.g gVar6 = (qv0.g) ((n) getView());
                    j jVar = gVar6.C0;
                    if (jVar == null) {
                        Intrinsics.r("galleryRouter");
                        throw null;
                    }
                    Context requireContext = gVar6.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    j.b(jVar, requireContext, pw0.x.IdeaPinImageSticker, 1, null, null, null, 504);
                } else {
                    ((qv0.g) ((n) getView())).V8(aq1.h.idea_pin_image_sticker_picker_alert_view_title_no_photo, aq1.h.idea_pin_image_sticker_picker_alert_view_subtitle_no_photo);
                }
                getPresenterPinalytics().f122379a.F(h32.g0.IDEA_PIN_STICKER_INTERACTIVE, u0.IDEA_PIN_IMAGE_STICKER_BUTTON);
                return;
            }
            return;
        }
        ln0 ln0Var7 = this.f101451j;
        pageData = ln0Var7 != null ? ln0Var7.getPageData() : null;
        int j13 = pageData != null ? pageData.j() : 0;
        ln0 ln0Var8 = this.f101451j;
        B = ln0Var8 != null ? ln0Var8.B() : 0;
        wy0 f15 = ((b60.d) bVar).f();
        if (f15 != null) {
            if (f15.t2().intValue() == 0) {
                ((qv0.g) ((n) getView())).V8(aq1.h.idea_pin_board_sticker_alert_view_title_no_boards, aq1.h.idea_pin_board_sticker_alert_view_subtitle_no_boards);
            } else if (Intrinsics.d(f15.p4(), f15.t2())) {
                ((qv0.g) ((n) getView())).V8(aq1.h.idea_pin_board_sticker_alert_view_title_no_public_boards, aq1.h.idea_pin_board_sticker_alert_view_subtitle_no_public_boards);
            } else if (j13 >= 5) {
                kVar.h(aq1.h.idea_pin_page_board_sticker_limit);
            } else if (B >= 20) {
                kVar.h(aq1.h.pin_board_sticker_limit);
            } else {
                qv0.g gVar7 = (qv0.g) ((n) getView());
                gVar7.getClass();
                gVar7.M1(gVar7.U8(d2.c()));
            }
        }
        getPresenterPinalytics().f122379a.F(h32.g0.IDEA_PIN_STICKER_INTERACTIVE, u0.IDEA_PIN_BOARD_STICKER_BUTTON);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        i iVar = (i) dataSources;
        iVar.b(this.f101453l);
        iVar.b(this.f101454m);
        iVar.b(this.f101455n);
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        String query;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof cn1.q) {
            String str = ((cn1.q) event).f28232c;
            query = str != null ? str : "";
            this.f101452k = query;
            return;
        }
        if (event instanceof o) {
            if (!((o) event).f28229c) {
                if (this.f101452k.length() == 0) {
                    t3();
                    return;
                }
                return;
            }
            ov0.b bVar = this.f101453l;
            bVar.Z();
            switch (bVar.E) {
                case 0:
                    bVar.F = false;
                    break;
                default:
                    bVar.F = false;
                    break;
            }
            this.f101455n.n();
            ((qv0.g) ((n) getView())).W8(nv0.j.f92361a);
            getPresenterPinalytics().f122379a.X(u0.IDEA_PIN_STICKER_SEATCH_BOX);
            return;
        }
        if (!(event instanceof r)) {
            if ((event instanceof xl1.a) && event.j() == cn1.f0.gestalt_trailing_button) {
                t3();
                getPresenterPinalytics().f122379a.X(u0.IDEA_PIN_STICKER_SEATCH_CANCEL_BUTTON);
                return;
            }
            return;
        }
        String str2 = ((r) event).f28234c;
        query = str2 != null ? str2 : "";
        ov0.d dVar = this.f101454m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        dVar.E = query;
        f0 f0Var = dVar.f49121k;
        if (f0Var == null) {
            f0Var = new f0();
        }
        f0Var.e("query", query);
        dVar.f49121k = f0Var;
        dVar.i2();
        ((qv0.g) ((n) getView())).setLoadState(yk1.i.LOADING);
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        f1 f1Var = f1.SEARCH_IDEA_PIN_STICKERS;
        HashMap o13 = ep.b.o("query", query);
        Unit unit = Unit.f80348a;
        d0.B(d0Var, f1Var, null, null, o13, 22);
    }

    @Override // yk1.b
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i14 == 983) {
            ((qv0.g) ((n) getView())).D5();
        }
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, wt1.d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if ((state instanceof wt1.y) && (remoteList instanceof ov0.d)) {
            ov0.d dVar = (ov0.d) remoteList;
            boolean z13 = dVar.f49127q.size() == 1 && (CollectionsKt.firstOrNull(dVar.d()) instanceof vx);
            ((qv0.g) ((n) getView())).W8(new nv0.k(z13));
            ov0.b bVar = this.f101455n;
            if (z13 || dVar.f49127q.size() == 0) {
                switch (bVar.E) {
                    case 0:
                        bVar.F = true;
                        break;
                    default:
                        bVar.F = true;
                        break;
                }
                bVar.n();
                return;
            }
            switch (bVar.E) {
                case 0:
                    bVar.F = false;
                    break;
                default:
                    bVar.F = false;
                    break;
            }
            bVar.Z();
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        ((qv0.g) ((n) getView())).J0 = null;
        super.onUnbind();
    }

    public final void t3() {
        ov0.d dVar = this.f101454m;
        dVar.getClass();
        Intrinsics.checkNotNullParameter("", "query");
        dVar.E = "";
        f0 f0Var = dVar.f49121k;
        if (f0Var == null) {
            f0Var = new f0();
        }
        f0Var.e("query", "");
        dVar.f49121k = f0Var;
        dVar.Z();
        this.f101455n.Z();
        ov0.b bVar = this.f101453l;
        switch (bVar.E) {
            case 0:
                bVar.F = true;
                break;
            default:
                bVar.F = true;
                break;
        }
        bVar.n();
        ((qv0.g) ((n) getView())).W8(nv0.i.f92360a);
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(n view) {
        String f39332b;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((sq0.c0) view);
        qv0.g gVar = (qv0.g) view;
        gVar.J0 = this;
        Intrinsics.checkNotNullParameter(this, "listener");
        gVar.K0 = this;
        GestaltSearchField gestaltSearchField = gVar.H0;
        if (gestaltSearchField == null) {
            Intrinsics.r("searchBar");
            throw null;
        }
        gestaltSearchField.g0(this);
        wy0 f13 = ((b60.d) this.f101450i).f();
        if (f13 != null && (f39332b = f13.getF39332b()) != null) {
            String value = x02.x.PUBLIC_BOARDS_FILTER.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            this.f101448g.f(f39332b, "last_pinned_to", value, n00.b.a(n00.c.LIBRARY_BOARD_FEED), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE).l(wj2.c.a()).r(tk2.e.f118017c).o(new ev0.g(24, new a(this, 0)), new ev0.g(25, b.f101432j));
        }
        e0 M = ((dl1.l) this.f101442a).M(this.f101444c.d());
        hk2.b bVar = new hk2.b(new ev0.g(26, new a(this, 1)), new ev0.g(27, b.f101433k), ck2.i.f27923c);
        M.f(bVar);
        addDisposable(bVar);
        x xVar = this.f101443b;
        xVar.getClass();
        cw0.e eVar = cw0.e.STICKERS;
        String f39332b2 = com.bumptech.glide.d.Q((b60.b) xVar.f31695c).getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
        ae0.e eVar2 = (ae0.e) ((ae0.a) xVar.f31694b);
        eVar2.getClass();
        int i13 = 2;
        ja.f0 d2 = ja.f0.d(2, "SELECT content_id FROM idea_pin_recently_used_content WHERE content_type =? AND user_id = ? ORDER BY last_used_timestamp DESC");
        eVar2.f15046c.getClass();
        d2.c1(1, xa0.j.e(eVar));
        d2.c1(2, f39332b2);
        kk2.t r13 = j0.b(new ae0.d(eVar2, d2, i13)).r(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        r13.l(wj2.c.a()).o(new ev0.g(28, new a(this, i13)), new ev0.g(29, b.f101434l));
    }

    public final void v3(g gVar) {
        tp pageData;
        zq zqVar = gVar.f92357b;
        c cVar = new c(this, 0);
        ln0 ln0Var = this.f101451j;
        if (ln0Var != null && (pageData = ln0Var.getPageData()) != null) {
            Pair V = pageData.V(zqVar);
            tp tpVar = (tp) V.f80346a;
            nq nqVar = (nq) V.f80347b;
            ln0 J2 = ln0Var.J(tpVar, true);
            this.f101451j = J2;
            ((dl1.l) this.f101442a).W(J2);
            cVar.invoke(zqVar, nqVar.getConfig().getId());
        }
        String f39332b = zqVar.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        this.f101443b.g(f39332b).l(wj2.c.a()).o(new ev0.g(20, b.f101435m), new ev0.g(21, b.f101436n));
        ((qv0.g) ((n) getView())).D5();
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.b0(u0.STORY_PIN_STATIC_STICKER, gVar.f92358c, gVar.f92357b.getF39332b(), false);
    }

    public final void w3() {
        v7 v7Var;
        Set entrySet;
        Map.Entry entry;
        List list;
        if (this.f101457p == null || (v7Var = this.f101456o) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String v13 = kh2.d.v(v7Var);
        if (!z.j(v13)) {
            arrayList.add(v13);
        }
        Map d13 = v7Var.d1();
        if (d13 != null && (entrySet = d13.entrySet()) != null && (entry = (Map.Entry) CollectionsKt.T(entrySet)) != null && (list = (List) entry.getValue()) != null && (!list.isEmpty())) {
            int size = list.size() - 1;
            for (int i13 = 0; i13 < size && arrayList.size() != 3; i13++) {
                String j13 = ((sr) list.get(i13)).j();
                if (j13 != null && !arrayList.contains(j13)) {
                    arrayList.add(j13);
                }
            }
        }
        String str = (String) CollectionsKt.U(0, arrayList);
        String str2 = (String) CollectionsKt.U(1, arrayList);
        String str3 = (String) CollectionsKt.U(2, arrayList);
        dc0.g images = new dc0.g(str, str2, str3);
        u uVar = this.f101457p;
        Intrinsics.f(uVar);
        Intrinsics.checkNotNullParameter(images, "images");
        if (str == null && str2 == null && str3 == null) {
            return;
        }
        uVar.f105209d.setVisibility(8);
        int W = bs1.c.W(uVar, eo1.c.lego_brick_quarter);
        uVar.f105208c.setPadding(W, W, W, W);
        WebImageView webImageView = uVar.f105210e;
        if (str != null) {
            webImageView.loadUrl(str);
        }
        WebImageView webImageView2 = uVar.f105211f;
        if (str2 != null) {
            webImageView2.loadUrl(str2);
        }
        WebImageView webImageView3 = uVar.f105212g;
        if (str3 != null) {
            webImageView3.loadUrl(str3);
        }
        webImageView.setVisibility(0);
        webImageView2.setVisibility(0);
        webImageView3.setVisibility(0);
    }
}

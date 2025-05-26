package l11;

import a41.e0;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import ba1.y;
import c61.t;
import cn1.u;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.xt;
import com.pinterest.feature.pin.create.view.HeaderCell;
import com.pinterest.feature.profile.createdtab.view.ProfileCreatedTabEmptyStateView;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.profile.recentpins.view.RecentlyActionedFeedFooterView;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.search.results.view.StaticSearchBarView;
import com.pinterest.feature.search.results.view.n0;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchPillView;
import com.pinterest.feature.search.typeahead.view.TypeaheadLegacySearchBarContainer;
import com.pinterest.feature.search.visual.lens.FullScreenPhotoCameraView;
import com.pinterest.feature.settings.account.view.PasswordEditView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import i01.r0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import o71.c0;
import q71.d1;
import rc0.z0;
import v91.v;
import y31.s;

/* loaded from: classes5.dex */
public final /* synthetic */ class p implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81464b;

    public /* synthetic */ p(Object obj, int i13) {
        this.f81463a = i13;
        this.f81464b = obj;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        f11.h hVar;
        p21.a aVar;
        f30 pin;
        u50.r rVar;
        x41.d dVar;
        Function0 function0;
        w61.a aVar2;
        n0 n0Var;
        View.OnClickListener onClickListener;
        c0 c0Var;
        m81.a aVar3;
        m81.o oVar;
        s81.f fVar;
        xt xtVar;
        Function1 function1;
        Function0 function02;
        int i13 = this.f81463a;
        int i14 = 6;
        int i15 = 2;
        Unit unit = null;
        Object obj = this.f81464b;
        switch (i13) {
            case 0:
                HeaderCell this$0 = (HeaderCell) obj;
                int i16 = HeaderCell.f47072f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof om1.l) || (hVar = this$0.f47076d) == null) {
                    return;
                }
                hVar.d2();
                return;
            case 1:
                p11.c this$02 = (p11.c) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                int i17 = p11.c.f98640g0;
                this$02.getClass();
                Bundle bundle = new Bundle();
                WebView webView = this$02.f98642d0;
                if (webView == null) {
                    Intrinsics.r("webView");
                    throw null;
                }
                bundle.putString("ADD_LINK_URL", webView.getUrl());
                Unit unit2 = Unit.f80348a;
                this$02.P6("RESULT_ADD_LINK", bundle);
                this$02.D5();
                return;
            case 2:
                x11.c this$03 = (x11.c) obj;
                int i18 = x11.c.E0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                v11.b bVar = this$03.B0;
                if (bVar != null) {
                    ((w11.b) bVar).u3();
                    return;
                }
                return;
            case 3:
                q21.d this$04 = (q21.d) obj;
                int i19 = q21.d.B;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                p21.f fVar2 = this$04.f102126e;
                if (fVar2 == null || (aVar = this$04.f102136k) == null || !fVar2.isBound() || (pin = fVar2.f98692a) == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(pin, "pin");
                ((a91.f) aVar).getPinalytics().X(u0.VTO_PRODUCT_PREVIEW_BUTTON);
                return;
            case 4:
                u31.b state = (u31.b) obj;
                int i23 = ProfileCreatedTabEmptyStateView.f47511f;
                Intrinsics.checkNotNullParameter(state, "$state");
                Intrinsics.checkNotNullParameter(event, "it");
                state.f120153b.invoke();
                return;
            case 5:
                UserProfileHeader this$05 = (UserProfileHeader) obj;
                int i24 = UserProfileHeader.f47517s;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof rn1.f) || (rVar = this$05.f47531q) == null) {
                    return;
                }
                rVar.a(s.f136855a);
                return;
            case 6:
                e0 button = (e0) obj;
                int i25 = a41.r.P1;
                Intrinsics.checkNotNullParameter(button, "$button");
                Intrinsics.checkNotNullParameter(event, "it");
                button.f587c.invoke();
                return;
            case 7:
                RecentlyActionedFeedFooterView this$06 = (RecentlyActionedFeedFooterView) obj;
                int i26 = RecentlyActionedFeedFooterView.f47565c;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                x41.b bVar2 = this$06.f47566a;
                if (bVar2 == null || (dVar = ((a51.d) bVar2).R0) == null) {
                    return;
                }
                ((z41.b) dVar).v3();
                return;
            case 8:
                u51.e this$07 = (u51.e) obj;
                int i27 = u51.e.f120601z0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                rp0.d dVar2 = this$07.f120613p0;
                if (dVar2 != null) {
                    this$07.a8(dVar2);
                    unit = Unit.f80348a;
                }
                if (unit == null) {
                    this$07.f120614q0 = true;
                    return;
                }
                return;
            case 9:
                z51.c actionHandler = (z51.c) obj;
                int i28 = z51.b.f140864a;
                Intrinsics.checkNotNullParameter(actionHandler, "$actionHandler");
                Intrinsics.checkNotNullParameter(event, "it");
                actionHandler.getClass();
                SimpleDateFormat simpleDateFormat = z51.e.f140868a1;
                actionHandler.f140865a.h9(new Date());
                return;
            case 10:
                c61.i this$08 = (c61.i) obj;
                int i29 = c61.i.f26565m1;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof cn1.s) {
                    kh2.j.x2(this$08.c9(), c61.o.f26631a);
                    return;
                } else if (event instanceof cn1.p) {
                    kh2.j.x2(this$08.c9(), t.f26640a);
                    return;
                } else {
                    if (event instanceof u) {
                        kh2.j.x2(this$08.c9(), c61.m.f26611a);
                        return;
                    }
                    return;
                }
            case 11:
                l61.d this$09 = (l61.d) obj;
                int i33 = l61.d.C0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    this$09.R8();
                    return;
                }
                return;
            case 12:
                HairPatternEducationView this$010 = (HairPatternEducationView) obj;
                List list = HairPatternEducationView.f47651h;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (function0 = this$010.f47652d) == null) {
                    return;
                }
                function0.invoke();
                return;
            case 13:
                x61.j this$011 = (x61.j) obj;
                int i34 = x61.j.f133945l;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (aVar2 = this$011.f133949d) == null) {
                    return;
                }
                w wVar = aVar2.f128123d;
                if (wVar != null) {
                    wVar.f(new r70.h(false, false));
                }
                u0 u0Var = u0.MORE_INFO_BUTTON;
                HashMap o13 = ep.b.o("story_type", "hair_pattern_filters");
                Unit unit3 = Unit.f80348a;
                aVar2.f128126g.U(new i0(aVar2.f128127h, aVar2.f128125f, null, g0.HAIR_PATTERN_FILTERS, null, u0Var), f1.TAP, null, null, o13, false);
                aVar2.f128120a.f();
                return;
            case 14:
                StaticSearchBarView this$012 = (StaticSearchBarView) obj;
                int i35 = StaticSearchBarView.f47752g;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (this$012.f47757e || (n0Var = this$012.f47758f) == null) {
                    return;
                }
                n0Var.p0();
                return;
            case 15:
                lq0.e0 this$013 = (lq0.e0) obj;
                int i36 = lq0.e0.f84303d;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof xl1.a) || (onClickListener = (View.OnClickListener) this$013.f84306c) == null) {
                    return;
                }
                onClickListener.onClick((GestaltButton) this$013.f84305b);
                return;
            case 16:
                SearchTypeaheadPeopleCell this$014 = (SearchTypeaheadPeopleCell) obj;
                int i37 = SearchTypeaheadPeopleCell.f47864g;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$014.setEnabled(true);
                this$014.performClick();
                this$014.setEnabled(false);
                return;
            case 17:
                SearchTypeaheadRecentSearchPillView this$015 = (SearchTypeaheadRecentSearchPillView) obj;
                int i38 = SearchTypeaheadRecentSearchPillView.f47877g;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (c0Var = this$015.f47883f) == null) {
                    return;
                }
                c0Var.r3();
                return;
            case 18:
                TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = (TypeaheadLegacySearchBarContainer) obj;
                typeaheadLegacySearchBarContainer.f47917c.b(false);
                d1 d1Var = typeaheadLegacySearchBarContainer.f47919e;
                if (d1Var != null) {
                    d1Var.H1();
                    return;
                }
                return;
            case 19:
                q81.a this$016 = (q81.a) obj;
                int i39 = q81.a.f103013h;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (aVar3 = this$016.f103019f) == null) {
                    return;
                }
                FullScreenPhotoCameraView fullScreenPhotoCameraView = this$016.f103017d;
                ep0.d flashMode = fullScreenPhotoCameraView.f45437s ? fullScreenPhotoCameraView.f45439u : ep0.d.FLASH_MODE_OFF;
                m81.d dVar3 = (m81.d) aVar3;
                Intrinsics.checkNotNullParameter(flashMode, "flashMode");
                dVar3.getPinalytics().X(u0.FLASHLIGHT_CAMERA_TORCH_BUTTON);
                dVar3.f86534d = flashMode;
                rm1.q qVar = rm1.q.FLASH;
                int i43 = m81.c.f86530a[flashMode.ordinal()];
                if (i43 == 1) {
                    dVar3.f86534d = ep0.d.FLASH_MODE_ON;
                } else if (i43 == 2) {
                    dVar3.f86534d = ep0.d.FLASH_MODE_OFF;
                    qVar = rm1.q.FLASH_SLASH;
                } else if (i43 == 3) {
                    dVar3.f86534d = ep0.d.FLASH_MODE_AUTO;
                    qVar = rm1.q.FLASH_AUTOMATIC;
                }
                m81.b bVar3 = (m81.b) dVar3.getView();
                ep0.d flashMode2 = dVar3.f86534d;
                q81.a aVar4 = (q81.a) bVar3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(flashMode2, "flashMode");
                FullScreenPhotoCameraView fullScreenPhotoCameraView2 = aVar4.f103017d;
                fullScreenPhotoCameraView2.getClass();
                Intrinsics.checkNotNullParameter(flashMode2, "<set-?>");
                fullScreenPhotoCameraView2.f45439u = flashMode2;
                aVar4.i(qVar);
                return;
            case 20:
                u81.u this$017 = (u81.u) obj;
                int i44 = u81.u.f121096c;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (!(event instanceof om1.l) || (oVar = this$017.f121097a) == null || (xtVar = (fVar = (s81.f) oVar).f111899b) == null) {
                    return;
                }
                String uid = xtVar.f43789c;
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                s81.p pVar = (s81.p) fVar.f111898a;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(uid, "uid");
                ek2.f i45 = pVar.f111928f.a(uid).l(tk2.e.f118017c).h(wj2.c.a()).i(new r0(i14), new a81.a(25, s81.l.f111909k));
                Intrinsics.checkNotNullExpressionValue(i45, "subscribe(...)");
                pVar.addDisposable(i45);
                pVar.f111948z.X(uid);
                return;
            case 21:
                k91.c this$018 = (k91.c) obj;
                int i46 = k91.c.f78808v0;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                p91.d dVar4 = this$018.f78812m0;
                if (dVar4 != null) {
                    dVar4.w3();
                    return;
                }
                return;
            case 22:
                q91.g this$019 = (q91.g) obj;
                int i47 = q91.g.f103100c;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof an1.p) {
                    int i48 = ((an1.l) ((u50.o) this$019.a().f49491p.f33803a)).f15747e;
                    this$019.a().t(new z0(i15, event));
                    this$019.f103101a.invoke(Integer.valueOf(((an1.p) event).f15758c), new b2.t(this$019, i48, 7));
                    return;
                }
                return;
            case 23:
                q91.i this$020 = (q91.i) obj;
                int i49 = q91.i.f103127j;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.a) {
                    String valueOf = String.valueOf(((xn1.a) event).f135436c);
                    if (this$020.f103131g == null) {
                        Intrinsics.r("initialValue");
                        throw null;
                    }
                    if (!Intrinsics.d(valueOf, r0)) {
                        bd1.b bVar4 = this$020.f103132h;
                        if (bVar4 != null) {
                            this$020.f103133i.c(new yc1.c(bVar4, valueOf));
                            return;
                        } else {
                            Intrinsics.r("apiFieldName");
                            throw null;
                        }
                    }
                    String str = this$020.f103131g;
                    if (str == null) {
                        Intrinsics.r("initialValue");
                        throw null;
                    }
                    if (Intrinsics.d(valueOf, str)) {
                        bd1.b fieldName = this$020.f103132h;
                        if (fieldName == null) {
                            Intrinsics.r("apiFieldName");
                            throw null;
                        }
                        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
                        this$020.f103128d.invoke(new yc1.b(fieldName));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                q91.u this$021 = (q91.u) obj;
                int i53 = q91.u.K0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                this$021.X8(false);
                l91.h hVar2 = this$021.F0;
                if (hVar2 != null) {
                    ((p91.w) hVar2).v3();
                    return;
                }
                return;
            case 25:
                PasswordEditView this$022 = (PasswordEditView) obj;
                int i54 = PasswordEditView.f48130i;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.d) {
                    if (!ve.h.X((xn1.d) event, 6) || (function02 = this$022.f48134g) == null) {
                        return;
                    }
                    function02.invoke();
                    return;
                }
                if (!(event instanceof xn1.a) || (function1 = this$022.f48135h) == null) {
                    return;
                }
                GestaltTextField gestaltTextField = this$022.f48131d;
                if (gestaltTextField != null) {
                    function1.invoke(gestaltTextField);
                    return;
                } else {
                    Intrinsics.r("inputText");
                    throw null;
                }
            case 26:
                q91.i0 this$023 = (q91.i0) obj;
                int i55 = q91.i0.f103134h0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof xl1.a) {
                    this$023.z(q91.b.f103070q);
                    return;
                }
                return;
            case 27:
                v91.m this$024 = (v91.m) obj;
                int i56 = v91.m.f124995l0;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof on1.g) {
                    ((v) this$024.f124996c0.getValue()).f125014e.e().a(v91.e.f124980a);
                    return;
                } else {
                    if (event instanceof on1.h) {
                        ((v) this$024.f124996c0.getValue()).f125014e.e().a(v91.f.f124981a);
                        return;
                    }
                    return;
                }
            case 28:
                x91.s this$025 = (x91.s) obj;
                int i57 = x91.s.L0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof cn1.q) {
                    GestaltSearchField gestaltSearchField = this$025.H0;
                    if (gestaltSearchField != null) {
                        this$025.b9().f134341i.e().a(new x91.c(gestaltSearchField.I0()));
                        return;
                    } else {
                        Intrinsics.r("searchField");
                        throw null;
                    }
                }
                return;
            default:
                y this$026 = (y) obj;
                int i58 = y.M0;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                Intrinsics.checkNotNullParameter(event, "it");
                kh2.j.x2(this$026.b9(), new ba1.p(e82.w.INSTAGRAM));
                return;
        }
    }
}

package x61;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import c71.b0;
import c71.z;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.xk;
import com.pinterest.api.model.xt;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.feature.search.results.view.GraphQLSearchGridFragment;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadBoardCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHashtagCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPinCarousel;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadRecentSearchPillView;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadTextCell;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadYourBoardCell;
import com.pinterest.feature.search.visual.lens.FullScreenPhotoCameraView;
import com.pinterest.feature.search.visual.lens.view.VirtualTryOnBottomSheetHeaderView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.v3;
import com.pinterest.screens.z3;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.f1;
import h32.u0;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nx.d0;
import o71.g0;
import o71.k;
import o71.l0;
import o71.o;
import o71.q;
import o71.r;
import o71.s;
import o71.v;
import o71.x;
import q71.i0;
import q71.m;
import q71.x0;
import q91.d1;
import qz.f0;
import s81.p;
import u81.t;
import u81.y;
import x81.a0;
import x81.o0;
import x81.u;

/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133941b;

    public /* synthetic */ e(Object obj, int i13) {
        this.f133940a = i13;
        this.f133941b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        v vVar;
        br.d dVar;
        String e13;
        s sVar;
        br.d dVar2;
        br.c cVar;
        br.d dVar3;
        String uid;
        ih ihVar;
        s81.d dVar4;
        d30 d30Var;
        s81.f fVar;
        xt xtVar;
        a0 a0Var;
        u uVar;
        int i13 = this.f133940a;
        str = "";
        Object obj = this.f133941b;
        switch (i13) {
            case 0:
                PinterestVideoView this_apply = (PinterestVideoView) obj;
                List list = HairPatternEducationView.f47651h;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (this_apply.f()) {
                    oc2.i.a(this_apply);
                    return;
                } else {
                    this_apply.play();
                    return;
                }
            case 1:
                z this$0 = (z) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                boolean z13 = this$0.B3().f22092a;
                String correctedQuery = this$0.B3().f22093b;
                Intrinsics.checkNotNullExpressionValue(correctedQuery, "getCorrectedQuery(...)");
                String originalQuery = this$0.B3().f22094c;
                Intrinsics.checkNotNullExpressionValue(originalQuery, "getOriginalQuery(...)");
                Intrinsics.checkNotNullParameter(correctedQuery, "correctedQuery");
                Intrinsics.checkNotNullParameter(originalQuery, "originalQuery");
                if (kotlin.text.z.j(originalQuery) && kotlin.text.z.j(correctedQuery)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("type", z13 ? "typo_auto_original" : "typo_suggestion");
                this$0.getPinalytics().Z(u0.SEARCH_QUERY_TYPO_CORRECTION, hashMap);
                if (z13) {
                    String obj2 = StringsKt.i0(originalQuery).toString();
                    h61.h hVar = this$0.Q.f26728a;
                    String[] values = {obj2, "typo_auto_original"};
                    Intrinsics.checkNotNullParameter(values, "values");
                    this$0.Q3(new b0(hVar, obj2, null, null, StringsKt.i0(correctedQuery).toString(), null, null, null, null, "typo_auto_original", null, Boolean.TRUE, e0.b(c0.M(values, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -885780, 2097151));
                    this$0.f26851h0 = null;
                    this$0.f26853i0 = null;
                } else {
                    String obj3 = StringsKt.i0(correctedQuery).toString();
                    h61.h hVar2 = this$0.Q.f26728a;
                    String[] values2 = {obj3, "typo_suggestion"};
                    Intrinsics.checkNotNullParameter(values2, "values");
                    this$0.Q3(new b0(hVar2, obj3, null, null, StringsKt.i0(originalQuery).toString(), null, null, null, null, "typo_suggestion", null, null, e0.b(c0.M(values2, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -853012, 2097151));
                    this$0.f26851h0 = null;
                    this$0.f26853i0 = null;
                }
                this$0.x3().clear();
                this$0.z3().Z();
                this$0.M3(false, false);
                return;
            case 2:
                GraphQLSearchGridFragment this$02 = (GraphQLSearchGridFragment) obj;
                int i14 = GraphQLSearchGridFragment.H1;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                d0 s73 = this$02.s7();
                u0 u0Var = u0.FILTER_BUTTON;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("applied_filter_count", String.valueOf(this$02.f47662g1));
                Unit unit = Unit.f80348a;
                s73.Z(u0Var, hashMap2);
                de1.d dVar5 = this$02.f47678w1;
                if (dVar5 != null) {
                    dVar5.x();
                    return;
                }
                return;
            case 3:
                q71.a this$03 = (q71.a) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                x xVar = this$03.C0;
                if (xVar != null) {
                    xVar.w3(false);
                    return;
                }
                return;
            case 4:
                m this$04 = (m) obj;
                int i15 = m.N;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                int i16 = this$04.M;
                if (i16 == -1 || (vVar = this$04.K) == null || i16 == -1) {
                    return;
                }
                vVar.f93380c.d(Navigation.z0((ScreenLocation) v3.f51465a.getValue(), ((f30) vVar.d().get(i16)).getUid()));
                return;
            case 5:
                SearchTypeaheadBoardCell this$05 = (SearchTypeaheadBoardCell) obj;
                int i17 = SearchTypeaheadBoardCell.f47841e;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                k kVar = this$05.f47845d;
                if (kVar != null) {
                    kVar.q3();
                    return;
                }
                return;
            case 6:
                SearchTypeaheadHashtagCell this$06 = (SearchTypeaheadHashtagCell) obj;
                int i18 = SearchTypeaheadHashtagCell.f47850d;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.getClass();
                o oVar = this$06.f47853c;
                if (oVar == null || (dVar = oVar.f93359d) == null || dVar.f23707e != br.c.PIN) {
                    return;
                }
                String str2 = dVar.f23704b;
                r9 = str2 != null ? StringsKt.i0(str2).toString() : null;
                l0.c(oVar.f93356a, oVar.f93361f, r9 == null ? "" : r9, oVar.f93360e, "user", null, 48);
                oVar.f93356a.a(dVar);
                String str3 = dVar.f23703a;
                Intrinsics.checkNotNullExpressionValue(str3, "getUid(...)");
                oVar.f93358c.d(r41.k.c(oVar.f93357b, str3, r41.b.SearchTypeaheadPeopleCell, null, null, 28));
                return;
            case 7:
                q71.b0 this$07 = (q71.b0) obj;
                int i19 = q71.b0.f102695e;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                q qVar = this$07.f102696a;
                if (qVar != null) {
                    r rVar = qVar.f93363a;
                    d0 pinalytics = rVar.getPinalytics();
                    f1 f1Var = f1.TAP;
                    xk xkVar = qVar.f93364b;
                    String uid2 = xkVar.getUid();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("story_type", xkVar.q());
                    hashMap3.put("content_ids", xkVar.getUid());
                    ih ihVar2 = xkVar.f43728t;
                    if (ihVar2 != null && (e13 = ihVar2.e()) != null) {
                        hashMap3.put("url", e13);
                    }
                    Unit unit2 = Unit.f80348a;
                    pinalytics.g(f1Var, uid2, hashMap3, false);
                    ih ihVar3 = xkVar.f43728t;
                    nu1.a.c(rVar.f93365a, ihVar3 != null ? ihVar3.e() : null, null, null, false, 30);
                    return;
                }
                return;
            case 8:
                SearchTypeaheadPeopleCell this$08 = (SearchTypeaheadPeopleCell) obj;
                int i23 = SearchTypeaheadPeopleCell.f47864g;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.f47870f || (sVar = this$08.f47869e) == null || (dVar2 = sVar.f93370d) == null || (cVar = dVar2.f23707e) != br.c.PINNER) {
                    return;
                }
                String t13 = cVar != null ? pe.i.t(cVar) : null;
                String str4 = dVar2.f23704b;
                r9 = str4 != null ? StringsKt.i0(str4).toString() : null;
                String str5 = r9 == null ? "" : r9;
                String str6 = sVar.f93373g;
                int i24 = sVar.f93372f;
                String str7 = dVar2.f23703a;
                sVar.f93367a.b(i24, str6, str5, t13, str7, str7);
                sVar.f93367a.a(dVar2);
                String str8 = dVar2.f23703a;
                Intrinsics.checkNotNullExpressionValue(str8, "getUid(...)");
                sVar.f93369c.d(r41.k.c(sVar.f93368b, str8, r41.b.SearchTypeaheadPeopleCell, null, null, 28));
                return;
            case 9:
                SearchTypeaheadPinCarousel this$09 = (SearchTypeaheadPinCarousel) obj;
                int i25 = SearchTypeaheadPinCarousel.f47871g;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                v vVar2 = this$09.f47876f;
                if (vVar2 == null || (dVar3 = vVar2.f93385h) == null) {
                    return;
                }
                String str9 = dVar3.f23704b;
                String obj4 = str9 != null ? StringsKt.i0(str9).toString() : null;
                String str10 = obj4 == null ? "" : obj4;
                br.c cVar2 = dVar3.f23707e;
                Intrinsics.checkNotNullExpressionValue(cVar2, "getItemType(...)");
                String B = pe.i.B(cVar2, false);
                br.c cVar3 = dVar3.f23707e;
                Intrinsics.checkNotNullExpressionValue(cVar3, "getItemType(...)");
                h61.h F = pe.i.F(cVar3, null);
                Date date = vVar2.f93388k;
                String valueOf = date != null ? String.valueOf(new Date().getTime() - date.getTime()) : null;
                int i26 = vVar2.f93386i;
                vVar2.f93381d.a(dVar3, i26, false);
                k71.o a13 = vVar2.f93382e.a();
                if (a13 != null) {
                    String str11 = vVar2.f93387j;
                    String[] values3 = {str10, B, String.valueOf(i26)};
                    Intrinsics.checkNotNullParameter(values3, "values");
                    a13.F6(b0.c(new b0(F, str10, str11, valueOf, null, null, null, null, null, B, null, null, e0.b(c0.M(values3, "|", null, null, 0, null, null, 62)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -66576, 2097151), false, 3));
                    return;
                }
                return;
            case 10:
                k71.j listener = (k71.j) obj;
                int i27 = i0.f102719e;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                o71.z zVar = (o71.z) listener;
                vh vhVar = zVar.f93417d;
                if (vhVar != null) {
                    zVar.getPinalytics().F(o71.z.q3(vhVar), u0.SEE_MORE_BUTTON);
                }
                NavigationImpl w13 = Navigation.w1((ScreenLocation) v3.f51466b.getValue());
                vh vhVar2 = zVar.f93417d;
                r9 = vhVar2 != null ? vhVar2.q() : null;
                if (r9 != null) {
                    if (Intrinsics.d(r9, "user_recently_saved_pins")) {
                        str = "RECENTLY_SAVED";
                    } else if (Intrinsics.d(r9, "user_recently_viewed_pins")) {
                        str = "RECENTLY_VIEWED";
                    }
                }
                w13.m0("com.pinterest.EXTRA_RECENT_PIN_ACTION_TYPE", str);
                zVar.f93415b.d(w13);
                return;
            case 11:
                SearchTypeaheadRecentSearchPillView this$010 = (SearchTypeaheadRecentSearchPillView) obj;
                int i28 = SearchTypeaheadRecentSearchPillView.f47877g;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                o71.c0 c0Var = this$010.f47883f;
                if (c0Var != null) {
                    c0Var.q3();
                    return;
                }
                return;
            case 12:
                SearchTypeaheadTextCell this$011 = (SearchTypeaheadTextCell) obj;
                int i29 = SearchTypeaheadTextCell.f47887r;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                o71.c0 c0Var2 = this$011.f47900m;
                if (c0Var2 != null) {
                    c0Var2.q3();
                    return;
                }
                return;
            case 13:
                x0 this$012 = (x0) obj;
                int i33 = x0.f102782i;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                g0 g0Var = this$012.f102790h;
                if (g0Var != null) {
                    vh vhVar3 = g0Var.f93295d;
                    if (vhVar3 != null && (ihVar = vhVar3.f42857o) != null) {
                        r9 = ihVar.e();
                    }
                    Uri parse = Uri.parse(r9 != null ? r9 : "");
                    d0 d0Var = g0Var.f93292a.f122379a;
                    Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
                    h32.g0 g0Var2 = h32.g0.DYNAMIC_GRID_STORY;
                    HashMap o13 = ep.b.o("story_type", "autocomplete_trending_articles");
                    vh vhVar4 = g0Var.f93295d;
                    if (vhVar4 != null && (uid = vhVar4.getUid()) != null) {
                    }
                    o13.put("story_index", String.valueOf(g0Var.f93296e));
                    o13.put("rs", "autocomplete");
                    Unit unit3 = Unit.f80348a;
                    d0.B(d0Var, null, g0Var2, null, o13, 21);
                    g0Var.f93293b.a(parse, null, null, true, false);
                    return;
                }
                return;
            case 14:
                SearchTypeaheadYourBoardCell this$013 = (SearchTypeaheadYourBoardCell) obj;
                int i34 = SearchTypeaheadYourBoardCell.f47905d;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                k kVar2 = this$013.f47908c;
                if (kVar2 != null) {
                    kVar2.q3();
                    return;
                }
                return;
            case 15:
                q81.a this$014 = (q81.a) obj;
                int i35 = q81.a.f103013h;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                m81.a aVar = this$014.f103019f;
                if (aVar != null) {
                    m81.d dVar6 = (m81.d) aVar;
                    dVar6.f86533c = this$014.f103017d.f45422e == 1 ? 1 : 0;
                    q81.a aVar2 = (q81.a) ((m81.b) dVar6.getView());
                    kg.a.b(aVar2.f103016c);
                    FullScreenPhotoCameraView fullScreenPhotoCameraView = aVar2.f103017d;
                    fullScreenPhotoCameraView.getClass();
                    FragmentActivity activity = aVar2.f103014a;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    fullScreenPhotoCameraView.b();
                    fullScreenPhotoCameraView.p();
                    fullScreenPhotoCameraView.f45422e = fullScreenPhotoCameraView.f45422e == 1 ? 0 : 1;
                    HandlerThread handlerThread = new HandlerThread("CameraBackground");
                    handlerThread.start();
                    fullScreenPhotoCameraView.f45428k = new Handler(handlerThread.getLooper());
                    fullScreenPhotoCameraView.f45427j = handlerThread;
                    fullScreenPhotoCameraView.n(activity, fullScreenPhotoCameraView.getWidth(), fullScreenPhotoCameraView.getHeight());
                    int i36 = dVar6.f86533c;
                    GestaltIconButton gestaltIconButton = aVar2.f103015b;
                    if (i36 != 1) {
                        gestaltIconButton.setAlpha(1.0f);
                        gestaltIconButton.setEnabled(true);
                        return;
                    } else {
                        aVar2.i(rm1.q.FLASH);
                        gestaltIconButton.setAlpha(0.5f);
                        gestaltIconButton.setEnabled(false);
                        return;
                    }
                }
                return;
            case 16:
                t this$015 = (t) obj;
                int i37 = t.M;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                m81.m mVar = this$015.K;
                if (mVar == null || (d30Var = (dVar4 = (s81.d) mVar).f111897b) == null) {
                    return;
                }
                dVar4.f111896a.K0(d30Var.f41101b, d30Var.e());
                return;
            case 17:
                u81.u this$016 = (u81.u) obj;
                int i38 = u81.u.f121096c;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                m81.o oVar2 = this$016.f121097a;
                if (oVar2 == null || (xtVar = (fVar = (s81.f) oVar2).f111899b) == null) {
                    return;
                }
                String str12 = xtVar.f44121b;
                Intrinsics.checkNotNullExpressionValue(str12, "getLargeImageUrl(...)");
                String imageUrl = str12.length() > 0 ? xtVar.f44121b : xtVar.f44120a;
                Intrinsics.f(imageUrl);
                p pVar = (p) fVar.f111898a;
                pVar.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                new uy.t().i();
                HashMap hashMap4 = new HashMap();
                hashMap4.put("url", imageUrl);
                pVar.getPinalytics().g(f1.FLASHLIGHT_LENS_UNIVERSE_SEARCH, "", hashMap4, false);
                r81.m mVar2 = pVar.f111947y;
                mVar2.i0(imageUrl);
                a32.c cVar4 = a32.c.CAMERA_HISTORY;
                if (cVar4 == null) {
                    f0 f0Var = mVar2.f49121k;
                    if (f0Var != null) {
                        f0Var.h("source_type");
                    }
                } else {
                    f0 f0Var2 = mVar2.f49121k;
                    if (f0Var2 != null) {
                        f0Var2.c(cVar4.getValue(), "source_type");
                    }
                }
                pVar.L = cVar4;
                pVar.K = imageUrl;
                u81.r rVar2 = (u81.r) ((m81.q) pVar.getView());
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                WebImageView webImageView = rVar2.f121092w1;
                if (webImageView == null) {
                    Intrinsics.r("imagePreview");
                    throw null;
                }
                webImageView.loadUrl(imageUrl);
                pVar.g4(s81.h.SEARCH_RESULTS);
                pVar.e4(pVar.z3());
                return;
            case 18:
                y this$017 = (y) obj;
                int i39 = y.f121115c0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.N6(false, false);
                return;
            case 19:
                PinterestToolTip this_apply2 = (PinterestToolTip) obj;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                bs1.c.X0(this_apply2);
                return;
            case 20:
                VirtualTryOnBottomSheetHeaderView this$018 = (VirtualTryOnBottomSheetHeaderView) obj;
                int i43 = VirtualTryOnBottomSheetHeaderView.f48060d;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                if (!this$018.f48062b || (a0Var = this$018.f48061a) == null || (uVar = a0Var.f134165a.T1) == null) {
                    return;
                }
                o0 o0Var = (o0) uVar;
                if (o0Var.f134285u == x81.o.GALLERY_PHOTOS) {
                    o0Var.W3(x81.o.GALLERY_DIRECTORIES);
                    return;
                }
                return;
            case 21:
                d91.j this$019 = (d91.j) obj;
                int i44 = d91.j.f54083v1;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.P7();
                return;
            case 22:
                k91.e this$020 = (k91.e) obj;
                int i45 = k91.e.f78821q0;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                p91.f fVar2 = this$020.f78826n0;
                if (fVar2 != null) {
                    fVar2.p3();
                    return;
                }
                return;
            case 23:
                k91.g this$021 = (k91.g) obj;
                int i46 = k91.g.f78829n0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                p91.g gVar = this$021.f78832l0;
                if (gVar != null) {
                    gVar.getPinalytics().N(f1.TAP, u0.CREATE_BUTTON, null, null, false);
                    NavigationImpl w14 = Navigation.w1((ScreenLocation) z3.f51676b.getValue());
                    w14.m0("com.pinterest.identity.EXTRA_BUSINESS_CREATE_ACCOUNT_TYPE", "CONVERTED");
                    gVar.f99283a.d(w14);
                    return;
                }
                return;
            case 24:
                n91.q this$022 = (n91.q) obj;
                int i47 = n91.q.f90057m0;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                kh2.j.x2(this$022.Y7(), n91.b.f90030a);
                return;
            case 25:
                q91.m this$023 = (q91.m) obj;
                int i48 = q91.m.C0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.P7();
                return;
            case 26:
                q91.p this$024 = (q91.p) obj;
                int i49 = q91.p.G0;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.P7();
                return;
            case 27:
                q91.u this$025 = (q91.u) obj;
                int i53 = q91.u.K0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.P7();
                return;
            case 28:
                q91.o0 this$026 = (q91.o0) obj;
                int i54 = q91.o0.f103151s0;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                this$026.getClass();
                this$026.a8(null, u0.DISMISS_BUTTON);
                this$026.D5();
                return;
            default:
                d1 this$027 = (d1) obj;
                int i55 = d1.f103082m0;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                this$027.D5();
                return;
        }
    }
}

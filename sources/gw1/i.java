package gw1;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.util.SparseArray;
import androidx.appcompat.widget.x;
import com.pinterest.api.model.ay;
import com.pinterest.api.model.lh0;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.ta;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wn0;
import com.pinterest.api.model.wy0;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.partnerAnalytics.components.productTag.ProductTagCard;
import com.pinterest.partnerAnalytics.feature.audience.metadata.AudienceMetadataCard;
import com.pinterest.screens.p3;
import com.pinterest.shuffles.scene.composer.i0;
import com.pinterest.shuffles.scene.composer.y;
import com.pinterest.ui.actionbar.LegoActionBar;
import dl1.u;
import e82.z;
import h32.g0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh2.g3;
import kh2.k3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.w;
import m60.x0;
import n02.o;
import nx.b0;
import o82.h2;
import o82.m1;
import o82.q1;
import qr1.q;
import r02.l0;
import r02.s0;
import r72.a2;
import r72.k0;
import r72.z1;
import s02.t;
import s02.v;
import so.i1;
import so.y0;
import u50.r;
import u52.b1;
import u52.n0;
import v.f1;
import x02.c2;
import x02.d0;
import x02.f0;
import yx1.a0;
import yx1.p;

/* loaded from: classes4.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f66230i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f66231j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f66232k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i13, Object obj, Object obj2) {
        super(1);
        this.f66230i = i13;
        this.f66231j = obj;
        this.f66232k = obj2;
    }

    public final v7 b(v7 board) {
        int i13 = this.f66230i;
        Object obj = this.f66232k;
        Object obj2 = this.f66231j;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(board, "board");
                ((d0) obj2).f(1, ((f0) ((u) obj)).f131354e);
                u7 G1 = board.G1();
                G1.b(Boolean.valueOf(!r2.f131354e));
                return G1.a();
            default:
                Intrinsics.checkNotNullParameter(board, "updatedBoard");
                v7 v7Var = (v7) obj;
                ((d0) obj2).f(-1, v7Var != null ? kh2.d.M0(v7Var) : false);
                if (v7Var == null) {
                    return board;
                }
                u7 G12 = v7Var.G1();
                G12.Y = Integer.valueOf(v7Var.q1().intValue() + 1);
                boolean[] zArr = G12.f42452n0;
                if (zArr.length > 50) {
                    zArr[50] = true;
                }
                G12.d(board.C0());
                return G12.a();
        }
    }

    public final rn1.a e(rn1.a it) {
        u50.f0 h23;
        int i13 = this.f66230i;
        Object obj = this.f66232k;
        Object obj2 = this.f66231j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                ow1.g gVar = (ow1.g) obj2;
                int i14 = com.pinterest.partnerAnalytics.g.pin_lifetime_metric_label;
                mw1.g gVar2 = (mw1.g) ((g3) obj);
                String str = gVar2.f88435b;
                String string = gVar.getString(gVar2.f88434a.getDescription());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String lowerCase = string.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String string2 = gVar.getString(i14, str, gVar2.f88436c, lowerCase);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return rn1.a.y(it, bs1.c.h2(string2), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = ((AudienceMetadataCard) obj).getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return rn1.a.y(it, bs1.c.h2(pp2.a.t((Date) obj2, resources)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                Double d2 = ((mw1.e) obj2).f88429b;
                if (d2 == null) {
                    CharSequence text = ((uw1.e) obj).f123229d.getText(com.pinterest.partnerAnalytics.g.analytics_empty_value);
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    h23 = bs1.c.h2(text);
                } else {
                    String G = ((uw1.e) obj).f123231f.G((float) d2.doubleValue());
                    Intrinsics.checkNotNullExpressionValue(G, "getFormattedValue(...)");
                    h23 = bs1.c.h2(G);
                }
                return rn1.a.y(it, h23, null, null, null, null, 0, d7.b.Z(((uw1.e) obj).f123232g), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final void f(int i13) {
        int i14 = this.f66230i;
        Object obj = this.f66232k;
        Object obj2 = this.f66231j;
        switch (i14) {
            case 0:
                ((Function1) obj2).invoke(Integer.valueOf(i13));
                a.c.y(((f) obj).f66227b);
                return;
            case 4:
                ((Function1) obj2).invoke(Integer.valueOf(i13));
                a.c.y(((f) obj).f66227b);
                return;
            case 5:
                ((Function1) obj2).invoke(Integer.valueOf(i13));
                a.c.y(((f) obj).f66227b);
                return;
            case 7:
                vx1.c cVar = (vx1.c) obj2;
                List list = (List) obj;
                cVar.b8((ww1.c) list.get(i13));
                cVar.X7().g((ww1.c) list.get(i13));
                return;
            default:
                yx1.j jVar = (yx1.j) obj2;
                yx1.d dVar = jVar.D0;
                if (dVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                List list2 = (List) obj;
                ww1.c metricSelected = (ww1.c) list2.get(i13);
                p pVar = (p) dVar;
                Intrinsics.checkNotNullParameter(metricSelected, "metricSelected");
                if (pVar.f140400o != metricSelected) {
                    pVar.f140400o = metricSelected;
                    vh vhVar = pVar.f140404s;
                    if (vhVar != null) {
                        pVar.q3(vhVar);
                    }
                }
                ProductTagCard productTagCard = jVar.f140374x0;
                if (productTagCard != null) {
                    productTagCard.g((ww1.c) list2.get(i13));
                    return;
                } else {
                    Intrinsics.r("productTags");
                    throw null;
                }
        }
    }

    public final void h(Throwable th3) {
        String str;
        f1 f1Var;
        qz.d M;
        int i13 = this.f66230i;
        Object obj = this.f66232k;
        Object obj2 = this.f66231j;
        switch (i13) {
            case 10:
                ((g4.u) obj2).getClass();
                if (th3 != null) {
                    th3.getMessage();
                }
                ((Function0) obj).invoke();
                return;
            case 11:
                ((g4.u) obj2).getClass();
                if (th3 != null) {
                    th3.getMessage();
                }
                ((my1.c) obj).f73375b.invoke();
                return;
            case 12:
                NetworkResponseError networkResponseError = th3 instanceof NetworkResponseError ? (NetworkResponseError) th3 : null;
                String e13 = (networkResponseError == null || (f1Var = networkResponseError.f45043a) == null || (M = k3.M(f1Var)) == null) ? null : M.e();
                a02.d dVar = (a02.d) obj2;
                i92.k kVar = dVar.f225i0;
                if (kVar == null) {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
                if (e13 == null) {
                    str = dVar.getString(x0.generic_error);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                } else {
                    str = e13;
                }
                kVar.i(str);
                nx.d0 s73 = dVar.s7();
                h32.f1 f1Var2 = h32.f1.AUTH_COLLECTION_FAIL;
                g0 g0Var = (g0) obj;
                HashMap hashMap = new HashMap();
                if (e13 == null) {
                    e13 = "";
                }
                hashMap.put("fail_reason", e13);
                Unit unit = Unit.f80348a;
                nx.d0.B(s73, f1Var2, g0Var, null, hashMap, 20);
                dVar.getAnalyticsApi().a("recovery_v2_fb_email_update_failed");
                return;
            case 20:
                HashMap auxData = new HashMap();
                c2 params = (c2) obj;
                ((b0) obj2).getClass();
                Intrinsics.checkNotNullParameter(auxData, "auxData");
                Intrinsics.checkNotNullParameter(params, "params");
                b0.k(auxData, null, null, params.f131302g, null, "repin", null, th3, 1);
                nx.d0 a13 = sh.f.a();
                Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
                a13.g(h32.f1.PIN_CREATE_FAILURE, params.f131299d, auxData, false);
                return;
            default:
                com.pinterest.shuffles.scene.composer.u uVar = (com.pinterest.shuffles.scene.composer.u) obj2;
                i0 l13 = (i0) obj;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(l13, "l");
                uVar.f52146d.remove(l13);
                return;
        }
    }

    public final void i(tt1.a it) {
        int i13 = this.f66230i;
        Object obj = this.f66232k;
        Object obj2 = this.f66231j;
        switch (i13) {
            case 13:
                lh0 lh0Var = (lh0) it.c();
                if (lh0Var != null) {
                    o oVar = (o) obj2;
                    String str = (String) obj;
                    List k13 = lh0Var.k();
                    ay ayVar = k13 != null ? (ay) CollectionsKt.firstOrNull(k13) : null;
                    if (ayVar != null) {
                        HashMap k03 = kh2.b0.k0(lh0Var);
                        k03.put("object_type", str);
                        m02.b bVar = new m02.b(ayVar, k03);
                        w wVar = oVar.f88862j;
                        NavigationImpl w13 = Navigation.w1((ScreenLocation) p3.f51207e.getValue());
                        w13.y0(bVar, "EXTRA_REPORT_FLOW_SENSITIVITY_DATA");
                        wVar.d(w13);
                    }
                    if (oVar.isBound()) {
                        oVar.p3();
                        break;
                    }
                }
                break;
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                ((r) obj2).a(new s02.p(((t) ((v) obj)).f110351c, Intrinsics.d(it.e(), "success")));
                break;
            default:
                w wVar2 = (w) obj2;
                e82.w wVar3 = e82.w.FACEBOOK;
                wVar2.d(new z(true, false, null, h32.f1.INSTAGRAM_ACCT_CLAIMING_SUCCESS, null));
                if (((q) it.c()).getIsMigrationBackfilled()) {
                    wVar2.d(new e82.v());
                }
                nx.d0.v((nx.d0) obj, h32.f1.USER_ENABLE_INSTAGRAM, "0", false, 12);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g gVar;
        String str;
        wy0 f13;
        String str2;
        k0 a13;
        k0 a14;
        String str3;
        int i13 = this.f66230i;
        int i14 = 2;
        String str4 = null;
        r6 = null;
        u50.f0 f0Var = null;
        Object obj2 = null;
        str4 = null;
        Object obj3 = this.f66232k;
        Object obj4 = this.f66231j;
        switch (i13) {
            case 0:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 1:
                return e((rn1.a) obj);
            case 2:
                px.i iVar = (px.i) obj;
                pw1.h hVar = (pw1.h) obj4;
                h hVar2 = hVar.f101537s;
                Date date = (Date) obj3;
                Intrinsics.f(iVar);
                switch (((y0) hVar2).f114715a) {
                    case 0:
                        gVar = new g(date, iVar);
                        break;
                    default:
                        gVar = new g(date, iVar);
                        break;
                }
                ((uw1.b) hVar.getView()).o3(new yx1.u(gVar, ph.a.X(), hVar.f97963d));
                return Unit.f80348a;
            case 3:
                return e((rn1.a) obj);
            case 4:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 5:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 6:
                return e((rn1.a) obj);
            case 7:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 8:
                f(((Number) obj).intValue());
                return Unit.f80348a;
            case 9:
                px.g pinMetrics = (px.g) obj;
                p pVar = (p) obj4;
                Intrinsics.f(pinMetrics);
                Date endDate = (Date) obj3;
                Intrinsics.checkNotNullExpressionValue(endDate, "$endDate");
                pVar.getClass();
                Intrinsics.checkNotNullParameter(pinMetrics, "pinMetrics");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                List list = pinMetrics.f101554a;
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list) {
                    px.e eVar = (px.e) obj5;
                    if (!eVar.f101551a.isVideoMetric()) {
                        px.f fVar = eVar.f101551a;
                        if (!fVar.isProductTag() && !ph.a.v0(pVar.r3(), fVar)) {
                            arrayList.add(obj5);
                        }
                    }
                }
                int i15 = com.pinterest.partnerAnalytics.g.pin_stats_engaged_summary_title;
                ArrayList L0 = ph.a.L0(arrayList);
                i1 i1Var = (i1) pVar.f140387b;
                ((yx1.j) ((yx1.e) pVar.getView())).d8(new yx1.c(i1Var.a(pinMetrics.f101555b, endDate, L0, i15, pinMetrics.f101557d, pinMetrics.f101559f, pinMetrics.f101556c, pinMetrics.f101558e)));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list) {
                    px.e eVar2 = (px.e) obj6;
                    if (eVar2.f101551a.isVideoMetric() && !ph.a.v0(pVar.r3(), eVar2.f101551a)) {
                        arrayList2.add(obj6);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    str = "<this>";
                    ((yx1.j) ((yx1.e) pVar.getView())).g8(new a0(i1Var.a(pinMetrics.f101555b, endDate, ph.a.L0(arrayList2), com.pinterest.partnerAnalytics.g.video_stats_title, pinMetrics.f101557d, pinMetrics.f101561h, pinMetrics.f101556c, pinMetrics.f101558e)));
                } else {
                    str = "<this>";
                    px.d dVar = pinMetrics.f101560g;
                    if (dVar != null) {
                        ((yx1.j) ((yx1.e) pVar.getView())).g8(new yx1.b0(dVar == px.d.MULTI_PAGE ? com.pinterest.partnerAnalytics.g.video_stats_not_available_disclaimer : com.pinterest.partnerAnalytics.g.video_stats_not_available_for_single_image));
                    } else {
                        ((yx1.j) ((yx1.e) pVar.getView())).g8(yx1.z.f140420b);
                    }
                }
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    px.f fVar2 = ((px.e) it.next()).f101551a;
                    String str5 = str;
                    Intrinsics.checkNotNullParameter(fVar2, str5);
                    arrayList3.add(ww1.c.valueOf(fVar2.name()));
                    str = str5;
                }
                pVar.f140401p = CollectionsKt.H0(arrayList3);
                return Unit.f80348a;
            case 10:
                h((Throwable) obj);
                return Unit.f80348a;
            case 11:
                h((Throwable) obj);
                return Unit.f80348a;
            case 12:
                h((Throwable) obj);
                return Unit.f80348a;
            case 13:
                i((tt1.a) obj);
                return Unit.f80348a;
            case 14:
                i((tt1.a) obj);
                return Unit.f80348a;
            case 15:
                l0 f14 = (l0) obj;
                Intrinsics.checkNotNullParameter(f14, "f");
                s0 s0Var = (s0) obj4;
                s0Var.f105806f0 = f14.f105771a;
                s0Var.f105807g0 = f14.f105772b;
                ((kotlin.jvm.internal.i0) obj3).f80432a = f14.f105773c;
                return Unit.f80348a;
            case 16:
                return b((v7) obj);
            case 17:
                return b((v7) obj);
            case 18:
                String fields = (String) obj;
                Intrinsics.checkNotNullParameter(fields, "fields");
                x02.a aVar = (x02.a) obj4;
                int i16 = aVar.f131491c;
                int value = x02.b.REQUEST_FROM_DID_IT.getValue();
                String str6 = aVar.f131286f;
                if (i16 == value) {
                    a12.d dVar2 = (a12.d) ((b12.a) obj3).f21099d;
                    Intrinsics.checkNotNullExpressionValue(str6, "getParentUid(...)");
                    return dVar2.m(str6, fields, "6");
                }
                if (i16 != x02.b.REQUEST_FROM_PIN.getValue()) {
                    if (i16 != x02.b.REQUEST_FROM_AGGREGATED_COMMENT.getValue()) {
                        return kk2.r.f79973a;
                    }
                    a12.d dVar3 = (a12.d) ((b12.a) obj3).f21099d;
                    Intrinsics.checkNotNullExpressionValue(str6, "getParentUid(...)");
                    String a15 = n00.b.a(n00.c.AGGREGATED_COMMENT_REPLY_FIELDS);
                    String str7 = aVar.f131287g;
                    return dVar3.j(str6, a15, str7 != null ? str7 : "6");
                }
                a12.d dVar4 = (a12.d) ((b12.a) obj3).f21099d;
                Intrinsics.checkNotNullExpressionValue(str6, "getParentUid(...)");
                String str8 = aVar.f131287g;
                String str9 = str8 != null ? str8 : "6";
                String str10 = aVar.f131288h;
                if (str10 != null && str10.length() != 0) {
                    str4 = str10;
                }
                return dVar4.i(str6, fields, str9, str4);
            case 19:
                Boolean exists = (Boolean) obj;
                Intrinsics.checkNotNullParameter(exists, "exists");
                if (exists.booleanValue()) {
                    return ((i22.b) obj4).f71442b.b(((u) obj3).a());
                }
                String a16 = ((u) obj3).a();
                wn0 wn0Var = new wn0(null, null, null, null, null, null, false, null, 255, null);
                i22.b bVar = (i22.b) obj4;
                boolean f15 = bVar.f71443c.f("PREF_COMMENT_ENABLED_ON_STORY_PIN_CREATE_DEFAULT", true);
                b60.b bVar2 = bVar.f71441a;
                ln0 ln0Var = new ln0(a16, wn0Var, null, null, null, null, null, null, f15 && (f13 = ((b60.d) bVar2).f()) != null && Intrinsics.d(f13.r4(), Boolean.FALSE), null, null, null, null, null, 16120, null);
                String uid = com.bumptech.glide.d.Q(bVar2).getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                return bVar.f71442b.d(ln0Var, uid).k(new b22.f(9, new s12.a(ln0Var, i14)));
            case 20:
                h((Throwable) obj);
                return Unit.f80348a;
            case 21:
                b1 it2 = (b1) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ta taVar = (ta) CollectionsKt.U(((n0) obj4).f120718a, it2.f120666e);
                if (taVar == null || (str2 = taVar.getUid()) == null) {
                    str2 = ((b1) ((l82.e) obj3).f82219b).f120667f;
                }
                String str11 = str2;
                Intrinsics.f(str11);
                return b1.b(it2, null, str11, null, null, 991);
            case 22:
                vd0.c cVar = (vd0.c) obj;
                vd0.c m13 = cVar != null ? cVar.m("data") : null;
                if (m13 != null) {
                    r rVar = (r) obj3;
                    ((gx.e) obj4).getClass();
                    String o13 = m13.o("invite_url", "");
                    Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
                    if (o13.length() > 0) {
                        String o14 = m13.o("invite_code", "");
                        Intrinsics.checkNotNullExpressionValue(o14, "optString(...)");
                        rVar.a(new y52.k(o13, o14));
                    }
                }
                return Unit.f80348a;
            case 23:
                ke2.d from = (ke2.d) obj;
                Intrinsics.checkNotNullParameter(from, "sceneItem");
                ((y) obj4).getClass();
                Intrinsics.checkNotNullParameter(from, "from");
                z1 r03 = kh2.b0.r0(from);
                String b13 = r03 != null ? r03.b() : null;
                Iterator it3 = ((l62.a) obj3).f81609a.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        String b14 = ((z1) next).b();
                        if (b13 != null) {
                            int i17 = a2.f106437b;
                            if (Intrinsics.d(b14, b13)) {
                                obj2 = next;
                            }
                        }
                    }
                }
                z1 z1Var = (z1) obj2;
                boolean z13 = (z1Var == null || (a14 = z1Var.a()) == null) ? false : a14.f106516d;
                Intrinsics.checkNotNullParameter(from, "<this>");
                Boolean valueOf = Boolean.valueOf(z13);
                SparseArray sparseArray = from.f79321c;
                sparseArray.put(1, valueOf);
                if (z1Var != null && (a13 = z1Var.a()) != null) {
                    r5 = a13.f106515c;
                }
                Intrinsics.checkNotNullParameter(from, "<this>");
                sparseArray.put(2, Boolean.valueOf(r5));
                return Unit.f80348a;
            case 24:
                h((Throwable) obj);
                return Unit.f80348a;
            case 25:
                f22.e eVar3 = (f22.e) obj;
                String str12 = eVar3.f60978b;
                if (str12 != null && (str3 = eVar3.f60977a) != null) {
                    e82.j jVar = (e82.j) obj4;
                    jVar.f57880f = str3;
                    Uri parse = Uri.parse(str12);
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                    ((lu1.c) jVar.f57875a).s((Activity) obj3, parse, null);
                }
                return Unit.f80348a;
            case 26:
                i((tt1.a) obj);
                return Unit.f80348a;
            case 27:
                ((i92.k) ((x) obj4).f16710c).m(((Activity) obj3).getString(g82.a.connected_to_social));
                return Unit.f80348a;
            case 28:
                o82.y0 it4 = (o82.y0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                m1 m1Var = (m1) ((q1) obj3);
                ArrayList g13 = h2.g((h2) obj4, m1Var.f93667a);
                o82.t tVar = o82.t.f93712e;
                it4.getClass();
                return o82.y0.e(g13, tVar, m1Var.f93668b);
            default:
                om1.c it5 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                z92.g gVar2 = (z92.g) obj4;
                rm1.q qVar = gVar2.f141441a;
                if (qVar == null) {
                    qVar = GestaltIconButton.E;
                }
                rm1.q qVar2 = qVar;
                fm1.c Z = d7.b.Z(!(Intrinsics.d(gVar2, z92.g.f141440d) || gVar2.f141441a == null));
                Integer num = gVar2.f141443c;
                if (num != null) {
                    String string = ((LegoActionBar) obj3).getResources().getString(num.intValue());
                    if (string != null) {
                        f0Var = bs1.c.p2(string);
                    }
                }
                return om1.c.e(it5, qVar2, null, null, Z, f0Var, false, 0, 998);
        }
    }
}

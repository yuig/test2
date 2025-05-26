package vr;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.k;
import com.pinterest.api.model.wy0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import es.c;
import es.h;
import h32.c1;
import h32.e;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d;
import lh0.g1;
import lh0.z3;
import n60.o;
import nm.u;
import nx.d0;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f126448a;

    /* renamed from: b, reason: collision with root package name */
    public final d f126449b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f126450c;

    /* renamed from: d, reason: collision with root package name */
    public final es.a f126451d;

    /* renamed from: e, reason: collision with root package name */
    public final h f126452e;

    public b(d0 pinalytics, d adFormatsLibraryExperiments, b60.b activeUserManager, es.a adFormats, h adsCommonDisplay) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        this.f126448a = pinalytics;
        this.f126449b = adFormatsLibraryExperiments;
        this.f126450c = activeUserManager;
        this.f126451d = adFormats;
        this.f126452e = adsCommonDisplay;
    }

    public final void a(f30 pin, HashMap auxData) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        ArrayList arrayList = new ArrayList();
        Boolean N5 = pin.N5();
        Intrinsics.checkNotNullExpressionValue(N5, "getPromotedIsAutoAssembled(...)");
        if (N5.booleanValue()) {
            arrayList.add("auto_assembled");
        }
        Boolean O5 = pin.O5();
        Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
        if (O5.booleanValue()) {
            arrayList.add("catalog_carousel_ad");
        }
        Boolean V5 = pin.V5();
        Intrinsics.checkNotNullExpressionValue(V5, "getPromotedIsSideswipeDisabled(...)");
        if (V5.booleanValue()) {
            arrayList.add("sideswipe_disabled");
        }
        auxData.put("promoted_is", CollectionsKt.Z(arrayList, ",", null, null, 0, null, null, 62));
        g t33 = pin.t3();
        if (t33 != null) {
            String R = t33.R();
            if (R != null && R.length() != 0) {
                String R2 = t33.R();
                if (R2 == null) {
                    R2 = "";
                }
                auxData.put("ce_alt_image_signature", R2);
            }
            auxData.put("ads_collection_grid_click_type", String.valueOf(t33.T().intValue()));
            Boolean c03 = t33.c0();
            Intrinsics.checkNotNullExpressionValue(c03, "getExcludeFromGridRepTests(...)");
            auxData.put("ads_exclude_from_grid_rep_tests", c03.booleanValue() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
            auxData.put("ads_grid_click_type", String.valueOf(t33.d0().intValue()));
        }
    }

    public final e b(e eVar, f30 pin, Integer num, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        e32.b e13 = e(pin, num, str);
        if (e13 == null) {
            return eVar;
        }
        h32.d dVar = eVar != null ? new h32.d(eVar) : new h32.d();
        dVar.b(e13);
        return dVar.a();
    }

    public final void c(f30 f30Var, HashMap auxData) {
        g t33;
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (f30Var == null || (t33 = f30Var.t3()) == null) {
            return;
        }
        if (!((c) this.f126451d).M(f30Var)) {
            t33 = null;
        }
        if (t33 != null) {
            auxData.put("grid_click_type", String.valueOf(t33.d0().intValue()));
            auxData.put("destination_type", String.valueOf(t33.X().intValue()));
        }
    }

    public final cs.d d(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        es.a aVar = this.f126451d;
        return !((c) aVar).t(pin) ? cs.d.NOT_SUPPORTED : ((c) aVar).u(pin) ? cs.d.VIDEO : cs.d.IMAGE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r1.X().intValue() == h32.n0.NATIVE_BROWSER.getValue()) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e32.b e(com.pinterest.api.model.f30 r12, java.lang.Integer r13, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.Boolean r0 = r12.d5()
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            com.pinterest.api.model.g r0 = r12.t3()
            if (r0 == 0) goto Lc8
            java.lang.Boolean r3 = r0.c0()
            com.pinterest.api.model.k r2 = r0.L()
            if (r2 == 0) goto L31
            com.pinterest.api.model.k$c r2 = r2.j()
            if (r2 == 0) goto L31
            int r2 = r2.getValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7 = r2
            goto L32
        L31:
            r7 = r1
        L32:
            com.pinterest.api.model.k r2 = r0.L()
            if (r2 == 0) goto L48
            com.pinterest.api.model.k$d r2 = r2.k()
            if (r2 == 0) goto L48
            int r2 = r2.getValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            com.pinterest.api.model.k r2 = r0.L()
            if (r2 == 0) goto L5f
            com.pinterest.api.model.k$a r2 = r2.h()
            if (r2 == 0) goto L5f
            int r2 = r2.getValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = r2
            goto L60
        L5f:
            r5 = r1
        L60:
            com.pinterest.api.model.k r0 = r0.L()
            if (r0 == 0) goto L74
            com.pinterest.api.model.k$b r0 = r0.i()
            if (r0 == 0) goto L74
            int r0 = r0.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L74:
            r4 = r1
            es.a r0 = r11.f126451d
            r1 = r0
            es.c r1 = (es.c) r1
            boolean r1 = r1.i0(r12)
            if (r1 != 0) goto Lb6
            r1 = r0
            es.c r1 = (es.c) r1
            boolean r1 = r1.G(r12)
            if (r1 == 0) goto La0
            com.pinterest.api.model.g r1 = r12.t3()
            if (r1 == 0) goto La0
            java.lang.Integer r1 = r1.X()
            h32.n0 r2 = h32.n0.NATIVE_BROWSER
            int r2 = r2.getValue()
            int r1 = r1.intValue()
            if (r1 != r2) goto La0
            goto Lb6
        La0:
            es.c r0 = (es.c) r0
            boolean r12 = r0.G(r12)
            if (r12 == 0) goto Laf
            h32.n0 r12 = h32.n0.WEB
            int r12 = r12.getValue()
            goto Lbc
        Laf:
            h32.n0 r12 = h32.n0.NONE
            int r12 = r12.getValue()
            goto Lbc
        Lb6:
            h32.n0 r12 = h32.n0.NATIVE_BROWSER
            int r12 = r12.getValue()
        Lbc:
            e32.b r1 = new e32.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r2 = r1
            r9 = r13
            r10 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vr.b.e(com.pinterest.api.model.f30, java.lang.Integer, java.lang.String):e32.b");
    }

    public final ArrayList f(f30 pin) {
        k L;
        k L2;
        k L3;
        k L4;
        k L5;
        k L6;
        Intrinsics.checkNotNullParameter(pin, "pin");
        ArrayList arrayList = new ArrayList();
        c cVar = (c) this.f126451d;
        if (cVar.J(pin)) {
            String str = null;
            if (cVar.Y(pin) != cVar.e0(pin)) {
                boolean Y = cVar.Y(pin);
                boolean e03 = cVar.e0(pin);
                g t33 = pin.t3();
                String uid = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Boolean i53 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i53, "getIsThirdPartyAd(...)");
                boolean booleanValue = i53.booleanValue();
                g t34 = pin.t3();
                arrayList.add(new cs.a("is_promoted_video", Y, e03, t33, uid, booleanValue, String.valueOf((t34 == null || (L6 = t34.L()) == null) ? null : L6.l())));
            }
            if (cVar.a0(pin) != cVar.g0(pin)) {
                boolean a03 = cVar.a0(pin);
                boolean g03 = cVar.g0(pin);
                g t35 = pin.t3();
                String uid2 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                Boolean i54 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i54, "getIsThirdPartyAd(...)");
                boolean booleanValue2 = i54.booleanValue();
                g t36 = pin.t3();
                arrayList.add(new cs.a("is_story_ad", a03, g03, t35, uid2, booleanValue2, String.valueOf((t36 == null || (L5 = t36.L()) == null) ? null : L5.l())));
            }
            if (cVar.V(pin) != cVar.b0(pin)) {
                boolean V = cVar.V(pin);
                boolean b03 = cVar.b0(pin);
                g t37 = pin.t3();
                String uid3 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                Boolean i55 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i55, "getIsThirdPartyAd(...)");
                boolean booleanValue3 = i55.booleanValue();
                g t38 = pin.t3();
                arrayList.add(new cs.a(SbaPinRep.AUXDATA_IS_LEAD_AD, V, b03, t37, uid3, booleanValue3, String.valueOf((t38 == null || (L4 = t38.L()) == null) ? null : L4.l())));
            }
            if (cVar.X(pin) != cVar.d0(pin)) {
                boolean X = cVar.X(pin);
                boolean d03 = cVar.d0(pin);
                g t39 = pin.t3();
                String uid4 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                Boolean i56 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i56, "getIsThirdPartyAd(...)");
                boolean booleanValue4 = i56.booleanValue();
                g t310 = pin.t3();
                arrayList.add(new cs.a("is_promoted_quiz_pin", X, d03, t39, uid4, booleanValue4, String.valueOf((t310 == null || (L3 = t310.L()) == null) ? null : L3.l())));
            }
            if (cVar.Z(pin) != cVar.f0(pin)) {
                boolean Z = cVar.Z(pin);
                boolean f03 = cVar.f0(pin);
                g t311 = pin.t3();
                String uid5 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                Boolean i57 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i57, "getIsThirdPartyAd(...)");
                boolean booleanValue5 = i57.booleanValue();
                g t312 = pin.t3();
                arrayList.add(new cs.a("is_showcase_pin", Z, f03, t311, uid5, booleanValue5, String.valueOf((t312 == null || (L2 = t312.L()) == null) ? null : L2.l())));
            }
            if (cVar.W(pin) != cVar.c0(pin)) {
                boolean W = cVar.W(pin);
                boolean c03 = cVar.c0(pin);
                g t313 = pin.t3();
                String uid6 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
                Boolean i58 = pin.i5();
                Intrinsics.checkNotNullExpressionValue(i58, "getIsThirdPartyAd(...)");
                boolean booleanValue6 = i58.booleanValue();
                g t314 = pin.t3();
                if (t314 != null && (L = t314.L()) != null) {
                    str = L.l();
                }
                arrayList.add(new cs.a("is_promoted_carousel_pin", W, c03, t313, uid6, booleanValue6, String.valueOf(str)));
            }
        }
        return arrayList;
    }

    public final String g(f30 f30Var) {
        wy0 f13;
        if (f30Var == null || !f30Var.d5().booleanValue()) {
            return null;
        }
        u uVar = new u();
        g t33 = f30Var.t3();
        if (t33 != null) {
            Boolean i03 = t33.i0();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(i03, bool) && (f13 = ((b60.d) this.f126450c).f()) != null && Intrinsics.d(f13.F4(), bool) && this.f126449b.k()) {
                uVar.t("is_weight_loss_shown_opted_out", bool);
            }
        }
        if (uVar.isEmpty()) {
            return null;
        }
        return uVar.toString();
    }

    public final void h(List newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        ArrayList arrayList = new ArrayList();
        for (Object obj : newItems) {
            if (obj instanceof f30) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.B((f30) next, "getIsPromoted(...)")) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        d dVar = this.f126449b;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        if (g1Var.o("android_ad_logging_enhancements", "enabled", z3Var) || g1Var.l("android_ad_logging_enhancements")) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                f30 f30Var = (f30) it2.next();
                f1 f1Var = f1.PIN_AD_DELIVERED;
                String uid = f30Var.getUid();
                Boolean bool = Boolean.FALSE;
                this.f126448a.u(f1Var, uid, new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b(null, f30Var, null, null), null), null, false);
            }
        }
    }
}

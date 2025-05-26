package ek1;

import android.webkit.URLUtil;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.tr;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import ey.n2;
import h32.d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ni1.m2;
import ni1.x2;
import so.md;

/* loaded from: classes2.dex */
public final class q1 extends l82.d {

    /* renamed from: g, reason: collision with root package name */
    public static final ps0.y f59322g = new ps0.y(13, 0);

    /* renamed from: b, reason: collision with root package name */
    public final fs.c f59323b;

    /* renamed from: c, reason: collision with root package name */
    public final es.a f59324c;

    /* renamed from: d, reason: collision with root package name */
    public final es.h f59325d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.b0 f59326e;

    /* renamed from: f, reason: collision with root package name */
    public final ur.a f59327f;

    public q1(ur.a adsDependencies, es.a adFormats, es.h adsCommonDisplay, fs.c adsSalesDealsDisplay, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(adsSalesDealsDisplay, "adsSalesDealsDisplay");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(adsCommonDisplay, "adsCommonDisplay");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        this.f59323b = adsSalesDealsDisplay;
        this.f59324c = adFormats;
        this.f59325d = adsCommonDisplay;
        this.f59326e = pinAuxHelper;
        this.f59327f = adsDependencies;
    }

    public static void g(l82.e eVar, f30 pin, sr srVar) {
        int i13 = (int) (200 * ((r1) eVar.f82219b).f59344f);
        Intrinsics.checkNotNullParameter(pin, "pin");
        sr m13 = b40.m(pin);
        if (m13 != null) {
            Double h10 = m13.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
            double min = Math.min(h10.doubleValue(), i13);
            double doubleValue = m13.k().doubleValue();
            Double h13 = m13.h();
            Intrinsics.checkNotNullExpressionValue(h13, "getHeight(...)");
            double doubleValue2 = (doubleValue / h13.doubleValue()) * min;
            pr f13 = sr.f();
            f13.f(Double.valueOf(doubleValue2));
            f13.c(Double.valueOf(min));
            f13.e(m13.j());
            f13.b(m13.g());
            f13.d(m13.i());
            srVar = f13.a();
        }
        int E0 = bs1.c.E0(srVar);
        int w03 = bs1.c.w0(srVar);
        eVar.f(new u00.e(new qa2.m(E0, w03, E0, w03, qa2.c1.NONE, 32), 18));
    }

    public static ArrayList h(List list, tr trVar, boolean z13, cs.c cVar) {
        ArrayList arrayList;
        sr y13;
        int i13 = g1.f59236b[cVar.ordinal()];
        int i14 = i13 != 1 ? i13 != 2 ? 3 : 5 : 1;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((f30) obj).A4() != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty() && (arrayList.size() >= i14 || z13)) {
            for (int i15 = 0; i15 < i14; i15++) {
                if (i15 < arrayList.size()) {
                    f30 f30Var = (f30) CollectionsKt.U(i15, arrayList);
                    Map A4 = f30Var != null ? f30Var.A4() : null;
                    if (A4 == null) {
                        A4 = kotlin.collections.z0.d();
                    }
                    if ((!A4.isEmpty()) && f30Var != null && (y13 = b40.y(f30Var, trVar)) != null) {
                        String j13 = y13.j();
                        arrayList2.add(j13 != null ? j13 : "");
                    }
                } else {
                    arrayList2.add("");
                }
            }
        }
        return arrayList2;
    }

    public static yi1.d j(l82.e resultBuilder, f30 pin, boolean z13, boolean z14, String str, String str2) {
        yi1.e eVar;
        r1 r1Var = (r1) resultBuilder.f82219b;
        yi1.r loggingData = r1Var.f59351m;
        Boolean S4 = pin.S4();
        Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
        boolean booleanValue = S4.booleanValue();
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        boolean z15 = ((r1) resultBuilder.f82219b).f59342d.f90854g;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        boolean s03 = b40.s0(pin);
        sr m13 = b40.m(pin);
        String D0 = m13 != null ? bs1.c.D0(m13) : null;
        if (D0 == null || D0.length() == 0) {
            D0 = ((!z13 && !booleanValue) || str2 == null || str2.length() == 0) ? str : str2;
        }
        String str3 = D0 == null ? b40.a1(pin, z15) ? "" : null : D0;
        if (str3 != null) {
            u50.n pVar = s03 ? new u50.p() : u50.q.f120581a;
            eVar = new yi1.e(URLUtil.isValidUrl(str3) ? new yi1.k0(str3) : str3.length() > 0 ? new yi1.j0(str3) : yi1.i0.f139105a, pVar, pVar, s03, s03 ? yi1.g0.COLLAGE_FEED_BORDER : yi1.g0.NONE);
        } else {
            eVar = null;
        }
        n2 n2Var = str3 != null ? new n2(str3, r1Var.f59340b, d4.UNKNOWN_VIEW, false, 0, 0) : null;
        resultBuilder.h(new k1(yi1.r.a(loggingData, false, str3, 0L, 0L, false, false, n2Var == null ? loggingData.f139151i : n2Var, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE), 0));
        if (eVar != null) {
            if (r1Var.f59356r == yi1.a.NotLoaded || z14) {
                resultBuilder.h(h1.f59240k);
                Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
                resultBuilder.h(new a2(r1Var.f59353o, 2));
                resultBuilder.f(h1.f59249t);
                return new yi1.b(eVar);
            }
        }
        return yi1.c.f139077a;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        r1 vmState = (r1) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        l82.e d2 = l82.d.d(new r(), vmState);
        Intrinsics.checkNotNullParameter(d2, "<this>");
        d2.a(b.f59213a);
        az.b bVar = ((r) d2.f82218a).f59329b;
        f30 pin = vmState.f59338a;
        Intrinsics.checkNotNullParameter(pin, "pin");
        ur.a adsCoreDependencies = this.f59327f;
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        h32.y1 builder = new h32.y1();
        builder.f67433b = -1L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        ur.b bVar2 = (ur.b) adsCoreDependencies;
        h32.k0 c13 = es.h.c(bVar2.f123060c, pin);
        h32.f fVar = ((es.c) bVar2.f123058a).j0(pin) ? new h32.f() : null;
        builder.f67435c = pin.getUid();
        builder.f67467y = b40.i0(pin);
        builder.f67463u = pin.d5();
        builder.f67438d0 = pin.b5();
        builder.F = Boolean.valueOf(bs1.c.d1(pin));
        builder.f67455m = pin.z4();
        if (b40.X0(pin)) {
            builder.f67467y = b40.i0(pin);
            builder.f67465w = Boolean.TRUE;
        }
        if (c13 != null) {
            builder.Z = c13;
        }
        if (fVar != null) {
            builder.f67440e0 = fVar;
        }
        builder.f67446h0 = ((vr.b) bVar2.f123059b).g(pin);
        Short o13 = ((es.v) bVar2.f123060c).o(pin);
        if (o13 != null) {
            builder.f67448i0 = Short.valueOf(o13.shortValue());
        }
        builder.f67445h = Short.valueOf((short) vmState.f59340b);
        d2.f(new j1(az.b.e(bVar, null, builder.a(), null, 5), 0));
        x2 x2Var = vmState.f59342d;
        d2.h(new m2(df.j1.H1(vmState.f59338a, x2Var.f90852f, x2Var.A, new defpackage.d(14, d2), new defpackage.d(15, d2), this.f59324c), 2));
        return d2.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x05c7, code lost:
    
        if (r12.f128722d == true) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0624 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0332 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b0  */
    @Override // l82.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l82.c0 f(u50.s r117, u50.o r118, l82.i0 r119, l82.e r120) {
        /*
            Method dump skipped, instructions count: 3338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ek1.q1.f(u50.s, u50.o, l82.i0, l82.e):l82.c0");
    }

    public final HashMap i(l82.e eVar) {
        HashMap contents;
        ln e03;
        Integer num;
        String str;
        List d2;
        l30 l30Var;
        r1 r1Var = (r1) eVar.f82219b;
        HashMap hashMap = r1Var.f59352n;
        boolean z13 = r1Var.O;
        boolean z14 = false;
        f30 pin = r1Var.f59338a;
        if (z13 && !df.j1.K1(pin, r1Var.i(), new i1(eVar, r1Var, 0), new i1(eVar, r1Var, 1))) {
            z14 = true;
        }
        boolean z15 = r1Var.f59342d.C;
        Integer valueOf = Integer.valueOf(r1Var.f59359u);
        Intrinsics.checkNotNullParameter(pin, "pin");
        nx.q commerceData = r1Var.f59361w;
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        es.a adFormats = this.f59324c;
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        nx.b0 pinAuxHelper = this.f59326e;
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        ur.a adsDependencies = this.f59327f;
        Intrinsics.checkNotNullParameter(adsDependencies, "adsDependencies");
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        hashMap2.put("pin_column_index", String.valueOf(r1Var.f59354p + 1));
        hashMap2.put("number_of_columns", String.valueOf(r1Var.f59360v));
        es.c cVar = (es.c) adFormats;
        if (cVar.H(pin)) {
            hashMap2.put("is_third_party_ad_asin_enabled", z15 ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
        }
        if (z14) {
            hashMap2.put("audio_control_button_is_visible", String.valueOf(!r1Var.P));
            hashMap2.put("audio_control_button_disabled", String.valueOf(b40.C0(pin)));
        }
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            contents = hashMap2;
            oi1.b.b(hashMap2, r1Var.X, pin, valueOf, false, pinAuxHelper);
            boolean z16 = r1Var.f59364z;
            if ((z16 || r1Var.A) && (num = r1Var.W) != null) {
                contents.put("index", num.toString());
            }
            if (z16) {
                String str2 = r1Var.B;
                if (str2 != null) {
                    contents.put("story_type", str2);
                }
                Boolean bool = r1Var.C;
                if (bool != null) {
                    contents.put("is_multiple_advertiser", String.valueOf(bool.booleanValue()));
                }
            }
            if (cVar.K(pin)) {
                String f03 = com.bumptech.glide.d.f0(pin);
                if (f03 == null) {
                    f03 = "";
                }
                contents.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03);
                contents.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            }
            Boolean O5 = pin.O5();
            Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
            if (O5.booleanValue()) {
                cc J3 = pin.J3();
                if (J3 == null || (d2 = J3.d()) == null || (l30Var = (l30) d2.get(r1Var.f59345g)) == null || (str = l30Var.t()) == null) {
                    str = "0";
                }
                contents.put("internal_item_id", str);
            }
            ((vr.b) ((ur.b) adsDependencies).f123059b).c(pin, contents);
            pinAuxHelper.getClass();
            nx.b0.b(pin, r1Var.G, contents);
            oi1.b.a(pin, contents);
        } else {
            contents = hashMap2;
        }
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 != null && (e03 = t33.e0()) != null) {
            contents.put("promo_ad_type", String.valueOf(e03.i().intValue()));
        }
        pinAuxHelper.e(pin, contents, commerceData);
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new HashMap(contents);
    }

    public final void k(yi1.f0 f0Var, l82.e resultBuilder) {
        if (f0Var instanceof yi1.y) {
            resultBuilder.h(new l1(f0Var, 0));
            resultBuilder.f(new l1(f0Var, 1));
            resultBuilder.f(new u00.e(i(resultBuilder), 21));
            return;
        }
        if (f0Var instanceof yi1.v) {
            resultBuilder.h(new l1(f0Var, 2));
            h32.z1 z1Var = ((r) resultBuilder.f82218a).f59329b.f20694b;
            if (z1Var != null) {
                resultBuilder.f(new j1.a(z1Var, f0Var, this, resultBuilder, 2));
                return;
            }
            return;
        }
        if (f0Var instanceof yi1.u) {
            resultBuilder.h(new bi1.a0(f0Var, 9));
            resultBuilder.f(new u00.e(i(resultBuilder), 21));
            return;
        }
        if (Intrinsics.d(f0Var, yi1.t.f139159a)) {
            resultBuilder.f(h1.f59243n);
            return;
        }
        if (f0Var instanceof yi1.w) {
            r1 r1Var = (r1) resultBuilder.f82219b;
            String str = r1Var.f59351m.f139145c;
            String str2 = str == null ? "" : str;
            String uid = r1Var.f59338a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            resultBuilder.h(m1.f59280j);
            if (r1Var.f59340b < r1Var.f59355q && str2.length() > 0) {
                resultBuilder.a(new p0(str2, false, false, s92.c.UNKNOWN, null, ((yi1.w) f0Var).f139163a));
            }
            if (uid.length() > 0) {
                resultBuilder.a(new q0(uid, ((yi1.w) f0Var).f139163a));
                return;
            }
            return;
        }
        if (f0Var instanceof yi1.x) {
            yi1.x event = (yi1.x) f0Var;
            resultBuilder.h(h1.f59241l);
            resultBuilder.f(h1.f59242m);
            r1 r1Var2 = (r1) resultBuilder.f82219b;
            int i13 = r1Var2.f59340b;
            String str3 = r1Var2.f59351m.f139145c;
            String str4 = str3 == null ? "" : str3;
            if (i13 < r1Var2.f59355q && str4.length() > 0) {
                hs1.x xVar = event.f139165b;
                resultBuilder.a(new p0(str4, xVar == hs1.x.DISK || xVar == hs1.x.MEMORY, true, dl2.b.C0(xVar, event.f139164a), event.f139164a, event.f139166c));
            }
            String uid2 = ((r1) resultBuilder.f82219b).f59338a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            resultBuilder.a(new s0(uid2, event.f139166c));
            vr.a adsCommonAnalytics = ((ur.b) this.f59327f).f123059b;
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Intrinsics.checkNotNullParameter(event, "event");
            es.a adFormats = this.f59324c;
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
            r1 r1Var3 = (r1) resultBuilder.f82219b;
            long j13 = r1Var3.f59351m.f139146d;
            long j14 = j13 > 0 ? event.f139167d - j13 : 0L;
            az.a aVar = r1Var3.f59357s == d2.Is1PxVisible ? az.a.IMPRESSION_IN_PROGRESS : az.a.AWAITING_1PX_VISIBLE;
            az.a aVar2 = ((r) resultBuilder.f82218a).f59329b.f20695c;
            az.a aVar3 = az.a.IMPRESSION_IN_PROGRESS;
            if (aVar2 != aVar3 && aVar == aVar3) {
                long j15 = event.f139168e * 1000000;
                resultBuilder.h(new a2(j15, 0));
                resultBuilder.f(new a2(j15, 1));
                f30 f30Var = r1Var3.f59338a;
                if (ps0.y.g(resultBuilder, f30Var, adFormats) && y1.f59399a[((vr.b) adsCommonAnalytics).d(f30Var).ordinal()] == 1) {
                    String uid3 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    i0 i0Var = new i0(new zw.b(uid3));
                    String uid4 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                    resultBuilder.d(i0Var, new i0(new zw.c(uid4)));
                }
            }
            resultBuilder.f(new b2(aVar, event, j14));
            return;
        }
        if (f0Var instanceof yi1.b0) {
            r1 r1Var4 = (r1) resultBuilder.f82219b;
            if (!r1Var4.f59351m.f139149g) {
                yi1.b0 b0Var = (yi1.b0) f0Var;
                s92.c C0 = dl2.b.C0(b0Var.f139072a, b0Var.f139073b);
                String uid5 = r1Var4.f59338a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                resultBuilder.a(new o0(uid5, C0, b0Var.f139073b, b0Var.f139074c, b0Var.f139075d, b0Var.f139076e));
            }
            resultBuilder.h(new u00.e(r1Var4, 19));
            return;
        }
        if (f0Var instanceof yi1.c0) {
            r1 r1Var5 = (r1) resultBuilder.f82219b;
            yi1.r rVar = r1Var5.f59351m;
            if (rVar.f139150h) {
                return;
            }
            String uid6 = r1Var5.f59338a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid6, "getUid(...)");
            resultBuilder.h(new k1(rVar, 1));
            resultBuilder.a(new u0(uid6, ((yi1.c0) f0Var).f139078a));
            return;
        }
        boolean z13 = f0Var instanceof yi1.d0;
        md mdVar = md.f113556a;
        if (z13) {
            l82.i0 i0Var2 = resultBuilder.f82219b;
            r1 r1Var6 = (r1) i0Var2;
            boolean z14 = ((r1) i0Var2).f59342d.f90871o0;
            resultBuilder.a(new l0(mdVar));
            if (z14) {
                return;
            }
            String uid7 = r1Var6.f59338a.getUid();
            Intrinsics.checkNotNullExpressionValue(uid7, "getUid(...)");
            yi1.d0 d0Var = (yi1.d0) f0Var;
            resultBuilder.a(new r0(uid7, d0Var.f139079a, r1Var6.f59340b, d0Var.f139080b));
            return;
        }
        if (f0Var instanceof yi1.e0) {
            l82.i0 i0Var3 = resultBuilder.f82219b;
            r1 r1Var7 = (r1) i0Var3;
            boolean z15 = ((r1) i0Var3).f59342d.f90871o0;
            resultBuilder.a(new l0(mdVar));
            n2 n2Var = r1Var7.f59351m.f139151i;
            if (n2Var != null) {
                resultBuilder.a(new t0(n2Var, ((yi1.e0) f0Var).f139087b));
            }
            if (z15) {
                String uid8 = r1Var7.f59338a.getUid();
                Intrinsics.checkNotNullExpressionValue(uid8, "getUid(...)");
                yi1.e0 e0Var = (yi1.e0) f0Var;
                resultBuilder.a(new r0(uid8, e0Var.j(), r1Var7.f59340b, e0Var.f139087b));
                return;
            }
            return;
        }
        if (f0Var instanceof yi1.z) {
            yi1.z zVar = (yi1.z) f0Var;
            c2.i(resultBuilder, zVar.k(), zVar.l(), zVar.j());
            return;
        }
        if (f0Var instanceof yi1.a0) {
            yi1.a0 event2 = (yi1.a0) f0Var;
            Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
            Intrinsics.checkNotNullParameter(event2, "event");
            az.b bVar = ((r) resultBuilder.f82218a).f59329b;
            h32.z1 z1Var2 = bVar.f20694b;
            if (z1Var2 == null) {
                return;
            }
            List list = z1Var2.f67506q;
            ArrayList H0 = list != null ? CollectionsKt.H0(list) : new ArrayList();
            H0.add(event2.f139070a);
            resultBuilder.f(new j1(az.b.e(bVar, null, com.bumptech.glide.d.A0(z1Var2, new i1.y(H0, 4)), null, 5), 2));
        }
    }
}

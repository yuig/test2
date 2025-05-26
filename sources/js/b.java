package js;

import android.net.Uri;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i3;
import com.pinterest.api.model.i30;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.md;
import com.pinterest.api.model.n90;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.z90;
import com.pinterest.api.model.zb;
import df.j1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import nm.q;
import tb0.g;
import tb0.h;
import tb0.p;
import vb0.j;
import x02.i2;

/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final es.a f77558a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.e f77559b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f77560c;

    /* renamed from: d, reason: collision with root package name */
    public final UserDeserializer f77561d;

    public b(es.a adFormats, lh0.e experiments, i2 pinRepository, UserDeserializer userDeserializer) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        this.f77558a = adFormats;
        this.f77559b = experiments;
        this.f77560c = pinRepository;
        this.f77561d = userDeserializer;
    }

    public static String c(vd0.c cVar, Uri uri, String str) {
        String d2;
        return (cVar == null || (d2 = cVar.d(str)) == null) ? uri.getQueryParameter(str) : d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.pinterest.api.model.f30 a(com.pinterest.api.model.f30 r7, vd0.c r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "pin"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "adPreviewDeeplinkUrl"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r0 = " data: "
            if (r8 == 0) goto L3d
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch: java.lang.Exception -> L1b
            com.pinterest.api.model.f30 r7 = r6.b(r7, r8, r9)     // Catch: java.lang.Exception -> L1b
            r8 = 1
            goto L3e
        L1b:
            r1 = move-exception
            java.util.HashSet r2 = tb0.h.f117076w
            tb0.h r2 = tb0.g.f117075a
            java.lang.String r3 = r7.getUid()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to Parse response from the Ad Preview API. PinId: "
            r4.<init>(r5)
            r4.append(r3)
            r4.append(r0)
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            tb0.p r3 = tb0.p.AD_FORMATS
            r2.q(r1, r8, r3)
        L3d:
            r8 = 0
        L3e:
            if (r8 != 0) goto L6b
            kotlin.jvm.internal.Intrinsics.f(r9)     // Catch: java.lang.Exception -> L49
            r8 = 0
            com.pinterest.api.model.f30 r7 = r6.b(r7, r8, r9)     // Catch: java.lang.Exception -> L49
            goto L6b
        L49:
            r8 = move-exception
            java.util.HashSet r1 = tb0.h.f117076w
            tb0.h r1 = tb0.g.f117075a
            java.lang.String r2 = r7.getUid()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to Parse response from the push notification payload. PinId: "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            tb0.p r0 = tb0.p.AD_FORMATS
            r1.q(r8, r9, r0)
        L6b:
            x02.i2 r8 = r6.f77560c
            r8.W(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: js.b.a(com.pinterest.api.model.f30, vd0.c, java.lang.String):com.pinterest.api.model.f30");
    }

    public final f30 b(f30 f30Var, vd0.c cVar, Uri uri) {
        wy0 wy0Var;
        cc ccVar;
        List d2;
        String c13;
        String c14;
        e30 R6 = f30Var.R6();
        String c15 = c(cVar, uri, "is_promoted");
        R6.V0(c15 != null ? Boolean.valueOf(Boolean.parseBoolean(c15)) : null);
        String c16 = c(cVar, uri, "promoted_is_removable");
        R6.f37085e2 = c16 != null ? Boolean.valueOf(Boolean.parseBoolean(c16)) : null;
        boolean[] zArr = R6.f37101h3;
        if (zArr.length > 160) {
            zArr[160] = true;
        }
        String c17 = c(cVar, uri, "is_eligible_for_aggregated_comments");
        R6.s0(c17 != null ? Boolean.valueOf(Boolean.parseBoolean(c17)) : null);
        String c18 = c(cVar, uri, "is_eligible_for_web_closeup");
        R6.R0 = c18 != null ? Boolean.valueOf(Boolean.parseBoolean(c18)) : null;
        boolean[] zArr2 = R6.f37101h3;
        if (zArr2.length > 95) {
            zArr2[95] = true;
        }
        String c19 = c(cVar, uri, "promoted_is_max_video");
        R6.f37066a2 = c19 != null ? Boolean.valueOf(Boolean.parseBoolean(c19)) : null;
        boolean[] zArr3 = R6.f37101h3;
        if (zArr3.length > 156) {
            zArr3[156] = true;
        }
        R6.f37082e = c(cVar, uri, "ad_destination_url");
        boolean[] zArr4 = R6.f37101h3;
        if (zArr4.length > 4) {
            zArr4[4] = true;
        }
        String c23 = c(cVar, uri, "promoter");
        if (c23 != null) {
            vd0.c json = new vd0.c(c23);
            UserDeserializer userDeserializer = this.f77561d;
            userDeserializer.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            wy0Var = userDeserializer.e(json, false, false);
        } else {
            wy0Var = null;
        }
        R6.f37117l2 = wy0Var;
        boolean[] zArr5 = R6.f37101h3;
        if (zArr5.length > 167) {
            zArr5[167] = true;
        }
        R6.I1(c(cVar, uri, "promoted_android_deep_link"));
        String c24 = c(cVar, uri, "promoted_is_showcase");
        R6.f37090f2 = c24 != null ? Boolean.valueOf(Boolean.parseBoolean(c24)) : null;
        boolean[] zArr6 = R6.f37101h3;
        if (zArr6.length > 161) {
            zArr6[161] = true;
        }
        String c25 = c(cVar, uri, "promoted_is_quiz");
        Boolean valueOf = c25 != null ? Boolean.valueOf(Boolean.parseBoolean(c25)) : null;
        R6.d2 = valueOf;
        boolean[] zArr7 = R6.f37101h3;
        if (zArr7.length > 159) {
            zArr7[159] = true;
        }
        if (Intrinsics.d(valueOf, Boolean.TRUE) && (c14 = c(cVar, uri, "promoted_quiz_pin_data")) != null) {
            try {
                R6.f37113k2 = (z90) vd0.c.f125622b.b(z90.class, c14);
                boolean[] zArr8 = R6.f37101h3;
                if (zArr8.length > 166) {
                    zArr8[166] = true;
                }
            } catch (Exception e13) {
                HashSet hashSet = h.f117076w;
                g.f117075a.q(e13, a.a.j("Quiz Preview: Error parsing promoted_quiz_pin_data. Pin ID: ", R6.f37063a), p.QUIZ);
            }
        }
        R6.f37138r = c(cVar, uri, "call_to_action_text");
        boolean[] zArr9 = R6.f37101h3;
        if (zArr9.length > 17) {
            zArr9[17] = true;
        }
        String c26 = c(cVar, uri, "ad_data");
        if (c26 != null) {
            Object e14 = vd0.c.f125622b.e(j1.p1(c26).i(), com.pinterest.api.model.g.class);
            Intrinsics.g(e14, "null cannot be cast to non-null type com.pinterest.api.model.AdData");
            R6.f37078d = (com.pinterest.api.model.g) e14;
            boolean[] zArr10 = R6.f37101h3;
            if (zArr10.length > 3) {
                zArr10[3] = true;
            }
        }
        String c27 = c(cVar, uri, "aggregated_pin_data");
        if (c27 != null) {
            f3 z33 = f30Var.z3();
            if (z33 != null) {
                Object e15 = vd0.c.f125622b.e(j1.p1(c27).i(), f3.class);
                Intrinsics.g(e15, "null cannot be cast to non-null type com.pinterest.api.model.AggregatedPinData");
                f3 f3Var = (f3) e15;
                if (z33 != f3Var) {
                    i3 P = z33.P();
                    P.b(f3Var);
                    z33 = P.a();
                }
            } else {
                z33 = null;
            }
            R6.h(z33);
        }
        if (((es.c) this.f77558a).U(f30Var)) {
            String c28 = c(cVar, uri, "id");
            if ((c28 == null || c28.length() == 0) && !((m60.d) m60.d.a()).f()) {
                j.f125466a.G("Missing id parameter in override fields", new Object[0]);
            }
            if (c28 == null) {
                c28 = "";
            }
            R6.x2(c28);
        }
        String c29 = c(cVar, uri, "collection_pin");
        if (c29 != null) {
            R6.C = (md) vd0.c.f125622b.b(md.class, c29);
            boolean[] zArr11 = R6.f37101h3;
            if (zArr11.length > 28) {
                zArr11[28] = true;
            }
        }
        String c33 = c(cVar, uri, "promoted_is_catalog_carousel_ad");
        Boolean valueOf2 = c33 != null ? Boolean.valueOf(Boolean.parseBoolean(c33)) : null;
        R6.X1 = valueOf2;
        boolean[] zArr12 = R6.f37101h3;
        if (zArr12.length > 153) {
            zArr12[153] = true;
        }
        if (Intrinsics.d(valueOf2, Boolean.TRUE) && (c13 = c(cVar, uri, "carousel_data")) != null) {
            try {
                R6.s((cc) vd0.c.f125622b.b(cc.class, c13));
            } catch (Exception e16) {
                HashSet hashSet2 = h.f117076w;
                g.f117075a.q(e16, a.a.j("Catalog Carousel Preview: Error parsing carousel_data. Pin ID: ", R6.f37063a), p.AD_FORMATS);
            }
        }
        String c34 = c(cVar, uri, "carousel_destination_urls");
        if (c34 != null) {
            q f13 = j1.p1(c34).f();
            ArrayList arrayList = new ArrayList();
            int size = f13.f91364a.size();
            for (int i13 = 0; i13 < size; i13++) {
                cc ccVar2 = R6.f37158w;
                l30 l30Var = (ccVar2 == null || (d2 = ccVar2.d()) == null) ? null : (l30) d2.get(i13);
                if (l30Var != null) {
                    i30 i30Var = new i30(l30Var, 0);
                    i30Var.f38630a = f13.u(i13).p();
                    boolean[] zArr13 = i30Var.f38643n;
                    if (zArr13.length > 0) {
                        zArr13[0] = true;
                    }
                    l30 a13 = i30Var.a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    arrayList.add(a13);
                }
            }
            cc ccVar3 = R6.f37158w;
            if (ccVar3 != null) {
                zb zbVar = new zb(ccVar3, 0);
                zbVar.f44270a = arrayList;
                boolean[] zArr14 = zbVar.f44273d;
                if (zArr14.length > 0) {
                    zArr14[0] = true;
                }
                ccVar = zbVar.a();
            } else {
                ccVar = null;
            }
            R6.s(ccVar);
        }
        String c35 = c(cVar, uri, "promoted_is_lead_ad");
        Boolean valueOf3 = c35 != null ? Boolean.valueOf(Boolean.parseBoolean(c35)) : null;
        R6.Z1 = valueOf3;
        boolean[] zArr15 = R6.f37101h3;
        if (zArr15.length > 155) {
            zArr15[155] = true;
        }
        if (Intrinsics.d(valueOf3, Boolean.TRUE)) {
            R6.f37138r = c(cVar, uri, "call_to_action_text");
            boolean[] zArr16 = R6.f37101h3;
            if (zArr16.length > 17) {
                zArr16[17] = true;
            }
            String c36 = c(cVar, uri, "promoted_lead_form");
            if (c36 != null) {
                try {
                    R6.f37100h2 = (n90) vd0.c.f125622b.b(n90.class, c36);
                    boolean[] zArr17 = R6.f37101h3;
                    if (zArr17.length > 163) {
                        zArr17[163] = true;
                    }
                } catch (Exception e17) {
                    HashSet hashSet3 = h.f117076w;
                    g.f117075a.q(e17, a.a.j("Lead Ad Preview: Error parsing promoted_lead_form data. Pin ID: ", R6.f37063a), p.LEAD_AD);
                }
            }
        }
        lh0.e eVar = this.f77559b;
        eVar.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) eVar.f83333a;
        if (g1Var.o("android_premiere_spotlight_ad_preview", "enabled", z3Var) || g1Var.l("android_premiere_spotlight_ad_preview")) {
            String c37 = c(cVar, uri, "is_premiere");
            R6.f37089f1 = c37 != null ? Boolean.valueOf(Boolean.parseBoolean(c37)) : null;
            boolean[] zArr18 = R6.f37101h3;
            if (zArr18.length > 109) {
                zArr18[109] = true;
            }
        }
        f30 a14 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        return a14;
    }
}

package nx;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.d7;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.k;
import com.pinterest.api.model.zs;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final vr.a f92377a;

    /* renamed from: b, reason: collision with root package name */
    public final es.a f92378b;

    public b0(vr.a adsCommonAnalytics, es.a adFormats) {
        Intrinsics.checkNotNullParameter(adsCommonAnalytics, "adsCommonAnalytics");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f92377a = adsCommonAnalytics;
        this.f92378b = adFormats;
    }

    public static void b(f30 f30Var, boolean z13, HashMap auxData) {
        String B3;
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (z13) {
            auxData.put("is_arapi", "true");
            if (f30Var == null || (B3 = f30Var.B3()) == null) {
                return;
            }
            auxData.put("attribution_source_id", B3);
        }
    }

    public static void f(f30 f30Var, HashMap hashMap) {
        if (hashMap != null) {
            nm.u q13 = q(hashMap);
            if (q13 == null) {
                q13 = new nm.u();
            }
            pm.o oVar = q13.f91366a;
            Intrinsics.checkNotNullExpressionValue(oVar, "asMap(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.y0.a(oVar.f100619d));
            for (Map.Entry entry : oVar.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((nm.s) entry.getValue()).toString());
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(linkedHashMap);
            if (f30Var != null && df.j1.F1(f30Var) && !f30Var.d5().booleanValue()) {
                hashMap2.put("is_pdpplus", String.valueOf(f30Var.M4().booleanValue()));
            }
            if (!hashMap2.isEmpty()) {
                String obj = hashMap2.toString();
                Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
                hashMap.put("commerce_data", obj);
            }
        }
    }

    public static void g(HashMap rootAuxData, Pair property) {
        Intrinsics.checkNotNullParameter(rootAuxData, "rootAuxData");
        Intrinsics.checkNotNullParameter(property, "property");
        nm.u q13 = q(rootAuxData);
        if (q13 == null) {
            q13 = new nm.u();
        }
        q13.u((String) property.f80346a, (String) property.f80347b);
        String sVar = q13.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        rootAuxData.put("commerce_data", sVar);
    }

    public static void h(String str, HashMap auxData, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (z13) {
            auxData.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
            auxData.put("mdl_did_succeed", "false");
            auxData.put("is_third_party_ad", String.valueOf(z14));
            if (str != null) {
                auxData.put("final_destination_url", kotlin.text.e0.C(4096, str));
            }
        }
    }

    public static void i(f30 pin, HashMap auxData) {
        com.pinterest.api.model.k L;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        com.pinterest.api.model.g t33 = pin.t3();
        if (t33 == null || (L = t33.L()) == null) {
            return;
        }
        k.b i13 = L.i();
        if (i13 != null) {
            auxData.put("ads_creative_type", String.valueOf(i13.getValue()));
        }
        k.a h10 = L.h();
        if (h10 != null) {
            auxData.put("ads_closeup_type", String.valueOf(h10.getValue()));
        }
        k.c j13 = L.j();
        if (j13 != null) {
            auxData.put("ads_destination_type", String.valueOf(j13.getValue()));
        }
        k.d k13 = L.k();
        if (k13 != null) {
            auxData.put("ads_media_type", String.valueOf(k13.getValue()));
        }
    }

    public static void j(HashMap auxData, x10.c params, Throwable th3, qz.d dVar, int i13) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.f131324e;
        String str2 = params.f131323d;
        String str3 = params.f131322c;
        String str4 = params.f131328i;
        String str5 = params.f131331l;
        k(auxData, str, str2, str3, str4, (str5 == null || str5.length() == 0) ? "create_pin" : "create_video", dVar, th3, i13);
    }

    public static void k(HashMap hashMap, String str, String str2, String str3, String str4, String str5, qz.d dVar, Throwable th3, int i13) {
        boolean z13;
        nm.u uVar = new nm.u();
        if (df.j1.d1(str)) {
            uVar.u("image_url", str);
        }
        if (df.j1.d1(str2)) {
            uVar.u("source_url", str2);
        }
        if (str3 != null && str3.length() != 0) {
            uVar.u("description", str3);
        }
        if (th3 != null) {
            nm.u uVar2 = new nm.u();
            String message = th3.getMessage();
            boolean z14 = true;
            if (message == null || message.length() == 0) {
                z13 = false;
            } else {
                uVar2.u("error_message", th3.getMessage());
                z13 = true;
            }
            if (th3.getCause() != null) {
                uVar2.u("error_cause", String.valueOf(th3.getCause()));
            } else {
                z14 = z13;
            }
            uVar.u("error_domain", th3.toString());
            if (z14) {
                uVar.r("error_user_info", uVar2);
            }
        }
        uVar.u("pin_creation_method", str4);
        uVar.u("pin_creation_type", str5);
        if (dVar != null) {
            uVar.s(Integer.valueOf(dVar.f105387g), "error_code");
        }
        uVar.s(Integer.valueOf(i13), "error_try_count");
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("pin_create_failure_data", sVar);
    }

    public static /* synthetic */ HashMap p(b0 b0Var, f30 f30Var, int i13, String str) {
        return b0Var.n(f30Var, i13, str, null, new q());
    }

    public static nm.u q(HashMap hashMap) {
        String str = hashMap != null ? (String) hashMap.get("commerce_data") : null;
        if (str == null) {
            return null;
        }
        nm.u i13 = df.j1.p1(str).i();
        if (i13.isEmpty()) {
            return null;
        }
        return i13;
    }

    public final void a(f30 f30Var, xr.a attributionReporting, HashMap auxData) {
        Intrinsics.checkNotNullParameter(attributionReporting, "attributionReporting");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        if (f30Var != null) {
            b(f30Var, ((es.c) this.f92378b).l0(f30Var), auxData);
        }
    }

    public final void c(f30 f30Var, HashMap auxData) {
        q qVar;
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        nm.u q13 = q(auxData);
        if (q13 == null) {
            qVar = null;
        } else {
            Set entrySet = q13.f91366a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "entrySet(...)");
            int a13 = kotlin.collections.y0.a(kotlin.collections.g0.q(entrySet, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
            Iterator it = ((pm.l) entrySet).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), ((nm.s) entry.getValue()).p());
            }
            qVar = new q(linkedHashMap);
        }
        if (qVar == null) {
            qVar = new q();
        }
        e(f30Var, auxData, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.pinterest.api.model.f30 r20, java.util.HashMap r21, java.lang.String r22, nx.q r23) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nx.b0.d(com.pinterest.api.model.f30, java.util.HashMap, java.lang.String, nx.q):void");
    }

    public final void e(f30 f30Var, HashMap auxData, q commerceData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(commerceData, "commerceData");
        if (f30Var != null) {
            d(f30Var, auxData, null, commerceData);
        }
    }

    public final HashMap l(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return p(this, pin, i13, null);
    }

    public final HashMap m(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return l(d7.a(pin), pin);
    }

    public final HashMap n(f30 f30Var, int i13, String str, HashMap auxData, q qVar) {
        if (auxData == null) {
            auxData = new HashMap();
        }
        String id3 = f30Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        auxData.put("pin_id", id3);
        zs t63 = f30Var.t6();
        if (t63 != null && df.j1.d1(t63.getId())) {
            String id4 = t63.getId();
            Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
            auxData.put("interest_id", id4);
        }
        if (i13 >= 0) {
            auxData.put("grid_index", String.valueOf(i13));
        }
        vr.b bVar = (vr.b) this.f92377a;
        bVar.c(f30Var, auxData);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Short o13 = ((es.v) bVar.f126452e).o(f30Var);
        if (o13 != null) {
            auxData.put("dl_ad_closeup_ingress_variant", String.valueOf((int) o13.shortValue()));
        }
        d(f30Var, auxData, str, qVar);
        String i03 = b40.i0(f30Var);
        if (i03 != null) {
            if (!b40.X0(f30Var)) {
                i03 = null;
            }
            if (i03 != null) {
                auxData.put(SbaPinRep.AUX_DATA_VIDEO_ID, i03);
            }
        }
        i(f30Var, auxData);
        if (!auxData.isEmpty()) {
            return auxData;
        }
        return null;
    }

    public final HashMap o(f30 pin, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return p(this, pin, -1, str);
    }
}

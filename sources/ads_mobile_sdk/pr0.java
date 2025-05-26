package ads_mobile_sdk;

import a.h4;
import a.p0;
import a.z2;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nm.s;

/* loaded from: classes2.dex */
public final class pr0 {

    /* renamed from: a, reason: collision with root package name */
    public static final pr0 f9784a = new pr0();

    public static Pair a(nm.u json, long j13) {
        int a13;
        String str;
        Pair pair;
        s v13;
        int a14;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("AppSettings raw response: " + json).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str2 = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str2);
                }
            }
            if (!k41.a(json)) {
                return null;
            }
            String a15 = k41.a(json, "appSettingsJson");
            nm.u uVar = (nm.u) new nm.o().b(nm.u.class, a15);
            a13 = k41.a(uVar, "status", 0);
            if (a13 != 1) {
                s v14 = uVar.v("errorMessage");
                String p13 = v14 != null ? v14.p() : null;
                if (p13 == null) {
                    a14 = k41.a(uVar, "status", 0);
                    p13 = "status is not 1, was " + a14;
                }
                ft2.b(p13);
                return null;
            }
            long e13 = k41.e(uVar);
            nm.u x13 = uVar.x("common_settings");
            nm.q w13 = x13 != null ? x13.w("loeid") : null;
            ArrayList arrayList = new ArrayList();
            if (w13 != null) {
                Iterator it2 = w13.f91364a.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    s sVar = (s) next;
                    Intrinsics.f(sVar);
                    arrayList.add(Long.valueOf(sVar.l()));
                    Unit unit = Unit.f80348a;
                    i13 = i14;
                }
            }
            nm.u x14 = uVar.x("ad_unit_patterns");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x14 != null) {
                Iterator it3 = ((pm.l) x14.f91366a.entrySet()).iterator();
                while (((pm.m) it3).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((pm.k) it3).next();
                    Intrinsics.f(entry);
                    String str3 = (String) entry.getKey();
                    s sVar2 = (s) entry.getValue();
                    Intrinsics.f(str3);
                    Intrinsics.f(sVar2);
                    nm.q f13 = sVar2.f();
                    Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
                    r5 a16 = a(f13);
                    Pair pair2 = a16 != null ? new Pair(str3, a16) : null;
                    if (pair2 != null) {
                        linkedHashMap.put(pair2.f80346a, pair2.f80347b);
                        Unit unit2 = Unit.f80348a;
                    }
                }
            }
            nm.q w14 = uVar.w("ad_unit_id_settings");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str4 = "getAsJsonObject(...)";
            if (w14 != null) {
                Iterator it4 = w14.f().f91364a.iterator();
                while (it4.hasNext()) {
                    s sVar3 = (s) it4.next();
                    Intrinsics.f(sVar3);
                    nm.u i15 = sVar3.i();
                    Intrinsics.checkNotNullExpressionValue(i15, "getAsJsonObject(...)");
                    Pair c13 = c(i15);
                    if (c13 != null) {
                        linkedHashMap2.put(c13.f80346a, c13.f80347b);
                        Unit unit3 = Unit.f80348a;
                    }
                }
            }
            nm.q w15 = uVar.w("ad_unit_id_settings");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (w15 != null) {
                Iterator it5 = w15.f().f91364a.iterator();
                while (it5.hasNext()) {
                    s sVar4 = (s) it5.next();
                    Intrinsics.f(sVar4);
                    nm.u i16 = sVar4.i();
                    Intrinsics.checkNotNullExpressionValue(i16, "getAsJsonObject(...)");
                    Pair a17 = a(i16);
                    if (a17 != null) {
                        linkedHashMap3.put(a17.f80346a, a17.f80347b);
                        Unit unit4 = Unit.f80348a;
                    }
                }
            }
            nm.q w16 = uVar.w("signal_adapters");
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            if (w16 != null) {
                Iterator it6 = w16.f().f91364a.iterator();
                while (it6.hasNext()) {
                    s sVar5 = (s) it6.next();
                    Intrinsics.f(sVar5);
                    nm.u i17 = sVar5.i();
                    Intrinsics.checkNotNullExpressionValue(i17, "getAsJsonObject(...)");
                    Pair g13 = g(i17);
                    if (g13 != null) {
                        linkedHashMap4.put(g13.f80346a, g13.f80347b);
                        Unit unit5 = Unit.f80348a;
                    }
                }
            }
            nm.q w17 = uVar.w("adapter_settings");
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            if (w17 != null) {
                Iterator it7 = w17.f().f91364a.iterator();
                while (it7.hasNext()) {
                    s sVar6 = (s) it7.next();
                    Intrinsics.f(sVar6);
                    nm.u i18 = sVar6.i();
                    Intrinsics.checkNotNullExpressionValue(i18, "getAsJsonObject(...)");
                    Pair a18 = a(i18, "admob");
                    if (a18 != null) {
                        linkedHashMap5.put(a18.f80346a, a18.f80347b);
                        Unit unit6 = Unit.f80348a;
                    }
                }
            }
            nm.q w18 = uVar.w("adapter_settings");
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            if (w18 != null) {
                Iterator it8 = w18.f().f91364a.iterator();
                while (it8.hasNext()) {
                    s sVar7 = (s) it8.next();
                    Intrinsics.f(sVar7);
                    nm.u i19 = sVar7.i();
                    Intrinsics.checkNotNullExpressionValue(i19, "getAsJsonObject(...)");
                    Pair a19 = a(i19, "ad_manager");
                    if (a19 != null) {
                        linkedHashMap6.put(a19.f80346a, a19.f80347b);
                        Unit unit7 = Unit.f80348a;
                    }
                }
            }
            s v15 = uVar.v("initializer_settings");
            nm.u i23 = v15 != null ? v15.i() : null;
            nm.u i24 = (i23 == null || (v13 = i23.v("config")) == null) ? null : v13.i();
            if (i24 == null) {
                i24 = new nm.u();
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            Iterator it9 = ((pm.l) i24.f91366a.entrySet()).iterator();
            while (((pm.m) it9).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((pm.k) it9).next();
                Intrinsics.f(entry2);
                Iterator it10 = it9;
                String str5 = (String) entry2.getKey();
                s sVar8 = (s) entry2.getValue();
                Intrinsics.f(str5);
                Intrinsics.f(sVar8);
                nm.u i25 = sVar8.i();
                Intrinsics.checkNotNullExpressionValue(i25, str4);
                n6 d2 = d(i25);
                if (d2 != null) {
                    str = str4;
                    pair = new Pair(str5, d2);
                } else {
                    str = str4;
                    pair = null;
                }
                if (pair != null) {
                    linkedHashMap7.put(pair.f80346a, pair.f80347b);
                    Unit unit8 = Unit.f80348a;
                }
                it9 = it10;
                str4 = str;
            }
            a.c2 builder = gf.C();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            pf pfVar = new pf(builder);
            pfVar.a(j13);
            pfVar.b(e13);
            pfVar.a(a15);
            pfVar.a(pfVar.h(), arrayList);
            String sVar9 = x13 != null ? x13.toString() : null;
            if (sVar9 == null) {
                sVar9 = "";
            }
            pfVar.b(sVar9);
            pfVar.d(pfVar.e(), linkedHashMap);
            pfVar.g(pfVar.i(), linkedHashMap4);
            pfVar.f(pfVar.g(), linkedHashMap5);
            pfVar.a(pfVar.b(), linkedHashMap6);
            pfVar.e(pfVar.f(), linkedHashMap7);
            pfVar.c(pfVar.d(), linkedHashMap2);
            pfVar.b(pfVar.c(), linkedHashMap3);
            return new Pair(pfVar.a(), uVar);
        } catch (Exception e14) {
            ft2.a(e14);
            return null;
        }
    }

    public static n5 b(nm.u uVar) {
        String a13;
        a.y7 builder = n5.u();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        p5 p5Var = new p5(builder);
        if (gk0.a(2)) {
            Iterator it = gk0.a().b("AdUnitPatterns: " + uVar).iterator();
            while (true) {
                ok.c0 c0Var = (ok.c0) it;
                if (!c0Var.hasNext()) {
                    break;
                }
                String str = (String) c0Var.next();
                Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
            }
        }
        ba0 c13 = p5Var.c();
        nm.q w13 = uVar.w("including");
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        if (w13 != null) {
            Iterator it2 = w13.f91364a.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                s sVar = (s) next;
                Intrinsics.f(sVar);
                String p13 = sVar.p();
                if (p13 != null) {
                    arrayList.add(p13);
                }
                i14 = i15;
            }
        }
        p5Var.b(c13, arrayList);
        ba0 b13 = p5Var.b();
        nm.q w14 = uVar.w("excluding");
        ArrayList arrayList2 = new ArrayList();
        if (w14 != null) {
            Iterator it3 = w14.f91364a.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                int i16 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                s sVar2 = (s) next2;
                Intrinsics.f(sVar2);
                String p14 = sVar2.p();
                if (p14 != null) {
                    arrayList2.add(p14);
                }
                i13 = i16;
            }
        }
        p5Var.a(b13, arrayList2);
        a13 = k41.a(uVar, "effective_ad_unit_id", "");
        String lowerCase = a13.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        p5Var.a(lowerCase);
        return p5Var.a();
    }

    public static Pair c(nm.u uVar) {
        String a13;
        String a14;
        try {
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("AppSettings MediationConfig for request signals: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
                }
            }
            a13 = k41.a(uVar, "format", "");
            Locale locale = Locale.ROOT;
            String lowerCase = a13.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            a14 = k41.a(uVar, "ad_unit_id", "");
            String lowerCase2 = a14.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            s v13 = uVar.v("request_signals");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0 && v13 != null) {
                return new Pair(lowerCase2 + "," + lowerCase, v13.toString());
            }
            return null;
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static n6 d(nm.u uVar) {
        h4 h4Var;
        h4 h4Var2;
        h4 h4Var3;
        try {
            a.z7 builder = n6.t();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            h4Var = ((n6) builder.f10110b).initializationData_;
            List unmodifiableList = Collections.unmodifiableList(h4Var);
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getInitializationDataList(...)");
            ba0 ba0Var = new ba0(unmodifiableList);
            s v13 = uVar.v("data");
            nm.q f13 = v13 != null ? v13.f() : null;
            ArrayList values = new ArrayList();
            if (f13 != null) {
                Iterator it = f13.f91364a.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    s sVar = (s) next;
                    Intrinsics.f(sVar);
                    nm.u i15 = sVar.i();
                    Intrinsics.checkNotNullExpressionValue(i15, "getAsJsonObject(...)");
                    values.add(e(i15));
                    i13 = i14;
                }
            }
            Intrinsics.checkNotNullParameter(ba0Var, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            builder.b();
            n6 n6Var = (n6) builder.f10110b;
            h4Var2 = n6Var.initializationData_;
            if (!((j) h4Var2).f6594a) {
                n6Var.initializationData_ = e0.t.a(h4Var2);
            }
            h4Var3 = n6Var.initializationData_;
            z2.a(values, h4Var3);
            sj0 a13 = builder.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            return (n6) a13;
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static q6 e(nm.u uVar) {
        int i13;
        w81 w81Var;
        w81 w81Var2;
        w81 w81Var3;
        a.g9 builder = q6.t();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        s v13 = uVar.v("format");
        String value = v13 != null ? v13.p() : null;
        if (value == null) {
            value = "";
        }
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        q6 q6Var = (q6) builder.f10110b;
        q6Var.getClass();
        i13 = q6Var.bitField0_;
        q6Var.bitField0_ = i13 | 1;
        q6Var.format_ = value;
        s v14 = uVar.v("data");
        if (v14 != null) {
            nm.u i14 = v14.i();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((pm.l) i14.f91366a.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Intrinsics.f(entry);
                String str = (String) entry.getKey();
                s sVar = (s) entry.getValue();
                Intrinsics.f(str);
                Intrinsics.f(sVar);
                linkedHashMap.put(str, sVar.p());
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String key = (String) entry2.getKey();
                String value2 = (String) entry2.getValue();
                w81Var = ((q6) builder.f10110b).extras_;
                Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
                Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getExtrasMap(...)");
                ca0 ca0Var = new ca0(unmodifiableMap);
                Intrinsics.f(value2);
                Intrinsics.checkNotNullParameter(ca0Var, "<this>");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value2, "value");
                key.getClass();
                builder.b();
                q6 q6Var2 = (q6) builder.f10110b;
                w81Var2 = q6Var2.extras_;
                if (!w81Var2.f12897a) {
                    q6Var2.extras_ = w81Var2.b();
                }
                w81Var3 = q6Var2.extras_;
                w81Var3.put(key, value2);
            }
        }
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (q6) a13;
    }

    public static i91 f(nm.u uVar) {
        try {
            a.s3 builder = i91.t();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            k91 k91Var = new k91(builder);
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("AppSettings MediationAdNetworkInfo: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
                }
            }
            ba0 b13 = k91Var.b();
            nm.q w13 = uVar.w("rtb_adapters");
            ArrayList arrayList = new ArrayList();
            if (w13 != null) {
                Iterator it2 = w13.f91364a.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    s sVar = (s) next;
                    Intrinsics.f(sVar);
                    String p13 = sVar.p();
                    if (p13 != null) {
                        arrayList.add(p13);
                    }
                    i13 = i14;
                }
            }
            k91Var.a(b13, arrayList);
            ca0 c13 = k91Var.c();
            nm.u x13 = uVar.x("data");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (x13 != null) {
                Iterator it3 = ((pm.l) x13.f91366a.entrySet()).iterator();
                while (((pm.m) it3).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((pm.k) it3).next();
                    Intrinsics.f(entry);
                    String str2 = (String) entry.getKey();
                    s sVar2 = (s) entry.getValue();
                    Intrinsics.f(str2);
                    Intrinsics.f(sVar2);
                    linkedHashMap.put(str2, sVar2.p());
                }
            }
            k91Var.a(c13, linkedHashMap);
            return k91Var.a();
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static Pair g(nm.u uVar) {
        String a13;
        boolean a14;
        try {
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("Signal adapters: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
                }
            }
            a13 = k41.a(uVar, "adapter_class_name", "");
            if (a13.length() == 0) {
                return null;
            }
            a.x8 builder = pj.u();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            rj rjVar = new rj(builder);
            rjVar.a(a13);
            a14 = k41.a(uVar, "collect_signals", false);
            rjVar.b(a14);
            rjVar.a(true);
            ca0 b13 = rjVar.b();
            s v13 = uVar.v("data");
            nm.u i13 = v13 != null ? v13.i() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i13 != null) {
                Iterator it2 = ((pm.l) i13.f91366a.entrySet()).iterator();
                while (((pm.m) it2).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((pm.k) it2).next();
                    Intrinsics.f(entry);
                    String str2 = (String) entry.getKey();
                    s sVar = (s) entry.getValue();
                    Intrinsics.f(str2);
                    Intrinsics.f(sVar);
                    linkedHashMap.put(str2, sVar.p());
                }
            }
            rjVar.a(b13, linkedHashMap);
            return new Pair(a13, rjVar.a());
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static pj a(nm.u uVar, String str, String str2) {
        String a13;
        String a14;
        boolean a15;
        boolean a16;
        try {
            a13 = k41.a(uVar, "platform", "");
            Locale locale = Locale.ROOT;
            String lowerCase = a13.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!Intrinsics.d(lowerCase, lowerCase2)) {
                return null;
            }
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("Adapter settings from permission set: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str3 = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str3);
                }
            }
            a.x8 builder = pj.u();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            rj rjVar = new rj(builder);
            rjVar.a(str);
            a14 = k41.a(uVar, "platform", "");
            String lowerCase3 = a14.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            rjVar.b(lowerCase3);
            a15 = k41.a(uVar, "collect_secure_signals", false);
            rjVar.b(a15);
            a16 = k41.a(uVar, "collect_secure_signals_on_full_app", false);
            rjVar.a(a16);
            ca0 b13 = rjVar.b();
            s v13 = uVar.v("data");
            nm.u i13 = v13 != null ? v13.i() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i13 != null) {
                Iterator it2 = ((pm.l) i13.f91366a.entrySet()).iterator();
                while (((pm.m) it2).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((pm.k) it2).next();
                    Intrinsics.f(entry);
                    String str4 = (String) entry.getKey();
                    s sVar = (s) entry.getValue();
                    Intrinsics.f(str4);
                    Intrinsics.f(sVar);
                    linkedHashMap.put(str4, sVar.p());
                }
            }
            rjVar.a(b13, linkedHashMap);
            return rjVar.a();
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static ds a(nm.u jsonObject, nm.u consentStrings) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        w81 w81Var;
        w81 w81Var2;
        w81 w81Var3;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(consentStrings, "consentStrings");
        try {
            p0 builder = ds.y();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            String value = new nm.o().l(consentStrings);
            Intrinsics.checkNotNullExpressionValue(value, "toJson(...)");
            Intrinsics.checkNotNullParameter(value, "value");
            builder.b();
            ds dsVar = (ds) builder.f10110b;
            dsVar.getClass();
            value.getClass();
            i13 = dsVar.bitField0_;
            dsVar.bitField0_ = i13 | 1;
            dsVar.consentStringJson_ = value;
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("consent_state", "key");
            String value2 = jsonObject.v("consent_state").p();
            Intrinsics.checkNotNullExpressionValue(value2, "getAsString(...)");
            Intrinsics.checkNotNullParameter(value2, "value");
            builder.b();
            ds dsVar2 = (ds) builder.f10110b;
            dsVar2.getClass();
            value2.getClass();
            i14 = dsVar2.bitField0_;
            dsVar2.bitField0_ = i14 | 2;
            dsVar2.consentStateJson_ = value2;
            qk.c cVar = qk.d.f104038e;
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("allowlist", "key");
            String p13 = jsonObject.v("allowlist").p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            cq value3 = cq.a(cVar.a(p13));
            Intrinsics.checkNotNullExpressionValue(value3, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value3, "value");
            builder.b();
            ds dsVar3 = (ds) builder.f10110b;
            dsVar3.getClass();
            value3.getClass();
            dsVar3.consentAllowlist_ = value3;
            i15 = dsVar3.bitField0_;
            dsVar3.bitField0_ = i15 | 16;
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("client_pat", "key");
            String p14 = jsonObject.v("client_pat").p();
            Intrinsics.checkNotNullExpressionValue(p14, "getAsString(...)");
            wv1 value4 = wv1.a(Base64.decode(p14, 0));
            Intrinsics.checkNotNullExpressionValue(value4, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value4, "value");
            builder.b();
            ds dsVar4 = (ds) builder.f10110b;
            dsVar4.getClass();
            value4.getClass();
            dsVar4.patternMatchingFlag_ = value4;
            i16 = dsVar4.bitField0_;
            dsVar4.bitField0_ = i16 | 4;
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("client_pre", "key");
            String p15 = jsonObject.v("client_pre").p();
            Intrinsics.checkNotNullExpressionValue(p15, "getAsString(...)");
            tx1 value5 = tx1.a(Base64.decode(p15, 0));
            Intrinsics.checkNotNullExpressionValue(value5, "parseFrom(...)");
            Intrinsics.checkNotNullParameter(value5, "value");
            builder.b();
            ds dsVar5 = (ds) builder.f10110b;
            dsVar5.getClass();
            value5.getClass();
            dsVar5.preProcessingFlag_ = value5;
            i17 = dsVar5.bitField0_;
            dsVar5.bitField0_ = i17 | 8;
            w81Var = ((ds) builder.f10110b).concatenatedSignalsMap_;
            Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(w81Var));
            Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "getConcatenatedSignalsMapMap(...)");
            ca0 ca0Var = new ca0(unmodifiableMap);
            nm.o oVar = new nm.o();
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter("arr_params", "key");
            String p16 = jsonObject.v("arr_params").p();
            Intrinsics.checkNotNullExpressionValue(p16, "getAsString(...)");
            pm.o oVar2 = ((nm.u) oVar.b(nm.u.class, p16)).f91366a;
            Intrinsics.checkNotNullExpressionValue(oVar2, "asMap(...)");
            LinkedHashMap map = new LinkedHashMap(kotlin.collections.y0.a(oVar2.f100619d));
            Iterator it = ((pm.l) oVar2.entrySet()).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                map.put(((Map.Entry) next).getKey(), ((s) ((Map.Entry) next).getValue()).j().p());
            }
            Intrinsics.checkNotNullParameter(ca0Var, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            builder.b();
            ds dsVar6 = (ds) builder.f10110b;
            w81Var2 = dsVar6.concatenatedSignalsMap_;
            if (!w81Var2.f12897a) {
                dsVar6.concatenatedSignalsMap_ = w81Var2.b();
            }
            w81Var3 = dsVar6.concatenatedSignalsMap_;
            w81Var3.putAll(map);
            jsonObject.y("client_pat");
            jsonObject.y("client_pre");
            jsonObject.y("arr_params");
            sj0 a13 = builder.a();
            Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
            return (ds) a13;
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static Pair a(nm.u uVar) {
        try {
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("AppSettings MediationConfig: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
                }
            }
            String a13 = k41.a(uVar, "format");
            Locale locale = Locale.ROOT;
            String lowerCase = a13.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = k41.a(uVar, "ad_unit_id").toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (lowerCase.length() != 0 && lowerCase2.length() != 0) {
                nm.u x13 = uVar.x("mediation_config");
                nm.q w13 = x13 != null ? x13.w("ad_networks") : null;
                ArrayList arrayList = new ArrayList();
                if (w13 != null) {
                    Iterator it2 = w13.f91364a.iterator();
                    int i13 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i14 = i13 + 1;
                        if (i13 >= 0) {
                            s sVar = (s) next;
                            Intrinsics.f(sVar);
                            nm.u i15 = sVar.i();
                            Intrinsics.checkNotNullExpressionValue(i15, "getAsJsonObject(...)");
                            i91 f13 = f(i15);
                            if (f13 != null) {
                                arrayList.add(f13);
                            }
                            i13 = i14;
                        } else {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                String str2 = lowerCase2 + "," + lowerCase;
                a.c8 builder = na1.t();
                Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
                Intrinsics.checkNotNullParameter(builder, "builder");
                pa1 pa1Var = new pa1(builder);
                pa1Var.a(pa1Var.b(), arrayList);
                return new Pair(str2, pa1Var.a());
            }
            return null;
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static Pair a(nm.u uVar, String str) {
        String a13;
        try {
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("Adapter settings: " + uVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str2 = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str2);
                }
            }
            a13 = k41.a(uVar, "adapter_class_name", "");
            if (a13.length() == 0) {
                return null;
            }
            s v13 = uVar.v("permission_set");
            nm.q f13 = v13 != null ? v13.f() : null;
            ArrayList arrayList = new ArrayList();
            if (f13 != null) {
                Iterator it2 = f13.f91364a.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        s sVar = (s) next;
                        Intrinsics.f(sVar);
                        nm.u i15 = sVar.i();
                        Intrinsics.checkNotNullExpressionValue(i15, "getAsJsonObject(...)");
                        pj a14 = a(i15, a13, str);
                        Pair pair = a14 != null ? new Pair(a13, a14) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                        i13 = i14;
                    } else {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                }
            }
            return (Pair) CollectionsKt.firstOrNull(arrayList);
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }

    public static r5 a(nm.q qVar) {
        try {
            a.la builder = r5.t();
            Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            t5 t5Var = new t5(builder);
            if (gk0.a(2)) {
                Iterator it = gk0.a().b("AdUnitPatterns: " + qVar).iterator();
                while (((ok.c0) it).hasNext()) {
                    String str = (String) ((ok.c0) it).next();
                    Log.v("GoogleMobileAds", Thread.currentThread().getName() + ": " + str);
                }
            }
            ba0 b13 = t5Var.b();
            ArrayList arrayList = new ArrayList();
            if (qVar != null) {
                Iterator it2 = qVar.f91364a.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i14 = i13 + 1;
                    if (i13 >= 0) {
                        s sVar = (s) next;
                        Intrinsics.f(sVar);
                        nm.u i15 = sVar.i();
                        Intrinsics.checkNotNullExpressionValue(i15, "getAsJsonObject(...)");
                        arrayList.add(b(i15));
                        i13 = i14;
                    } else {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                }
            }
            t5Var.a(b13, arrayList);
            return t5Var.a();
        } catch (Exception e13) {
            ft2.a(e13);
            return null;
        }
    }
}

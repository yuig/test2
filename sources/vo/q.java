package vo;

import android.os.Bundle;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.n1;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pinterest.activity.PinterestActivity;
import i2.j2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends hb0.d {

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f126377d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PinterestActivity f126378e;

    public q(PinterestActivity pinterestActivity) {
        this.f126378e = pinterestActivity;
    }

    @Override // hb0.c
    public final void c() {
        PinterestActivity pinterestActivity = this.f126378e;
        se2.a aVar = pinterestActivity.f34827t;
        if (aVar == null) {
            Intrinsics.r("googlePlayServices");
            throw null;
        }
        AdvertisingIdClient.Info b13 = ((gz1.b) ((bf2.b) aVar).get()).b(pinterestActivity.getApplicationContext());
        if (b13 != null) {
            String id3 = b13.getId();
            if (id3 == null) {
                id3 = "";
            }
            if (id3.length() > 0) {
                LinkedHashMap linkedHashMap = this.f126377d;
                String id4 = b13.getId();
                linkedHashMap.put("advertising_identifier", id4 != null ? id4 : "");
                String bool = Boolean.toString(!b13.isLimitAdTrackingEnabled());
                Intrinsics.checkNotNullExpressionValue(bool, "toString(...)");
                linkedHashMap.put("advertising_tracking_enabled", bool);
            }
        }
    }

    @Override // hb0.d
    public final void e() {
        PinterestActivity pinterestActivity = this.f126378e;
        je0.b bVar = pinterestActivity.f34817j;
        if (bVar == null) {
            Intrinsics.r("deepLinkManager");
            throw null;
        }
        nm.u jsonObject = bVar.a();
        Intrinsics.checkNotNullExpressionValue(jsonObject, "getInstallMetaData(...)");
        pm.o oVar = jsonObject.f91366a;
        int i13 = oVar.f100619d;
        LinkedHashMap params = this.f126377d;
        if (i13 > 0) {
            String sVar = jsonObject.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            params.put("data", sVar);
            dy.d dVar = pinterestActivity.f34822o;
            if (dVar == null) {
                Intrinsics.r("firebaseAnalyticsEvents");
                throw null;
            }
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            FirebaseAnalytics firebaseAnalytics = dVar.f56534g;
            if (firebaseAnalytics != null && oVar.f100619d > 0) {
                HashMap hashMap = new HashMap();
                Iterator it = ((pm.l) oVar.entrySet()).iterator();
                while (((pm.m) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((pm.k) it).next();
                    Intrinsics.f(entry);
                    String str = (String) entry.getKey();
                    nm.s sVar2 = (nm.s) entry.getValue();
                    sVar2.getClass();
                    if ((sVar2 instanceof nm.v) && !(sVar2 instanceof nm.t)) {
                        Intrinsics.f(str);
                        String sVar3 = sVar2.toString();
                        Intrinsics.checkNotNullExpressionValue(sVar3, "toString(...)");
                        hashMap.put(str, sVar3);
                    }
                }
                Bundle bundle = new Bundle();
                String value = (String) hashMap.get("utm_source");
                if (value != null) {
                    Intrinsics.checkNotNullParameter("utm_source", "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    bundle.putString("utm_source", value);
                }
                String value2 = (String) hashMap.get("utm_medium");
                if (value2 != null) {
                    Intrinsics.checkNotNullParameter("utm_medium", "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    bundle.putString("utm_medium", value2);
                }
                String value3 = (String) hashMap.get("utm_campaign");
                if (value3 != null) {
                    Intrinsics.checkNotNullParameter("utm_campaign", "key");
                    Intrinsics.checkNotNullParameter(value3, "value");
                    bundle.putString("utm_campaign", value3);
                }
                d1 d1Var = firebaseAnalytics.f33719a;
                d1Var.getClass();
                d1Var.b(new n1(d1Var, null, "install", bundle, false));
            }
        }
        se2.a aVar = pinterestActivity.f34821n;
        if (aVar == null) {
            Intrinsics.r("analyticsApi");
            throw null;
        }
        vy.m mVar = (vy.m) ((bf2.b) aVar).get();
        mVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        fk2.x f13 = mVar.h().a(params).f(new mc.h(8, new vy.g(2, mVar)));
        Intrinsics.checkNotNullExpressionValue(f13, "doOnError(...)");
        fk2.c l13 = f13.l(tk2.e.f118017c);
        Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
        nl.b.n(l13, new j2(5, mVar, pinterestActivity), p.f126376i);
    }
}

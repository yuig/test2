package wr;

import com.pinterest.adFormatsLibrary.analytics.logger.BaseAdsPayload;
import com.pinterest.analytics.kibana.KibanaMetrics;
import g1.r;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.z3;
import ol2.f;
import vy.m;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f130851a;

    /* renamed from: b, reason: collision with root package name */
    public final m f130852b;

    /* renamed from: c, reason: collision with root package name */
    public final lh0.d f130853c;

    /* renamed from: d, reason: collision with root package name */
    public final r f130854d;

    public d(b60.b activeUserManager, m analyticsApi, lh0.d adFormatsLibraryExperiments) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(adFormatsLibraryExperiments, "adFormatsLibraryExperiments");
        this.f130851a = activeUserManager;
        this.f130852b = analyticsApi;
        this.f130853c = adFormatsLibraryExperiments;
        this.f130854d = new r(1024);
    }

    public static String b(BaseAdsPayload baseAdsPayload, String str) {
        return a.a.D(baseAdsPayload.getAdFormatKey().getValue(), "_", str);
    }

    public final void c(BaseAdsPayload payload, KibanaMetrics.Log.Metadata metadata, Float f13, String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        lh0.d dVar = this.f130853c;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        if (g1Var.o("android_ad_json_logging_killswitch", "enabled", z3Var) || g1Var.l("android_ad_json_logging_killswitch")) {
            return;
        }
        if (f13 != null && f13.floatValue() < 1.0f) {
            float floatValue = f13.floatValue();
            f.f96454a.getClass();
            if (floatValue <= f.f96455b.h().nextFloat()) {
                return;
            }
        }
        String b13 = str != null ? b(payload, str) : null;
        r rVar = this.f130854d;
        if (b13 == null || !Intrinsics.d(rVar.c(b13), Boolean.TRUE)) {
            KibanaMetrics.Log.Metadata metadata2 = metadata == null ? new KibanaMetrics.Log.Metadata(dl2.b.g1(((b60.d) this.f130851a).f()), null, 2, null) : metadata;
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(metadata2, "metadata");
            a aVar = new a("ad_formats", metadata2, payload, null, null, 0L, 56, null);
            ms0.b bVar = new ms0.b();
            bVar.b(aVar);
            if (b13 != null) {
                rVar.d(b13, Boolean.TRUE);
            }
            this.f130852b.i(bVar, ox.a.f97979i);
        }
    }
}

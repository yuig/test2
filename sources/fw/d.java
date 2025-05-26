package fw;

import com.pinterest.adsGmaLibrary.analytics.AdsGmaLogger$AdsGmaNativeAdPayload;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.i;
import lh0.z3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c f63037a;

    /* renamed from: b, reason: collision with root package name */
    public final i f63038b;

    /* renamed from: c, reason: collision with root package name */
    public final zr.b f63039c;

    public d(wr.d adFormatsLogger, i adsGmaLibraryExperiments, zr.b adsSystemUtils) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(adsGmaLibraryExperiments, "adsGmaLibraryExperiments");
        Intrinsics.checkNotNullParameter(adsSystemUtils, "adsSystemUtils");
        this.f63037a = adFormatsLogger;
        this.f63038b = adsGmaLibraryExperiments;
        this.f63039c = adsSystemUtils;
    }

    public final boolean a() {
        i iVar = this.f63038b;
        iVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) iVar.f83385a;
        return g1Var.o("android_ad_gma_logging", "enabled", z3Var) || g1Var.l("android_ad_gma_logging");
    }

    public final void b(String eventName, Long l13, String str, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (a()) {
            wr.c.a(this.f63037a, new AdsGmaLogger$AdsGmaNativeAdPayload(eventName, hashMap != null ? (String) hashMap.get("ad_unit_ids") : null, hashMap != null ? (String) hashMap.get("media_type") : null, hashMap != null ? (String) hashMap.get("ad_creative_type") : null, hashMap != null ? (String) hashMap.get("has_video_content") : null, hashMap != null ? (String) hashMap.get("has_image_content") : null, str, hashMap != null ? (String) hashMap.get("aspect_ratio_from_native_ad") : null, l13, hashMap != null ? (String) hashMap.get("video_duration") : null, hashMap != null ? (String) hashMap.get("has_icon") : null, hashMap != null ? (String) hashMap.get("advertiser_name") : null, hashMap != null ? (String) hashMap.get("headline") : null, this.f63039c.a()), null, null, 14);
        }
    }
}

package nx;

import com.pinterest.analytics.CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload;
import com.pinterest.analytics.CollageAdsLogger$CollageAdCollageLoadedPayload;
import com.pinterest.analytics.CollageAdsLogger$CollageAdCollageNextCutoutLoadedPayload;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final wr.c f92417a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0.k0 f92418b;

    public k(wr.d adFormatsLogger, lh0.k0 collagesLibraryExperiments) {
        Intrinsics.checkNotNullParameter(adFormatsLogger, "adFormatsLogger");
        Intrinsics.checkNotNullParameter(collagesLibraryExperiments, "collagesLibraryExperiments");
        this.f92417a = adFormatsLogger;
        this.f92418b = collagesLibraryExperiments;
    }

    public static void b(k kVar, String pinId, Integer num, boolean z13, Long l13, String str, int i13) {
        String str2 = (i13 & 16) != 0 ? null : str;
        f animationType = f.DEFAULT;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        if (kVar.a()) {
            wr.c.a(kVar.f92417a, new CollageAdsLogger$CollageAdCollageLoadedPayload(pinId, num, l13, !z13, str2, false, animationType.name()), null, null, 14);
        }
    }

    public static void c(k kVar, String pinId, boolean z13, Integer num, long j13, boolean z14, boolean z15, int i13) {
        if ((i13 & 16) != 0) {
            z14 = false;
        }
        if ((i13 & 32) != 0) {
            z15 = false;
        }
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        if (kVar.a()) {
            wr.c.a(kVar.f92417a, new CollageAdsLogger$CollageAdCollageCutoutsLoadedPayload(pinId, Long.valueOf(j13), z14 ? "HeroCutoutView" : z15 ? "RefreshDrawerCutoutView" : "DrawerCutoutView", !z13, num), null, null, 14);
        }
    }

    public static void d(k kVar, String pinId, boolean z13, String cutoutItemPinId, boolean z14, long j13, boolean z15, int i13) {
        if ((i13 & 64) != 0) {
            z15 = false;
        }
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(cutoutItemPinId, "cutoutItemPinId");
        if (kVar.a()) {
            wr.c.a(kVar.f92417a, new CollageAdsLogger$CollageAdCollageNextCutoutLoadedPayload(pinId, Long.valueOf(j13), z15 ? "RefreshDrawerCutoutView" : "DrawerCutoutView", !z13, (z14 ? h.PDP : h.PIN).name(), cutoutItemPinId), null, null, 14);
        }
    }

    public final boolean a() {
        lh0.k0 k0Var = this.f92418b;
        k0Var.getClass();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) k0Var.f83401a;
        return g1Var.o("android_collage_ad_alpha_logging", "enabled", z3Var) || g1Var.l("android_collage_ad_alpha_logging");
    }
}

package nc2;

import android.util.LruCache;
import bc2.o;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.k4;
import lh0.z3;
import tb0.p;

/* loaded from: classes2.dex */
public final class e implements bc2.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Map f90395f = z0.g(new Pair("V_HEVC_MP4_T1_V2", 640000), new Pair("V_HEVC_MP4_T2_V2", 850000), new Pair("V_HEVC_MP4_T3_V2", 1200000), new Pair("V_HEVC_MP4_T4_V2", 1500000), new Pair("V_HEVC_MP4_T5_V2", 2400000));

    /* renamed from: a, reason: collision with root package name */
    public final bc2.b f90396a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f90397b;

    /* renamed from: c, reason: collision with root package name */
    public final k4 f90398c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.e f90399d;

    /* renamed from: e, reason: collision with root package name */
    public final LruCache f90400e;

    public e(bc2.b deviceMediaCodecs, tb0.h crashReporting, k4 experiments, l5.i devicePerformance, l8.e bandwidthMeter) {
        Intrinsics.checkNotNullParameter(deviceMediaCodecs, "deviceMediaCodecs");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        Intrinsics.checkNotNullParameter(bandwidthMeter, "bandwidthMeter");
        this.f90396a = deviceMediaCodecs;
        this.f90397b = crashReporting;
        this.f90398c = experiments;
        this.f90399d = bandwidthMeter;
        this.f90400e = new LruCache(30);
    }

    public static LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : f90395f.keySet()) {
            o oVar = (o) map.get(str);
            Integer num = oVar != null ? oVar.f22666c : null;
            if (num != null) {
                linkedHashMap.put(str, num);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bc2.o b(bc2.d r17, java.util.Map r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nc2.e.b(bc2.d, java.util.Map, boolean):bc2.o");
    }

    public final o c(Map map) {
        o oVar = (o) map.get("V_DASH_HEVC");
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = (o) map.get("V_HLSV3_MOBILE");
        if (oVar2 != null) {
            return oVar2;
        }
        this.f90397b.q(new IllegalStateException(), "Neither DASH or HLS track found", p.VIDEO_PLAYER);
        Collection values = map.values();
        Intrinsics.checkNotNullParameter(values, "<this>");
        return (o) CollectionsKt.R(values);
    }

    public final boolean d() {
        k4 k4Var = this.f90398c;
        k4Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k4Var.f83410a;
        return g1Var.o("android_video_mp4_track_selector_unpin", "enabled", z3Var) || g1Var.l("android_video_mp4_track_selector_unpin");
    }
}

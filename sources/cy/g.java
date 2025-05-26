package cy;

import ac2.r;
import android.net.Uri;
import android.os.SystemClock;
import g7.a0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.chromium.net.UrlResponseInfo;
import tb.l;
import tb0.p;
import xu1.y;

/* loaded from: classes3.dex */
public final class g implements a0, d {

    /* renamed from: b, reason: collision with root package name */
    public final y f53399b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53400c;

    /* renamed from: d, reason: collision with root package name */
    public final l f53401d;

    /* renamed from: e, reason: collision with root package name */
    public final su1.h f53402e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f53403f;

    /* renamed from: g, reason: collision with root package name */
    public Map f53404g;

    /* renamed from: h, reason: collision with root package name */
    public String f53405h;

    /* renamed from: i, reason: collision with root package name */
    public long f53406i;

    /* renamed from: j, reason: collision with root package name */
    public long f53407j;

    /* renamed from: k, reason: collision with root package name */
    public long f53408k;

    public g(y networkTypeMonitor, String currentUserId, l telemetryPreferences) {
        Intrinsics.checkNotNullParameter(networkTypeMonitor, "networkTypeMonitor");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        this.f53399b = networkTypeMonitor;
        this.f53400c = currentUserId;
        this.f53401d = telemetryPreferences;
        this.f53402e = su1.h.CLIENT_CRONET;
        h[] values = h.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (h hVar : values) {
            arrayList.add(hVar.getExt());
        }
        HashSet D0 = CollectionsKt.D0(arrayList);
        this.f53403f = D0;
        ArrayList arrayList2 = new ArrayList(g0.q(D0, 10));
        Iterator it = D0.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((String) it.next()).length()));
        }
    }

    public static r b(g7.f fVar) {
        r rVar = fVar instanceof r ? (r) fVar : null;
        vb0.j.f125466a.M(rVar, "[NetworkMetricsTransferListener] Should only be provided to PinterestCronetDataSource.", p.VIDEO_PLAYER, new Object[0]);
        Intrinsics.f(rVar);
        return rVar;
    }

    @Override // g7.a0
    public final void a(g7.f source, g7.i dataSpec, boolean z13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        r b13 = b(source);
        vb0.j.f125466a.M(b13, "[NetworkMetricsTransferListener] Should only be provided to PinterestCronetDataSource.", p.VIDEO_PLAYER, new Object[0]);
        UrlResponseInfo urlResponseInfo = b13.f71663z;
        if (urlResponseInfo != null && urlResponseInfo.getHttpStatusCode() > 0) {
            b13.f71663z.getHttpStatusCode();
        }
        this.f53404g = b13.e();
        this.f53406i = SystemClock.elapsedRealtime();
        UrlResponseInfo urlResponseInfo2 = b13.f71663z;
        this.f53405h = urlResponseInfo2 != null ? urlResponseInfo2.getNegotiatedProtocol() : null;
    }

    @Override // g7.a0
    public final void d(g7.f source, g7.i dataSpec, boolean z13) {
        String str;
        String str2;
        String path;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        r b13 = b(source);
        UrlResponseInfo urlResponseInfo = b13.f71663z;
        this.f53407j = SystemClock.elapsedRealtime();
        Map b14 = b13.D.b();
        Intrinsics.checkNotNullExpressionValue(b14, "getSnapshot(...)");
        LinkedHashMap j13 = z0.j(b14, b13.E);
        Map httpRequestHeaders = dataSpec.f63790e;
        Intrinsics.checkNotNullExpressionValue(httpRequestHeaders, "httpRequestHeaders");
        LinkedHashMap j14 = z0.j(j13, httpRequestHeaders);
        HashSet hashSet = e.f53396a;
        Intrinsics.checkNotNullParameter(j14, "<this>");
        long j15 = 0;
        for (Map.Entry entry : j14.entrySet()) {
            j15 = j15 + ((String) entry.getKey()).length() + ((String) entry.getValue()).length();
        }
        boolean d2 = Intrinsics.d(j14.get("Content-Encoding"), "gzip");
        long length = dataSpec.f63789d != null ? r5.length : 0L;
        Long valueOf = d2 ? null : Long.valueOf(length);
        Map map = this.f53404g;
        if (map == null) {
            map = z0.d();
        }
        long d13 = e.d(map);
        long j16 = this.f53408k;
        Map map2 = map;
        float f13 = this.f53407j - this.f53406i;
        String str3 = z13 ? "network" : "local_cache";
        Uri uri = dataSpec.f63786a;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            str2 = e.b(lastPathSegment);
            str = str3;
        } else {
            str = str3;
            str2 = null;
        }
        if (CollectionsKt.L(this.f53403f, str2)) {
            path = a.a.j("$.", str2);
        } else {
            Uri r13 = b13.r();
            path = r13 != null ? r13.getPath() : null;
        }
        int length2 = uri.toString().length();
        List list = (List) map2.get("x-pinterest-rid");
        String Z = list != null ? CollectionsKt.Z(list, ",", null, null, 0, null, null, 62) : null;
        Integer valueOf2 = urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null;
        List list2 = (List) map2.get("x-cdn");
        String Z2 = list2 != null ? CollectionsKt.Z(list2, ",", null, null, 0, null, null, 62) : null;
        this.f53399b.getClass();
        String str4 = path;
        com.pinterest.analytics.kibana.g gVar = new com.pinterest.analytics.kibana.g(y.b().getUsing(), this.f53400c);
        com.pinterest.analytics.kibana.f fVar = new com.pinterest.analytics.kibana.f(y.b().getHasMobile(), j15, valueOf, length, Long.valueOf(d13), Boolean.valueOf(d2), Long.valueOf(j16), Long.valueOf(j16), null, (valueOf2 == null || !new IntRange(1, 599, 1).f(valueOf2.intValue())) ? null : valueOf2, (valueOf2 == null || !new IntRange(-1, 599, 1).f(valueOf2.intValue())) ? valueOf2 : null, Float.valueOf(f13), Long.valueOf((long) f13), null, Integer.valueOf(length2));
        String host = uri.getHost();
        String b15 = g7.i.b(dataSpec.f63788c);
        Intrinsics.checkNotNullExpressionValue(b15, "getHttpMethodString(...)");
        com.pinterest.analytics.kibana.i iVar = new com.pinterest.analytics.kibana.i(gVar, fVar, new com.pinterest.analytics.kibana.h(str, host, b15, str4, uri.getEncodedPath(), this.f53405h, null, Z, null, Z2, this.f53402e.getStr()));
        l lVar = this.f53401d;
        if (lVar.x()) {
            d.f53395a.getClass();
            c.a(iVar);
        }
        lVar.y();
    }

    @Override // g7.a0
    public final void f(g7.f source, g7.i dataSpec) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
    }

    @Override // g7.a0
    public final void g(g7.f source, g7.i dataSpec, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        vb0.j.f125466a.M(b(source), "[NetworkMetricsTransferListener] Should only be provided to PinterestCronetDataSource.", p.VIDEO_PLAYER, new Object[0]);
        this.f53408k += i13;
    }
}

package tu1;

import android.net.Uri;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes4.dex */
public final class p0 implements uu1.c {

    /* renamed from: a, reason: collision with root package name */
    public final y f119424a;

    public p0(y networkLogger) {
        Intrinsics.checkNotNullParameter(networkLogger, "networkLogger");
        this.f119424a = networkLogger;
    }

    @Override // uu1.c
    public final void a(RequestFinishedInfo requestInfo) {
        Long l13;
        int i13;
        Long l14;
        List<String> list;
        List<String> list2;
        Intrinsics.checkNotNullParameter(requestInfo, "info");
        y yVar = this.f119424a;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        UrlResponseInfo responseInfo = requestInfo.getResponseInfo();
        String str = null;
        Map<String, List<String>> allHeaders = responseInfo != null ? responseInfo.getAllHeaders() : null;
        UrlResponseInfo responseInfo2 = requestInfo.getResponseInfo();
        String source = (responseInfo2 == null || !responseInfo2.wasCached()) ? su1.e.NETWORK.getSource() : su1.e.LOCAL_CACHE.getSource();
        UrlResponseInfo responseInfo3 = requestInfo.getResponseInfo();
        String negotiatedProtocol = responseInfo3 != null ? responseInfo3.getNegotiatedProtocol() : null;
        String str2 = negotiatedProtocol == null ? "unknown" : negotiatedProtocol;
        UrlResponseInfo responseInfo4 = requestInfo.getResponseInfo();
        Integer valueOf = Integer.valueOf(responseInfo4 != null ? responseInfo4.getHttpStatusCode() : 0);
        boolean d2 = Intrinsics.d(v0.b(requestInfo).get("android_is_gzipped"), "true");
        String str3 = (String) v0.b(requestInfo).get("annotation_request_headers_size_in_bytes");
        RequestFinishedInfo.Metrics metrics = requestInfo.getMetrics();
        if (metrics == null || (l13 = metrics.getSentByteCount()) == null) {
            l13 = 0L;
        }
        long longValue = l13.longValue();
        long parseLong = str3 != null ? Long.parseLong(str3) : 0L;
        String url = requestInfo.getUrl();
        Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
        String str4 = (String) v0.b(requestInfo).get("annotation_request_type");
        String str5 = str4 == null ? "unknown" : str4;
        su1.q qVar = new su1.q(longValue, longValue, parseLong, url, d2, str5);
        RequestFinishedInfo.Metrics metrics2 = requestInfo.getMetrics();
        int finishedReason = requestInfo.getFinishedReason();
        if (finishedReason != 1) {
            i13 = finishedReason != 2 ? 0 : -999;
        } else {
            if (requestInfo.getException() instanceof NetworkException) {
                CronetException exception = requestInfo.getException();
                Intrinsics.g(exception, "null cannot be cast to non-null type org.chromium.net.NetworkException");
                switch (((NetworkException) exception).getErrorCode()) {
                    case 1:
                        i13 = 1;
                        break;
                    case 2:
                        i13 = -1009;
                        break;
                    case 3:
                    case 5:
                    case 8:
                        i13 = -1005;
                        break;
                    case 4:
                    case 6:
                        break;
                    case 7:
                    case 9:
                        i13 = -1004;
                        break;
                    case 10:
                        i13 = -1002;
                        break;
                    default:
                        i13 = -998;
                        break;
                }
            }
            i13 = -1001;
        }
        Date dnsStart = metrics2.getDnsStart();
        Long valueOf2 = dnsStart != null ? Long.valueOf(dnsStart.getTime()) : null;
        Date dnsEnd = metrics2.getDnsEnd();
        Long valueOf3 = dnsEnd != null ? Long.valueOf(dnsEnd.getTime()) : null;
        if (valueOf2 != null) {
            l14 = valueOf3 != null ? Long.valueOf(valueOf3.longValue() - valueOf2.longValue()) : null;
        } else {
            l14 = null;
        }
        Long ttfbMs = metrics2.getTtfbMs();
        if (ttfbMs == null) {
            ttfbMs = 0L;
        }
        Long totalTimeMs = metrics2.getTotalTimeMs();
        if (totalTimeMs == null) {
            totalTimeMs = 0L;
        }
        Long receivedByteCount = metrics2.getReceivedByteCount();
        if (receivedByteCount == null) {
            receivedByteCount = 0L;
        }
        boolean socketReused = metrics2.getSocketReused();
        long longValue2 = ttfbMs.longValue();
        long longValue3 = totalTimeMs.longValue();
        long longValue4 = receivedByteCount.longValue();
        Integer valueOf4 = Integer.valueOf(i13);
        su1.j networkMetricsData = new su1.j(allHeaders, source, str2, valueOf, qVar, new su1.r(longValue2, longValue3, l14, longValue4, socketReused, valueOf4));
        cy.a aVar = yVar.f119472a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(networkMetricsData, "networkMetricsData");
        aVar.f53385b.getClass();
        xu1.i networkType = xu1.y.b();
        cy.f fVar = aVar.f53386c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(networkMetricsData, "networkMetricsData");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        su1.h transport = aVar.f53388e;
        Intrinsics.checkNotNullParameter(transport, "transport");
        Long valueOf5 = allHeaders != null ? Long.valueOf(cy.e.d(allHeaders)) : null;
        Uri parse = Uri.parse(url);
        String lastPathSegment = parse.getLastPathSegment();
        String b13 = lastPathSegment != null ? cy.e.b(lastPathSegment) : null;
        String j13 = CollectionsKt.L(cy.e.f53396a, b13) ? a.a.j("$.", b13) : parse.getPath();
        String Z = (allHeaders == null || (list2 = allHeaders.get("x-pinterest-rid")) == null) ? null : CollectionsKt.Z(list2, ",", null, null, 0, null, null, 62);
        if (allHeaders != null && (list = allHeaders.get("x-cdn")) != null) {
            str = (String) CollectionsKt.firstOrNull(list);
        }
        com.pinterest.analytics.kibana.g gVar = new com.pinterest.analytics.kibana.g(networkType.getUsing(), fVar.f53398a);
        boolean hasMobile = networkType.getHasMobile();
        if (!new IntRange(1, 599, 1).f(valueOf.intValue())) {
            valueOf = 0;
        }
        com.pinterest.analytics.kibana.i iVar = new com.pinterest.analytics.kibana.i(gVar, new com.pinterest.analytics.kibana.f(hasMobile, parseLong, Long.valueOf(longValue), longValue, valueOf5, Boolean.valueOf(d2), Long.valueOf(longValue4), Long.valueOf(longValue4), Boolean.valueOf(socketReused), valueOf, valueOf4, Float.valueOf(longValue3), Long.valueOf(longValue2), l14, Integer.valueOf(parse.toString().length())), new com.pinterest.analytics.kibana.h(source, parse.getHost(), str5, j13, parse.getEncodedPath(), str2, null, Z, null, str, transport.getStr()));
        tb.l lVar = aVar.f53387d;
        if (lVar.x()) {
            cy.d.f53395a.getClass();
            cy.c.a(iVar);
        }
        lVar.y();
    }
}

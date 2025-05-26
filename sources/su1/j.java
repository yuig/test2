package su1;

import a.cb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Map f115234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115235b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115236c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f115237d;

    /* renamed from: e, reason: collision with root package name */
    public final q f115238e;

    /* renamed from: f, reason: collision with root package name */
    public final r f115239f;

    public j(Map map, String fetchFrom, String networkProtocol, Integer num, q requestMetricsData, r responseMetricsData) {
        Intrinsics.checkNotNullParameter(fetchFrom, "fetchFrom");
        Intrinsics.checkNotNullParameter(networkProtocol, "networkProtocol");
        Intrinsics.checkNotNullParameter(requestMetricsData, "requestMetricsData");
        Intrinsics.checkNotNullParameter(responseMetricsData, "responseMetricsData");
        this.f115234a = map;
        this.f115235b = fetchFrom;
        this.f115236c = networkProtocol;
        this.f115237d = num;
        this.f115238e = requestMetricsData;
        this.f115239f = responseMetricsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f115234a, jVar.f115234a) && Intrinsics.d(this.f115235b, jVar.f115235b) && Intrinsics.d(this.f115236c, jVar.f115236c) && Intrinsics.d(this.f115237d, jVar.f115237d) && Intrinsics.d(this.f115238e, jVar.f115238e) && Intrinsics.d(this.f115239f, jVar.f115239f);
    }

    public final int hashCode() {
        Map map = this.f115234a;
        int d2 = cb.d(this.f115236c, cb.d(this.f115235b, (map == null ? 0 : map.hashCode()) * 31, 31), 31);
        Integer num = this.f115237d;
        return this.f115239f.hashCode() + ((this.f115238e.hashCode() + ((d2 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "NetworkMetricsData(responseHeaders=" + this.f115234a + ", fetchFrom=" + this.f115235b + ", networkProtocol=" + this.f115236c + ", statusCode=" + this.f115237d + ", requestMetricsData=" + this.f115238e + ", responseMetricsData=" + this.f115239f + ")";
    }
}

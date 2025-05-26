package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0003B)\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/pinterest/api/model/tv;", "", "", "a", "I", "getVersion", "()I", "version", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "Lcom/pinterest/api/model/tv$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "results", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class tv {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("result_version")
    private final int version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("endpoint_id")
    @NotNull
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("result")
    @NotNull
    private final List<a> results;

    public tv(int i13, @NotNull String id3, @NotNull List<a> results) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(results, "results");
        this.version = i13;
        this.id = id3;
        this.results = results;
    }

    /* renamed from: a, reason: from getter */
    public final List getResults() {
        return this.results;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv)) {
            return false;
        }
        tv tvVar = (tv) obj;
        return this.version == tvVar.version && Intrinsics.d(this.id, tvVar.id) && Intrinsics.d(this.results, tvVar.results);
    }

    public final int hashCode() {
        return this.results.hashCode() + a.cb.d(this.id, Integer.hashCode(this.version) * 31, 31);
    }

    public final String toString() {
        int i13 = this.version;
        String str = this.id;
        List<a> list = this.results;
        StringBuilder sb3 = new StringBuilder("Metric(version=");
        sb3.append(i13);
        sb3.append(", id=");
        sb3.append(str);
        sb3.append(", results=");
        return a.c.j(sb3, list, ")");
    }

    public /* synthetic */ tv(int i13, String str, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 2 : i13, str, (i14 & 4) != 0 ? new ArrayList() : list);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\b\b\u0002\u0010/\u001a\u00020\b\u0012\b\b\u0002\u00100\u001a\u00020\b\u0012\b\b\u0002\u00101\u001a\u00020\b\u0012\b\b\u0002\u00103\u001a\u000202\u0012\b\b\u0002\u00104\u001a\u000202\u0012\b\b\u0002\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00107R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\"\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b!\u0010\fR\u001a\u0010%\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010(\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b'\u0010\fR\u001a\u0010+\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\f¨\u00068"}, d2 = {"Lcom/pinterest/api/model/tv$a;", "", "", "a", "I", "getStatusCode", "()I", "statusCode", "", "b", "J", "getDnsStart", "()J", "dnsStart", "c", "getDnsEnd", "dnsEnd", "d", "getTcpStart", "tcpStart", "e", "getTlsStart", "tlsStart", "f", "getTcpEnd", "tcpEnd", "g", "getReqStart", "reqStart", "h", "getReqHeadersEnd", "reqHeadersEnd", "i", "getReqBodyStart", "reqBodyStart", "j", "getReqBodyEnd", "reqBodyEnd", "k", "getRespStart", "respStart", "l", "getRespEnd", "respEnd", "latency", "ttfb", "ttlb", "tcpTime", "tlsTime", "dnsTime", "", "cdn", "cacheStatus", "responseCode", "<init>", "(IJJJJJJJJJJJJJJJJJLjava/lang/String;Ljava/lang/String;I)V", "models_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @om.b("status_code")
        private final int statusCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @om.b("dns_start")
        private final long dnsStart;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @om.b("dns_end")
        private final long dnsEnd;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @om.b("tcp_start")
        private final long tcpStart;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @om.b("tls_start")
        private final long tlsStart;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @om.b("tcp_end")
        private final long tcpEnd;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @om.b("req_start")
        private final long reqStart;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @om.b("req_headers_end")
        private final long reqHeadersEnd;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @om.b("req_body_start")
        private final long reqBodyStart;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @om.b("req_body_end")
        private final long reqBodyEnd;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @om.b("resp_start")
        private final long respStart;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @om.b("resp_end")
        private final long respEnd;

        /* renamed from: m, reason: collision with root package name */
        public final transient long f42326m;

        /* renamed from: n, reason: collision with root package name */
        public final transient long f42327n;

        /* renamed from: o, reason: collision with root package name */
        public final transient long f42328o;

        /* renamed from: p, reason: collision with root package name */
        public final transient long f42329p;

        /* renamed from: q, reason: collision with root package name */
        public final transient long f42330q;

        /* renamed from: r, reason: collision with root package name */
        public final transient long f42331r;

        /* renamed from: s, reason: collision with root package name */
        public final transient String f42332s;

        /* renamed from: t, reason: collision with root package name */
        public final transient String f42333t;

        /* renamed from: u, reason: collision with root package name */
        public final transient int f42334u;

        public a(int i13, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j33, long j34, long j35, @NotNull String cdn, @NotNull String cacheStatus, int i14) {
            Intrinsics.checkNotNullParameter(cdn, "cdn");
            Intrinsics.checkNotNullParameter(cacheStatus, "cacheStatus");
            this.statusCode = i13;
            this.dnsStart = j13;
            this.dnsEnd = j14;
            this.tcpStart = j15;
            this.tlsStart = j16;
            this.tcpEnd = j17;
            this.reqStart = j18;
            this.reqHeadersEnd = j19;
            this.reqBodyStart = j23;
            this.reqBodyEnd = j24;
            this.respStart = j25;
            this.respEnd = j26;
            this.f42326m = j27;
            this.f42327n = j28;
            this.f42328o = j29;
            this.f42329p = j33;
            this.f42330q = j34;
            this.f42331r = j35;
            this.f42332s = cdn;
            this.f42333t = cacheStatus;
            this.f42334u = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.statusCode == aVar.statusCode && this.dnsStart == aVar.dnsStart && this.dnsEnd == aVar.dnsEnd && this.tcpStart == aVar.tcpStart && this.tlsStart == aVar.tlsStart && this.tcpEnd == aVar.tcpEnd && this.reqStart == aVar.reqStart && this.reqHeadersEnd == aVar.reqHeadersEnd && this.reqBodyStart == aVar.reqBodyStart && this.reqBodyEnd == aVar.reqBodyEnd && this.respStart == aVar.respStart && this.respEnd == aVar.respEnd && this.f42326m == aVar.f42326m && this.f42327n == aVar.f42327n && this.f42328o == aVar.f42328o && this.f42329p == aVar.f42329p && this.f42330q == aVar.f42330q && this.f42331r == aVar.f42331r && Intrinsics.d(this.f42332s, aVar.f42332s) && Intrinsics.d(this.f42333t, aVar.f42333t) && this.f42334u == aVar.f42334u;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f42334u) + a.cb.d(this.f42333t, a.cb.d(this.f42332s, a.a.c(this.f42331r, a.a.c(this.f42330q, a.a.c(this.f42329p, a.a.c(this.f42328o, a.a.c(this.f42327n, a.a.c(this.f42326m, a.a.c(this.respEnd, a.a.c(this.respStart, a.a.c(this.reqBodyEnd, a.a.c(this.reqBodyStart, a.a.c(this.reqHeadersEnd, a.a.c(this.reqStart, a.a.c(this.tcpEnd, a.a.c(this.tlsStart, a.a.c(this.tcpStart, a.a.c(this.dnsEnd, a.a.c(this.dnsStart, Integer.hashCode(this.statusCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            int i13 = this.statusCode;
            long j13 = this.dnsStart;
            long j14 = this.dnsEnd;
            long j15 = this.tcpStart;
            long j16 = this.tlsStart;
            long j17 = this.tcpEnd;
            long j18 = this.reqStart;
            long j19 = this.reqHeadersEnd;
            long j23 = this.reqBodyStart;
            long j24 = this.reqBodyEnd;
            long j25 = this.respStart;
            long j26 = this.respEnd;
            StringBuilder sb3 = new StringBuilder("Result(statusCode=");
            sb3.append(i13);
            sb3.append(", dnsStart=");
            sb3.append(j13);
            a.cb.v(sb3, ", dnsEnd=", j14, ", tcpStart=");
            sb3.append(j15);
            a.cb.v(sb3, ", tlsStart=", j16, ", tcpEnd=");
            sb3.append(j17);
            a.cb.v(sb3, ", reqStart=", j18, ", reqHeadersEnd=");
            sb3.append(j19);
            a.cb.v(sb3, ", reqBodyStart=", j23, ", reqBodyEnd=");
            sb3.append(j24);
            a.cb.v(sb3, ", respStart=", j25, ", respEnd=");
            sb3.append(j26);
            sb3.append(", latency=");
            sb3.append(this.f42326m);
            sb3.append(", ttfb=");
            sb3.append(this.f42327n);
            sb3.append(", ttlb=");
            sb3.append(this.f42328o);
            sb3.append(", tcpTime=");
            sb3.append(this.f42329p);
            sb3.append(", tlsTime=");
            sb3.append(this.f42330q);
            sb3.append(", dnsTime=");
            sb3.append(this.f42331r);
            sb3.append(", cdn=");
            sb3.append(this.f42332s);
            sb3.append(", cacheStatus=");
            sb3.append(this.f42333t);
            sb3.append(", responseCode=");
            return a.a.n(sb3, this.f42334u, ")");
        }

        public /* synthetic */ a(int i13, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j33, long j34, long j35, String str, String str2, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, j13, j14, j15, j16, j17, j18, j19, j23, j24, j25, j26, j27, (i15 & 8192) != 0 ? 0L : j28, (i15 & 16384) != 0 ? 0L : j29, (32768 & i15) != 0 ? 0L : j33, (65536 & i15) != 0 ? 0L : j34, (131072 & i15) != 0 ? 0L : j35, (262144 & i15) != 0 ? "" : str, (524288 & i15) != 0 ? "" : str2, (i15 & 1048576) != 0 ? 0 : i14);
        }
    }
}

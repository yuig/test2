package ads_mobile_sdk;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class vo {

    /* renamed from: a, reason: collision with root package name */
    public final String f12576a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12577b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12578c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12579d;

    /* renamed from: e, reason: collision with root package name */
    public final nm.u f12580e;

    /* renamed from: f, reason: collision with root package name */
    public final nm.u f12581f;

    /* renamed from: g, reason: collision with root package name */
    public final ck f12582g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12583h;

    /* renamed from: i, reason: collision with root package name */
    public final nm.u f12584i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f12585j;

    /* renamed from: k, reason: collision with root package name */
    public final long f12586k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12587l;

    /* renamed from: m, reason: collision with root package name */
    public final List f12588m;

    /* renamed from: n, reason: collision with root package name */
    public final long f12589n;

    /* renamed from: o, reason: collision with root package name */
    public final long f12590o;

    /* renamed from: p, reason: collision with root package name */
    public final int f12591p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f12592q;

    /* renamed from: r, reason: collision with root package name */
    public final String f12593r;

    public vo(String adapterResponseReplacementKey, String adRequestPostBody, String adRequestUrl, String adResponseBody, nm.u adResponseHeaders, nm.u biddingData, ck ckVar, String gwsQueryId, nm.u inspectorExtras, boolean z13, long j13, int i13, ArrayList noFillUrls, long j14, long j15, int i14, Bundle responseInfoExtras, String scionQueryEventId) {
        Intrinsics.checkNotNullParameter(adapterResponseReplacementKey, "adapterResponseReplacementKey");
        Intrinsics.checkNotNullParameter(adRequestPostBody, "adRequestPostBody");
        Intrinsics.checkNotNullParameter(adRequestUrl, "adRequestUrl");
        Intrinsics.checkNotNullParameter(adResponseBody, "adResponseBody");
        Intrinsics.checkNotNullParameter(adResponseHeaders, "adResponseHeaders");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(inspectorExtras, "inspectorExtras");
        Intrinsics.checkNotNullParameter(noFillUrls, "noFillUrls");
        Intrinsics.checkNotNullParameter(responseInfoExtras, "responseInfoExtras");
        Intrinsics.checkNotNullParameter(scionQueryEventId, "scionQueryEventId");
        this.f12576a = adapterResponseReplacementKey;
        this.f12577b = adRequestPostBody;
        this.f12578c = adRequestUrl;
        this.f12579d = adResponseBody;
        this.f12580e = adResponseHeaders;
        this.f12581f = biddingData;
        this.f12582g = ckVar;
        this.f12583h = gwsQueryId;
        this.f12584i = inspectorExtras;
        this.f12585j = z13;
        this.f12586k = j13;
        this.f12587l = i13;
        this.f12588m = noFillUrls;
        this.f12589n = j14;
        this.f12590o = j15;
        this.f12591p = i14;
        this.f12592q = responseInfoExtras;
        this.f12593r = scionQueryEventId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return Intrinsics.d(this.f12576a, voVar.f12576a) && Intrinsics.d(this.f12577b, voVar.f12577b) && Intrinsics.d(this.f12578c, voVar.f12578c) && Intrinsics.d(this.f12579d, voVar.f12579d) && Intrinsics.d(this.f12580e, voVar.f12580e) && Intrinsics.d(this.f12581f, voVar.f12581f) && Intrinsics.d(this.f12582g, voVar.f12582g) && Intrinsics.d(this.f12583h, voVar.f12583h) && Intrinsics.d(this.f12584i, voVar.f12584i) && this.f12585j == voVar.f12585j && this.f12586k == voVar.f12586k && this.f12587l == voVar.f12587l && Intrinsics.d(this.f12588m, voVar.f12588m) && zn2.b.d(this.f12589n, voVar.f12589n) && zn2.b.d(this.f12590o, voVar.f12590o) && this.f12591p == voVar.f12591p && Intrinsics.d(this.f12592q, voVar.f12592q) && Intrinsics.d(this.f12593r, voVar.f12593r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.f12581f.f91366a.hashCode() + ((this.f12580e.f91366a.hashCode() + kh2.j1.t(kh2.j1.t(kh2.j1.t(this.f12576a.hashCode() * 31, this.f12577b), this.f12578c), this.f12579d)) * 31)) * 31;
        ck ckVar = this.f12582g;
        int hashCode2 = (this.f12584i.f91366a.hashCode() + kh2.j1.t((hashCode + (ckVar == null ? 0 : ckVar.hashCode())) * 31, this.f12583h)) * 31;
        boolean z13 = this.f12585j;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int p13 = gh0.b.p(kh2.n3.f(this.f12587l, a.a.c(this.f12586k, (hashCode2 + i13) * 31, 31)), this.f12588m);
        long j13 = this.f12589n;
        zn2.a aVar = zn2.b.f142311b;
        return this.f12593r.hashCode() + ((this.f12592q.hashCode() + kh2.n3.f(this.f12591p, a.a.c(this.f12590o, a.a.c(j13, p13, 31), 31))) * 31);
    }

    public final String toString() {
        String str = this.f12576a;
        String str2 = this.f12577b;
        String str3 = this.f12578c;
        String str4 = this.f12579d;
        nm.u uVar = this.f12580e;
        nm.u uVar2 = this.f12581f;
        ck ckVar = this.f12582g;
        String str5 = this.f12583h;
        nm.u uVar3 = this.f12584i;
        boolean z13 = this.f12585j;
        long j13 = this.f12586k;
        int i13 = this.f12587l;
        List list = this.f12588m;
        String o13 = zn2.b.o(this.f12589n);
        String o14 = zn2.b.o(this.f12590o);
        int i14 = this.f12591p;
        Bundle bundle = this.f12592q;
        String str6 = this.f12593r;
        StringBuilder w13 = a.a.w("CommonConfiguration(adapterResponseReplacementKey=", str, ", adRequestPostBody=", str2, ", adRequestUrl=");
        a.a.B(w13, str3, ", adResponseBody=", str4, ", adResponseHeaders=");
        w13.append(uVar);
        w13.append(", biddingData=");
        w13.append(uVar2);
        w13.append(", bowResponseError=");
        w13.append(ckVar);
        w13.append(", gwsQueryId=");
        w13.append(str5);
        w13.append(", inspectorExtras=");
        w13.append(uVar3);
        w13.append(", isIdless=");
        w13.append(z13);
        w13.append(", latency=");
        w13.append(j13);
        w13.append(", maxParallelRenderers=");
        w13.append(i13);
        w13.append(", noFillUrls=");
        w13.append(list);
        w13.append(", refreshInterval=");
        w13.append(o13);
        w13.append(", proactiveRefreshLoadDelayInterval=");
        w13.append(o14);
        w13.append(", responseCode=");
        w13.append(i14);
        w13.append(", responseInfoExtras=");
        w13.append(bundle);
        w13.append(", scionQueryEventId=");
        w13.append(str6);
        w13.append(")");
        return w13.toString();
    }
}

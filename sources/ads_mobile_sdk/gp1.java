package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gp1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5654b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5655c;

    public gp1(long j13, String gwsQueryId, String url) {
        fp1 eventState = fp1.f5235a;
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventState, "eventState");
        this.f5653a = j13;
        this.f5654b = gwsQueryId;
        this.f5655c = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp1)) {
            return false;
        }
        gp1 gp1Var = (gp1) obj;
        if (this.f5653a != gp1Var.f5653a || !Intrinsics.d(this.f5654b, gp1Var.f5654b) || !Intrinsics.d(this.f5655c, gp1Var.f5655c)) {
            return false;
        }
        fp1 fp1Var = fp1.f5235a;
        return true;
    }

    public final int hashCode() {
        return fp1.f5235a.hashCode() + kh2.j1.t(kh2.j1.t(Long.hashCode(this.f5653a) * 31, this.f5654b), this.f5655c);
    }

    public final String toString() {
        return "OfflineBufferedPingRecord(timestamp=" + this.f5653a + ", gwsQueryId=" + this.f5654b + ", url=" + this.f5655c + ", eventState=" + fp1.f5235a + ")";
    }
}

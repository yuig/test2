package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o52 {

    /* renamed from: a, reason: collision with root package name */
    public String f9147a;

    /* renamed from: b, reason: collision with root package name */
    public String f9148b;

    /* renamed from: c, reason: collision with root package name */
    public h92 f9149c;

    /* renamed from: d, reason: collision with root package name */
    public String f9150d;

    /* renamed from: e, reason: collision with root package name */
    public String f9151e;

    public /* synthetic */ o52() {
        this("", "", h92.f5898d, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o52)) {
            return false;
        }
        o52 o52Var = (o52) obj;
        return Intrinsics.d(this.f9147a, o52Var.f9147a) && Intrinsics.d(this.f9148b, o52Var.f9148b) && this.f9149c == o52Var.f9149c && Intrinsics.d(this.f9150d, o52Var.f9150d) && Intrinsics.d(this.f9151e, o52Var.f9151e);
    }

    public final int hashCode() {
        return this.f9151e.hashCode() + kh2.j1.t((this.f9149c.hashCode() + kh2.j1.t(this.f9147a.hashCode() * 31, this.f9148b)) * 31, this.f9150d);
    }

    public final String toString() {
        String str = this.f9147a;
        String str2 = this.f9148b;
        h92 h92Var = this.f9149c;
        String str3 = this.f9150d;
        String str4 = this.f9151e;
        StringBuilder w13 = a.a.w("PublisherRequestTraceMeta(publisherRequestId=", str, ", adUnitId=", str2, ", publisherRequestType=");
        w13.append(h92Var);
        w13.append(", signalGenerationRequestId=");
        w13.append(str3);
        w13.append(", preloadId=");
        return a.a.p(w13, str4, ")");
    }

    public o52(String publisherRequestId, String adUnitId, h92 publisherRequestType, String signalGenerationRequestId, String preloadId) {
        Intrinsics.checkNotNullParameter(publisherRequestId, "publisherRequestId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(publisherRequestType, "publisherRequestType");
        Intrinsics.checkNotNullParameter(signalGenerationRequestId, "signalGenerationRequestId");
        Intrinsics.checkNotNullParameter(preloadId, "preloadId");
        this.f9147a = publisherRequestId;
        this.f9148b = adUnitId;
        this.f9149c = publisherRequestType;
        this.f9150d = signalGenerationRequestId;
        this.f9151e = preloadId;
    }
}

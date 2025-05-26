package y02;

import ep.b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f136511a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f136512b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136513c;

    public a(boolean z13, boolean z14, boolean z15) {
        this.f136511a = z13;
        this.f136512b = z14;
        this.f136513c = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f136511a == aVar.f136511a && this.f136512b == aVar.f136512b && this.f136513c == aVar.f136513c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136513c) + b.e(this.f136512b, Boolean.hashCode(this.f136511a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrackingSettingsResponse(sendMarketingData=");
        sb3.append(this.f136511a);
        sb3.append(", sendEventsToAdNetworks=");
        sb3.append(this.f136512b);
        sb3.append(", sendEventsToThirdParties=");
        return a.a.r(sb3, this.f136513c, ")");
    }
}

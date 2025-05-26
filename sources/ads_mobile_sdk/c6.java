package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final e6 f3778a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3779b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.v f3780c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3781d;

    public c6(e6 type, long j13, wi.v precisionType, String currencyCode) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(precisionType, "precisionType");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f3778a = type;
        this.f3779b = j13;
        this.f3780c = precisionType;
        this.f3781d = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return this.f3778a == c6Var.f3778a && this.f3779b == c6Var.f3779b && this.f3780c == c6Var.f3780c && Intrinsics.d(this.f3781d, c6Var.f3781d);
    }

    public final int hashCode() {
        return this.f3781d.hashCode() + ((this.f3780c.hashCode() + a.a.c(this.f3779b, this.f3778a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "AdValueParcel(type=" + this.f3778a + ", valueMicros=" + this.f3779b + ", precisionType=" + this.f3780c + ", currencyCode=" + this.f3781d + ")";
    }
}

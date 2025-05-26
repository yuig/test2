package wi;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final v f129951a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129952b;

    /* renamed from: c, reason: collision with root package name */
    public final String f129953c;

    public j(v precisionType, long j13, String currencyCode) {
        Intrinsics.checkNotNullParameter(precisionType, "precisionType");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f129951a = precisionType;
        this.f129952b = j13;
        this.f129953c = currencyCode;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f129951a == jVar.f129951a && this.f129952b == jVar.f129952b && Intrinsics.d(this.f129953c, jVar.f129953c)) {
                return true;
            }
        }
        return false;
    }
}

package ga;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f64578a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64579b;

    public a(String adsSdkName, boolean z13) {
        Intrinsics.checkNotNullParameter(adsSdkName, "adsSdkName");
        this.f64578a = adsSdkName;
        this.f64579b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f64578a, aVar.f64578a) && this.f64579b == aVar.f64579b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64579b) + (this.f64578a.hashCode() * 31);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f64578a + ", shouldRecordObservation=" + this.f64579b;
    }
}

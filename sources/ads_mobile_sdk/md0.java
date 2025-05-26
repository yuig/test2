package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class md0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8177b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8178c;

    public md0(String str, String str2, String firebaseAdEventId) {
        Intrinsics.checkNotNullParameter(firebaseAdEventId, "firebaseAdEventId");
        this.f8176a = str;
        this.f8177b = str2;
        this.f8178c = firebaseAdEventId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md0)) {
            return false;
        }
        md0 md0Var = (md0) obj;
        return Intrinsics.d(this.f8176a, md0Var.f8176a) && Intrinsics.d(this.f8177b, md0Var.f8177b) && Intrinsics.d(this.f8178c, md0Var.f8178c);
    }

    public final int hashCode() {
        String str = this.f8176a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8177b;
        return this.f8178c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f8176a;
        String str2 = this.f8177b;
        return a.a.p(a.a.w("FirebaseAnalyticsIds(firebaseAppId=", str, ", firebaseAppInstanceId=", str2, ", firebaseAdEventId="), this.f8178c, ")");
    }
}

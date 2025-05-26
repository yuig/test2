package rx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f110122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110123b;

    public a(String userId, String audienceType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        this.f110122a = userId;
        this.f110123b = audienceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f110122a, aVar.f110122a) && Intrinsics.d(this.f110123b, aVar.f110123b);
    }

    public final int hashCode() {
        return this.f110123b.hashCode() + (this.f110122a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudienceInsightsRequestParameters(userId=");
        sb3.append(this.f110122a);
        sb3.append(", audienceType=");
        return a.a.p(sb3, this.f110123b, ")");
    }
}

package ic1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f72097a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72098b;

    public x(String countryPhoneCode, String countryCode) {
        Intrinsics.checkNotNullParameter(countryPhoneCode, "countryPhoneCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f72097a = countryPhoneCode;
        this.f72098b = countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f72097a, xVar.f72097a) && Intrinsics.d(this.f72098b, xVar.f72098b);
    }

    public final int hashCode() {
        return this.f72098b.hashCode() + (this.f72097a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfileCountryCodeUpdatedEvent(countryPhoneCode=");
        sb3.append(this.f72097a);
        sb3.append(", countryCode=");
        return a.a.p(sb3, this.f72098b, ")");
    }
}

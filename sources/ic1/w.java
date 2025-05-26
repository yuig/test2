package ic1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f72094a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72095b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72096c;

    public w(String countryPhoneCodeLabel, String countryPhoneCode, String countryCode) {
        Intrinsics.checkNotNullParameter(countryPhoneCodeLabel, "countryPhoneCodeLabel");
        Intrinsics.checkNotNullParameter(countryPhoneCode, "countryPhoneCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f72094a = countryPhoneCodeLabel;
        this.f72095b = countryPhoneCode;
        this.f72096c = countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f72094a, wVar.f72094a) && Intrinsics.d(this.f72095b, wVar.f72095b) && Intrinsics.d(this.f72096c, wVar.f72096c);
    }

    public final int hashCode() {
        return this.f72096c.hashCode() + cb.d(this.f72095b, this.f72094a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PhoneCountryCodeItem(countryPhoneCodeLabel=");
        sb3.append(this.f72094a);
        sb3.append(", countryPhoneCode=");
        sb3.append(this.f72095b);
        sb3.append(", countryCode=");
        return a.a.p(sb3, this.f72096c, ")");
    }
}

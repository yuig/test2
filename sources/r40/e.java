package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f106134a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106135b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106136c;

    public e(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f106134a = __typename;
        this.f106135b = str;
        this.f106136c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f106134a, eVar.f106134a) && Intrinsics.d(this.f106135b, eVar.f106135b) && Intrinsics.d(this.f106136c, eVar.f106136c);
    }

    public final int hashCode() {
        int hashCode = this.f106134a.hashCode() * 31;
        String str = this.f106135b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106136c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContactPhoneCountry(__typename=");
        sb3.append(this.f106134a);
        sb3.append(", code=");
        sb3.append(this.f106135b);
        sb3.append(", phoneCode=");
        return a.a.p(sb3, this.f106136c, ")");
    }
}

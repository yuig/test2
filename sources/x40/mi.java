package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    public final String f132853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132855c;

    public mi(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132853a = __typename;
        this.f132854b = str;
        this.f132855c = str2;
    }

    public final String a() {
        return this.f132854b;
    }

    public final String b() {
        return this.f132855c;
    }

    public final String c() {
        return this.f132853a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi)) {
            return false;
        }
        mi miVar = (mi) obj;
        return Intrinsics.d(this.f132853a, miVar.f132853a) && Intrinsics.d(this.f132854b, miVar.f132854b) && Intrinsics.d(this.f132855c, miVar.f132855c);
    }

    public final int hashCode() {
        int hashCode = this.f132853a.hashCode() * 31;
        String str = this.f132854b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132855c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContactPhoneCountry(__typename=");
        sb3.append(this.f132853a);
        sb3.append(", code=");
        sb3.append(this.f132854b);
        sb3.append(", phoneCode=");
        return a.a.p(sb3, this.f132855c, ")");
    }
}

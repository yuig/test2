package c60;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f26507a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26508b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26509c;

    public a(String v3AccessToken, String str, String str2) {
        Intrinsics.checkNotNullParameter(v3AccessToken, "v3AccessToken");
        this.f26507a = v3AccessToken;
        this.f26508b = str;
        this.f26509c = str2;
    }

    public final String a() {
        String str = this.f26508b;
        if (str != null) {
            String str2 = this.f26509c;
            if (!(true ^ (str2 == null || str2.length() == 0))) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.f26507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f26507a, aVar.f26507a) && Intrinsics.d(this.f26508b, aVar.f26508b) && Intrinsics.d(this.f26509c, aVar.f26509c);
    }

    public final int hashCode() {
        int hashCode = this.f26507a.hashCode() * 31;
        String str = this.f26508b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26509c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AccessToken(v3AccessToken=");
        sb3.append(this.f26507a);
        sb3.append(", v5AccessToken=");
        sb3.append(this.f26508b);
        sb3.append(", v5RefreshToken=");
        return a.a.p(sb3, this.f26509c, ")");
    }
}

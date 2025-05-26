package f22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f60977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f60978b;

    public e(String str, String str2) {
        this.f60977a = str;
        this.f60978b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f60977a, eVar.f60977a) && Intrinsics.d(this.f60978b, eVar.f60978b);
    }

    public final int hashCode() {
        String str = this.f60977a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f60978b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitEtsyOauthResponse(oauthTokenSecret=");
        sb3.append(this.f60977a);
        sb3.append(", loginUrl=");
        return a.a.p(sb3, this.f60978b, ")");
    }
}

package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f120430a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120431b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120432c;

    public w(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120430a = __typename;
        this.f120431b = str;
        this.f120432c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f120430a, wVar.f120430a) && Intrinsics.d(this.f120431b, wVar.f120431b) && Intrinsics.d(this.f120432c, wVar.f120432c);
    }

    public final int hashCode() {
        int hashCode = this.f120430a.hashCode() * 31;
        String str = this.f120431b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120432c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContactPhoneCountry(__typename=");
        sb3.append(this.f120430a);
        sb3.append(", code=");
        sb3.append(this.f120431b);
        sb3.append(", phoneCode=");
        return a.a.p(sb3, this.f120432c, ")");
    }
}

package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f120335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120336b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120337c;

    public i(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120335a = __typename;
        this.f120336b = str;
        this.f120337c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f120335a, iVar.f120335a) && Intrinsics.d(this.f120336b, iVar.f120336b) && Intrinsics.d(this.f120337c, iVar.f120337c);
    }

    public final int hashCode() {
        int hashCode = this.f120335a.hashCode() * 31;
        String str = this.f120336b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120337c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContactPhoneCountry(__typename=");
        sb3.append(this.f120335a);
        sb3.append(", code=");
        sb3.append(this.f120336b);
        sb3.append(", phoneCode=");
        return a.a.p(sb3, this.f120337c, ")");
    }
}

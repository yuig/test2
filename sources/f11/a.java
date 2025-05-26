package f11;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f60776a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f60777b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f60778c;

    /* renamed from: d, reason: collision with root package name */
    public final String f60779d;

    public a(String altText, Boolean bool, Boolean bool2, String str) {
        Intrinsics.checkNotNullParameter(altText, "altText");
        this.f60776a = altText;
        this.f60777b = bool;
        this.f60778c = bool2;
        this.f60779d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f60776a, aVar.f60776a) && Intrinsics.d(this.f60777b, aVar.f60777b) && Intrinsics.d(this.f60778c, aVar.f60778c) && Intrinsics.d(this.f60779d, aVar.f60779d);
    }

    public final int hashCode() {
        int hashCode = this.f60776a.hashCode() * 31;
        Boolean bool = this.f60777b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f60778c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f60779d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdvancedSettingsSetEvent(altText=");
        sb3.append(this.f60776a);
        sb3.append(", isCommentsEnabled=");
        sb3.append(this.f60777b);
        sb3.append(", isShoppingRecEnabled=");
        sb3.append(this.f60778c);
        sb3.append(", sponsorId=");
        return a.a.p(sb3, this.f60779d, ")");
    }
}

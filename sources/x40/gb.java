package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    public final String f132445a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132446b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132447c;

    public gb(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132445a = __typename;
        this.f132446b = str;
        this.f132447c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return Intrinsics.d(this.f132445a, gbVar.f132445a) && Intrinsics.d(this.f132446b, gbVar.f132446b) && Intrinsics.d(this.f132447c, gbVar.f132447c);
    }

    public final int hashCode() {
        int hashCode = this.f132445a.hashCode() * 31;
        String str = this.f132446b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132447c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReadTimesM(__typename=");
        sb3.append(this.f132445a);
        sb3.append(", time=");
        sb3.append(this.f132446b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f132447c, ")");
    }
}

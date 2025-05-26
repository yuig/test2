package xc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends u {

    /* renamed from: a, reason: collision with root package name */
    public final String f134578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f134579b;

    public r(String str, String str2) {
        this.f134578a = str;
        this.f134579b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f134578a, rVar.f134578a) && Intrinsics.d(this.f134579b, rVar.f134579b);
    }

    public final int hashCode() {
        String str = this.f134578a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f134579b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Failure(error=");
        sb3.append(this.f134578a);
        sb3.append(", source=");
        return a.a.p(sb3, this.f134579b, ")");
    }
}

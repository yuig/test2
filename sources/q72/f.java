package q72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f102837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f102838b;

    public f(String str, String str2) {
        this.f102837a = str;
        this.f102838b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f102837a, fVar.f102837a) && Intrinsics.d(this.f102838b, fVar.f102838b);
    }

    public final int hashCode() {
        String str = this.f102837a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f102838b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RichSummary(siteName=");
        sb3.append(this.f102837a);
        sb3.append(", displayDescription=");
        return a.a.p(sb3, this.f102838b, ")");
    }
}

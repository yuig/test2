package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106436b;

    public a1(String status, String str) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f106435a = status;
        this.f106436b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f106435a, a1Var.f106435a) && Intrinsics.d(this.f106436b, a1Var.f106436b);
    }

    public final int hashCode() {
        int hashCode = this.f106435a.hashCode() * 31;
        String str = this.f106436b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageUploadInfo(status=");
        sb3.append(this.f106435a);
        sb3.append(", failureCode=");
        return a.a.p(sb3, this.f106436b, ")");
    }
}

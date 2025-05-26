package m70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86497a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86498b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86499c;

    public a(String str, String str2, String str3) {
        this.f86497a = str;
        this.f86498b = str2;
        this.f86499c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f86497a, aVar.f86497a) && Intrinsics.d(this.f86498b, aVar.f86498b) && Intrinsics.d(this.f86499c, aVar.f86499c);
    }

    public final int hashCode() {
        String str = this.f86497a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86498b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86499c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadingArgs(boardId=");
        sb3.append(this.f86497a);
        sb3.append(", categoryId=");
        sb3.append(this.f86498b);
        sb3.append(", stlIds=");
        return a.a.p(sb3, this.f86499c, ")");
    }
}

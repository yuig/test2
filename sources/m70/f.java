package m70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86515a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86516b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86517c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86518d;

    public f(String str, String str2, String str3, String str4) {
        this.f86515a = str;
        this.f86516b = str2;
        this.f86517c = str3;
        this.f86518d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f86515a, fVar.f86515a) && Intrinsics.d(this.f86516b, fVar.f86516b) && Intrinsics.d(this.f86517c, fVar.f86517c) && Intrinsics.d(this.f86518d, fVar.f86518d);
    }

    public final int hashCode() {
        String str = this.f86515a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86516b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86517c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f86518d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadingArgs(boardId=");
        sb3.append(this.f86515a);
        sb3.append(", boardSessionId=");
        sb3.append(this.f86516b);
        sb3.append(", requestParams=");
        sb3.append(this.f86517c);
        sb3.append(", appliedFilters=");
        return a.a.p(sb3, this.f86518d, ")");
    }
}

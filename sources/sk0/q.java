package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f113076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113077b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113078c;

    /* renamed from: d, reason: collision with root package name */
    public final String f113079d;

    public q(String boardId, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113076a = boardId;
        this.f113077b = str;
        this.f113078c = str2;
        this.f113079d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f113076a, qVar.f113076a) && Intrinsics.d(this.f113077b, qVar.f113077b) && Intrinsics.d(this.f113078c, qVar.f113078c) && Intrinsics.d(this.f113079d, qVar.f113079d);
    }

    public final int hashCode() {
        int hashCode = this.f113076a.hashCode() * 31;
        String str = this.f113077b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113078c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f113079d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigateToShop(boardId=");
        sb3.append(this.f113076a);
        sb3.append(", boardSessionId=");
        sb3.append(this.f113077b);
        sb3.append(", title=");
        sb3.append(this.f113078c);
        sb3.append(", subtitle=");
        return a.a.p(sb3, this.f113079d, ")");
    }
}

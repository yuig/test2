package vo0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f126389a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126390b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126391c;

    public c(String articleId, String str, String str2) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.f126389a = articleId;
        this.f126390b = str;
        this.f126391c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f126389a, cVar.f126389a) && Intrinsics.d(this.f126390b, cVar.f126390b) && Intrinsics.d(this.f126391c, cVar.f126391c);
    }

    public final int hashCode() {
        int hashCode = this.f126389a.hashCode() * 31;
        String str = this.f126390b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f126391c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BubbleContentParams(articleId=");
        sb3.append(this.f126389a);
        sb3.append(", requestParams=");
        sb3.append(this.f126390b);
        sb3.append(", shopSource=");
        return a.a.p(sb3, this.f126391c, ")");
    }
}

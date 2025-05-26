package yu0;

import a.c;
import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140157a;

    /* renamed from: b, reason: collision with root package name */
    public final String f140158b;

    /* renamed from: c, reason: collision with root package name */
    public final String f140159c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f140160d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f140161e;

    public b(String query, String language) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter("interests", "corpus");
        this.f140157a = query;
        this.f140158b = language;
        this.f140159c = "interests";
        this.f140160d = 20;
        this.f140161e = 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f140157a, bVar.f140157a) && Intrinsics.d(this.f140158b, bVar.f140158b) && Intrinsics.d(this.f140159c, bVar.f140159c) && Intrinsics.d(this.f140160d, bVar.f140160d) && Intrinsics.d(this.f140161e, bVar.f140161e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f140159c, cb.d(this.f140158b, this.f140157a.hashCode() * 31, 31), 31);
        Integer num = this.f140160d;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f140161e;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InterestTagQueryRequestParams(query=");
        sb3.append(this.f140157a);
        sb3.append(", language=");
        sb3.append(this.f140158b);
        sb3.append(", corpus=");
        sb3.append(this.f140159c);
        sb3.append(", limit=");
        sb3.append(this.f140160d);
        sb3.append(", minLevel=");
        return c.i(sb3, this.f140161e, ")");
    }
}

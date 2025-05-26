package bh1;

import c42.c;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22807b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22808c;

    public b(String articleId) {
        String validDisplayTypes = c0.M(new Integer[]{Integer.valueOf(c.HERO.getValue()), Integer.valueOf(c.THREE_PIN_COLLECTION.getValue())}, ",", null, null, 0, null, null, 62);
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(validDisplayTypes, "validDisplayTypes");
        this.f22806a = articleId;
        this.f22807b = 3;
        this.f22808c = validDisplayTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f22806a, bVar.f22806a) && this.f22807b == bVar.f22807b && Intrinsics.d(this.f22808c, bVar.f22808c);
    }

    public final int hashCode() {
        return this.f22808c.hashCode() + ep.b.b(this.f22807b, this.f22806a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TodayTabArticleRelatedArticlesRequestParams(articleId=");
        sb3.append(this.f22806a);
        sb3.append(", numArticles=");
        sb3.append(this.f22807b);
        sb3.append(", validDisplayTypes=");
        return a.a.p(sb3, this.f22808c, ")");
    }
}

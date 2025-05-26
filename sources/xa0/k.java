package xa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f134408a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134409b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134410c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f134411d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134412e;

    /* renamed from: f, reason: collision with root package name */
    public final String f134413f;

    public k(boolean z13, boolean z14, boolean z15, boolean z16, int i13) {
        z13 = (i13 & 1) != 0 ? false : z13;
        z15 = (i13 & 4) != 0 ? false : z15;
        String fields = n00.b.a(n00.c.COLLAGE_RETRIEVAL_FEED);
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f134408a = z13;
        this.f134409b = z14;
        this.f134410c = z15;
        this.f134411d = z16;
        this.f134412e = 6;
        this.f134413f = fields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f134408a == kVar.f134408a && this.f134409b == kVar.f134409b && this.f134410c == kVar.f134410c && this.f134411d == kVar.f134411d && this.f134412e == kVar.f134412e && Intrinsics.d(this.f134413f, kVar.f134413f);
    }

    public final int hashCode() {
        return this.f134413f.hashCode() + ep.b.b(this.f134412e, ep.b.e(this.f134411d, ep.b.e(this.f134410c, ep.b.e(this.f134409b, Boolean.hashCode(this.f134408a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageFeedRequestArgs(forceAll=");
        sb3.append(this.f134408a);
        sb3.append(", transformToPins=");
        sb3.append(this.f134409b);
        sb3.append(", isDraft=");
        sb3.append(this.f134410c);
        sb3.append(", addCreateNewItem=");
        sb3.append(this.f134411d);
        sb3.append(", pageSize=");
        sb3.append(this.f134412e);
        sb3.append(", fields=");
        return a.a.p(sb3, this.f134413f, ")");
    }
}

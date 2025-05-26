package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f85977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85978b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85979c;

    public g(f category, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f85977a = category;
        this.f85978b = i13;
        this.f85979c = z13;
    }

    public final boolean a() {
        return this.f85979c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f85977a == gVar.f85977a && Intrinsics.d(null, null) && this.f85978b == gVar.f85978b && this.f85979c == gVar.f85979c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85979c) + ep.b.b(this.f85978b, ep.b.b(0, this.f85977a.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectCategoryInfo(category=");
        sb3.append(this.f85977a);
        sb3.append(", riveArtboardName=null, iconResId=0, titleResId=");
        sb3.append(this.f85978b);
        sb3.append(", isSelectable=");
        return a.a.r(sb3, this.f85979c, ")");
    }
}

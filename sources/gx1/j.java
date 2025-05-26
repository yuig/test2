package gx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f66306b;

    /* renamed from: c, reason: collision with root package name */
    public final float f66307c;

    /* renamed from: d, reason: collision with root package name */
    public final float f66308d;

    public j(String title, float f13, float f14) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f66306b = title;
        this.f66307c = f13;
        this.f66308d = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f66306b, jVar.f66306b) && Float.compare(this.f66307c, jVar.f66307c) == 0 && Float.compare(this.f66308d, jVar.f66308d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f66308d) + a.a.a(this.f66307c, this.f66306b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TopCategoryItem(title=");
        sb3.append(this.f66306b);
        sb3.append(", affinity=");
        sb3.append(this.f66307c);
        sb3.append(", audience=");
        return d7.g.i(sb3, this.f66308d, ")");
    }
}

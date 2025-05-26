package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f86005a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86006b;

    public h(g category, boolean z13) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f86005a = category;
        this.f86006b = z13;
    }

    public final g a() {
        return this.f86005a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f86005a, hVar.f86005a) && this.f86006b == hVar.f86006b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86006b) + (this.f86005a.hashCode() * 31);
    }

    public final String toString() {
        return "EffectCategoryModel(category=" + this.f86005a + ", isSelected=" + this.f86006b + ")";
    }
}

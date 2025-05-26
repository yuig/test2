package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f82414a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f82415b;

    public k(String draftId, Integer num) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82414a = draftId;
        this.f82415b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f82414a, kVar.f82414a) && Intrinsics.d(this.f82415b, kVar.f82415b);
    }

    public final int hashCode() {
        int hashCode = this.f82414a.hashCode() * 31;
        Integer num = this.f82415b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "DraftSelected(draftId=" + this.f82414a + ", position=" + this.f82415b + ")";
    }
}

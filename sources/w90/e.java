package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f128530a;

    public e(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f128530a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f128530a, ((e) obj).f128530a);
    }

    public final int hashCode() {
        return this.f128530a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DraftSelected(draftId="), this.f128530a, ")");
    }
}

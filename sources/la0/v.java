package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f82471a;

    public v(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82471a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f82471a, ((v) obj).f82471a);
    }

    public final int hashCode() {
        return this.f82471a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DuplicateTapped(draftId="), this.f82471a, ")");
    }
}

package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f82412a;

    public j(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82412a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f82412a, ((j) obj).f82412a);
    }

    public final int hashCode() {
        return this.f82412a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DraftOverflowMenuSelected(draftId="), this.f82412a, ")");
    }
}

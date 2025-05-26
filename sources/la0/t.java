package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f82466a;

    public t(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82466a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f82466a, ((t) obj).f82466a);
    }

    public final int hashCode() {
        return this.f82466a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DeleteTapped(draftId="), this.f82466a, ")");
    }
}

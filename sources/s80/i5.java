package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i5 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111590a;

    public i5(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f111590a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5) && Intrinsics.d(this.f111590a, ((i5) obj).f111590a);
    }

    public final int hashCode() {
        return this.f111590a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchDraft(draftId="), this.f111590a, ")");
    }
}

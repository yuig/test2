package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f92605a;

    public n(String useCaseId) {
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92605a = useCaseId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f92605a, ((n) obj).f92605a);
    }

    public final int hashCode() {
        return this.f92605a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowMoreButtonClicked(useCaseId="), this.f92605a, ")");
    }
}

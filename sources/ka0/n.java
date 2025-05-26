package ka0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f78915a;

    public n(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f78915a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f78915a, ((n) obj).f78915a);
    }

    public final int hashCode() {
        return this.f78915a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ReturnDraftSelection(draftId="), this.f78915a, ")");
    }
}

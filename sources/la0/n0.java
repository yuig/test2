package la0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f82439a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82440b;

    public n0(String draftId, Set options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82439a = options;
        this.f82440b = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f82439a, n0Var.f82439a) && Intrinsics.d(this.f82440b, n0Var.f82440b);
    }

    public final int hashCode() {
        return this.f82440b.hashCode() + (this.f82439a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowRetrievalOptionsSheet(options=" + this.f82439a + ", draftId=" + this.f82440b + ")";
    }
}

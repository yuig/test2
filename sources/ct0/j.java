package ct0;

import com.pinterest.api.model.zs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final zs f53153a;

    public j(zs interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f53153a = interest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f53153a, ((j) obj).f53153a);
    }

    public final int hashCode() {
        return this.f53153a.hashCode();
    }

    public final String toString() {
        return "NavigateToInterest(interest=" + this.f53153a + ")";
    }
}

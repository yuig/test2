package fa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f61543a;

    public x0(f30 collage) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f61543a = collage;
        Intrinsics.checkNotNullExpressionValue(collage.getId(), "getUid(...)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f61543a, ((x0) obj).f61543a);
    }

    public final int hashCode() {
        return this.f61543a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("CollageVMState(collage="), this.f61543a, ")");
    }
}

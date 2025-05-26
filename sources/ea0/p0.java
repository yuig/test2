package ea0;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f57992a;

    /* renamed from: b, reason: collision with root package name */
    public final List f57993b;

    public p0(f30 collage, List pendingSideEffects) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        Intrinsics.checkNotNullParameter(pendingSideEffects, "pendingSideEffects");
        this.f57992a = collage;
        this.f57993b = pendingSideEffects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f57992a, p0Var.f57992a) && Intrinsics.d(this.f57993b, p0Var.f57993b);
    }

    public final int hashCode() {
        return this.f57993b.hashCode() + (this.f57992a.hashCode() * 31);
    }

    public final String toString() {
        return "SourceCollageLoaded(collage=" + this.f57992a + ", pendingSideEffects=" + this.f57993b + ")";
    }
}

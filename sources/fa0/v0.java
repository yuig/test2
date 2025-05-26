package fa0;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f61539a;

    /* renamed from: b, reason: collision with root package name */
    public final List f61540b;

    public v0(f30 collage, List pendingSideEffects) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        Intrinsics.checkNotNullParameter(pendingSideEffects, "pendingSideEffects");
        this.f61539a = collage;
        this.f61540b = pendingSideEffects;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f61539a, v0Var.f61539a) && Intrinsics.d(this.f61540b, v0Var.f61540b);
    }

    public final int hashCode() {
        return this.f61540b.hashCode() + (this.f61539a.hashCode() * 31);
    }

    public final String toString() {
        return "SourceCollageLoaded(collage=" + this.f61539a + ", pendingSideEffects=" + this.f61540b + ")";
    }
}

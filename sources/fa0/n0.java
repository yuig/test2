package fa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f61516a;

    public n0(f30 collage) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f61516a = collage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f61516a, ((n0) obj).f61516a);
    }

    public final int hashCode() {
        return this.f61516a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("Save(collage="), this.f61516a, ")");
    }
}

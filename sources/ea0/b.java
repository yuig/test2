package ea0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f57947a;

    public b(f30 collage) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f57947a = collage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f57947a, ((b) obj).f57947a);
    }

    public final int hashCode() {
        return this.f57947a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("CollageClicked(collage="), this.f57947a, ")");
    }
}

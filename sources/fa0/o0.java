package fa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f61519a;

    public o0(f30 collage) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f61519a = collage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f61519a, ((o0) obj).f61519a);
    }

    public final int hashCode() {
        return this.f61519a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("SaveClicked(collage="), this.f61519a, ")");
    }
}

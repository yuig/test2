package ea0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f58003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58004b;

    public w(f30 collage) {
        Intrinsics.checkNotNullParameter(collage, "collage");
        this.f58003a = collage;
        String id3 = collage.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f58004b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f58003a, ((w) obj).f58003a);
    }

    @Override // ea0.a0
    public final String getId() {
        return this.f58004b;
    }

    public final int hashCode() {
        return this.f58003a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("CollageVMState(collage="), this.f58003a, ")");
    }
}

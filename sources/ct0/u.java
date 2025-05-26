package ct0;

import com.pinterest.api.model.zs;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final zs f53168a;

    public u(zs model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f53168a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f53168a, ((u) obj).f53168a);
    }

    public final int hashCode() {
        return this.f53168a.hashCode();
    }

    public final String toString() {
        return "SbaHftInterestsTabItem(model=" + this.f53168a + ")";
    }
}

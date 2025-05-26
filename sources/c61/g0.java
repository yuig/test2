package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26560a;

    public g0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26560a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26560a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f26560a, ((g0) obj).f26560a);
    }

    public final int hashCode() {
        return this.f26560a.hashCode();
    }

    public final String toString() {
        return "StructuredFeedHeaderItemVMState(model=" + this.f26560a + ")";
    }
}

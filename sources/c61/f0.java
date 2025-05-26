package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26540a;

    public f0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26540a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26540a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f26540a, ((f0) obj).f26540a);
    }

    public final int hashCode() {
        return this.f26540a.hashCode();
    }

    public final String toString() {
        return "StructuredFeedFreeformItemVMState(model=" + this.f26540a + ")";
    }
}

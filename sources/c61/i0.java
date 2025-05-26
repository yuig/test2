package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26578a;

    public i0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26578a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26578a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f26578a, ((i0) obj).f26578a);
    }

    public final int hashCode() {
        return this.f26578a.hashCode();
    }

    public final String toString() {
        return "UnifiedComponentBundledItemVMState(model=" + this.f26578a + ")";
    }
}

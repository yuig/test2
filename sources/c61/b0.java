package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26521a;

    public b0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26521a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26521a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f26521a, ((b0) obj).f26521a);
    }

    public final int hashCode() {
        return this.f26521a.hashCode();
    }

    public final String toString() {
        return "PinUpsellItemVMState(model=" + this.f26521a + ")";
    }
}

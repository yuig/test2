package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26525a;

    public c0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26525a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f26525a, ((c0) obj).f26525a);
    }

    public final int hashCode() {
        return this.f26525a.hashCode();
    }

    public final String toString() {
        return "ShoppingSpotlightItemVMState(model=" + this.f26525a + ")";
    }
}

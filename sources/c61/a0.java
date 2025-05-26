package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26517a;

    public a0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26517a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26517a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f26517a, ((a0) obj).f26517a);
    }

    public final int hashCode() {
        return this.f26517a.hashCode();
    }

    public final String toString() {
        return "ImmersiveHeaderItemVMState(model=" + this.f26517a + ")";
    }
}

package ns;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final vh f91957a;

    public t(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f91957a = model;
    }

    @Override // ns.v
    public final vh c() {
        return this.f91957a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f91957a, ((t) obj).f91957a);
    }

    public final int hashCode() {
        return this.f91957a.hashCode();
    }

    public final String toString() {
        return "ImmersiveHeaderItemVMState(model=" + this.f91957a + ")";
    }
}

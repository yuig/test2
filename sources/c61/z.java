package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26650a;

    public z(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26650a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f26650a, ((z) obj).f26650a);
    }

    public final int hashCode() {
        return this.f26650a.hashCode();
    }

    public final String toString() {
        return "BubbleItemVMState(model=" + this.f26650a + ")";
    }
}

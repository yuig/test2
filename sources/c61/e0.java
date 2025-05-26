package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26533a;

    public e0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26533a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f26533a, ((e0) obj).f26533a);
    }

    public final int hashCode() {
        return this.f26533a.hashCode();
    }

    public final String toString() {
        return "StructuredFeedFooterItemVMState(model=" + this.f26533a + ")";
    }
}

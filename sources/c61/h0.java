package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26563a;

    public h0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26563a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26563a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f26563a, ((h0) obj).f26563a);
    }

    public final int hashCode() {
        return this.f26563a.hashCode();
    }

    public final String toString() {
        return "StructuredFeedImageUpsellItemVMState(model=" + this.f26563a + ")";
    }
}

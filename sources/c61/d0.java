package c61;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f26529a;

    public d0(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f26529a = model;
    }

    @Override // c61.j0
    public final vh c() {
        return this.f26529a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f26529a, ((d0) obj).f26529a);
    }

    public final int hashCode() {
        return this.f26529a.hashCode();
    }

    public final String toString() {
        return "StructuredFeedCarouselItemVMState(model=" + this.f26529a + ")";
    }
}

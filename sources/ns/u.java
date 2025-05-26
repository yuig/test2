package ns;

import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final vh f91958a;

    public u(vh model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f91958a = model;
    }

    @Override // ns.v
    public final vh c() {
        return this.f91958a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f91958a, ((u) obj).f91958a);
    }

    public final int hashCode() {
        return this.f91958a.hashCode();
    }

    public final String toString() {
        return "PlaceholderGridSectionItemVMState(model=" + this.f91958a + ")";
    }

    public /* synthetic */ u() {
        this(new vh());
    }
}

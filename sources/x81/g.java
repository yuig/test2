package x81;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final h f134229h;

    public g(h productViewModel) {
        Intrinsics.checkNotNullParameter(productViewModel, "productViewModel");
        this.f134229h = productViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f134229h, ((g) obj).f134229h);
    }

    public final int hashCode() {
        return this.f134229h.hashCode();
    }

    public final String toString() {
        return "MakeupLookViewModel(productViewModel=" + this.f134229h + ")";
    }
}

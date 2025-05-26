package ac2;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 implements y0 {

    /* renamed from: a */
    public final WeakReference f2060a;

    /* renamed from: b */
    public final w0 f2061b;

    public u0(WeakReference boundView, w0 previousUsedState) {
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        Intrinsics.checkNotNullParameter(previousUsedState, "previousUsedState");
        this.f2060a = boundView;
        this.f2061b = previousUsedState;
    }

    public final WeakReference d() {
        return this.f2060a;
    }

    public final w0 e() {
        return this.f2061b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f2060a, u0Var.f2060a) && Intrinsics.d(this.f2061b, u0Var.f2061b);
    }

    public final int hashCode() {
        return this.f2061b.hashCode() + (this.f2060a.hashCode() * 31);
    }

    public final String toString() {
        return "Reused(" + this.f2060a.get() + ", previousState: " + this.f2061b + ")";
    }
}

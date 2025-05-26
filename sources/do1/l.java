package do1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.g f55683a;

    public l(rm1.g iconAndSize) {
        Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
        this.f55683a = iconAndSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f55683a, ((l) obj).f55683a);
    }

    public final int hashCode() {
        return this.f55683a.hashCode();
    }

    public final String toString() {
        return "ToastIcon(iconAndSize=" + this.f55683a + ")";
    }
}

package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    public final n f91412a;

    /* renamed from: b, reason: collision with root package name */
    public final n f91413b;

    public e(n startIcon, n endIcon) {
        Intrinsics.checkNotNullParameter(startIcon, "startIcon");
        Intrinsics.checkNotNullParameter(endIcon, "endIcon");
        this.f91412a = startIcon;
        this.f91413b = endIcon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f91412a, eVar.f91412a) && Intrinsics.d(this.f91413b, eVar.f91413b);
    }

    public final int hashCode() {
        return this.f91413b.hashCode() + (this.f91412a.hashCode() * 31);
    }

    public final String toString() {
        return "DoubleIconButton(startIcon=" + this.f91412a + ", endIcon=" + this.f91413b + ")";
    }
}

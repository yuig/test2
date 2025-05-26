package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final n f91428a;

    public g(n icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f91428a = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f91428a, ((g) obj).f91428a);
    }

    public final int hashCode() {
        return this.f91428a.hashCode();
    }

    public final String toString() {
        return "SingleIconButton(icon=" + this.f91428a + ")";
    }
}

package zj1;

import kotlin.jvm.internal.Intrinsics;
import ni1.f0;
import rm1.c;

/* loaded from: classes2.dex */
public final class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f142060a;

    public b(c defaultIconColor) {
        Intrinsics.checkNotNullParameter(defaultIconColor, "defaultIconColor");
        this.f142060a = defaultIconColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f142060a == ((b) obj).f142060a;
    }

    public final int hashCode() {
        return this.f142060a.hashCode();
    }

    public final String toString() {
        return "OverflowDisplayState(defaultIconColor=" + this.f142060a + ")";
    }
}

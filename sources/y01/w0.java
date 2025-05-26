package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ls1.k f136500a;

    public w0(ls1.k mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f136500a = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && this.f136500a == ((w0) obj).f136500a;
    }

    public final int hashCode() {
        return this.f136500a.hashCode();
    }

    public final String toString() {
        return "OnSwipeEvent(mode=" + this.f136500a + ")";
    }
}

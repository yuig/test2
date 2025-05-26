package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f86007a;

    public h0(a colorItem) {
        Intrinsics.checkNotNullParameter(colorItem, "colorItem");
        this.f86007a = colorItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f86007a, ((h0) obj).f86007a);
    }

    public final int hashCode() {
        return this.f86007a.hashCode();
    }

    public final String toString() {
        return "ColorClicked(colorItem=" + this.f86007a + ")";
    }
}

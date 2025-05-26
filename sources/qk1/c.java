package qk1;

import kotlin.jvm.internal.Intrinsics;
import yl1.g;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f104059a;

    /* renamed from: b, reason: collision with root package name */
    public final g f104060b;

    public c(int i13, g colorPalette) {
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        this.f104059a = i13;
        this.f104060b = colorPalette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f104059a == cVar.f104059a && Intrinsics.d(this.f104060b, cVar.f104060b);
    }

    public final int hashCode() {
        return this.f104060b.hashCode() + (Integer.hashCode(this.f104059a) * 31);
    }

    public final String toString() {
        return "GestaltFollowButtonState(textResId=" + this.f104059a + ", colorPalette=" + this.f104060b + ")";
    }
}

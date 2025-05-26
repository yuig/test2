package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 extends kg.p {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i f59651a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i f59652b;

    public c0(u50.i backgroundColor, u50.i textColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f59651a = backgroundColor;
        this.f59652b = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f59651a, c0Var.f59651a) && Intrinsics.d(this.f59652b, c0Var.f59652b);
    }

    public final int hashCode() {
        return this.f59652b.hashCode() + (this.f59651a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(backgroundColor=" + this.f59651a + ", textColor=" + this.f59652b + ")";
    }
}

package jb2;

import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final u50.i f75365b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i f75366c;

    public d(u50.i backgroundColor, u50.i textColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f75365b = backgroundColor;
        this.f75366c = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f75365b, dVar.f75365b) && Intrinsics.d(this.f75366c, dVar.f75366c);
    }

    public final int hashCode() {
        return this.f75366c.hashCode() + (this.f75365b.hashCode() * 31);
    }

    public final String toString() {
        return "Default(backgroundColor=" + this.f75365b + ", textColor=" + this.f75366c + ")";
    }
}

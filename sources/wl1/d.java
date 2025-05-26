package wl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f130186a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.c f130187b;

    public d(rm1.q iconStandard, rm1.c iconColor) {
        Intrinsics.checkNotNullParameter(iconStandard, "iconStandard");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        this.f130186a = iconStandard;
        this.f130187b = iconColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f130186a == dVar.f130186a && this.f130187b == dVar.f130187b;
    }

    public final int hashCode() {
        return this.f130187b.hashCode() + (this.f130186a.hashCode() * 31);
    }

    public final String toString() {
        return "Icon(iconStandard=" + this.f130186a + ", iconColor=" + this.f130187b + ")";
    }
}

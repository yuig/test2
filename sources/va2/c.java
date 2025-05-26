package va2;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final q f125324a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.c f125325b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f125326c;

    public c(rm1.c iconColor, q icon, vn1.c textColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.f125324a = icon;
        this.f125325b = iconColor;
        this.f125326c = textColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f125324a == cVar.f125324a && this.f125325b == cVar.f125325b && this.f125326c == cVar.f125326c;
    }

    public final int hashCode() {
        return this.f125326c.hashCode() + ((this.f125325b.hashCode() + (this.f125324a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CreatorStatsItemStyle(icon=" + this.f125324a + ", iconColor=" + this.f125325b + ", textColor=" + this.f125326c + ")";
    }
}

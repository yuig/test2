package re1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final vn1.c f107681a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.b f107682b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.e f107683c;

    public v(vn1.c color, vn1.b alignment, vn1.e style) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f107681a = color;
        this.f107682b = alignment;
        this.f107683c = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f107681a == vVar.f107681a && this.f107682b == vVar.f107682b && this.f107683c == vVar.f107683c;
    }

    public final int hashCode() {
        return this.f107683c.hashCode() + ((this.f107682b.hashCode() + (this.f107681a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextStyleSpec(color=" + this.f107681a + ", alignment=" + this.f107682b + ", style=" + this.f107683c + ")";
    }

    public /* synthetic */ v(vn1.b bVar, vn1.e eVar, int i13) {
        this(vn1.c.DEFAULT, (i13 & 2) != 0 ? vn1.b.START : bVar, (i13 & 4) != 0 ? vn1.e.REGULAR : eVar);
    }
}

package cn1;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f28191a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28192b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f28193c;

    /* renamed from: d, reason: collision with root package name */
    public final yl1.g f28194d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28195e;

    public g(u50.i0 text, boolean z13, u50.i0 contentDescription, yl1.g colorPalette, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        this.f28191a = text;
        this.f28192b = z13;
        this.f28193c = contentDescription;
        this.f28194d = colorPalette;
        this.f28195e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f28191a, gVar.f28191a) && this.f28192b == gVar.f28192b && Intrinsics.d(this.f28193c, gVar.f28193c) && Intrinsics.d(this.f28194d, gVar.f28194d) && this.f28195e == gVar.f28195e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28195e) + ((this.f28194d.hashCode() + ep.b.d(this.f28193c, ep.b.e(this.f28192b, this.f28191a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrailingActionDisplayState(text=");
        sb3.append(this.f28191a);
        sb3.append(", enabled=");
        sb3.append(this.f28192b);
        sb3.append(", contentDescription=");
        sb3.append(this.f28193c);
        sb3.append(", colorPalette=");
        sb3.append(this.f28194d);
        sb3.append(", id=");
        return a.a.n(sb3, this.f28195e, ")");
    }

    public g(u50.i0 i0Var) {
        this(i0Var, true, i0Var, GestaltSearchField.A.getColorPalette(), f0.gestalt_trailing_button);
    }
}

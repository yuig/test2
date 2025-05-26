package rm1;

import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.k0;

/* loaded from: classes2.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final g f108695a;

    /* renamed from: b, reason: collision with root package name */
    public final c f108696b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f108697c;

    /* renamed from: d, reason: collision with root package name */
    public final int f108698d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f108699e;

    public d(g iconAndSize, c color, fm1.c visibility, int i13, i0 i0Var) {
        Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f108695a = iconAndSize;
        this.f108696b = color;
        this.f108697c = visibility;
        this.f108698d = i13;
        this.f108699e = i0Var;
    }

    public static d e(d dVar, g gVar, c cVar, fm1.c cVar2, int i13, i0 i0Var, int i14) {
        if ((i14 & 1) != 0) {
            gVar = dVar.f108695a;
        }
        g iconAndSize = gVar;
        if ((i14 & 2) != 0) {
            cVar = dVar.f108696b;
        }
        c color = cVar;
        if ((i14 & 4) != 0) {
            cVar2 = dVar.f108697c;
        }
        fm1.c visibility = cVar2;
        if ((i14 & 8) != 0) {
            i13 = dVar.f108698d;
        }
        int i15 = i13;
        if ((i14 & 16) != 0) {
            i0Var = dVar.f108699e;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(iconAndSize, "iconAndSize");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new d(iconAndSize, color, visibility, i15, i0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f108695a, dVar.f108695a) && this.f108696b == dVar.f108696b && this.f108697c == dVar.f108697c && this.f108698d == dVar.f108698d && Intrinsics.d(this.f108699e, dVar.f108699e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f108698d, d7.g.a(this.f108697c, (this.f108696b.hashCode() + (this.f108695a.hashCode() * 31)) * 31, 31), 31);
        i0 i0Var = this.f108699e;
        return b13 + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(iconAndSize=");
        sb3.append(this.f108695a);
        sb3.append(", color=");
        sb3.append(this.f108696b);
        sb3.append(", visibility=");
        sb3.append(this.f108697c);
        sb3.append(", id=");
        sb3.append(this.f108698d);
        sb3.append(", contentDescription=");
        return jq.b.k(sb3, this.f108699e, ")");
    }

    public d(g gVar, c cVar, fm1.c cVar2, int i13, k0 k0Var, int i14) {
        this(gVar, (i14 & 2) != 0 ? GestaltIcon.f49405g : cVar, (i14 & 4) != 0 ? GestaltIcon.f49400b.c() : cVar2, (i14 & 8) != 0 ? Integer.MIN_VALUE : i13, (i14 & 16) != 0 ? null : k0Var);
    }
}

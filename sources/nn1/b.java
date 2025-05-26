package nn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.f0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f91535a;

    /* renamed from: b, reason: collision with root package name */
    public final f f91536b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f91537c;

    /* renamed from: d, reason: collision with root package name */
    public final rn1.b f91538d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f91539e;

    /* renamed from: f, reason: collision with root package name */
    public final q f91540f;

    /* renamed from: g, reason: collision with root package name */
    public final yl1.c f91541g;

    /* renamed from: h, reason: collision with root package name */
    public final fm1.c f91542h;

    /* renamed from: i, reason: collision with root package name */
    public final int f91543i;

    public b(i0 text, f colorPalette, i0 contentDescription, rn1.b ellipsize, boolean z13, q icon, yl1.c size, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f91535a = text;
        this.f91536b = colorPalette;
        this.f91537c = contentDescription;
        this.f91538d = ellipsize;
        this.f91539e = z13;
        this.f91540f = icon;
        this.f91541g = size;
        this.f91542h = visibility;
        this.f91543i = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [u50.i0] */
    public static b e(b bVar, f0 f0Var, yl1.c cVar, fm1.c cVar2, int i13) {
        f0 f0Var2 = f0Var;
        if ((i13 & 1) != 0) {
            f0Var2 = bVar.f91535a;
        }
        f0 text = f0Var2;
        f colorPalette = bVar.f91536b;
        i0 contentDescription = bVar.f91537c;
        rn1.b ellipsize = bVar.f91538d;
        boolean z13 = bVar.f91539e;
        q icon = bVar.f91540f;
        if ((i13 & 64) != 0) {
            cVar = bVar.f91541g;
        }
        yl1.c size = cVar;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            cVar2 = bVar.f91542h;
        }
        fm1.c visibility = cVar2;
        int i14 = bVar.f91543i;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new b(text, colorPalette, contentDescription, ellipsize, z13, icon, size, visibility, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f91535a, bVar.f91535a) && Intrinsics.d(this.f91536b, bVar.f91536b) && Intrinsics.d(this.f91537c, bVar.f91537c) && this.f91538d == bVar.f91538d && this.f91539e == bVar.f91539e && this.f91540f == bVar.f91540f && this.f91541g == bVar.f91541g && this.f91542h == bVar.f91542h && this.f91543i == bVar.f91543i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91543i) + d7.g.a(this.f91542h, (this.f91541g.hashCode() + ((this.f91540f.hashCode() + ep.b.e(this.f91539e, (this.f91538d.hashCode() + ep.b.d(this.f91537c, (this.f91536b.hashCode() + (this.f91535a.hashCode() * 31)) * 31, 31)) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f91535a);
        sb3.append(", colorPalette=");
        sb3.append(this.f91536b);
        sb3.append(", contentDescription=");
        sb3.append(this.f91537c);
        sb3.append(", ellipsize=");
        sb3.append(this.f91538d);
        sb3.append(", enabled=");
        sb3.append(this.f91539e);
        sb3.append(", icon=");
        sb3.append(this.f91540f);
        sb3.append(", size=");
        sb3.append(this.f91541g);
        sb3.append(", visibility=");
        sb3.append(this.f91542h);
        sb3.append(", id=");
        return a.a.n(sb3, this.f91543i, ")");
    }
}

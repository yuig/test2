package en1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f59653a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f59654b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f59655c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f59656d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f59657e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f59658f;

    /* renamed from: g, reason: collision with root package name */
    public final kg.p f59659g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f59660h;

    /* renamed from: i, reason: collision with root package name */
    public final int f59661i;

    public d(u50.i0 text, u50.i0 contentDescription, fm1.c visibility, u50.i0 tag, boolean z13, b0 startItem, kg.p style, boolean z14, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(startItem, "startItem");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59653a = text;
        this.f59654b = contentDescription;
        this.f59655c = visibility;
        this.f59656d = tag;
        this.f59657e = z13;
        this.f59658f = startItem;
        this.f59659g = style;
        this.f59660h = z14;
        this.f59661i = i13;
    }

    public static d e(d dVar, u50.f0 f0Var, u50.f0 f0Var2, u50.f0 f0Var3, boolean z13, b0 b0Var, kg.p pVar, boolean z14, int i13, int i14) {
        u50.i0 text = (i14 & 1) != 0 ? dVar.f59653a : f0Var;
        u50.i0 contentDescription = (i14 & 2) != 0 ? dVar.f59654b : f0Var2;
        fm1.c visibility = dVar.f59655c;
        u50.i0 tag = (i14 & 8) != 0 ? dVar.f59656d : f0Var3;
        boolean z15 = (i14 & 16) != 0 ? dVar.f59657e : z13;
        b0 startItem = (i14 & 32) != 0 ? dVar.f59658f : b0Var;
        kg.p style = (i14 & 64) != 0 ? dVar.f59659g : pVar;
        boolean z16 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? dVar.f59660h : z14;
        int i15 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? dVar.f59661i : i13;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(startItem, "startItem");
        Intrinsics.checkNotNullParameter(style, "style");
        return new d(text, contentDescription, visibility, tag, z15, startItem, style, z16, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f59653a, dVar.f59653a) && Intrinsics.d(this.f59654b, dVar.f59654b) && this.f59655c == dVar.f59655c && Intrinsics.d(this.f59656d, dVar.f59656d) && this.f59657e == dVar.f59657e && Intrinsics.d(this.f59658f, dVar.f59658f) && Intrinsics.d(this.f59659g, dVar.f59659g) && this.f59660h == dVar.f59660h && this.f59661i == dVar.f59661i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59661i) + ep.b.e(this.f59660h, (this.f59659g.hashCode() + ((this.f59658f.hashCode() + ep.b.e(this.f59657e, ep.b.d(this.f59656d, d7.g.a(this.f59655c, ep.b.d(this.f59654b, this.f59653a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f59653a);
        sb3.append(", contentDescription=");
        sb3.append(this.f59654b);
        sb3.append(", visibility=");
        sb3.append(this.f59655c);
        sb3.append(", tag=");
        sb3.append(this.f59656d);
        sb3.append(", selected=");
        sb3.append(this.f59657e);
        sb3.append(", startItem=");
        sb3.append(this.f59658f);
        sb3.append(", style=");
        sb3.append(this.f59659g);
        sb3.append(", isExpandable=");
        sb3.append(this.f59660h);
        sb3.append(", id=");
        return a.a.n(sb3, this.f59661i, ")");
    }
}

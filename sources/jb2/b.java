package jb2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.o;

/* loaded from: classes4.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f75354a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f75355b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f75356c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75357d;

    /* renamed from: e, reason: collision with root package name */
    public final float f75358e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f75359f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f75360g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f75361h;

    /* renamed from: i, reason: collision with root package name */
    public final int f75362i;

    public b(i0 text, i0 contentDescription, fm1.c visibility, boolean z13, float f13, i0 tag, boolean z14, s0 style, int i13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f75354a = text;
        this.f75355b = contentDescription;
        this.f75356c = visibility;
        this.f75357d = z13;
        this.f75358e = f13;
        this.f75359f = tag;
        this.f75360g = z14;
        this.f75361h = style;
        this.f75362i = i13;
    }

    public static b e(b bVar, f0 f0Var, f0 f0Var2, boolean z13, float f13, f0 f0Var3, boolean z14, s0 s0Var, int i13, int i14) {
        i0 text = (i14 & 1) != 0 ? bVar.f75354a : f0Var;
        i0 contentDescription = (i14 & 2) != 0 ? bVar.f75355b : f0Var2;
        fm1.c visibility = bVar.f75356c;
        boolean z15 = (i14 & 8) != 0 ? bVar.f75357d : z13;
        float f14 = (i14 & 16) != 0 ? bVar.f75358e : f13;
        i0 tag = (i14 & 32) != 0 ? bVar.f75359f : f0Var3;
        boolean z16 = (i14 & 64) != 0 ? bVar.f75360g : z14;
        s0 style = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bVar.f75361h : s0Var;
        int i15 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? bVar.f75362i : i13;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(style, "style");
        return new b(text, contentDescription, visibility, z15, f14, tag, z16, style, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f75354a, bVar.f75354a) && Intrinsics.d(this.f75355b, bVar.f75355b) && this.f75356c == bVar.f75356c && this.f75357d == bVar.f75357d && Float.compare(this.f75358e, bVar.f75358e) == 0 && Intrinsics.d(this.f75359f, bVar.f75359f) && this.f75360g == bVar.f75360g && Intrinsics.d(this.f75361h, bVar.f75361h) && this.f75362i == bVar.f75362i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75362i) + ((this.f75361h.hashCode() + ep.b.e(this.f75360g, ep.b.d(this.f75359f, a.a.a(this.f75358e, ep.b.e(this.f75357d, d7.g.a(this.f75356c, ep.b.d(this.f75355b, this.f75354a.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f75354a);
        sb3.append(", contentDescription=");
        sb3.append(this.f75355b);
        sb3.append(", visibility=");
        sb3.append(this.f75356c);
        sb3.append(", enabled=");
        sb3.append(this.f75357d);
        sb3.append(", alpha=");
        sb3.append(this.f75358e);
        sb3.append(", tag=");
        sb3.append(this.f75359f);
        sb3.append(", selected=");
        sb3.append(this.f75360g);
        sb3.append(", style=");
        sb3.append(this.f75361h);
        sb3.append(", id=");
        return a.a.n(sb3, this.f75362i, ")");
    }
}

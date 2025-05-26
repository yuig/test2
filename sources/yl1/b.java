package yl1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import rm1.q;
import u50.i0;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f139300a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139301b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f139302c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f139303d;

    /* renamed from: e, reason: collision with root package name */
    public final g f139304e;

    /* renamed from: f, reason: collision with root package name */
    public final c f139305f;

    /* renamed from: g, reason: collision with root package name */
    public final q f139306g;

    /* renamed from: h, reason: collision with root package name */
    public final q f139307h;

    /* renamed from: i, reason: collision with root package name */
    public final int f139308i;

    /* renamed from: j, reason: collision with root package name */
    public final e f139309j;

    public b(i0 text, boolean z13, fm1.c visibility, i0 contentDescription, g colorPalette, c size, q qVar, q qVar2, int i13, e width) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f139300a = text;
        this.f139301b = z13;
        this.f139302c = visibility;
        this.f139303d = contentDescription;
        this.f139304e = colorPalette;
        this.f139305f = size;
        this.f139306g = qVar;
        this.f139307h = qVar2;
        this.f139308i = i13;
        this.f139309j = width;
    }

    public static b e(i0 text, boolean z13, fm1.c visibility, i0 contentDescription, g colorPalette, c size, q qVar, q qVar2, int i13, e width) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(colorPalette, "colorPalette");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(width, "width");
        return new b(text, z13, visibility, contentDescription, colorPalette, size, qVar, qVar2, i13, width);
    }

    public static /* synthetic */ b f(b bVar, i0 i0Var, boolean z13, fm1.c cVar, i0 i0Var2, g gVar, c cVar2, q qVar, q qVar2, int i13, e eVar, int i14) {
        i0 i0Var3 = (i14 & 1) != 0 ? bVar.f139300a : i0Var;
        boolean z14 = (i14 & 2) != 0 ? bVar.f139301b : z13;
        fm1.c cVar3 = (i14 & 4) != 0 ? bVar.f139302c : cVar;
        i0 i0Var4 = (i14 & 8) != 0 ? bVar.f139303d : i0Var2;
        g gVar2 = (i14 & 16) != 0 ? bVar.f139304e : gVar;
        c cVar4 = (i14 & 32) != 0 ? bVar.f139305f : cVar2;
        q qVar3 = (i14 & 64) != 0 ? bVar.f139306g : qVar;
        q qVar4 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bVar.f139307h : qVar2;
        int i15 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? bVar.f139308i : i13;
        e eVar2 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? bVar.f139309j : eVar;
        bVar.getClass();
        return e(i0Var3, z14, cVar3, i0Var4, gVar2, cVar4, qVar3, qVar4, i15, eVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f139300a, bVar.f139300a) && this.f139301b == bVar.f139301b && this.f139302c == bVar.f139302c && Intrinsics.d(this.f139303d, bVar.f139303d) && Intrinsics.d(this.f139304e, bVar.f139304e) && this.f139305f == bVar.f139305f && this.f139306g == bVar.f139306g && this.f139307h == bVar.f139307h && this.f139308i == bVar.f139308i && this.f139309j == bVar.f139309j;
    }

    public final int hashCode() {
        int hashCode = (this.f139305f.hashCode() + ((this.f139304e.hashCode() + ep.b.d(this.f139303d, d7.g.a(this.f139302c, ep.b.e(this.f139301b, this.f139300a.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        q qVar = this.f139306g;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        q qVar2 = this.f139307h;
        return this.f139309j.hashCode() + ep.b.b(this.f139308i, (hashCode2 + (qVar2 != null ? qVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(text=" + this.f139300a + ", enabled=" + this.f139301b + ", visibility=" + this.f139302c + ", contentDescription=" + this.f139303d + ", colorPalette=" + this.f139304e + ", size=" + this.f139305f + ", startIcon=" + this.f139306g + ", endIcon=" + this.f139307h + ", id=" + this.f139308i + ", width=" + this.f139309j + ")";
    }

    public /* synthetic */ b(i0 i0Var, boolean z13, fm1.c cVar, i0 i0Var2, g gVar, c cVar2, q qVar, q qVar2, int i13, e eVar, int i14) {
        this(i0Var, (i14 & 2) != 0 ? true : z13, (i14 & 4) != 0 ? GestaltButton.f49319h.c() : cVar, (i14 & 8) != 0 ? i0Var : i0Var2, (i14 & 16) != 0 ? d.PRIMARY.getColorPalette() : gVar, (i14 & 32) != 0 ? c.LARGE : cVar2, (i14 & 64) != 0 ? null : qVar, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : qVar2, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? Integer.MIN_VALUE : i13, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? GestaltButton.f49323l : eVar);
    }
}

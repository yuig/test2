package rn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.b0;
import u50.i0;

/* loaded from: classes2.dex */
public final class a extends e {
    public final fm1.b A;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f108849g;

    /* renamed from: h, reason: collision with root package name */
    public final vn1.c f108850h;

    /* renamed from: i, reason: collision with root package name */
    public final List f108851i;

    /* renamed from: j, reason: collision with root package name */
    public final List f108852j;

    /* renamed from: k, reason: collision with root package name */
    public final vn1.g f108853k;

    /* renamed from: l, reason: collision with root package name */
    public final int f108854l;

    /* renamed from: m, reason: collision with root package name */
    public final fm1.c f108855m;

    /* renamed from: n, reason: collision with root package name */
    public final b f108856n;

    /* renamed from: o, reason: collision with root package name */
    public final rm1.d f108857o;

    /* renamed from: p, reason: collision with root package name */
    public final rm1.d f108858p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f108859q;

    /* renamed from: r, reason: collision with root package name */
    public final int f108860r;

    /* renamed from: s, reason: collision with root package name */
    public final i0 f108861s;

    /* renamed from: t, reason: collision with root package name */
    public final vn1.g f108862t;

    /* renamed from: u, reason: collision with root package name */
    public final vn1.g f108863u;

    /* renamed from: v, reason: collision with root package name */
    public final u50.n f108864v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f108865w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f108866x;

    /* renamed from: y, reason: collision with root package name */
    public final vn1.d f108867y;

    /* renamed from: z, reason: collision with root package name */
    public final fm1.a f108868z;

    public a(i0 text, vn1.c color, List alignment, List style, vn1.g variant, int i13, fm1.c visibility, b ellipsize, rm1.d dVar, rm1.d dVar2, boolean z13, int i14, i0 i0Var, vn1.g gVar, vn1.g gVar2, u50.n nVar, Integer num, boolean z14, vn1.d hyphenationFrequency, fm1.a importantForAccessibility, fm1.b textDirection) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        Intrinsics.checkNotNullParameter(hyphenationFrequency, "hyphenationFrequency");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        Intrinsics.checkNotNullParameter(textDirection, "textDirection");
        this.f108849g = text;
        this.f108850h = color;
        this.f108851i = alignment;
        this.f108852j = style;
        this.f108853k = variant;
        this.f108854l = i13;
        this.f108855m = visibility;
        this.f108856n = ellipsize;
        this.f108857o = dVar;
        this.f108858p = dVar2;
        this.f108859q = z13;
        this.f108860r = i14;
        this.f108861s = i0Var;
        this.f108862t = gVar;
        this.f108863u = gVar2;
        this.f108864v = nVar;
        this.f108865w = num;
        this.f108866x = z14;
        this.f108867y = hyphenationFrequency;
        this.f108868z = importantForAccessibility;
        this.A = textDirection;
    }

    public static a y(a aVar, i0 i0Var, vn1.c cVar, List list, List list2, vn1.g gVar, int i13, fm1.c cVar2, b bVar, rm1.d dVar, rm1.d dVar2, boolean z13, int i14, i0 i0Var2, vn1.g gVar2, vn1.g gVar3, b0 b0Var, Integer num, boolean z14, fm1.a aVar2, fm1.b bVar2, int i15) {
        i0 text = (i15 & 1) != 0 ? aVar.f108849g : i0Var;
        vn1.c color = (i15 & 2) != 0 ? aVar.f108850h : cVar;
        List alignment = (i15 & 4) != 0 ? aVar.f108851i : list;
        List style = (i15 & 8) != 0 ? aVar.f108852j : list2;
        vn1.g variant = (i15 & 16) != 0 ? aVar.f108853k : gVar;
        int i16 = (i15 & 32) != 0 ? aVar.f108854l : i13;
        fm1.c visibility = (i15 & 64) != 0 ? aVar.f108855m : cVar2;
        b ellipsize = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? aVar.f108856n : bVar;
        rm1.d dVar3 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? aVar.f108857o : dVar;
        rm1.d dVar4 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? aVar.f108858p : dVar2;
        boolean z15 = (i15 & 1024) != 0 ? aVar.f108859q : z13;
        int i17 = (i15 & 2048) != 0 ? aVar.f108860r : i14;
        i0 i0Var3 = (i15 & 4096) != 0 ? aVar.f108861s : i0Var2;
        vn1.g gVar4 = (i15 & 8192) != 0 ? aVar.f108862t : gVar2;
        vn1.g gVar5 = (i15 & 16384) != 0 ? aVar.f108863u : gVar3;
        u50.n nVar = (i15 & 32768) != 0 ? aVar.f108864v : b0Var;
        Integer num2 = (i15 & 65536) != 0 ? aVar.f108865w : num;
        if ((i15 & 131072) != 0) {
            z14 = aVar.f108866x;
        }
        vn1.d hyphenationFrequency = aVar.f108867y;
        i0 i0Var4 = i0Var3;
        fm1.a importantForAccessibility = (i15 & 524288) != 0 ? aVar.f108868z : aVar2;
        fm1.b textDirection = (i15 & 1048576) != 0 ? aVar.A : bVar2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        Intrinsics.checkNotNullParameter(hyphenationFrequency, "hyphenationFrequency");
        Intrinsics.checkNotNullParameter(importantForAccessibility, "importantForAccessibility");
        Intrinsics.checkNotNullParameter(textDirection, "textDirection");
        return new a(text, color, alignment, style, variant, i16, visibility, ellipsize, dVar3, dVar4, z15, i17, i0Var4, gVar4, gVar5, nVar, num2, z14, hyphenationFrequency, importantForAccessibility, textDirection);
    }

    @Override // rn1.e
    public final List e() {
        return this.f108851i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f108849g, aVar.f108849g) && this.f108850h == aVar.f108850h && Intrinsics.d(this.f108851i, aVar.f108851i) && Intrinsics.d(this.f108852j, aVar.f108852j) && this.f108853k == aVar.f108853k && this.f108854l == aVar.f108854l && this.f108855m == aVar.f108855m && this.f108856n == aVar.f108856n && Intrinsics.d(this.f108857o, aVar.f108857o) && Intrinsics.d(this.f108858p, aVar.f108858p) && this.f108859q == aVar.f108859q && this.f108860r == aVar.f108860r && Intrinsics.d(this.f108861s, aVar.f108861s) && this.f108862t == aVar.f108862t && this.f108863u == aVar.f108863u && Intrinsics.d(this.f108864v, aVar.f108864v) && Intrinsics.d(this.f108865w, aVar.f108865w) && this.f108866x == aVar.f108866x && this.f108867y == aVar.f108867y && this.f108868z == aVar.f108868z && this.A == aVar.A;
    }

    @Override // rn1.e
    public final vn1.g f() {
        return this.f108863u;
    }

    @Override // rn1.e
    public final vn1.g g() {
        return this.f108862t;
    }

    @Override // rn1.e
    public final int getId() {
        return this.f108860r;
    }

    @Override // rn1.e
    public final vn1.c h() {
        return this.f108850h;
    }

    public final int hashCode() {
        int hashCode = (this.f108856n.hashCode() + d7.g.a(this.f108855m, ep.b.b(this.f108854l, (this.f108853k.hashCode() + ep.b.c(this.f108852j, ep.b.c(this.f108851i, (this.f108850h.hashCode() + (this.f108849g.hashCode() * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31;
        rm1.d dVar = this.f108857o;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        rm1.d dVar2 = this.f108858p;
        int b13 = ep.b.b(this.f108860r, ep.b.e(this.f108859q, (hashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31), 31);
        i0 i0Var = this.f108861s;
        int hashCode3 = (b13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        vn1.g gVar = this.f108862t;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        vn1.g gVar2 = this.f108863u;
        int hashCode5 = (hashCode4 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        u50.n nVar = this.f108864v;
        int hashCode6 = (hashCode5 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Integer num = this.f108865w;
        return this.A.hashCode() + ((this.f108868z.hashCode() + ((this.f108867y.hashCode() + ep.b.e(this.f108866x, (hashCode6 + (num != null ? num.hashCode() : 0)) * 31, 31)) * 31)) * 31);
    }

    @Override // rn1.e
    public final i0 i() {
        return this.f108861s;
    }

    @Override // rn1.e
    public final b j() {
        return this.f108856n;
    }

    @Override // rn1.e
    public final rm1.d k() {
        return this.f108857o;
    }

    @Override // rn1.e
    public final vn1.d l() {
        return this.f108867y;
    }

    @Override // rn1.e
    public final u50.n m() {
        return this.f108864v;
    }

    @Override // rn1.e
    public final fm1.a n() {
        return this.f108868z;
    }

    @Override // rn1.e
    public final Integer o() {
        return this.f108865w;
    }

    @Override // rn1.e
    public final int p() {
        return this.f108854l;
    }

    @Override // rn1.e
    public final rm1.d q() {
        return this.f108858p;
    }

    @Override // rn1.e
    public final List r() {
        return this.f108852j;
    }

    @Override // rn1.e
    public final boolean s() {
        return this.f108859q;
    }

    @Override // rn1.e
    public final i0 t() {
        return this.f108849g;
    }

    public final String toString() {
        return "DisplayState(text=" + this.f108849g + ", color=" + this.f108850h + ", alignment=" + this.f108851i + ", style=" + this.f108852j + ", variant=" + this.f108853k + ", maxLines=" + this.f108854l + ", visibility=" + this.f108855m + ", ellipsize=" + this.f108856n + ", endIcon=" + this.f108857o + ", startIcon=" + this.f108858p + ", supportLinks=" + this.f108859q + ", id=" + this.f108860r + ", contentDescription=" + this.f108861s + ", autoSizeMinVariant=" + this.f108862t + ", autoSizeMaxVariant=" + this.f108863u + ", iconPadding=" + this.f108864v + ", labelFor=" + this.f108865w + ", isAccessibilityHeading=" + this.f108866x + ", hyphenationFrequency=" + this.f108867y + ", importantForAccessibility=" + this.f108868z + ", textDirection=" + this.A + ")";
    }

    @Override // rn1.e
    public final fm1.b u() {
        return this.A;
    }

    @Override // rn1.e
    public final vn1.g v() {
        return this.f108853k;
    }

    @Override // rn1.e
    public final fm1.c w() {
        return this.f108855m;
    }

    @Override // rn1.e
    public final boolean x() {
        return this.f108866x;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(u50.i0 r25, vn1.c r26, java.util.List r27, java.util.List r28, vn1.g r29, int r30, fm1.c r31, rn1.b r32, rm1.d r33, rm1.d r34, boolean r35, int r36, u50.i0 r37, vn1.g r38, vn1.g r39, boolean r40, vn1.d r41, fm1.a r42, int r43) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rn1.a.<init>(u50.i0, vn1.c, java.util.List, java.util.List, vn1.g, int, fm1.c, rn1.b, rm1.d, rm1.d, boolean, int, u50.i0, vn1.g, vn1.g, boolean, vn1.d, fm1.a, int):void");
    }
}

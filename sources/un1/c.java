package un1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.b0;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class c extends rn1.e {

    /* renamed from: g, reason: collision with root package name */
    public final i0 f122863g;

    /* renamed from: h, reason: collision with root package name */
    public final vn1.c f122864h;

    /* renamed from: i, reason: collision with root package name */
    public final List f122865i;

    /* renamed from: j, reason: collision with root package name */
    public final List f122866j;

    /* renamed from: k, reason: collision with root package name */
    public final vn1.g f122867k;

    /* renamed from: l, reason: collision with root package name */
    public final int f122868l;

    /* renamed from: m, reason: collision with root package name */
    public final fm1.c f122869m;

    /* renamed from: n, reason: collision with root package name */
    public final rm1.d f122870n;

    /* renamed from: o, reason: collision with root package name */
    public final rm1.d f122871o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f122872p;

    /* renamed from: q, reason: collision with root package name */
    public final int f122873q;

    /* renamed from: r, reason: collision with root package name */
    public final i0 f122874r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f122875s;

    /* renamed from: t, reason: collision with root package name */
    public final u50.n f122876t;

    /* renamed from: u, reason: collision with root package name */
    public final j f122877u;

    /* renamed from: v, reason: collision with root package name */
    public final int f122878v;

    /* renamed from: w, reason: collision with root package name */
    public final i0 f122879w;

    /* renamed from: x, reason: collision with root package name */
    public final k f122880x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f122881y;

    public c(i0 i0Var, vn1.c cVar, List list, List list2, vn1.g gVar, int i13, fm1.c cVar2, rm1.d dVar, rm1.d dVar2, boolean z13, int i14, f0 f0Var, Integer num, b0 b0Var, j jVar, int i15, f0 f0Var2, int i16) {
        this(i0Var, (i16 & 2) != 0 ? vn1.h.f126277c : cVar, (i16 & 4) != 0 ? e0.b(vn1.h.f126276b) : list, (i16 & 8) != 0 ? e0.b(vn1.h.f126279e) : list2, (i16 & 16) != 0 ? vn1.h.f126278d : gVar, (i16 & 32) != 0 ? Integer.MAX_VALUE : i13, (i16 & 64) != 0 ? vn1.h.f126275a.e() : cVar2, (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : dVar, (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : dVar2, (i16 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z13, (i16 & 1024) != 0 ? Integer.MIN_VALUE : i14, (i16 & 2048) != 0 ? null : f0Var, (i16 & 4096) != 0 ? null : num, (i16 & 8192) != 0 ? null : b0Var, (i16 & 16384) != 0 ? i.f122887b : jVar, i15, f0Var2, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [u50.i0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [u50.i0] */
    public static c y(c cVar, i0 i0Var, vn1.g gVar, int i13, fm1.c cVar2, boolean z13, f0 f0Var, j jVar, int i14, f0 f0Var2, boolean z14, int i15) {
        Integer num;
        int i16;
        i0 text = (i15 & 1) != 0 ? cVar.f122863g : i0Var;
        vn1.c color = cVar.f122864h;
        List alignment = cVar.f122865i;
        List style = cVar.f122866j;
        vn1.g variant = (i15 & 16) != 0 ? cVar.f122867k : gVar;
        int i17 = (i15 & 32) != 0 ? cVar.f122868l : i13;
        fm1.c visibility = (i15 & 64) != 0 ? cVar.f122869m : cVar2;
        rm1.d dVar = cVar.f122870n;
        rm1.d dVar2 = cVar.f122871o;
        boolean z15 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? cVar.f122872p : z13;
        int i18 = cVar.f122873q;
        f0 f0Var3 = (i15 & 2048) != 0 ? cVar.f122874r : f0Var;
        Integer num2 = cVar.f122875s;
        u50.n nVar = cVar.f122876t;
        j suffixMode = (i15 & 16384) != 0 ? cVar.f122877u : jVar;
        if ((i15 & 32768) != 0) {
            num = num2;
            i16 = cVar.f122878v;
        } else {
            num = num2;
            i16 = i14;
        }
        f0 f0Var4 = (65536 & i15) != 0 ? cVar.f122879w : f0Var2;
        k kVar = cVar.f122880x;
        boolean z16 = (i15 & 262144) != 0 ? cVar.f122881y : z14;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(suffixMode, "suffixMode");
        return new c(text, color, alignment, style, variant, i17, visibility, dVar, dVar2, z15, i18, f0Var3, num, nVar, suffixMode, i16, f0Var4, kVar, z16);
    }

    @Override // rn1.e
    public final List e() {
        return this.f122865i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f122863g, cVar.f122863g) && this.f122864h == cVar.f122864h && Intrinsics.d(this.f122865i, cVar.f122865i) && Intrinsics.d(this.f122866j, cVar.f122866j) && this.f122867k == cVar.f122867k && this.f122868l == cVar.f122868l && this.f122869m == cVar.f122869m && Intrinsics.d(this.f122870n, cVar.f122870n) && Intrinsics.d(this.f122871o, cVar.f122871o) && this.f122872p == cVar.f122872p && this.f122873q == cVar.f122873q && Intrinsics.d(this.f122874r, cVar.f122874r) && Intrinsics.d(this.f122875s, cVar.f122875s) && Intrinsics.d(this.f122876t, cVar.f122876t) && Intrinsics.d(this.f122877u, cVar.f122877u) && this.f122878v == cVar.f122878v && Intrinsics.d(this.f122879w, cVar.f122879w) && Intrinsics.d(this.f122880x, cVar.f122880x) && this.f122881y == cVar.f122881y;
    }

    @Override // rn1.e
    public final int getId() {
        return this.f122873q;
    }

    @Override // rn1.e
    public final vn1.c h() {
        return this.f122864h;
    }

    public final int hashCode() {
        int a13 = d7.g.a(this.f122869m, ep.b.b(this.f122868l, (this.f122867k.hashCode() + ep.b.c(this.f122866j, ep.b.c(this.f122865i, (this.f122864h.hashCode() + (this.f122863g.hashCode() * 31)) * 31, 31), 31)) * 31, 31), 31);
        rm1.d dVar = this.f122870n;
        int hashCode = (a13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        rm1.d dVar2 = this.f122871o;
        int b13 = ep.b.b(this.f122873q, ep.b.e(this.f122872p, (hashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31, 31), 31);
        i0 i0Var = this.f122874r;
        int hashCode2 = (b13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        Integer num = this.f122875s;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        u50.n nVar = this.f122876t;
        int b14 = ep.b.b(this.f122878v, (this.f122877u.hashCode() + ((hashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31)) * 31, 31);
        i0 i0Var2 = this.f122879w;
        int hashCode4 = (b14 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31;
        k kVar = this.f122880x;
        return Boolean.hashCode(this.f122881y) + ((hashCode4 + (kVar != null ? kVar.hashCode() : 0)) * 31);
    }

    @Override // rn1.e
    public final i0 i() {
        return this.f122874r;
    }

    @Override // rn1.e
    public final rm1.d k() {
        return this.f122870n;
    }

    @Override // rn1.e
    public final u50.n m() {
        return this.f122876t;
    }

    @Override // rn1.e
    public final Integer o() {
        return this.f122875s;
    }

    @Override // rn1.e
    public final int p() {
        return this.f122868l;
    }

    @Override // rn1.e
    public final rm1.d q() {
        return this.f122871o;
    }

    @Override // rn1.e
    public final List r() {
        return this.f122866j;
    }

    @Override // rn1.e
    public final boolean s() {
        return this.f122872p;
    }

    @Override // rn1.e
    public final i0 t() {
        return this.f122863g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f122863g);
        sb3.append(", color=");
        sb3.append(this.f122864h);
        sb3.append(", alignment=");
        sb3.append(this.f122865i);
        sb3.append(", style=");
        sb3.append(this.f122866j);
        sb3.append(", variant=");
        sb3.append(this.f122867k);
        sb3.append(", maxLines=");
        sb3.append(this.f122868l);
        sb3.append(", visibility=");
        sb3.append(this.f122869m);
        sb3.append(", endIcon=");
        sb3.append(this.f122870n);
        sb3.append(", startIcon=");
        sb3.append(this.f122871o);
        sb3.append(", supportLinks=");
        sb3.append(this.f122872p);
        sb3.append(", id=");
        sb3.append(this.f122873q);
        sb3.append(", contentDescription=");
        sb3.append(this.f122874r);
        sb3.append(", labelFor=");
        sb3.append(this.f122875s);
        sb3.append(", iconPadding=");
        sb3.append(this.f122876t);
        sb3.append(", suffixMode=");
        sb3.append(this.f122877u);
        sb3.append(", maxLinesWhenCollapsed=");
        sb3.append(this.f122878v);
        sb3.append(", suffix=");
        sb3.append(this.f122879w);
        sb3.append(", suffixStyle=");
        sb3.append(this.f122880x);
        sb3.append(", isCollapsed=");
        return a.a.r(sb3, this.f122881y, ")");
    }

    @Override // rn1.e
    public final vn1.g v() {
        return this.f122867k;
    }

    @Override // rn1.e
    public final fm1.c w() {
        return this.f122869m;
    }

    public c(i0 text, vn1.c color, List alignment, List style, vn1.g variant, int i13, fm1.c visibility, rm1.d dVar, rm1.d dVar2, boolean z13, int i14, i0 i0Var, Integer num, u50.n nVar, j suffixMode, int i15, i0 i0Var2, k kVar, boolean z14) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(suffixMode, "suffixMode");
        this.f122863g = text;
        this.f122864h = color;
        this.f122865i = alignment;
        this.f122866j = style;
        this.f122867k = variant;
        this.f122868l = i13;
        this.f122869m = visibility;
        this.f122870n = dVar;
        this.f122871o = dVar2;
        this.f122872p = z13;
        this.f122873q = i14;
        this.f122874r = i0Var;
        this.f122875s = num;
        this.f122876t = nVar;
        this.f122877u = suffixMode;
        this.f122878v = i15;
        this.f122879w = i0Var2;
        this.f122880x = kVar;
        this.f122881y = z14;
    }
}

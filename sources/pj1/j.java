package pj1;

import android.graphics.PorterDuff;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import ni1.f0;
import rm1.m;
import rm1.q;
import u50.i0;
import u50.n;

/* loaded from: classes2.dex */
public final class j implements f0 {
    public final u50.c A;
    public final boolean B;
    public final u50.c C;
    public final u50.c D;
    public final g92.d E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final n I;

    /* renamed from: J, reason: collision with root package name */
    public final n f100315J;
    public final n K;

    /* renamed from: a, reason: collision with root package name */
    public final vn1.c f100316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100317b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.c f100318c;

    /* renamed from: d, reason: collision with root package name */
    public final int f100319d;

    /* renamed from: e, reason: collision with root package name */
    public final int f100320e;

    /* renamed from: f, reason: collision with root package name */
    public final m f100321f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100322g;

    /* renamed from: h, reason: collision with root package name */
    public final int f100323h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f100324i;

    /* renamed from: j, reason: collision with root package name */
    public final int f100325j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f100326k;

    /* renamed from: l, reason: collision with root package name */
    public final i0 f100327l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f100328m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f100329n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f100330o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f100331p;

    /* renamed from: q, reason: collision with root package name */
    public final int f100332q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f100333r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f100334s;

    /* renamed from: t, reason: collision with root package name */
    public final PorterDuff.Mode f100335t;

    /* renamed from: u, reason: collision with root package name */
    public final PorterDuff.Mode f100336u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f100337v;

    /* renamed from: w, reason: collision with root package name */
    public final int f100338w;

    /* renamed from: x, reason: collision with root package name */
    public final b f100339x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f100340y;

    /* renamed from: z, reason: collision with root package name */
    public final int f100341z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ j(vn1.c r41, int r42, rm1.c r43, int r44, int r45, rm1.m r46, int r47, u50.i0 r48, boolean r49, boolean r50, boolean r51, pj1.b r52, boolean r53, int r54, u50.c r55, boolean r56, u50.c r57, g92.d r58, boolean r59, boolean r60, u50.b0 r61, u50.b0 r62, u50.n r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pj1.j.<init>(vn1.c, int, rm1.c, int, int, rm1.m, int, u50.i0, boolean, boolean, boolean, pj1.b, boolean, int, u50.c, boolean, u50.c, g92.d, boolean, boolean, u50.b0, u50.b0, u50.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [rm1.m] */
    public static j e(j jVar, vn1.c cVar, int i13, rm1.c cVar2, q qVar, boolean z13, int i14, i0 i0Var, b bVar, boolean z14, int i15, u50.c cVar3, int i16) {
        boolean z15;
        b shawdowDrawableType;
        int i17;
        boolean z16;
        vn1.c textColor = (i16 & 1) != 0 ? jVar.f100316a : cVar;
        int i18 = (i16 & 2) != 0 ? jVar.f100317b : i13;
        rm1.c iconColor = (i16 & 4) != 0 ? jVar.f100318c : cVar2;
        int i19 = jVar.f100319d;
        int i23 = jVar.f100320e;
        q qVar2 = (i16 & 32) != 0 ? jVar.f100321f : qVar;
        boolean z17 = (i16 & 64) != 0 ? jVar.f100322g : z13;
        int i24 = (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? jVar.f100323h : i14;
        i0 i0Var2 = (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? jVar.f100324i : i0Var;
        int i25 = jVar.f100325j;
        boolean z18 = jVar.f100326k;
        i0 i0Var3 = jVar.f100327l;
        boolean z19 = jVar.f100328m;
        boolean z23 = jVar.f100329n;
        boolean z24 = jVar.f100330o;
        boolean z25 = jVar.f100331p;
        int i26 = jVar.f100332q;
        Integer num = jVar.f100333r;
        Integer num2 = jVar.f100334s;
        PorterDuff.Mode iconColorFilterMode = jVar.f100335t;
        PorterDuff.Mode backgroundColorFilterMode = jVar.f100336u;
        boolean z26 = jVar.f100337v;
        int i27 = jVar.f100338w;
        if ((i16 & 8388608) != 0) {
            z15 = z23;
            shawdowDrawableType = jVar.f100339x;
        } else {
            z15 = z23;
            shawdowDrawableType = bVar;
        }
        if ((i16 & 16777216) != 0) {
            i17 = i27;
            z16 = jVar.f100340y;
        } else {
            i17 = i27;
            z16 = z14;
        }
        int i28 = (33554432 & i16) != 0 ? jVar.f100341z : i15;
        u50.c cVar4 = (i16 & 67108864) != 0 ? jVar.A : cVar3;
        boolean z27 = jVar.B;
        u50.c cVar5 = jVar.C;
        u50.c cVar6 = jVar.D;
        g92.d dVar = jVar.E;
        boolean z28 = jVar.F;
        boolean z29 = jVar.G;
        boolean z33 = jVar.H;
        n nVar = jVar.I;
        n nVar2 = jVar.f100315J;
        n nVar3 = jVar.K;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconColorFilterMode, "iconColorFilterMode");
        Intrinsics.checkNotNullParameter(backgroundColorFilterMode, "backgroundColorFilterMode");
        Intrinsics.checkNotNullParameter(shawdowDrawableType, "shawdowDrawableType");
        return new j(textColor, i18, iconColor, i19, i23, qVar2, z17, i24, i0Var2, i25, z18, i0Var3, z19, z15, z24, z25, i26, num, num2, iconColorFilterMode, backgroundColorFilterMode, z26, i17, shawdowDrawableType, z16, i28, cVar4, z27, cVar5, cVar6, dVar, z28, z29, z33, nVar, nVar2, nVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f100316a == jVar.f100316a && this.f100317b == jVar.f100317b && this.f100318c == jVar.f100318c && this.f100319d == jVar.f100319d && this.f100320e == jVar.f100320e && Intrinsics.d(this.f100321f, jVar.f100321f) && this.f100322g == jVar.f100322g && this.f100323h == jVar.f100323h && Intrinsics.d(this.f100324i, jVar.f100324i) && this.f100325j == jVar.f100325j && this.f100326k == jVar.f100326k && Intrinsics.d(this.f100327l, jVar.f100327l) && this.f100328m == jVar.f100328m && this.f100329n == jVar.f100329n && this.f100330o == jVar.f100330o && this.f100331p == jVar.f100331p && this.f100332q == jVar.f100332q && Intrinsics.d(this.f100333r, jVar.f100333r) && Intrinsics.d(this.f100334s, jVar.f100334s) && this.f100335t == jVar.f100335t && this.f100336u == jVar.f100336u && this.f100337v == jVar.f100337v && this.f100338w == jVar.f100338w && this.f100339x == jVar.f100339x && this.f100340y == jVar.f100340y && this.f100341z == jVar.f100341z && Intrinsics.d(this.A, jVar.A) && this.B == jVar.B && Intrinsics.d(this.C, jVar.C) && Intrinsics.d(this.D, jVar.D) && this.E == jVar.E && this.F == jVar.F && this.G == jVar.G && this.H == jVar.H && Intrinsics.d(this.I, jVar.I) && Intrinsics.d(this.f100315J, jVar.f100315J) && Intrinsics.d(this.K, jVar.K);
    }

    public final PorterDuff.Mode f() {
        return this.f100336u;
    }

    public final PorterDuff.Mode g() {
        return this.f100335t;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f100320e, ep.b.b(this.f100319d, (this.f100318c.hashCode() + ep.b.b(this.f100317b, this.f100316a.hashCode() * 31, 31)) * 31, 31), 31);
        m mVar = this.f100321f;
        int b14 = ep.b.b(this.f100323h, ep.b.e(this.f100322g, (b13 + (mVar == null ? 0 : mVar.hashCode())) * 31, 31), 31);
        i0 i0Var = this.f100324i;
        int e13 = ep.b.e(this.f100326k, ep.b.b(this.f100325j, (b14 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31), 31);
        i0 i0Var2 = this.f100327l;
        int b15 = ep.b.b(this.f100332q, ep.b.e(this.f100331p, ep.b.e(this.f100330o, ep.b.e(this.f100329n, ep.b.e(this.f100328m, (e13 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31, 31), 31), 31), 31), 31);
        Integer num = this.f100333r;
        int hashCode = (b15 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f100334s;
        int b16 = ep.b.b(this.f100341z, ep.b.e(this.f100340y, (this.f100339x.hashCode() + ep.b.b(this.f100338w, ep.b.e(this.f100337v, (this.f100336u.hashCode() + ((this.f100335t.hashCode() + ((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31, 31), 31)) * 31, 31), 31);
        u50.c cVar = this.A;
        int e14 = ep.b.e(this.B, (b16 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
        u50.c cVar2 = this.C;
        int hashCode2 = (e14 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        u50.c cVar3 = this.D;
        int hashCode3 = (hashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
        g92.d dVar = this.E;
        int e15 = ep.b.e(this.H, ep.b.e(this.G, ep.b.e(this.F, (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31), 31), 31);
        n nVar = this.I;
        int hashCode4 = (e15 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        n nVar2 = this.f100315J;
        int hashCode5 = (hashCode4 + (nVar2 == null ? 0 : nVar2.hashCode())) * 31;
        n nVar3 = this.K;
        return hashCode5 + (nVar3 != null ? nVar3.hashCode() : 0);
    }

    public final String toString() {
        return "IndicatorDrawableDisplayState(textColor=" + this.f100316a + ", backgroundColor=" + this.f100317b + ", iconColor=" + this.f100318c + ", leftRightPadding=" + this.f100319d + ", topBottomPadding=" + this.f100320e + ", icon=" + this.f100321f + ", applyTint=" + this.f100322g + ", iconSize=" + this.f100323h + ", text=" + this.f100324i + ", maxTextWidth=" + this.f100325j + ", shouldAddShadow=" + this.f100326k + ", fallbackText=" + this.f100327l + ", collapsed=" + this.f100328m + ", isAnimatedArrowIcon=" + this.f100329n + ", isAnimatedPill=" + this.f100330o + ", shouldFlip=" + this.f100331p + ", collapsedWidth=" + this.f100332q + ", iconColorFilterRes=" + this.f100333r + ", backgroundColorFilterRes=" + this.f100334s + ", iconColorFilterMode=" + this.f100335t + ", backgroundColorFilterMode=" + this.f100336u + ", showIconBlurShadow=" + this.f100337v + ", shadowColorRes=" + this.f100338w + ", shawdowDrawableType=" + this.f100339x + ", showIconWithShadow=" + this.f100340y + ", iconWithShadowAlpha=" + this.f100341z + ", iconAlpha=" + this.A + ", isVRTheme=" + this.B + ", textPaintAlpha=" + this.C + ", backgroundPaintAlpha=" + this.D + ", theme=" + this.E + ", isAnimating=" + this.F + ", isCornerIndicator=" + this.G + ", isDirectToSiteIndicator=" + this.H + ", totalWidthPadding=" + this.I + ", iconTextMargin=" + this.f100315J + ", cornerRadius=" + this.K + ")";
    }

    public j(vn1.c textColor, int i13, rm1.c iconColor, int i14, int i15, m mVar, boolean z13, int i16, i0 i0Var, int i17, boolean z14, i0 i0Var2, boolean z15, boolean z16, boolean z17, boolean z18, int i18, Integer num, Integer num2, PorterDuff.Mode iconColorFilterMode, PorterDuff.Mode backgroundColorFilterMode, boolean z19, int i19, b shawdowDrawableType, boolean z23, int i23, u50.c cVar, boolean z24, u50.c cVar2, u50.c cVar3, g92.d dVar, boolean z25, boolean z26, boolean z27, n nVar, n nVar2, n nVar3) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(iconColorFilterMode, "iconColorFilterMode");
        Intrinsics.checkNotNullParameter(backgroundColorFilterMode, "backgroundColorFilterMode");
        Intrinsics.checkNotNullParameter(shawdowDrawableType, "shawdowDrawableType");
        this.f100316a = textColor;
        this.f100317b = i13;
        this.f100318c = iconColor;
        this.f100319d = i14;
        this.f100320e = i15;
        this.f100321f = mVar;
        this.f100322g = z13;
        this.f100323h = i16;
        this.f100324i = i0Var;
        this.f100325j = i17;
        this.f100326k = z14;
        this.f100327l = i0Var2;
        this.f100328m = z15;
        this.f100329n = z16;
        this.f100330o = z17;
        this.f100331p = z18;
        this.f100332q = i18;
        this.f100333r = num;
        this.f100334s = num2;
        this.f100335t = iconColorFilterMode;
        this.f100336u = backgroundColorFilterMode;
        this.f100337v = z19;
        this.f100338w = i19;
        this.f100339x = shawdowDrawableType;
        this.f100340y = z23;
        this.f100341z = i23;
        this.A = cVar;
        this.B = z24;
        this.C = cVar2;
        this.D = cVar3;
        this.E = dVar;
        this.F = z25;
        this.G = z26;
        this.H = z27;
        this.I = nVar;
        this.f100315J = nVar2;
        this.K = nVar3;
    }
}

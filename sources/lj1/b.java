package lj1;

import d7.g;
import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import u50.b0;
import u50.e;
import u50.i;
import u50.i0;
import u50.k0;
import u50.n;
import vn1.c;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f83616a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83617b;

    /* renamed from: c, reason: collision with root package name */
    public final n f83618c;

    /* renamed from: d, reason: collision with root package name */
    public final n f83619d;

    /* renamed from: e, reason: collision with root package name */
    public final i f83620e;

    /* renamed from: f, reason: collision with root package name */
    public final c f83621f;

    /* renamed from: g, reason: collision with root package name */
    public final i f83622g;

    /* renamed from: h, reason: collision with root package name */
    public final n f83623h;

    /* renamed from: i, reason: collision with root package name */
    public final n f83624i;

    /* renamed from: j, reason: collision with root package name */
    public final n f83625j;

    /* renamed from: k, reason: collision with root package name */
    public final n f83626k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f83627l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f83628m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f83629n;

    public b(i0 buttonText, boolean z13, n overlayTopRadius, n overlayBottomRadius, i overlayBackgroundColor, c buttonTextColor, i buttonBackgroundColor, n buttonInnerVerticalPadding, n buttonInnerHorizontalPadding, n buttonOuterHorizontalPadding, n buttonCornerRadius, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(overlayTopRadius, "overlayTopRadius");
        Intrinsics.checkNotNullParameter(overlayBottomRadius, "overlayBottomRadius");
        Intrinsics.checkNotNullParameter(overlayBackgroundColor, "overlayBackgroundColor");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        Intrinsics.checkNotNullParameter(buttonBackgroundColor, "buttonBackgroundColor");
        Intrinsics.checkNotNullParameter(buttonInnerVerticalPadding, "buttonInnerVerticalPadding");
        Intrinsics.checkNotNullParameter(buttonInnerHorizontalPadding, "buttonInnerHorizontalPadding");
        Intrinsics.checkNotNullParameter(buttonOuterHorizontalPadding, "buttonOuterHorizontalPadding");
        Intrinsics.checkNotNullParameter(buttonCornerRadius, "buttonCornerRadius");
        this.f83616a = buttonText;
        this.f83617b = z13;
        this.f83618c = overlayTopRadius;
        this.f83619d = overlayBottomRadius;
        this.f83620e = overlayBackgroundColor;
        this.f83621f = buttonTextColor;
        this.f83622g = buttonBackgroundColor;
        this.f83623h = buttonInnerVerticalPadding;
        this.f83624i = buttonInnerHorizontalPadding;
        this.f83625j = buttonOuterHorizontalPadding;
        this.f83626k = buttonCornerRadius;
        this.f83627l = z14;
        this.f83628m = z15;
        this.f83629n = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f83616a, bVar.f83616a) && this.f83617b == bVar.f83617b && Intrinsics.d(this.f83618c, bVar.f83618c) && Intrinsics.d(this.f83619d, bVar.f83619d) && Intrinsics.d(this.f83620e, bVar.f83620e) && this.f83621f == bVar.f83621f && Intrinsics.d(this.f83622g, bVar.f83622g) && Intrinsics.d(this.f83623h, bVar.f83623h) && Intrinsics.d(this.f83624i, bVar.f83624i) && Intrinsics.d(this.f83625j, bVar.f83625j) && Intrinsics.d(this.f83626k, bVar.f83626k) && this.f83627l == bVar.f83627l && this.f83628m == bVar.f83628m && this.f83629n == bVar.f83629n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83629n) + ep.b.e(this.f83628m, ep.b.e(this.f83627l, g.e(this.f83626k, g.e(this.f83625j, g.e(this.f83624i, g.e(this.f83623h, (this.f83622g.hashCode() + ((this.f83621f.hashCode() + ((this.f83620e.hashCode() + g.e(this.f83619d, g.e(this.f83618c, ep.b.e(this.f83617b, this.f83616a.hashCode() * 31, 31), 31), 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ButtonOverlayDisplayState(buttonText=");
        sb3.append(this.f83616a);
        sb3.append(", isVisible=");
        sb3.append(this.f83617b);
        sb3.append(", overlayTopRadius=");
        sb3.append(this.f83618c);
        sb3.append(", overlayBottomRadius=");
        sb3.append(this.f83619d);
        sb3.append(", overlayBackgroundColor=");
        sb3.append(this.f83620e);
        sb3.append(", buttonTextColor=");
        sb3.append(this.f83621f);
        sb3.append(", buttonBackgroundColor=");
        sb3.append(this.f83622g);
        sb3.append(", buttonInnerVerticalPadding=");
        sb3.append(this.f83623h);
        sb3.append(", buttonInnerHorizontalPadding=");
        sb3.append(this.f83624i);
        sb3.append(", buttonOuterHorizontalPadding=");
        sb3.append(this.f83625j);
        sb3.append(", buttonCornerRadius=");
        sb3.append(this.f83626k);
        sb3.append(", isOverlayHideEnabled=");
        sb3.append(this.f83627l);
        sb3.append(", isVisibleByDefault=");
        sb3.append(this.f83628m);
        sb3.append(", shouldRedraw=");
        return a.a.r(sb3, this.f83629n, ")");
    }

    public b(k0 k0Var, boolean z13, n nVar, n nVar2, boolean z14, int i13) {
        this((i13 & 1) != 0 ? ep.b.x("", "string", "") : k0Var, (i13 & 2) != 0 ? true : z13, (i13 & 4) != 0 ? new b0(eo1.c.lego_corner_radius_medium) : nVar, (i13 & 8) != 0 ? new b0(eo1.c.lego_corner_radius_medium) : nVar2, new e(eo1.a.sema_color_background_inverse_default), c.DEFAULT, new e(eo1.a.sema_color_background_default), new u50.d(eo1.a.sema_space_400), new u50.d(eo1.a.sema_space_800), new u50.d(eo1.a.sema_space_0), new u50.d(eo1.a.comp_button_large_rounding), (i13 & 2048) != 0 ? false : z14, false, false);
    }
}

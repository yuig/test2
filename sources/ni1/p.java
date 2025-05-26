package ni1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f90764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90765b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90766c;

    /* renamed from: d, reason: collision with root package name */
    public final vn1.c f90767d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90768e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90769f;

    /* renamed from: g, reason: collision with root package name */
    public final si1.a f90770g;

    /* renamed from: h, reason: collision with root package name */
    public final si1.a f90771h;

    /* renamed from: i, reason: collision with root package name */
    public final int f90772i;

    /* renamed from: j, reason: collision with root package name */
    public final int f90773j;

    /* renamed from: k, reason: collision with root package name */
    public final int f90774k;

    /* renamed from: l, reason: collision with root package name */
    public final int f90775l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f90776m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f90777n;

    public p(f30 pin, int i13, int i14, vn1.c gestaltTextColor, boolean z13, String str, si1.a globalVisiblePinRect, si1.a pinDrawableRect, int i15, int i16, int i17, int i18, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(gestaltTextColor, "gestaltTextColor");
        Intrinsics.checkNotNullParameter(globalVisiblePinRect, "globalVisiblePinRect");
        Intrinsics.checkNotNullParameter(pinDrawableRect, "pinDrawableRect");
        this.f90764a = pin;
        this.f90765b = i13;
        this.f90766c = i14;
        this.f90767d = gestaltTextColor;
        this.f90768e = z13;
        this.f90769f = str;
        this.f90770g = globalVisiblePinRect;
        this.f90771h = pinDrawableRect;
        this.f90772i = i15;
        this.f90773j = i16;
        this.f90774k = i17;
        this.f90775l = i18;
        this.f90776m = z14;
        this.f90777n = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f90764a, pVar.f90764a) && this.f90765b == pVar.f90765b && this.f90766c == pVar.f90766c && this.f90767d == pVar.f90767d && this.f90768e == pVar.f90768e && Intrinsics.d(this.f90769f, pVar.f90769f) && Intrinsics.d(this.f90770g, pVar.f90770g) && Intrinsics.d(this.f90771h, pVar.f90771h) && this.f90772i == pVar.f90772i && this.f90773j == pVar.f90773j && this.f90774k == pVar.f90774k && this.f90775l == pVar.f90775l && this.f90776m == pVar.f90776m && this.f90777n == pVar.f90777n;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f90768e, (this.f90767d.hashCode() + ep.b.b(this.f90766c, ep.b.b(this.f90765b, this.f90764a.hashCode() * 31, 31), 31)) * 31, 31);
        String str = this.f90769f;
        return Boolean.hashCode(this.f90777n) + ep.b.e(this.f90776m, ep.b.b(this.f90775l, ep.b.b(this.f90774k, ep.b.b(this.f90773j, ep.b.b(this.f90772i, (this.f90771h.hashCode() + ((this.f90770g.hashCode() + ((e13 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final int j() {
        return this.f90766c;
    }

    public final vn1.c k() {
        return this.f90767d;
    }

    public final si1.a l() {
        return this.f90770g;
    }

    public final int m() {
        return this.f90774k;
    }

    public final f30 n() {
        return this.f90764a;
    }

    public final int o() {
        return this.f90775l;
    }

    public final si1.a p() {
        return this.f90771h;
    }

    public final int q() {
        return this.f90765b;
    }

    public final int r() {
        return this.f90773j;
    }

    public final String s() {
        return this.f90769f;
    }

    public final int t() {
        return this.f90772i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowContextMenu(pin=");
        sb3.append(this.f90764a);
        sb3.append(", pinPosition=");
        sb3.append(this.f90765b);
        sb3.append(", backgroundColorResId=");
        sb3.append(this.f90766c);
        sb3.append(", gestaltTextColor=");
        sb3.append(this.f90767d);
        sb3.append(", showFavoriteAction=");
        sb3.append(this.f90768e);
        sb3.append(", productTagParentPinId=");
        sb3.append(this.f90769f);
        sb3.append(", globalVisiblePinRect=");
        sb3.append(this.f90770g);
        sb3.append(", pinDrawableRect=");
        sb3.append(this.f90771h);
        sb3.append(", rootViewWidth=");
        sb3.append(this.f90772i);
        sb3.append(", pinRepViewHeight=");
        sb3.append(this.f90773j);
        sb3.append(", gridTop=");
        sb3.append(this.f90774k);
        sb3.append(", pinCornerRadiusDimens=");
        sb3.append(this.f90775l);
        sb3.append(", isHideSupported=");
        sb3.append(this.f90776m);
        sb3.append(", isFullWidth=");
        return a.a.r(sb3, this.f90777n, ")");
    }

    public final boolean u() {
        return this.f90768e;
    }

    public final boolean v() {
        return this.f90777n;
    }

    public final boolean w() {
        return this.f90776m;
    }
}

package we1;

import a.cb;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import z32.d3;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final j21.b f129417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f129418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129419c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.n f129420d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f129421e;

    /* renamed from: f, reason: collision with root package name */
    public final ze0.a f129422f;

    /* renamed from: g, reason: collision with root package name */
    public final int f129423g;

    /* renamed from: h, reason: collision with root package name */
    public final d3 f129424h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f129425i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f129426j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f129427k;

    /* renamed from: l, reason: collision with root package name */
    public final h32.g0 f129428l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f129429m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f129430n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f129431o;

    /* renamed from: p, reason: collision with root package name */
    public final Float f129432p;

    public i2(j21.b carouselPadding, boolean z13, ze0.a userRepStyle, int i13, d3 videoPlayMode, Long l13, boolean z14, HashMap hashMap, h32.g0 g0Var, boolean z15, Boolean bool, Float f13) {
        int i14 = eo1.c.lego_corner_radius_medium;
        u50.d rightMargin = new u50.d(eo1.a.item_horizontal_spacing);
        Intrinsics.checkNotNullParameter(carouselPadding, "carouselPadding");
        Intrinsics.checkNotNullParameter("medium", "pinImageSize");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(userRepStyle, "userRepStyle");
        Intrinsics.checkNotNullParameter(videoPlayMode, "videoPlayMode");
        this.f129417a = carouselPadding;
        this.f129418b = "medium";
        this.f129419c = i14;
        this.f129420d = rightMargin;
        this.f129421e = z13;
        this.f129422f = userRepStyle;
        this.f129423g = i13;
        this.f129424h = videoPlayMode;
        this.f129425i = l13;
        this.f129426j = z14;
        this.f129427k = hashMap;
        this.f129428l = g0Var;
        this.f129429m = false;
        this.f129430n = z15;
        this.f129431o = bool;
        this.f129432p = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return Intrinsics.d(this.f129417a, i2Var.f129417a) && Intrinsics.d(this.f129418b, i2Var.f129418b) && this.f129419c == i2Var.f129419c && Intrinsics.d(this.f129420d, i2Var.f129420d) && this.f129421e == i2Var.f129421e && this.f129422f == i2Var.f129422f && this.f129423g == i2Var.f129423g && this.f129424h == i2Var.f129424h && Intrinsics.d(this.f129425i, i2Var.f129425i) && this.f129426j == i2Var.f129426j && Intrinsics.d(this.f129427k, i2Var.f129427k) && this.f129428l == i2Var.f129428l && this.f129429m == i2Var.f129429m && this.f129430n == i2Var.f129430n && Intrinsics.d(this.f129431o, i2Var.f129431o) && Intrinsics.d(this.f129432p, i2Var.f129432p);
    }

    public final int hashCode() {
        int hashCode = (this.f129424h.hashCode() + ep.b.b(this.f129423g, (this.f129422f.hashCode() + ep.b.e(this.f129421e, d7.g.e(this.f129420d, ep.b.b(this.f129419c, cb.d(this.f129418b, this.f129417a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31)) * 31;
        Long l13 = this.f129425i;
        int e13 = ep.b.e(this.f129426j, (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31, 31);
        HashMap hashMap = this.f129427k;
        int hashCode2 = (e13 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        h32.g0 g0Var = this.f129428l;
        int e14 = ep.b.e(this.f129430n, ep.b.e(this.f129429m, (hashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31), 31);
        Boolean bool = this.f129431o;
        int hashCode3 = (e14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f13 = this.f129432p;
        return hashCode3 + (f13 != null ? f13.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalCarouselConfigModel(carouselPadding=" + this.f129417a + ", pinImageSize=" + this.f129418b + ", pinCornerRadius=" + this.f129419c + ", rightMargin=" + this.f129420d + ", shouldCenterRecyclerView=" + this.f129421e + ", userRepStyle=" + this.f129422f + ", numRows=" + this.f129423g + ", videoPlayMode=" + this.f129424h + ", videoMaxPlaytimeMs=" + this.f129425i + ", shouldLogCarouselSwipe=" + this.f129426j + ", auxData=" + this.f129427k + ", componentType=" + this.f129428l + ", shouldPreventParentSwipe=" + this.f129429m + ", shouldDisableRecyclerViewFocusable=" + this.f129430n + ", shouldShowSavedOverlay=" + this.f129431o + ", itemWidthHeightRatio=" + this.f129432p + ")";
    }
}

package wa2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128719a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f128720b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f128721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f128722d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f128723e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f128724f;

    /* renamed from: g, reason: collision with root package name */
    public final bb2.e f128725g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f128726h;

    /* renamed from: i, reason: collision with root package name */
    public final h32.g0 f128727i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f128728j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f128729k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f128730l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f128731m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f128732n;

    /* renamed from: o, reason: collision with root package name */
    public final int f128733o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f128734p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f128735q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f128736r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f128737s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f128738t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f128739u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f128740v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f128741w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f128742x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f128743y;

    public /* synthetic */ g0(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, bb2.e eVar, u0 u0Var, h32.g0 g0Var, boolean z19, boolean z23, boolean z24, boolean z25, int i13, boolean z26, boolean z27, boolean z28, boolean z29, boolean z33, boolean z34, boolean z35, boolean z36, int i14) {
        this((i14 & 1) != 0 ? true : z13, (i14 & 2) != 0 ? true : z14, (i14 & 4) != 0 ? true : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? true : z18, (i14 & 64) != 0 ? null : eVar, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : u0Var, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : g0Var, (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z19, (i14 & 1024) != 0 ? false : z23, (i14 & 2048) != 0 ? false : z24, (i14 & 4096) != 0 ? false : z25, false, (i14 & 16384) != 0 ? 1 : i13, false, (65536 & i14) != 0 ? true : z26, (131072 & i14) != 0 ? true : z27, (262144 & i14) != 0 ? false : z28, (524288 & i14) != 0 ? false : z29, (1048576 & i14) != 0 ? false : z33, (2097152 & i14) != 0 ? false : z34, false, (8388608 & i14) != 0 ? false : z35, (i14 & 16777216) != 0 ? false : z36);
    }

    public static g0 a(g0 g0Var, bb2.e eVar, boolean z13, int i13) {
        return new g0(g0Var.f128719a, g0Var.f128720b, g0Var.f128721c, g0Var.f128722d, g0Var.f128723e, g0Var.f128724f, (i13 & 64) != 0 ? g0Var.f128725g : eVar, g0Var.f128726h, g0Var.f128727i, g0Var.f128728j, g0Var.f128729k, g0Var.f128730l, g0Var.f128731m, g0Var.f128732n, g0Var.f128733o, g0Var.f128734p, g0Var.f128735q, g0Var.f128736r, g0Var.f128737s, g0Var.f128738t, g0Var.f128739u, g0Var.f128740v, g0Var.f128741w, (i13 & 8388608) != 0 ? g0Var.f128742x : z13, g0Var.f128743y);
    }

    public final h32.g0 b() {
        return this.f128727i;
    }

    public final bb2.e c() {
        return this.f128725g;
    }

    public final int d() {
        return this.f128733o;
    }

    public final boolean e() {
        return this.f128740v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f128719a == g0Var.f128719a && this.f128720b == g0Var.f128720b && this.f128721c == g0Var.f128721c && this.f128722d == g0Var.f128722d && this.f128723e == g0Var.f128723e && this.f128724f == g0Var.f128724f && Intrinsics.d(this.f128725g, g0Var.f128725g) && this.f128726h == g0Var.f128726h && this.f128727i == g0Var.f128727i && this.f128728j == g0Var.f128728j && this.f128729k == g0Var.f128729k && this.f128730l == g0Var.f128730l && this.f128731m == g0Var.f128731m && this.f128732n == g0Var.f128732n && this.f128733o == g0Var.f128733o && this.f128734p == g0Var.f128734p && this.f128735q == g0Var.f128735q && this.f128736r == g0Var.f128736r && this.f128737s == g0Var.f128737s && this.f128738t == g0Var.f128738t && this.f128739u == g0Var.f128739u && this.f128740v == g0Var.f128740v && this.f128741w == g0Var.f128741w && this.f128742x == g0Var.f128742x && this.f128743y == g0Var.f128743y;
    }

    public final boolean f() {
        return this.f128721c;
    }

    public final boolean g() {
        return this.f128729k;
    }

    public final boolean h() {
        return this.f128730l;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f128724f, ep.b.e(this.f128723e, ep.b.e(this.f128722d, ep.b.e(this.f128721c, ep.b.e(this.f128720b, Boolean.hashCode(this.f128719a) * 31, 31), 31), 31), 31), 31);
        bb2.e eVar = this.f128725g;
        int hashCode = (e13 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        u0 u0Var = this.f128726h;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        h32.g0 g0Var = this.f128727i;
        return Boolean.hashCode(this.f128743y) + ep.b.e(this.f128742x, ep.b.e(this.f128741w, ep.b.e(this.f128740v, ep.b.e(this.f128739u, ep.b.e(this.f128738t, ep.b.e(this.f128737s, ep.b.e(this.f128736r, ep.b.e(this.f128735q, ep.b.e(this.f128734p, ep.b.b(this.f128733o, ep.b.e(this.f128732n, ep.b.e(this.f128731m, ep.b.e(this.f128730l, ep.b.e(this.f128729k, ep.b.e(this.f128728j, (hashCode2 + (g0Var != null ? g0Var.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean i() {
        return this.f128719a;
    }

    public final boolean j() {
        return this.f128722d;
    }

    public final boolean k() {
        return this.f128720b;
    }

    public final boolean l() {
        return this.f128739u;
    }

    public final boolean m() {
        return this.f128738t;
    }

    public final boolean n() {
        return this.f128736r;
    }

    public final boolean o() {
        return this.f128743y;
    }

    public final void p() {
        this.f128728j = true;
    }

    public final void q() {
        this.f128729k = true;
    }

    public final void r() {
        this.f128730l = true;
    }

    public final String toString() {
        boolean z13 = this.f128728j;
        boolean z14 = this.f128729k;
        boolean z15 = this.f128730l;
        StringBuilder sb3 = new StringBuilder("ShoppingGridConfigModel(shouldRenderPrice=");
        sb3.append(this.f128719a);
        sb3.append(", shouldRenderTitle=");
        sb3.append(this.f128720b);
        sb3.append(", shouldRenderMerchantDomain=");
        sb3.append(this.f128721c);
        sb3.append(", shouldRenderRatingAndCount=");
        sb3.append(this.f128722d);
        sb3.append(", shouldRenderShippingInfo=");
        sb3.append(this.f128723e);
        sb3.append(", shouldRenderLabel=");
        sb3.append(this.f128724f);
        sb3.append(", fixedHeightImageSpec=");
        sb3.append(this.f128725g);
        sb3.append(", elementType=");
        sb3.append(this.f128726h);
        sb3.append(", componentType=");
        sb3.append(this.f128727i);
        sb3.append(", shouldRenderLegoCallToActionButton=");
        sb3.append(z13);
        sb3.append(", shouldRenderPdpLiteOutOfStock=");
        a.c.v(sb3, z14, ", shouldRenderPdpLiteStale=", z15, ", usePinIdForTapAuxData=");
        sb3.append(this.f128731m);
        sb3.append(", shouldRenderCallToAction=");
        sb3.append(this.f128732n);
        sb3.append(", linesForTitle=");
        sb3.append(this.f128733o);
        sb3.append(", shouldRenderProductTagInTitle=");
        sb3.append(this.f128734p);
        sb3.append(", shouldRenderMerchantDomainAsTitle=");
        sb3.append(this.f128735q);
        sb3.append(", isNewPinGridRep=");
        sb3.append(this.f128736r);
        sb3.append(", shouldForceHideRatingAndCount=");
        sb3.append(this.f128737s);
        sb3.append(", isDealAOMInHF=");
        sb3.append(this.f128738t);
        sb3.append(", isBrandedStandardModuleInHF=");
        sb3.append(this.f128739u);
        sb3.append(", shouldDisplayPriceInBlack=");
        sb3.append(this.f128740v);
        sb3.append(", shouldDisplayStrikeThroughPriceInBlack=");
        sb3.append(this.f128741w);
        sb3.append(", showPriceInRegularFont=");
        sb3.append(this.f128742x);
        sb3.append(", isProductPageForPriceAndRatingsExperiment=");
        return a.a.r(sb3, this.f128743y, ")");
    }

    public g0(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, bb2.e eVar, u0 u0Var, h32.g0 g0Var, boolean z19, boolean z23, boolean z24, boolean z25, boolean z26, int i13, boolean z27, boolean z28, boolean z29, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39) {
        this.f128719a = z13;
        this.f128720b = z14;
        this.f128721c = z15;
        this.f128722d = z16;
        this.f128723e = z17;
        this.f128724f = z18;
        this.f128725g = eVar;
        this.f128726h = u0Var;
        this.f128727i = g0Var;
        this.f128728j = z19;
        this.f128729k = z23;
        this.f128730l = z24;
        this.f128731m = z25;
        this.f128732n = z26;
        this.f128733o = i13;
        this.f128734p = z27;
        this.f128735q = z28;
        this.f128736r = z29;
        this.f128737s = z33;
        this.f128738t = z34;
        this.f128739u = z35;
        this.f128740v = z36;
        this.f128741w = z37;
        this.f128742x = z38;
        this.f128743y = z39;
    }
}

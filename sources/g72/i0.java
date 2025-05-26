package g72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* renamed from: l, reason: collision with root package name */
    public static final i0 f64005l = new i0("none");

    /* renamed from: a, reason: collision with root package name */
    public final String f64006a;

    /* renamed from: b, reason: collision with root package name */
    public final g1 f64007b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f64008c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f64009d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f64010e;

    /* renamed from: f, reason: collision with root package name */
    public final g1 f64011f;

    /* renamed from: g, reason: collision with root package name */
    public final g1 f64012g;

    /* renamed from: h, reason: collision with root package name */
    public final g1 f64013h;

    /* renamed from: i, reason: collision with root package name */
    public final x f64014i;

    /* renamed from: j, reason: collision with root package name */
    public final g1 f64015j;

    /* renamed from: k, reason: collision with root package name */
    public final g1 f64016k;

    public i0(int i13, String str, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, g1 g1Var6, g1 g1Var7, x xVar, g1 g1Var8, g1 g1Var9) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, g0.f63988b);
            throw null;
        }
        this.f64006a = str;
        if ((i13 & 2) == 0) {
            this.f64007b = null;
        } else {
            this.f64007b = g1Var;
        }
        if ((i13 & 4) == 0) {
            this.f64008c = null;
        } else {
            this.f64008c = g1Var2;
        }
        if ((i13 & 8) == 0) {
            this.f64009d = null;
        } else {
            this.f64009d = g1Var3;
        }
        if ((i13 & 16) == 0) {
            this.f64010e = null;
        } else {
            this.f64010e = g1Var4;
        }
        if ((i13 & 32) == 0) {
            this.f64011f = null;
        } else {
            this.f64011f = g1Var5;
        }
        if ((i13 & 64) == 0) {
            this.f64012g = null;
        } else {
            this.f64012g = g1Var6;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f64013h = null;
        } else {
            this.f64013h = g1Var7;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f64014i = null;
        } else {
            this.f64014i = xVar;
        }
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0) {
            this.f64015j = null;
        } else {
            this.f64015j = g1Var8;
        }
        if ((i13 & 1024) == 0) {
            this.f64016k = null;
        } else {
            this.f64016k = g1Var9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f64006a, i0Var.f64006a) && Intrinsics.d(this.f64007b, i0Var.f64007b) && Intrinsics.d(this.f64008c, i0Var.f64008c) && Intrinsics.d(this.f64009d, i0Var.f64009d) && Intrinsics.d(this.f64010e, i0Var.f64010e) && Intrinsics.d(this.f64011f, i0Var.f64011f) && Intrinsics.d(this.f64012g, i0Var.f64012g) && Intrinsics.d(this.f64013h, i0Var.f64013h) && Intrinsics.d(this.f64014i, i0Var.f64014i) && Intrinsics.d(this.f64015j, i0Var.f64015j) && Intrinsics.d(this.f64016k, i0Var.f64016k);
    }

    public final int hashCode() {
        int hashCode = this.f64006a.hashCode() * 31;
        g1 g1Var = this.f64007b;
        int hashCode2 = (hashCode + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        g1 g1Var2 = this.f64008c;
        int hashCode3 = (hashCode2 + (g1Var2 == null ? 0 : g1Var2.hashCode())) * 31;
        g1 g1Var3 = this.f64009d;
        int hashCode4 = (hashCode3 + (g1Var3 == null ? 0 : g1Var3.hashCode())) * 31;
        g1 g1Var4 = this.f64010e;
        int hashCode5 = (hashCode4 + (g1Var4 == null ? 0 : g1Var4.hashCode())) * 31;
        g1 g1Var5 = this.f64011f;
        int hashCode6 = (hashCode5 + (g1Var5 == null ? 0 : g1Var5.hashCode())) * 31;
        g1 g1Var6 = this.f64012g;
        int hashCode7 = (hashCode6 + (g1Var6 == null ? 0 : g1Var6.hashCode())) * 31;
        g1 g1Var7 = this.f64013h;
        int hashCode8 = (hashCode7 + (g1Var7 == null ? 0 : g1Var7.hashCode())) * 31;
        x xVar = this.f64014i;
        int hashCode9 = (hashCode8 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        g1 g1Var8 = this.f64015j;
        int hashCode10 = (hashCode9 + (g1Var8 == null ? 0 : g1Var8.hashCode())) * 31;
        g1 g1Var9 = this.f64016k;
        return hashCode10 + (g1Var9 != null ? g1Var9.hashCode() : 0);
    }

    public final String toString() {
        return "FilterEffectDataEntity(type=" + this.f64006a + ", intensity=" + this.f64007b + ", exposure=" + this.f64008c + ", contrast=" + this.f64009d + ", saturation=" + this.f64010e + ", hue=" + this.f64011f + ", temperature=" + this.f64012g + ", tint=" + this.f64013h + ", invert=" + this.f64014i + ", shadows=" + this.f64015j + ", highlights=" + this.f64016k + ")";
    }

    public /* synthetic */ i0(String str) {
        this(str, null, null, null, null, null, null, null, null, null, null);
    }

    public i0(String type, g1 g1Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, g1 g1Var6, g1 g1Var7, x xVar, g1 g1Var8, g1 g1Var9) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f64006a = type;
        this.f64007b = g1Var;
        this.f64008c = g1Var2;
        this.f64009d = g1Var3;
        this.f64010e = g1Var4;
        this.f64011f = g1Var5;
        this.f64012g = g1Var6;
        this.f64013h = g1Var7;
        this.f64014i = xVar;
        this.f64015j = g1Var8;
        this.f64016k = g1Var9;
    }
}

package o21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f92820a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92821b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92822c;

    /* renamed from: d, reason: collision with root package name */
    public final ze1.a f92823d;

    /* renamed from: e, reason: collision with root package name */
    public final int f92824e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f92825f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f92826g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f92827h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f92828i;

    /* renamed from: j, reason: collision with root package name */
    public final ic0.a f92829j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f92830k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f92831l;

    public e(double d2, boolean z13, ze1.a aVar, HashMap hashMap, boolean z14, ic0.a aVar2, boolean z15, int i13) {
        d2 = (i13 & 1) != 0 ? 1.5d : d2;
        z13 = (i13 & 4) != 0 ? false : z13;
        aVar = (i13 & 8) != 0 ? null : aVar;
        int i14 = x0.fixed_size_pin_overlay_text_see_all;
        hashMap = (i13 & 32) != 0 ? null : hashMap;
        z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z14;
        aVar2 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : aVar2;
        z15 = (i13 & 1024) != 0 ? false : z15;
        boolean z16 = (i13 & 2048) != 0;
        this.f92820a = d2;
        this.f92821b = false;
        this.f92822c = z13;
        this.f92823d = aVar;
        this.f92824e = i14;
        this.f92825f = hashMap;
        this.f92826g = null;
        this.f92827h = null;
        this.f92828i = z14;
        this.f92829j = aVar2;
        this.f92830k = z15;
        this.f92831l = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Double.compare(this.f92820a, eVar.f92820a) == 0 && this.f92821b == eVar.f92821b && this.f92822c == eVar.f92822c && Intrinsics.d(this.f92823d, eVar.f92823d) && this.f92824e == eVar.f92824e && Intrinsics.d(this.f92825f, eVar.f92825f) && this.f92826g == eVar.f92826g && this.f92827h == eVar.f92827h && this.f92828i == eVar.f92828i && Intrinsics.d(this.f92829j, eVar.f92829j) && this.f92830k == eVar.f92830k && this.f92831l == eVar.f92831l;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f92822c, ep.b.e(this.f92821b, Double.hashCode(this.f92820a) * 31, 31), 31);
        ze1.a aVar = this.f92823d;
        int b13 = ep.b.b(this.f92824e, (e13 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        HashMap hashMap = this.f92825f;
        int hashCode = (b13 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        u0 u0Var = this.f92826g;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        u0 u0Var2 = this.f92827h;
        int e14 = ep.b.e(this.f92828i, (hashCode2 + (u0Var2 == null ? 0 : u0Var2.hashCode())) * 31, 31);
        ic0.a aVar2 = this.f92829j;
        return Boolean.hashCode(this.f92831l) + ep.b.e(this.f92830k, (e14 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "FixedSizePinRowDecoration(pinWidthHeightRatio=" + this.f92820a + ", shouldAddLastItemOverlay=" + this.f92821b + ", shouldShowPricePills=" + this.f92822c + ", productMetadataViewSpec=" + this.f92823d + ", overlayActionTextStringRes=" + this.f92824e + ", pinCellAuxData=" + this.f92825f + ", pinCellElementType=" + this.f92826g + ", actionOverlayElementType=" + this.f92827h + ", shouldCenterAndResizeSingleElement=" + this.f92828i + ", pinImageIndicatorModel=" + this.f92829j + ", useHorizontalProductMetadata=" + this.f92830k + ", shouldShowHide=" + this.f92831l + ")";
    }
}

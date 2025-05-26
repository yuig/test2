package ua2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f121438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121439b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f121440c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121441d;

    /* renamed from: e, reason: collision with root package name */
    public final String f121442e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f121443f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f121444g;

    /* renamed from: h, reason: collision with root package name */
    public final x32.b f121445h;

    /* renamed from: i, reason: collision with root package name */
    public final h32.e f121446i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f121447j;

    public c(int i13, int i14, boolean z13, boolean z14, String str, Integer num, boolean z15, x32.b bVar, h32.e eVar, Boolean bool, int i15) {
        z15 = (i15 & 64) != 0 ? false : z15;
        bVar = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : bVar;
        eVar = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : eVar;
        bool = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : bool;
        this.f121438a = i13;
        this.f121439b = i14;
        this.f121440c = z13;
        this.f121441d = z14;
        this.f121442e = str;
        this.f121443f = num;
        this.f121444g = z15;
        this.f121445h = bVar;
        this.f121446i = eVar;
        this.f121447j = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f121438a == cVar.f121438a && this.f121439b == cVar.f121439b && this.f121440c == cVar.f121440c && this.f121441d == cVar.f121441d && Intrinsics.d(this.f121442e, cVar.f121442e) && Intrinsics.d(this.f121443f, cVar.f121443f) && this.f121444g == cVar.f121444g && Intrinsics.d(this.f121445h, cVar.f121445h) && Intrinsics.d(this.f121446i, cVar.f121446i) && Intrinsics.d(this.f121447j, cVar.f121447j);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f121441d, ep.b.e(this.f121440c, ep.b.b(this.f121439b, Integer.hashCode(this.f121438a) * 31, 31), 31), 31);
        String str = this.f121442e;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f121443f;
        int e14 = ep.b.e(this.f121444g, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        x32.b bVar = this.f121445h;
        int hashCode2 = (e14 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h32.e eVar = this.f121446i;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Boolean bool = this.f121447j;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImpressionData(measuredWidth=");
        sb3.append(this.f121438a);
        sb3.append(", measuredHeight=");
        sb3.append(this.f121439b);
        sb3.append(", hasPinChips=");
        sb3.append(this.f121440c);
        sb3.append(", shouldRenderRating=");
        sb3.append(this.f121441d);
        sb3.append(", productParentPinId=");
        sb3.append(this.f121442e);
        sb3.append(", columnIndex=");
        sb3.append(this.f121443f);
        sb3.append(", isBtrObserved=");
        sb3.append(this.f121444g);
        sb3.append(", handshakeEventData=");
        sb3.append(this.f121445h);
        sb3.append(", adDataEventData=");
        sb3.append(this.f121446i);
        sb3.append(", isAttributionDisplayed=");
        return a.c.h(sb3, this.f121447j, ")");
    }
}

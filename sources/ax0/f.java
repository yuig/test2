package ax0;

import a.cb;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.vh;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import net.quikkly.android.utils.BitmapUtils;
import zy.l0;

/* loaded from: classes5.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f20607a;

    /* renamed from: b, reason: collision with root package name */
    public final vh f20608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20609c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20610d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20611e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f20612f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20613g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20614h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20615i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20616j;

    public f(f30 pin, vh vhVar, String enteredQuery, float f13, int i13, String clientTrackingParams, boolean z13, boolean z14, String pinBookmark, int i14) {
        enteredQuery = (i14 & 4) != 0 ? "" : enteredQuery;
        f13 = (i14 & 8) != 0 ? 1.0f : f13;
        i13 = (i14 & 16) != 0 ? 0 : i13;
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        clientTrackingParams = (i14 & 64) != 0 ? "" : clientTrackingParams;
        z13 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13;
        z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z14;
        pinBookmark = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? "" : pinBookmark;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinBookmark, "pinBookmark");
        this.f20607a = pin;
        this.f20608b = vhVar;
        this.f20609c = enteredQuery;
        this.f20610d = f13;
        this.f20611e = i13;
        this.f20612f = pinalyticsVMState;
        this.f20613g = clientTrackingParams;
        this.f20614h = z13;
        this.f20615i = z14;
        this.f20616j = pinBookmark;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f20607a, fVar.f20607a) && Intrinsics.d(this.f20608b, fVar.f20608b) && Intrinsics.d(this.f20609c, fVar.f20609c) && Float.compare(this.f20610d, fVar.f20610d) == 0 && this.f20611e == fVar.f20611e && Intrinsics.d(this.f20612f, fVar.f20612f) && Intrinsics.d(this.f20613g, fVar.f20613g) && this.f20614h == fVar.f20614h && this.f20615i == fVar.f20615i && Intrinsics.d(this.f20616j, fVar.f20616j);
    }

    public final int hashCode() {
        int hashCode = this.f20607a.hashCode() * 31;
        vh vhVar = this.f20608b;
        return this.f20616j.hashCode() + ep.b.e(this.f20615i, ep.b.e(this.f20614h, cb.d(this.f20613g, jq.b.a(this.f20612f, ep.b.b(this.f20611e, a.a.a(this.f20610d, cb.d(this.f20609c, (hashCode + (vhVar == null ? 0 : vhVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "See It Styled Module";
    }
}

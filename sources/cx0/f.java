package cx0;

import a.cb;
import bx0.z;
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
    public final f30 f53348a;

    /* renamed from: b, reason: collision with root package name */
    public final vh f53349b;

    /* renamed from: c, reason: collision with root package name */
    public final String f53350c;

    /* renamed from: d, reason: collision with root package name */
    public final float f53351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53352e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f53353f;

    /* renamed from: g, reason: collision with root package name */
    public final String f53354g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f53355h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f53356i;

    /* renamed from: j, reason: collision with root package name */
    public final String f53357j;

    /* renamed from: k, reason: collision with root package name */
    public final z f53358k;

    public f(f30 pin, vh vhVar, String str, float f13, int i13, String str2, boolean z13, boolean z14, String str3, z zVar, int i14) {
        String enteredQuery = (i14 & 4) != 0 ? "" : str;
        float f14 = (i14 & 8) != 0 ? 1.0f : f13;
        int i15 = (i14 & 16) != 0 ? 0 : i13;
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        String clientTrackingParams = (i14 & 64) != 0 ? "" : str2;
        boolean z15 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z13;
        boolean z16 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0 ? z14 : false;
        String pinBookmark = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0 ? str3 : "";
        z moduleVariant = (i14 & 1024) != 0 ? z.DROPDOWN : zVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(pinBookmark, "pinBookmark");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        this.f53348a = pin;
        this.f53349b = vhVar;
        this.f53350c = enteredQuery;
        this.f53351d = f14;
        this.f53352e = i15;
        this.f53353f = pinalyticsVMState;
        this.f53354g = clientTrackingParams;
        this.f53355h = z15;
        this.f53356i = z16;
        this.f53357j = pinBookmark;
        this.f53358k = moduleVariant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f53348a, fVar.f53348a) && Intrinsics.d(this.f53349b, fVar.f53349b) && Intrinsics.d(this.f53350c, fVar.f53350c) && Float.compare(this.f53351d, fVar.f53351d) == 0 && this.f53352e == fVar.f53352e && Intrinsics.d(this.f53353f, fVar.f53353f) && Intrinsics.d(this.f53354g, fVar.f53354g) && this.f53355h == fVar.f53355h && this.f53356i == fVar.f53356i && Intrinsics.d(this.f53357j, fVar.f53357j) && this.f53358k == fVar.f53358k;
    }

    public final int hashCode() {
        int hashCode = this.f53348a.hashCode() * 31;
        vh vhVar = this.f53349b;
        return this.f53358k.hashCode() + cb.d(this.f53357j, ep.b.e(this.f53356i, ep.b.e(this.f53355h, cb.d(this.f53354g, jq.b.a(this.f53353f, ep.b.b(this.f53352e, a.a.a(this.f53351d, cb.d(this.f53350c, (hashCode + (vhVar == null ? 0 : vhVar.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "STL Focus Module";
    }
}

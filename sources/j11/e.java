package j11;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.j;
import f02.g;
import g70.h;
import h32.f1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import r41.k;
import u50.f0;

/* loaded from: classes5.dex */
public final class e extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f74401d;

    /* renamed from: e, reason: collision with root package name */
    public final String f74402e;

    /* renamed from: f, reason: collision with root package name */
    public final String f74403f;

    /* renamed from: g, reason: collision with root package name */
    public final String f74404g;

    /* renamed from: h, reason: collision with root package name */
    public final w f74405h;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f74406i;

    /* renamed from: j, reason: collision with root package name */
    public final String f74407j;

    /* renamed from: k, reason: collision with root package name */
    public final h f74408k;

    public e(String sourcePinId, String newRepinId, String str, String boardName, String str2, w eventManager, d0 pinalytics, String str3, h boardNavigator) {
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        Intrinsics.checkNotNullParameter(newRepinId, "newRepinId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f74401d = newRepinId;
        this.f74402e = str;
        this.f74403f = boardName;
        this.f74404g = str2;
        this.f74405h = eventManager;
        this.f74406i = pinalytics;
        this.f74407j = str3;
        this.f74408k = boardNavigator;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        spannableStringBuilder.append((CharSequence) (bs1.c.d2(context, g.pin_deleted_from_board) + " "));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f74403f);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Context context2 = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f0 h23 = bs1.c.h2(spannableStringBuilder);
        String str = this.f74404g;
        return new GestaltToast(context2, new do1.d(h23, str != null ? new j(str) : null, null, null, 0, 3000, 0, null, false, 476));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d(f1.TAP);
        String str = this.f74402e;
        if (str != null) {
            h.g(this.f74408k, str, null, c.f74386k, 2);
            return;
        }
        String str2 = this.f74407j;
        if (str2 != null) {
            this.f74405h.d(k.c(k.f106176a, str2, r41.b.PinnedToast, null, null, 28));
        }
    }

    public final void d(f1 eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        HashMap hashMap = new HashMap();
        String str = this.f74402e;
        if (str == null) {
            str = "";
        }
        hashMap.put("board_id", str);
        hashMap.put("pin_id", this.f74401d);
        Unit unit = Unit.f80348a;
        d0.B(this.f74406i, eventType, null, this.f74402e, hashMap, 18);
    }
}

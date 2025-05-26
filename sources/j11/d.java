package j11;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.j;
import g70.h;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import m60.x0;
import nx.d0;
import r41.k;
import u50.f0;
import w01.e0;

/* loaded from: classes5.dex */
public final class d extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f74388d;

    /* renamed from: e, reason: collision with root package name */
    public final String f74389e;

    /* renamed from: f, reason: collision with root package name */
    public final String f74390f;

    /* renamed from: g, reason: collision with root package name */
    public final String f74391g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f74392h;

    /* renamed from: i, reason: collision with root package name */
    public final w f74393i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f74394j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f74395k;

    /* renamed from: l, reason: collision with root package name */
    public final String f74396l;

    /* renamed from: m, reason: collision with root package name */
    public final h f74397m;

    /* renamed from: n, reason: collision with root package name */
    public String f74398n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f74399o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f74400p;

    public d(d0 pinalytics, w eventManager, h boardNavigator, String sourcePinId, String str, String boardName, String str2, String str3, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(sourcePinId, "sourcePinId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f74388d = sourcePinId;
        this.f74389e = str;
        this.f74390f = boardName;
        this.f74391g = str2;
        this.f74392h = z13;
        this.f74393i = eventManager;
        this.f74394j = pinalytics;
        this.f74395k = z14;
        this.f74396l = str3;
        this.f74397m = boardNavigator;
        HashMap hashMap = new HashMap();
        hashMap.put("board_id", str == null ? "" : str);
        String str4 = this.f74398n;
        hashMap.put("pin_id", str4 != null ? str4 : sourcePinId);
        this.f74400p = hashMap;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        spannableStringBuilder.append((CharSequence) (bs1.c.d2(context, x0.saved_to) + " "));
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f74390f);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Context context2 = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f0 h23 = bs1.c.h2(spannableStringBuilder);
        String str = this.f74391g;
        return new GestaltToast(context2, new do1.d(h23, str != null ? new j(str) : null, this.f74398n != null ? new do1.b(bs1.c.j2(new String[0], x0.edit_save_toast), new e0(this, 4)) : null, null, 0, 3000, 0, null, false, 472));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d(f1.TAP, null);
        String str = this.f74389e;
        if (str != null) {
            h.g(this.f74397m, str, null, c.f74385j, 2);
            return;
        }
        String str2 = this.f74396l;
        if (str2 != null) {
            this.f74393i.d(k.c(k.f106176a, str2, r41.b.PinnedToast, null, null, 28));
        }
    }

    public final void d(f1 eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        HashMap hashMap = this.f74400p;
        if (str != null) {
            hashMap.put("save_session_id", str);
        }
        if (this.f74395k) {
            d0.B(this.f74394j, eventType, null, this.f74389e, hashMap, 18);
        } else {
            String str2 = this.f74398n;
            g0 g0Var = g0.SAVING_REPIN_TOAST;
            this.f74394j.h0((r18 & 1) != 0 ? f1.TAP : eventType, (r18 & 2) != 0 ? null : u0.SAVING_REPIN_TOAST_VIEW, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str2, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }
}

package qs0;

import android.content.Context;
import android.content.res.Resources;
import bs1.c;
import com.pinterest.design.brio.widget.voice.toast.PinterestToastContainer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toast.GestaltToast;
import do1.d;
import do1.j;
import ep.b;
import h32.f1;
import h32.u0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import om0.m1;
import rg0.n;
import u50.f0;
import wp1.f;

/* loaded from: classes5.dex */
public final class a extends we0.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f105087d;

    /* renamed from: e, reason: collision with root package name */
    public final String f105088e;

    /* renamed from: f, reason: collision with root package name */
    public final String f105089f;

    /* renamed from: g, reason: collision with root package name */
    public final n f105090g;

    /* renamed from: h, reason: collision with root package name */
    public final d0 f105091h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f105092i;

    public a(String metric, String pinId, String imageUrl, String userId, n expValue, d0 pinalytics, m1 clickListener) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(expValue, "expValue");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f105087d = metric;
        this.f105088e = pinId;
        this.f105089f = imageUrl;
        this.f105090g = expValue;
        this.f105091h = pinalytics;
        this.f105092i = clickListener;
    }

    @Override // we0.a
    public final GestaltToast a(PinterestToastContainer container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Resources resources = container.getResources();
        String str = this.f105087d;
        f0 h23 = c.h2(((Object) resources.getText(Intrinsics.d(str, "clicks") ? f.creator_metrics_clicks_toast_message : Intrinsics.d(str, "impressions") ? f.creator_metrics_impression_toast_message : f.creator_metrics_saves_toast_message)) + "\n" + ((Object) container.getResources().getText(f.creator_metrics_toast_pin_stats)));
        f1 f1Var = f1.VIEW;
        u0 u0Var = u0.CREATOR_METRICS_TOAST;
        HashMap o13 = b.o("metric", str);
        o13.put("pin.id", this.f105088e);
        Unit unit = Unit.f80348a;
        this.f105091h.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : o13, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f105090g.g();
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new GestaltToast(context, new d(h23, new j(this.f105089f), null, null, 0, 10000, 0, null, true, RecyclerViewTypes.VIEW_TYPE_STORY_EDUCATION_BANNER));
    }

    @Override // we0.a
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.b(context);
        this.f105092i.invoke();
        f1 f1Var = f1.TAP;
        u0 u0Var = u0.CREATOR_METRICS_TOAST;
        HashMap hashMap = new HashMap();
        hashMap.put("metric", this.f105087d);
        hashMap.put("pin.id", this.f105088e);
        Unit unit = Unit.f80348a;
        this.f105091h.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        this.f105090g.a(null, null);
    }

    @Override // we0.a
    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.c(context);
        this.f105090g.c(null, null);
    }
}

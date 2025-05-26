package b11;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.component.modal.ModalViewWrapper;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import y01.p1;

/* loaded from: classes5.dex */
public final class b extends jc0.b implements nx.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20968a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d f20969b;

    /* renamed from: c, reason: collision with root package name */
    public final yk1.v f20970c;

    /* renamed from: d, reason: collision with root package name */
    public final i92.k f20971d;

    /* renamed from: e, reason: collision with root package name */
    public final c82.d f20972e;

    /* renamed from: f, reason: collision with root package name */
    public final nx.f0 f20973f;

    public b(String pinUid, tp.e flagLinkObserver, yk1.a viewResources, i92.k toastUtils, c82.d siteApi, nx.f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(flagLinkObserver, "flagLinkObserver");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(siteApi, "siteApi");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f20968a = pinUid;
        this.f20969b = flagLinkObserver;
        this.f20970c = viewResources;
        this.f20971d = toastUtils;
        this.f20972e = siteApi;
        this.f20973f = pinalyticsFactory;
    }

    public final void b(m60.w wVar, l0 l0Var) {
        String string = ((yk1.a) this.f20970c).f139224a.getString(x0.iab_rate_thanks_for_your_feedback);
        wVar.d(new jc0.q(true));
        this.f20971d.m(string);
        h32.u0 elementType = l0Var.f21065b;
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        nx.f0 pinalyticsFactory = this.f20973f;
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        HashMap hashMap = new HashMap();
        hashMap.put("source", "IAB_NEG_FEEDBACK");
        ((nx.m) pinalyticsFactory).a(this).h0((r18 & 1) != 0 ? f1.TAP : f1.PIN_LINK_REPORT, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : h32.g0.MODAL_REPORT_MENU, (r18 & 8) != 0 ? null : this.f20968a, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        c82.d dVar = this.f20972e;
        dVar.getClass();
        String pinUid = this.f20968a;
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        String reason = l0Var.f21066c;
        Intrinsics.checkNotNullParameter(reason, "reason");
        TreeMap treeMap = new TreeMap();
        treeMap.put("reason", reason);
        treeMap.put("source", "IAB_NEG_FEEDBACK");
        dVar.f26959a.c(pinUid, treeMap).l(tk2.e.f118017c).h(wj2.c.a()).j(this.f20969b);
    }

    @Override // jc0.b
    public final BaseModalViewWrapper createModalView(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        String string = context.getString(n80.f.web_feedback_dialog_broken);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(new l0(h32.u0.BROKEN, string, "broken-link"));
        String string2 = context.getString(n80.f.spam_misleading);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(new l0(h32.u0.NEG_LINK_FEEDBACK_SPAM, string2, "spam"));
        String string3 = context.getString(n80.f.link_hide_reason_low_quality);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        arrayList.add(new l0(h32.u0.NEG_LINK_FEEDBACK_LOW_QUALITY, string3, "low-quality"));
        String string4 = context.getString(n80.f.link_feedback_language);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        arrayList.add(new l0(h32.u0.NEG_LINK_FEEDBACK_REASON_NOT_MY_LANGUAGE, string4, "not-in-lang"));
        String string5 = context.getString(n80.f.community_reporting_other);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        arrayList.add(new l0(h32.u0.OTHER, string5, "other"));
        ModalViewWrapper modalViewWrapper = new ModalViewWrapper(context);
        modalViewWrapper.p(context.getString(n80.f.link_hide_title_why_hide));
        m60.w wVar = m60.u.f85943a;
        modalViewWrapper.j(new a(wVar, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
            gestaltText.i(new p1(l0Var, 1));
            gestaltText.setPaddingRelative(context.getResources().getDimensionPixelSize(m60.r0.margin), gestaltText.getPaddingTop(), gestaltText.getPaddingEnd(), context.getResources().getDimensionPixelSize(m60.r0.margin_half));
            gestaltText.j(new zu0.f(this, f0Var, context, wVar, l0Var, 1));
            linearLayout.addView(gestaltText);
        }
        modalViewWrapper.addView(linearLayout);
        return modalViewWrapper;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.BROWSER, null, null, null, null, null);
    }
}

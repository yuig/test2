package y51;

import android.content.Context;
import android.view.KeyEvent;
import com.pinterest.api.model.tg0;
import com.pinterest.feature.scheduledpins.view.ScheduledPinDateTabView;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import com.pinterest.gestalt.text.GestaltText;
import dl1.s;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kh2.s0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nr0.m;
import pk.a0;
import so.n6;
import uk1.d;
import ve.h;
import wk1.i;
import wk1.n;
import z51.e;
import z51.f;
import z51.g;

/* loaded from: classes5.dex */
public final class c extends n implements f, x51.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f137771a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f137772b;

    /* renamed from: c, reason: collision with root package name */
    public final b f137773c;

    /* renamed from: d, reason: collision with root package name */
    public final x51.b f137774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wk1.c params, m dynamicGridViewBinderDelegateFactory, w eventManager) {
        super(params);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(dynamicGridViewBinderDelegateFactory, "dynamicGridViewBinderDelegateFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f137771a = eventManager;
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 31; i13++) {
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            arrayList.add(time);
            calendar.add(5, 1);
        }
        this.f137772b = arrayList;
        this.f137773c = new b(this);
        Date date = (Date) CollectionsKt.firstOrNull(arrayList);
        date = date == null ? new Date() : date;
        Date date2 = (Date) CollectionsKt.d0(arrayList);
        date2 = date2 == null ? new Date() : date2;
        d presenterPinalytics = getPresenterPinalytics();
        qa2.n nVar = params.f130131b;
        this.f137774d = new x51.b(date, date2, this, ((n6) dynamicGridViewBinderDelegateFactory).a(presenterPinalytics, nVar.f103320a, nVar, params.f130137h));
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f137774d);
    }

    @Override // wk1.n, wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f137771a.j(this.f137773c);
        ((e) ((g) getView())).X0 = null;
        super.onUnbind();
    }

    public final int u3(Date date) {
        int i13 = 0;
        for (s sVar : this.f137774d.d()) {
            if ((sVar instanceof tg0) && h.g((tg0) sVar, date)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public final int v3(Date date) {
        Iterator it = this.f137772b.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (s0.D0((Date) it.next(), date)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    @Override // wk1.n, wk1.q, yk1.p
    /* renamed from: w3, reason: merged with bridge method [inline-methods] */
    public final void r3(g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((nr0.e) view);
        e eVar = (e) view;
        eVar.X0 = this;
        ArrayList dates = this.f137772b;
        Intrinsics.checkNotNullParameter(dates, "dates");
        GestaltTabLayout gestaltTabLayout = eVar.R0;
        if (gestaltTabLayout == null) {
            Intrinsics.r("tabLayout");
            throw null;
        }
        ArrayList arrayList = new ArrayList(g0.q(dates, 10));
        Iterator it = dates.iterator();
        while (it.hasNext()) {
            Date date = (Date) it.next();
            GestaltTabLayout gestaltTabLayout2 = eVar.R0;
            if (gestaltTabLayout2 == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ek.e p13 = gestaltTabLayout2.p();
            Intrinsics.checkNotNullExpressionValue(p13, "newTab(...)");
            Context requireContext = eVar.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ScheduledPinDateTabView scheduledPinDateTabView = new ScheduledPinDateTabView(requireContext);
            scheduledPinDateTabView.L(date);
            p13.f59129f = scheduledPinDateTabView;
            p13.c();
            arrayList.add(p13);
        }
        gestaltTabLayout.E(0, arrayList);
        this.f137771a.h(this.f137773c);
    }

    public final void x3(Date date) {
        int v33;
        Intrinsics.checkNotNullParameter(date, "date");
        if (isBound() && (v33 = v3(date)) >= 0) {
            GestaltTabLayout gestaltTabLayout = ((e) ((g) getView())).R0;
            if (gestaltTabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            ek.e n13 = gestaltTabLayout.n(v33);
            KeyEvent.Callback callback = n13 != null ? n13.f59129f : null;
            ScheduledPinDateTabView scheduledPinDateTabView = callback instanceof ScheduledPinDateTabView ? (ScheduledPinDateTabView) callback : null;
            if (scheduledPinDateTabView != null) {
                scheduledPinDateTabView.T(true);
            }
        }
    }

    public final void z3(int i13, int i14) {
        g gVar = (g) getView();
        ArrayList arrayList = this.f137772b;
        Date startDate = (Date) arrayList.get(i13);
        Date endDate = (Date) arrayList.get(i14);
        e eVar = (e) gVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        boolean E0 = s0.E0(startDate, endDate);
        SimpleDateFormat simpleDateFormat = e.f140868a1;
        if (E0) {
            GestaltText gestaltText = eVar.Q0;
            if (gestaltText == null) {
                Intrinsics.r("tabHeader");
                throw null;
            }
            String format = simpleDateFormat.format(startDate);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            a0.p(gestaltText, format);
            return;
        }
        GestaltText gestaltText2 = eVar.Q0;
        if (gestaltText2 == null) {
            Intrinsics.r("tabHeader");
            throw null;
        }
        String string = eVar.getString(q22.c.scheduled_pin_feed_header_month_range, simpleDateFormat.format(startDate), simpleDateFormat.format(endDate));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(gestaltText2, string);
    }
}

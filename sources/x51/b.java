package x51;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.tg0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.scheduledpins.view.ScheduledPinDateTabView;
import com.pinterest.framework.multisection.datasource.pagedlist.c;
import com.pinterest.framework.multisection.datasource.pagedlist.k0;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import dl1.s;
import ig1.b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kh2.s0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import nr0.l;
import qz.f0;
import so.oa;
import ve.h;
import z51.e;
import z51.g;

/* loaded from: classes5.dex */
public final class b extends c {
    public final Date L;
    public final Date M;
    public final a N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Date scheduleStartDate, Date scheduleEndDate, a loadingListener, l viewBinderDelegate) {
        super("users/me/scheduledpins/", viewBinderDelegate, null, null, null, new ke0.a[]{(ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).Lc.get()}, new lk1.a() { // from class: com.pinterest.feature.scheduledpins.datasource.ScheduledPinFeedPagedList$1

            /* renamed from: a, reason: collision with root package name */
            public final Date f47591a = new Date();

            @Override // lk1.a
            public final boolean b(s model) {
                Intrinsics.checkNotNullParameter(model, "model");
                return (model instanceof kg0) && b.X0((kg0) model).before(this.f47591a);
            }
        }, null, null, 0L, null, 8092);
        Intrinsics.checkNotNullParameter(scheduleStartDate, "scheduleStartDate");
        Intrinsics.checkNotNullParameter(scheduleEndDate, "scheduleEndDate");
        Intrinsics.checkNotNullParameter(loadingListener, "loadingListener");
        Intrinsics.checkNotNullParameter(viewBinderDelegate, "viewBinderDelegate");
        Context context = kb0.a.f79058b;
        this.L = scheduleStartDate;
        this.M = scheduleEndDate;
        this.N = loadingListener;
        f0 f0Var = new f0();
        f0Var.e("fields", n00.b.a(n00.c.SCHEDULED_PIN_FEED));
        f0Var.e("page_size", "100");
        this.f49121k = f0Var;
        o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL, new sz0.a(14));
        o(RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER, new sz0.a(15));
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void X(String modelId) {
        Object obj;
        int v33;
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        List d2 = d();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : d2) {
            if (obj2 instanceof kg0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.d(((kg0) obj).getUid(), modelId)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        kg0 kg0Var = (kg0) obj;
        if (kg0Var != null) {
            Date date = ig1.b.X0(kg0Var);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kg0 kg0Var2 = (kg0) it2.next();
                    if (!Intrinsics.d(kg0Var2.getUid(), modelId) && s0.D0(ig1.b.X0(kg0Var2), date)) {
                        break;
                    }
                }
            }
            Iterator it3 = d().iterator();
            int i13 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i13 = -1;
                    break;
                }
                s sVar = (s) it3.next();
                if ((sVar instanceof tg0) && h.g((tg0) sVar, date)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (i13 >= 0) {
                Object obj3 = d().get(i13);
                Intrinsics.g(obj3, "null cannot be cast to non-null type com.pinterest.api.model.ScheduledPinSectionHeader");
                u1(i13, tg0.a((tg0) obj3, null, null, true, 27));
                y51.c cVar = (y51.c) this.N;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                if (cVar.isBound() && (v33 = cVar.v3(date)) >= 0) {
                    GestaltTabLayout gestaltTabLayout = ((e) ((g) cVar.getView())).R0;
                    if (gestaltTabLayout == null) {
                        Intrinsics.r("tabLayout");
                        throw null;
                    }
                    ek.e n13 = gestaltTabLayout.n(v33);
                    KeyEvent.Callback callback = n13 != null ? n13.f59129f : null;
                    ScheduledPinDateTabView scheduledPinDateTabView = callback instanceof ScheduledPinDateTabView ? (ScheduledPinDateTabView) callback : null;
                    if (scheduledPinDateTabView != null) {
                        scheduledPinDateTabView.T(false);
                    }
                }
            }
        }
        super.X(modelId);
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void b0(List itemsToSet, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToSet, "itemsToSet");
        y51.c cVar = (y51.c) this.N;
        if (cVar.isBound()) {
            ((e) ((g) cVar.getView())).j9(false);
            e eVar = (e) ((g) cVar.getView());
            GestaltTabLayout gestaltTabLayout = eVar.R0;
            if (gestaltTabLayout == null) {
                Intrinsics.r("tabLayout");
                throw null;
            }
            int size = gestaltTabLayout.f33126b.size();
            for (int i13 = 0; i13 < size; i13++) {
                GestaltTabLayout gestaltTabLayout2 = eVar.R0;
                if (gestaltTabLayout2 == null) {
                    Intrinsics.r("tabLayout");
                    throw null;
                }
                ek.e n13 = gestaltTabLayout2.n(i13);
                View view = n13 != null ? n13.f59129f : null;
                ScheduledPinDateTabView scheduledPinDateTabView = view instanceof ScheduledPinDateTabView ? (ScheduledPinDateTabView) view : null;
                if (scheduledPinDateTabView != null) {
                    scheduledPinDateTabView.T(false);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemsToSet) {
            if (obj instanceof kg0) {
                arrayList.add(obj);
            }
        }
        kg0 kg0Var = (kg0) CollectionsKt.firstOrNull(arrayList);
        if (kg0Var == null) {
            super.b0(itemsToSet, z13);
            return;
        }
        Date X0 = ig1.b.X0(kg0Var);
        ArrayList arrayList2 = new ArrayList();
        Date date = this.L;
        if (X0.after(date) && !s0.D0(X0, date)) {
            arrayList2.add(new tg0(this.L, s0.J(X0), true, null, false, 24, null));
        }
        f0(arrayList2, X0);
        arrayList2.addAll(g0(arrayList, X0));
        super.b0(arrayList2, z13);
        i0();
    }

    public final void f0(ArrayList arrayList, Date date) {
        arrayList.add(new tg0(date, null, false, null, false, 30, null));
        ((y51.c) this.N).x3(date);
    }

    public final ArrayList g0(ArrayList arrayList, Date date) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Date otherDate = date;
        while (it.hasNext()) {
            kg0 kg0Var = (kg0) it.next();
            Date X0 = ig1.b.X0(kg0Var);
            if (!s0.D0(X0, otherDate)) {
                Intrinsics.checkNotNullParameter(X0, "<this>");
                Intrinsics.checkNotNullParameter(otherDate, "otherDate");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(X0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(otherDate);
                calendar2.add(5, 1);
                if (calendar.get(6) != calendar2.get(6) || calendar.get(1) != calendar2.get(1)) {
                    arrayList2.add(new tg0(s0.I(otherDate), s0.J(X0), true, null, arrayList.size() == 100, 8, null));
                }
                f0(arrayList2, X0);
                otherDate = X0;
            }
            arrayList2.add(kg0Var);
        }
        if (!h0()) {
            Date date2 = this.M;
            if (otherDate.before(date2) && !s0.D0(otherDate, date2)) {
                arrayList2.add(new tg0(s0.I(otherDate), this.M, true, null, false, 24, null));
            }
        }
        return arrayList2;
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.c, sq0.e0
    public final int getItemViewType(int i13) {
        s item = getItem(i13);
        if (item instanceof kg0) {
            return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_CELL;
        }
        if (item instanceof tg0) {
            return RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER;
        }
        return -1;
    }

    public final boolean h0() {
        r rVar = this.f49128r;
        k0 k0Var = rVar instanceof k0 ? (k0) rVar : null;
        String str = k0Var != null ? k0Var.f49144f : null;
        return true ^ (str == null || str.length() == 0);
    }

    public final void i0() {
        if (h0()) {
            j1();
            return;
        }
        y51.c cVar = (y51.c) this.N;
        if (cVar.isBound()) {
            ((e) ((g) cVar.getView())).j9(true);
        }
    }

    @Override // com.pinterest.framework.multisection.datasource.pagedlist.h0
    public final void w(List itemsToAppend, boolean z13) {
        Intrinsics.checkNotNullParameter(itemsToAppend, "itemsToAppend");
        ArrayList arrayList = new ArrayList();
        for (Object obj : itemsToAppend) {
            if (obj instanceof kg0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        List d2 = d();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : d2) {
            if (obj2 instanceof tg0) {
                arrayList3.add(obj2);
            }
        }
        tg0 tg0Var = (tg0) CollectionsKt.d0(arrayList3);
        Date date = tg0Var != null ? tg0Var.f42207a : null;
        if (date == null) {
            kg0 kg0Var = (kg0) CollectionsKt.firstOrNull(arrayList);
            if (kg0Var == null) {
                super.w(itemsToAppend, z13);
                return;
            } else {
                date = ig1.b.X0(kg0Var);
                f0(arrayList2, date);
            }
        }
        arrayList2.addAll(g0(arrayList, date));
        super.w(arrayList2, z13);
        i0();
    }
}

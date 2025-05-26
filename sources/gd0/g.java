package gd0;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import jk2.j1;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import mu0.j;
import nx.d0;
import ra0.l0;
import t3.s1;
import uj2.q;
import wr0.l;
import yk1.v;

/* loaded from: classes5.dex */
public final class g extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f64816k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f64817l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f64818m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f64819n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f64820o;

    /* renamed from: p, reason: collision with root package name */
    public final Serializable f64821p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f64822q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f64823r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b60.b activeUserManager, d20.a analyticsService, id0.a seeMoreAction, id0.b logModuleViewAction) {
        super(null);
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(seeMoreAction, "seeMoreAction");
        Intrinsics.checkNotNullParameter(logModuleViewAction, "logModuleViewAction");
        this.f64817l = activeUserManager;
        this.f64818m = analyticsService;
        this.f64819n = seeMoreAction;
        this.f64820o = logModuleViewAction;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f64821p = simpleDateFormat;
        String uid = com.bumptech.glide.d.Q(activeUserManager).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f64822q = new a(uid, v(-30), v(0), x(-30, true), x(0, false));
        this.f64823r = com.bumptech.glide.d.Q(activeUserManager);
        o(2, new ep.c(24));
    }

    public static fd0.e w(double d2) {
        double d13 = d2 * 100;
        return new fd0.e(ml2.c.b(d13) + "%", d13 >= 0.01d ? fd0.d.Positive : d13 <= -0.01d ? fd0.d.Negative : fd0.d.Neutral);
    }

    public static String x(int i13, boolean z13) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.add(5, i13);
        if (z13) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        }
        return String.valueOf(calendar.getTimeInMillis() / 1000);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f64816k) {
            case 0:
                return 2;
            default:
                return 0;
        }
    }

    @Override // xk1.c
    public final q k() {
        switch (this.f64816k) {
            case 0:
                d20.a aVar = (d20.a) this.f64818m;
                a aVar2 = (a) this.f64822q;
                String str = aVar2.f64796a;
                Boolean bool = Boolean.TRUE;
                q u13 = aVar.e(str, aVar2.f64797b, aVar2.f64798c, "IMPRESSION,TOTAL_AUDIENCE,ENGAGERS", aVar2.f64799d, "0", aVar2.f64800e, aVar2.f64801f, bool, Boolean.FALSE, bool, bool, null, null, null, null, null, null).u();
                Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
                return s1.f(new j1(u13, new lb0.c(6, new l0(this, 21)), 0).H(tk2.e.f118017c), "observeOn(...)");
            default:
                q u14 = ((de0.d) this.f64820o).c((String) this.f64821p).r(tk2.e.f118017c).l(wj2.c.a()).k(new l(20, new au0.f(this, 5))).u();
                Intrinsics.checkNotNullExpressionValue(u14, "toObservable(...)");
                return u14;
        }
    }

    public final String v(int i13) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.f64821p;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i13);
        String format = simpleDateFormat.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final int z() {
        List F0 = CollectionsKt.F0(this.f135191h);
        int i13 = 0;
        if (!(F0 instanceof Collection) || !F0.isEmpty()) {
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                if (((ku0.a) it.next()).f80889b && (i13 = i13 + 1) < 0) {
                    f0.o();
                    throw null;
                }
            }
        }
        return i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j previewInteractionListener, d0 pinalytics, pb0.d dateFormatter, de0.d draftDataProvider, String userId, lh0.s1 experiments, v viewResources) {
        super(null);
        Intrinsics.checkNotNullParameter(previewInteractionListener, "previewInteractionListener");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        this.f64817l = previewInteractionListener;
        this.f64818m = pinalytics;
        this.f64819n = dateFormatter;
        this.f64820o = draftDataProvider;
        this.f64821p = userId;
        this.f64822q = experiments;
        this.f64823r = viewResources;
        o(0, new nu0.f(experiments, 0));
    }
}

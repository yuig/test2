package kf1;

import android.content.Context;
import de0.d;
import ja.f0;
import ja.j0;
import java.util.Calendar;
import java.util.TimeZone;
import k1.p;
import kk2.k;
import kk2.m;
import kk2.t;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import tb0.h;
import tk2.e;
import uj2.a0;
import we1.n1;
import xd0.c;
import xd0.f;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f79349a;

    /* renamed from: b, reason: collision with root package name */
    public final h f79350b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f79351c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f79352d;

    /* renamed from: e, reason: collision with root package name */
    public final fe0.b f79353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f79354f;

    /* renamed from: g, reason: collision with root package name */
    public xj2.b f79355g;

    public b(d draftDataProvider, h crashReporting, Context context, d0 pinalytics, fe0.b networkSpeedDataProvider) {
        Intrinsics.checkNotNullParameter(draftDataProvider, "draftDataProvider");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        this.f79349a = draftDataProvider;
        this.f79350b = crashReporting;
        this.f79351c = context;
        this.f79352d = pinalytics;
        this.f79353e = networkSpeedDataProvider;
        this.f79355g = new xj2.b();
    }

    public final void a() {
        if (this.f79354f) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f79354f = true;
        xj2.b bVar = this.f79355g;
        fe0.b bVar2 = this.f79353e;
        bVar2.getClass();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        calendar.add(2, -1);
        k kVar = new k(new fe0.a(bVar2, calendar.getTimeInMillis(), 0), 1);
        a0 a0Var = e.f118017c;
        t r13 = kVar.r(a0Var);
        Intrinsics.checkNotNullExpressionValue(r13, "subscribeOn(...)");
        bVar.a(r13.r(a0Var).l(a0Var).o(new vd1.a(12, a.f79346j), new vd1.a(13, a.f79347k)));
        xj2.b bVar3 = this.f79355g;
        f fVar = this.f79349a.f54556a;
        fVar.getClass();
        m k13 = j0.b(new c(fVar, f0.d(0, "SELECT * from idea_pin_drafts"), 4)).k(new lb0.c(12, de0.c.f54554k));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        bVar3.a(k13.r(a0Var).l(a0Var).o(new vd1.a(14, new p(this, currentTimeMillis, 7)), new vd1.a(15, new n1(this, 6))));
    }

    public final void b() {
        if (!this.f79355g.f135163b) {
            this.f79355g.dispose();
            this.f79355g = new xj2.b();
        }
        this.f79354f = false;
    }
}

package ac2;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.k4;
import lh0.z3;
import so.na;

/* loaded from: classes2.dex */
public final class s implements g7.r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2042a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2043b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.e f2044c;

    /* renamed from: d, reason: collision with root package name */
    public final se2.a f2045d;

    /* renamed from: e, reason: collision with root package name */
    public final se2.a f2046e;

    /* renamed from: f, reason: collision with root package name */
    public final wk2.a f2047f;

    /* renamed from: g, reason: collision with root package name */
    public final lb0.q f2048g;

    /* renamed from: h, reason: collision with root package name */
    public final tb.l f2049h;

    /* renamed from: i, reason: collision with root package name */
    public final k4 f2050i;

    /* renamed from: j, reason: collision with root package name */
    public final g7.s f2051j;

    /* renamed from: k, reason: collision with root package name */
    public gc2.c f2052k;

    public s(Context context, i cronetEngineOwner, l8.e bandwidthMeter, se2.a okHttpDataSourceFactory, se2.a networkClientDataSourceFactory, na networkMetricsTransferListenerProvider, lb0.q prefsManagerPersisted, tb.l telemetryPreferences, k4 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cronetEngineOwner, "cronetEngineOwner");
        Intrinsics.checkNotNullParameter(bandwidthMeter, "bandwidthMeter");
        Intrinsics.checkNotNullParameter(okHttpDataSourceFactory, "okHttpDataSourceFactory");
        Intrinsics.checkNotNullParameter(networkClientDataSourceFactory, "networkClientDataSourceFactory");
        Intrinsics.checkNotNullParameter(networkMetricsTransferListenerProvider, "networkMetricsTransferListenerProvider");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(telemetryPreferences, "telemetryPreferences");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f2042a = context;
        this.f2043b = cronetEngineOwner;
        this.f2044c = bandwidthMeter;
        this.f2045d = okHttpDataSourceFactory;
        this.f2046e = networkClientDataSourceFactory;
        this.f2047f = networkMetricsTransferListenerProvider;
        this.f2048g = prefsManagerPersisted;
        this.f2049h = telemetryPreferences;
        this.f2050i = experiments;
        g7.s sVar = new g7.s(0);
        this.f2051j = sVar;
        this.f2052k = new gc2.c(prefsManagerPersisted);
        sVar.a((Map) w.f2069d.getValue());
    }

    @Override // g7.e
    public final g7.f a() {
        g7.f c13;
        vb0.j.f125466a.O("createDataSource", tb0.p.VIDEO_PLAYER);
        g a13 = this.f2043b.a();
        if (a13 == null) {
            c13 = b();
        } else {
            k4 k4Var = this.f2050i;
            k4Var.getClass();
            z3 z3Var = a4.f83297a;
            lh0.g1 g1Var = (lh0.g1) k4Var.f83410a;
            if (g1Var.o("android_cronet_client_for_videos", "enabled", z3Var) || g1Var.l("android_cronet_client_for_videos")) {
                c13 = c();
            } else {
                v vVar = w.f2066a;
                String a14 = w.a(this.f2042a);
                g7.f rVar = new r(this.f2051j, a13.f1954a, a13.f1955b, a14);
                if (this.f2049h.w()) {
                    rVar.f((cy.g) this.f2047f.get());
                }
                c13 = rVar;
            }
        }
        c13.f(this.f2044c.c());
        c13.f(this.f2052k);
        return c13;
    }

    public final j7.c b() {
        bf2.b bVar = (bf2.b) this.f2045d;
        ((u) bVar.get()).c(this.f2051j.b());
        j7.c a13 = ((u) bVar.get()).a();
        Intrinsics.checkNotNullExpressionValue(a13, "createDataSource(...)");
        return a13;
    }

    public final j7.c c() {
        bf2.b bVar = (bf2.b) this.f2046e;
        ((t) bVar.get()).c(this.f2051j.b());
        j7.c a13 = ((t) bVar.get()).a();
        Intrinsics.checkNotNullExpressionValue(a13, "createDataSource(...)");
        return a13;
    }

    public final void d() {
        Map defaultRequestProperties = (Map) w.f2069d.getValue();
        Intrinsics.checkNotNullParameter(defaultRequestProperties, "defaultRequestProperties");
        this.f2051j.a(defaultRequestProperties);
        this.f2052k.getClass();
        this.f2052k = new gc2.c(this.f2048g);
    }
}

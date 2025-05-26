package fg2;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w1.d;
import wf2.c;
import xk2.q;
import xk2.s;

/* loaded from: classes4.dex */
public final class b extends uf2.b implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final Application f62129d;

    /* renamed from: e, reason: collision with root package name */
    public final og2.a f62130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Application application, og2.a clock, ei2.a sessionSpanWriter, lh2.b logger) {
        super(sessionSpanWriter, logger, new c(a.f62128i));
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionSpanWriter, "sessionSpanWriter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f62129d = application;
        this.f62130e = clock;
    }

    @Override // uf2.b, uf2.a
    public final void a() {
        try {
            q qVar = s.f135225b;
            this.f62129d.getApplicationContext().unregisterComponentCallbacks(this);
            Unit unit = Unit.f80348a;
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            ue.c.m(th3);
        }
    }

    @Override // uf2.b, uf2.a
    public final void c() {
        this.f62129d.getApplicationContext().registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        int i14 = 10;
        if (i13 == 10) {
            try {
                q qVar = s.f135225b;
                e(uf2.c.f122114k, new d(this.f62130e.now(), i14));
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                q qVar2 = s.f135225b;
                ue.c.m(th3);
            }
        }
    }
}

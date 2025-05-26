package nf1;

import bz.i;
import h32.g0;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f90482a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f90483b;

    /* renamed from: c, reason: collision with root package name */
    public final i f90484c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f90485d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f90486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90487f;

    /* renamed from: g, reason: collision with root package name */
    public String f90488g;

    public a(d0 pinalytics, i0 i0Var, i timeSpentLoggingManager) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        this.f90482a = pinalytics;
        this.f90483b = i0Var;
        this.f90484c = timeSpentLoggingManager;
    }

    public final void a() {
        if (this.f90487f) {
            Unit unit = null;
            if (this.f90488g != null) {
                b(g0.PIN_STORY_PIN_PAGE);
                this.f90488g = null;
                unit = Unit.f80348a;
            }
            if (unit == null) {
                b(g0.PIN_STORY_PIN_OOPS_PAGE);
            }
            this.f90487f = false;
        }
    }

    public final void b(g0 g0Var) {
        i0 source = this.f90483b;
        if (source == null) {
            source = this.f90482a.p();
        }
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f90484c.h(new i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, source.f67086f));
        }
    }

    public final void c(g0 g0Var) {
        i0 source = this.f90483b;
        if (source == null) {
            source = this.f90482a.p();
        }
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f90484c.d(new i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, source.f67086f));
        }
    }

    public final void d(g0 g0Var, HashMap hashMap, String str) {
        i0 source = this.f90483b;
        if (source == null) {
            source = this.f90482a.p();
        }
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f90484c.e(new i0(source.f67081a, source.f67082b, source.f67083c, g0Var, source.f67085e, source.f67086f), hashMap, str);
        }
    }
}

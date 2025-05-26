package i01;

import com.pinterest.api.model.f30;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f70678a;

    /* renamed from: b, reason: collision with root package name */
    public final bz.i f70679b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.b0 f70680c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70682e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f70683f;

    public n0(nx.d0 pinalytics, bz.i timeSpentLoggingManager, nx.b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(timeSpentLoggingManager, "timeSpentLoggingManager");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f70678a = pinalytics;
        this.f70679b = timeSpentLoggingManager;
        this.f70680c = pinAuxHelper;
        this.f70683f = m0.Deactivated;
    }

    public final void a() {
        if (this.f70681d) {
            h32.i0 source = this.f70678a.p();
            if (source != null) {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f70679b.h(new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.PIN_CLOSEUP_BODY, source.f67085e, source.f67086f));
            }
            this.f70681d = false;
        }
    }

    public final void b() {
        if (this.f70682e) {
            h32.i0 source = this.f70678a.p();
            if (source != null) {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f70679b.h(new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.PIN_CLOSEUP_RELATED_PINS, source.f67085e, source.f67086f));
            }
            this.f70682e = false;
        }
    }

    public final void c() {
        this.f70683f = m0.Activated;
    }

    public final void d() {
        a();
        b();
        this.f70683f = m0.Deactivated;
    }

    public final void e(f30 f30Var, String str) {
        if (this.f70681d || this.f70683f == m0.Deactivated) {
            return;
        }
        h32.i0 source = this.f70678a.p();
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            h32.i0 i0Var = new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.PIN_CLOSEUP_BODY, source.f67085e, source.f67086f);
            HashMap hashMap = new HashMap();
            if (f30Var != null) {
                this.f70680c.c(f30Var, hashMap);
            }
            this.f70679b.e(i0Var, hashMap, str);
        }
        this.f70681d = true;
    }

    public final void f(f30 f30Var) {
        if (this.f70682e || this.f70683f == m0.Deactivated) {
            return;
        }
        h32.i0 source = this.f70678a.p();
        if (source != null) {
            HashMap hashMap = new HashMap();
            if (f30Var != null) {
                this.f70680c.c(f30Var, hashMap);
            }
            Intrinsics.checkNotNullParameter(source, "source");
            h32.i0 i0Var = new h32.i0(source.f67081a, source.f67082b, source.f67083c, h32.g0.PIN_CLOSEUP_RELATED_PINS, source.f67085e, source.f67086f);
            int i13 = bz.i.f24182g;
            this.f70679b.e(i0Var, hashMap, null);
        }
        this.f70682e = true;
    }
}

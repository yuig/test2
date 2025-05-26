package ry;

import android.os.SystemClock;
import ey.e2;
import ey.f2;
import ey.k3;
import ey.l2;
import ey.o1;
import ey.u1;
import ey.v1;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import s92.l;
import s92.o;

/* loaded from: classes.dex */
public final class k extends v1 {

    /* renamed from: j, reason: collision with root package name */
    public static final Set f110213j = h1.f(h.class, g.class, c.class, d.class, e.class, b.class, a.class, f.class, e2.class, f2.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public final d4 f110214f;

    /* renamed from: g, reason: collision with root package name */
    public a4 f110215g;

    /* renamed from: h, reason: collision with root package name */
    public long f110216h;

    /* renamed from: i, reason: collision with root package name */
    public j f110217i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k3 perfLogger) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        this.f110214f = d4.PIN;
        this.f110217i = j.STATE_INIT;
    }

    public final void A(long j13) {
        if (this.f110217i == j.STATE_LOADING_STARTED) {
            o1 o1Var = this.f60594b;
            if (o1Var == null || !o1Var.a().f85171j) {
                q(j13);
            } else {
                n();
            }
            this.f110217i = j.STATE_LOADING_INDICATOR_SHOWING;
        }
    }

    public final void B() {
        this.f110215g = null;
        this.f110217i = j.STATE_INIT;
        this.f110216h = 0L;
    }

    @Override // ey.v1
    public final Set b() {
        return f110213j;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof h) {
            z(((h) e13).l());
            return true;
        }
        if (e13 instanceof g) {
            A(e13.c());
            return true;
        }
        if (e13 instanceof f) {
            x();
            return true;
        }
        if (e13 instanceof c) {
            v((c) e13);
            return true;
        }
        if (e13 instanceof d) {
            w(e13.c());
            return true;
        }
        if (e13 instanceof e) {
            y(e13.c());
            return true;
        }
        if (e13 instanceof b) {
            this.f110216h = SystemClock.elapsedRealtime();
            return true;
        }
        if (e13 instanceof a) {
            q(SystemClock.elapsedRealtime() - this.f110216h);
            r(e13.c());
            return true;
        }
        if (e13 instanceof e2) {
            q(e13.c());
            return true;
        }
        if (!(e13 instanceof f2)) {
            return true;
        }
        r(e13.c());
        return true;
    }

    public final void v(c cVar) {
        if (d()) {
            j jVar = this.f110217i;
            if (jVar == j.STATE_LOADING_INDICATOR_SHOWING || jVar == j.STATE_LOADING_STARTED) {
                boolean z13 = !cVar.f110208d;
                if (jVar == j.STATE_LOADING_STARTED && !z13) {
                    vb0.j.f125466a.S(true, "something is wrong, completing from STATE_LOADING_STARTED, loadingIndicatorIsOffscreen should be true!", new Object[0]);
                    return;
                }
                String str = cVar.f110209e;
                if (str != null && !z.j(str)) {
                    j("story_types_loaded", str);
                }
                String str2 = cVar.f110210f;
                if (str2 != null && !z.j(str2)) {
                    j("closeup_pin_id", str2);
                }
                a4 a4Var = this.f110215g;
                if (a4Var != null) {
                    j("view_param_type", a4Var.toString());
                }
                if (z13) {
                    q(0L);
                }
                a(o.COMPLETE, l.USER_NAVIGATION, this.f110214f, this.f110215g, cVar.c(), z13);
                B();
            }
        }
    }

    public final void w(long j13) {
        if (d()) {
            j jVar = this.f110217i;
            if (jVar == j.STATE_LOADING_STARTED) {
                q(0L);
                a(o.ERROR, l.USER_NAVIGATION, this.f110214f, this.f110215g, 0L, false);
                B();
                return;
            }
            if (jVar == j.STATE_LOADING_INDICATOR_SHOWING) {
                a(o.ERROR, l.USER_NAVIGATION, this.f110214f, this.f110215g, j13, false);
                B();
            }
        }
    }

    public final void x() {
        if (this.f110217i == j.STATE_LOADING_INDICATOR_SHOWING) {
            g();
            this.f110217i = j.STATE_LOADING_STARTED;
        }
    }

    public final void y(long j13) {
        j jVar = this.f110217i;
        if (jVar == j.STATE_LOADING_STARTED) {
            q(0L);
            a(o.ABORTED, l.USER_NAVIGATION, this.f110214f, this.f110215g, 0L, false);
            B();
            return;
        }
        if (jVar == j.STATE_LOADING_INDICATOR_SHOWING) {
            a(o.ABORTED, l.USER_NAVIGATION, this.f110214f, this.f110215g, j13, false);
            B();
        }
    }

    public final void z(a4 a4Var) {
        if (this.f110217i == j.STATE_INIT) {
            this.f110215g = a4Var;
            this.f110217i = j.STATE_LOADING_STARTED;
        }
    }
}

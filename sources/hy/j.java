package hy;

import android.os.SystemClock;
import ey.e2;
import ey.f2;
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
import s92.o;

/* loaded from: classes.dex */
public final class j extends v1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Set f70567k = h1.f(f.class, g.class, b.class, c.class, d.class, e.class, a.class, m.class, l.class, k.class, e2.class, f2.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public d4 f70568f;

    /* renamed from: g, reason: collision with root package name */
    public a4 f70569g;

    /* renamed from: h, reason: collision with root package name */
    public long f70570h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f70571i;

    /* renamed from: j, reason: collision with root package name */
    public i f70572j;

    public final void A() {
        this.f70568f = null;
        this.f70569g = null;
        this.f70572j = i.STATE_INIT;
        this.f70571i = false;
    }

    @Override // ey.v1
    public final Set b() {
        return f70567k;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        i iVar;
        Intrinsics.checkNotNullParameter(e13, "e");
        if (!super.o(e13)) {
            return false;
        }
        if (e13 instanceof f) {
            f fVar = (f) e13;
            d4 d4Var = this.f70568f;
            d4 d4Var2 = fVar.f70563d;
            if (d4Var != null && d4Var != d4Var2) {
                A();
            }
            d4 d4Var3 = d4.FEED;
            a4 a4Var = fVar.f70564e;
            if (((d4Var2 == d4Var3 && a4Var == a4.FEED_HOME) || d4Var2 == d4.PIN || d4Var2 == d4.SEARCH) && this.f70572j == i.STATE_INIT) {
                this.f70568f = d4Var2;
                this.f70569g = a4Var;
                this.f70571i = fVar.f70565f;
                this.f70572j = i.STATE_LOADING_STARTED;
            }
        } else if (e13 instanceof g) {
            z(e13.c());
        } else if (e13 instanceof b) {
            b bVar = (b) e13;
            d4 d4Var4 = bVar.f70558d;
            if (d4Var4 != null && d4Var4 == this.f70568f && ((iVar = this.f70572j) == i.STATE_SPINNER_SHOWING || iVar == i.STATE_LOADING_STARTED)) {
                boolean z13 = !bVar.f70559e;
                if (iVar != i.STATE_LOADING_STARTED || z13) {
                    h(bVar.f70560f, "slotindex");
                    d4 d4Var5 = this.f70568f;
                    Intrinsics.f(d4Var5);
                    j("view_type", d4Var5.toString());
                    if (this.f70568f == d4.PIN) {
                        String m13 = bVar.m();
                        if (m13 != null && !z.j(m13)) {
                            j("story_types_loaded", bVar.m());
                        }
                        String l13 = bVar.l();
                        if (l13 != null && !z.j(l13)) {
                            j("feed_source_object_id", bVar.l());
                        }
                    }
                    a4 a4Var2 = this.f70569g;
                    if (a4Var2 != null) {
                        j("view_param_type", a4Var2.toString());
                    }
                    if (z13) {
                        q(0L);
                    }
                    a(o.COMPLETE, v(), this.f70568f, this.f70569g, bVar.c(), z13);
                    A();
                } else {
                    vb0.j.f125466a.S(true, "something is wrong, completing from STATE_LOADING_STARTED, isCached should be true!", new Object[0]);
                }
            }
        } else if (e13 instanceof c) {
            w(e13.c());
        } else if (e13 instanceof d) {
            y(e13.c());
        } else if (e13 instanceof e) {
            x();
        } else if (e13 instanceof a) {
            this.f70570h = SystemClock.elapsedRealtime();
        } else if (e13 instanceof m) {
            q(SystemClock.elapsedRealtime() - this.f70570h);
            r(e13.c());
        } else if (e13 instanceof l) {
            q(e13.c());
        } else if (e13 instanceof k) {
            i(((k) e13).l(), "net_download_body_size");
            r(e13.c());
        } else if (e13 instanceof e2) {
            q(e13.c());
        } else if (e13 instanceof f2) {
            r(e13.c());
        }
        return true;
    }

    public final s92.l v() {
        return (this.f70568f == d4.PIN && this.f70571i) ? s92.l.FIRST_PAGE_LOAD : s92.l.USER_NAVIGATION;
    }

    public final void w(long j13) {
        i iVar = this.f70572j;
        if (iVar == i.STATE_LOADING_STARTED) {
            q(0L);
            a(o.ERROR, v(), this.f70568f, this.f70569g, 0L, false);
            A();
        } else if (iVar == i.STATE_SPINNER_SHOWING) {
            a(o.ERROR, v(), this.f70568f, this.f70569g, j13, false);
            A();
        }
    }

    public final void x() {
        if (this.f70572j == i.STATE_SPINNER_SHOWING && v() == s92.l.FIRST_PAGE_LOAD) {
            g();
            this.f70572j = i.STATE_LOADING_STARTED;
        }
    }

    public final void y(long j13) {
        i iVar = this.f70572j;
        if (iVar == i.STATE_LOADING_STARTED) {
            q(0L);
            a(o.ABORTED, v(), this.f70568f, this.f70569g, 0L, false);
            A();
        } else if (iVar == i.STATE_SPINNER_SHOWING) {
            a(o.ABORTED, v(), this.f70568f, this.f70569g, j13, false);
            A();
        }
    }

    public final void z(long j13) {
        if (this.f70572j == i.STATE_LOADING_STARTED) {
            o1 o1Var = this.f60594b;
            if (o1Var == null || !o1Var.a().f85171j) {
                q(j13);
            } else {
                n();
            }
            this.f70572j = i.STATE_SPINNER_SHOWING;
        }
    }
}

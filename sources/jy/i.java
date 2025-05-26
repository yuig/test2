package jy;

import ey.k3;
import ey.l2;
import ey.u1;
import ey.v1;
import ey.z1;
import h32.a4;
import h32.d4;
import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends v1 {

    /* renamed from: m, reason: collision with root package name */
    public static final Set f77708m = h1.f(g.class, b.class, c.class, e.class, f.class, l.class, m.class, j.class, k.class, a.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f77709f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77710g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77711h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77712i;

    /* renamed from: j, reason: collision with root package name */
    public String f77713j;

    /* renamed from: k, reason: collision with root package name */
    public d4 f77714k;

    /* renamed from: l, reason: collision with root package name */
    public a4 f77715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k3 perfLogger, m60.w eventManager) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f77709f = eventManager;
    }

    public final void A(m mVar) {
        if (Intrinsics.d(mVar.f60634c, this.f77713j) && !this.f77711h) {
            this.f77711h = true;
            if (d()) {
                r(mVar.c());
            }
            B(mVar.c());
        }
    }

    public final void B(long j13) {
        if (this.f77710g && this.f77711h) {
            if (ff0.j.f62104b || this.f77712i) {
                Intrinsics.checkNotNullParameter("openCloseup", "scenarioName");
                C(s92.o.COMPLETE, j13);
            }
        }
    }

    public final void C(s92.o oVar, long j13) {
        vb0.j.f125466a.M(this.f77714k, "view type for CloseUpPWT cannot be null! check why! assign ViewType.PIN to it to pass the log through", tb0.p.CLOSEUP, new Object[0]);
        if (this.f77714k == null) {
            this.f77714k = d4.PIN;
        }
        String str = h.f77707a;
        String pinUid = this.f77713j;
        Intrinsics.f(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        t(str, pinUid, null, new g(pinUid));
        a(oVar, s92.l.USER_NAVIGATION, this.f77714k, this.f77715l, j13, false);
        this.f77709f.d(d.f77704a);
        this.f77710g = false;
        this.f77711h = false;
        this.f77712i = false;
    }

    @Override // ey.v1
    public final Set b() {
        return f77708m;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if ((!(e13 instanceof g) && (e13 instanceof z1) && !Intrinsics.d(((z1) e13).l(), this.f77713j)) || !super.o(e13)) {
            return false;
        }
        if (e13 instanceof g) {
            y((g) e13);
            return true;
        }
        if (e13 instanceof b) {
            String m13 = ((b) e13).m();
            if (m13 == null) {
                m13 = "";
            }
            long c13 = e13.c();
            if (d()) {
                return true;
            }
            q(c13);
            j("http.url", m13);
            return true;
        }
        if (e13 instanceof c) {
            v((c) e13);
            return true;
        }
        if (e13 instanceof e) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof f) {
            x((f) e13);
            return true;
        }
        if (e13 instanceof l) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof m) {
            A((m) e13);
            return true;
        }
        if (e13 instanceof j) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof k) {
            z((k) e13);
            return true;
        }
        if (!(e13 instanceof a)) {
            return true;
        }
        w((a) e13);
        return true;
    }

    public final void v(c cVar) {
        if (Intrinsics.d(cVar.f60634c, this.f77713j)) {
            if (d()) {
                r(cVar.c());
            }
            B(cVar.c());
        }
    }

    public final void w(a aVar) {
        this.f77714k = aVar.f77701f;
        this.f77715l = aVar.f77702g;
        C(aVar.f77700e, aVar.c());
        Intrinsics.checkNotNullParameter("openCloseup", "scenarioName");
    }

    public final void x(f fVar) {
        if (Intrinsics.d(fVar.f60634c, this.f77713j) && !this.f77710g) {
            this.f77714k = fVar.f77705e;
            this.f77715l = fVar.f77706f;
            this.f77710g = true;
            if (d()) {
                r(fVar.c());
            }
            B(fVar.c());
        }
    }

    public final void y(g gVar) {
        this.f77713j = gVar.f60634c;
        q(gVar.c());
        String str = this.f77713j;
        if (str == null) {
            str = "";
        }
        j("pin.id", str);
    }

    public final void z(k kVar) {
        if (Intrinsics.d(kVar.f60634c, this.f77713j) && !this.f77712i) {
            this.f77712i = true;
            if (d()) {
                r(kVar.c());
            }
            B(kVar.c());
        }
    }
}

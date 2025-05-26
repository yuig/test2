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
public final class t extends v1 {

    /* renamed from: m, reason: collision with root package name */
    public static final Set f77719m = h1.f(s.class, q.class, r.class, w.class, x.class, u.class, v.class, o.class, p.class, n.class, l2.class);

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f77720f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77721g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77722h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77723i;

    /* renamed from: j, reason: collision with root package name */
    public String f77724j;

    /* renamed from: k, reason: collision with root package name */
    public d4 f77725k;

    /* renamed from: l, reason: collision with root package name */
    public a4 f77726l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k3 perfLogger, m60.w eventManager) {
        super(perfLogger);
        Intrinsics.checkNotNullParameter(perfLogger, "perfLogger");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f77720f = eventManager;
    }

    public final void A(long j13) {
        if (this.f77721g && this.f77722h) {
            if (ff0.j.f62104b || this.f77723i) {
                B(s92.o.COMPLETE, j13);
            }
        }
    }

    public final void B(s92.o oVar, long j13) {
        vb0.j.f125466a.M(this.f77725k, "view type for CloseUpPWT cannot be null! check why! assign ViewType.PIN to it to pass the log through", tb0.p.CLOSEUP, new Object[0]);
        if (this.f77725k == null) {
            this.f77725k = d4.PIN;
        }
        String str = y.f77729a;
        String pinUid = this.f77724j;
        Intrinsics.f(pinUid);
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        t(str, pinUid, null, new s(pinUid));
        a(oVar, s92.l.USER_NAVIGATION, this.f77725k, this.f77726l, j13, false);
        this.f77720f.d(d.f77704a);
        this.f77721g = false;
        this.f77722h = false;
        this.f77723i = false;
    }

    @Override // ey.v1
    public final Set b() {
        return f77719m;
    }

    @Override // ey.v1
    public final boolean o(u1 e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if ((!(e13 instanceof s) && (e13 instanceof z1) && !Intrinsics.d(((z1) e13).l(), this.f77724j)) || !super.o(e13)) {
            return false;
        }
        if (e13 instanceof s) {
            x((s) e13);
            return true;
        }
        if (e13 instanceof q) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof r) {
            w((r) e13);
            return true;
        }
        if (e13 instanceof w) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof x) {
            z((x) e13);
            return true;
        }
        if (e13 instanceof u) {
            if (d()) {
                return true;
            }
            q(e13.c());
            return true;
        }
        if (e13 instanceof v) {
            y((v) e13);
            return true;
        }
        if (!(e13 instanceof n)) {
            return true;
        }
        v((n) e13);
        return true;
    }

    public final void v(n nVar) {
        this.f77725k = nVar.f77717f;
        this.f77726l = nVar.f77718g;
        B(nVar.f77716e, nVar.c());
    }

    public final void w(r rVar) {
        if (Intrinsics.d(rVar.f60634c, this.f77724j) && !this.f77721g) {
            this.f77721g = true;
            if (d()) {
                r(rVar.c());
            }
            A(rVar.c());
        }
    }

    public final void x(s sVar) {
        this.f77724j = sVar.f60634c;
        q(sVar.c());
        String str = this.f77724j;
        if (str == null) {
            str = "";
        }
        j("pin.id", str);
    }

    public final void y(v vVar) {
        if (Intrinsics.d(vVar.f60634c, this.f77724j) && !this.f77723i) {
            this.f77723i = true;
            if (d()) {
                r(vVar.c());
            }
            A(vVar.c());
        }
    }

    public final void z(x xVar) {
        if (Intrinsics.d(xVar.f60634c, this.f77724j) && !this.f77722h) {
            this.f77725k = xVar.f77727e;
            this.f77726l = xVar.f77728f;
            this.f77722h = true;
            if (d()) {
                r(xVar.c());
            }
            A(xVar.c());
        }
    }
}

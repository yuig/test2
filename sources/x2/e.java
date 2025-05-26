package x2;

import kh2.b0;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;
import s3.j2;
import u2.p;

/* loaded from: classes.dex */
public final class e extends p implements j2, c {

    /* renamed from: n, reason: collision with root package name */
    public c f131582n;

    /* renamed from: o, reason: collision with root package name */
    public c f131583o;

    @Override // u2.p
    public final void E0() {
        this.f131583o = null;
        this.f131582n = null;
    }

    public final boolean M0(b bVar) {
        c cVar = this.f131582n;
        if (cVar != null) {
            return ((e) cVar).M0(bVar);
        }
        c cVar2 = this.f131583o;
        if (cVar2 != null) {
            return ((e) cVar2).M0(bVar);
        }
        return false;
    }

    public final void N0(b bVar) {
        c cVar = this.f131583o;
        if (cVar != null) {
            ((e) cVar).N0(bVar);
            return;
        }
        c cVar2 = this.f131582n;
        if (cVar2 != null) {
            ((e) cVar2).N0(bVar);
        }
    }

    public final void O0(b bVar) {
        c cVar = this.f131583o;
        if (cVar != null) {
            ((e) cVar).O0(bVar);
        }
        c cVar2 = this.f131582n;
        if (cVar2 != null) {
            ((e) cVar2).O0(bVar);
        }
        this.f131582n = null;
    }

    public final void P0(b bVar) {
        j2 j2Var;
        c cVar;
        c cVar2 = this.f131582n;
        if (cVar2 == null || !w.m(cVar2, b0.t0(bVar))) {
            if (this.f120042a.f120054m) {
                j0 j0Var = new j0();
                b0.X1(this, new e.f(j0Var, this, bVar, 12));
                j2Var = (j2) j0Var.f80434a;
            } else {
                j2Var = null;
            }
            cVar = (c) j2Var;
        } else {
            cVar = cVar2;
        }
        if (cVar != null && cVar2 == null) {
            w.n(cVar, bVar);
            c cVar3 = this.f131583o;
            if (cVar3 != null) {
                ((e) cVar3).O0(bVar);
            }
        } else if (cVar == null && cVar2 != null) {
            c cVar4 = this.f131583o;
            if (cVar4 != null) {
                w.n(cVar4, bVar);
            }
            ((e) cVar2).O0(bVar);
        } else if (!Intrinsics.d(cVar, cVar2)) {
            if (cVar != null) {
                w.n(cVar, bVar);
            }
            if (cVar2 != null) {
                ((e) cVar2).O0(bVar);
            }
        } else if (cVar != null) {
            ((e) cVar).P0(bVar);
        } else {
            c cVar5 = this.f131583o;
            if (cVar5 != null) {
                ((e) cVar5).P0(bVar);
            }
        }
        this.f131582n = cVar;
    }

    public final void Q0(b bVar) {
        c cVar = this.f131583o;
        if (cVar != null) {
            ((e) cVar).Q0(bVar);
            return;
        }
        c cVar2 = this.f131582n;
        if (cVar2 != null) {
            ((e) cVar2).Q0(bVar);
        }
    }

    @Override // s3.j2
    public final Object l() {
        return d.f131581a;
    }
}

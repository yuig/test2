package u2;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import ao2.g0;
import ao2.j0;
import ao2.o1;
import ao2.p1;
import k1.q0;
import s3.q1;
import s3.v1;
import t3.c0;

/* loaded from: classes.dex */
public abstract class p implements s3.m {

    /* renamed from: b, reason: collision with root package name */
    public ho2.c f120043b;

    /* renamed from: c, reason: collision with root package name */
    public int f120044c;

    /* renamed from: e, reason: collision with root package name */
    public p f120046e;

    /* renamed from: f, reason: collision with root package name */
    public p f120047f;

    /* renamed from: g, reason: collision with root package name */
    public v1 f120048g;

    /* renamed from: h, reason: collision with root package name */
    public q1 f120049h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120050i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f120051j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f120052k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f120053l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f120054m;

    /* renamed from: a, reason: collision with root package name */
    public p f120042a = this;

    /* renamed from: d, reason: collision with root package name */
    public int f120045d = -1;

    public boolean A0() {
        return !(this instanceof q0);
    }

    public void B0() {
        if (!(!this.f120054m)) {
            jk.r.y("node attached multiple times");
            throw null;
        }
        if (!(this.f120049h != null)) {
            jk.r.y("attach invoked on a node without a coordinator");
            throw null;
        }
        this.f120054m = true;
        this.f120052k = true;
    }

    public void C0() {
        if (!this.f120054m) {
            jk.r.y("Cannot detach a node that is not attached");
            throw null;
        }
        if (!(!this.f120052k)) {
            jk.r.y("Must run runAttachLifecycle() before markAsDetached()");
            throw null;
        }
        if (!(!this.f120053l)) {
            jk.r.y("Must run runDetachLifecycle() before markAsDetached()");
            throw null;
        }
        this.f120054m = false;
        ho2.c cVar = this.f120043b;
        if (cVar != null) {
            dl2.b.E(cVar, new ModifierNodeDetachedCancellationException());
            this.f120043b = null;
        }
    }

    public void D0() {
    }

    public void E0() {
    }

    public void F0() {
    }

    public void G0() {
        if (this.f120054m) {
            F0();
        } else {
            jk.r.y("reset() called on an unattached node");
            throw null;
        }
    }

    public void H0() {
        if (!this.f120054m) {
            jk.r.y("Must run markAsAttached() prior to runAttachLifecycle");
            throw null;
        }
        if (!this.f120052k) {
            jk.r.y("Must run runAttachLifecycle() only once after markAsAttached()");
            throw null;
        }
        this.f120052k = false;
        D0();
        this.f120053l = true;
    }

    public void I0() {
        if (!this.f120054m) {
            jk.r.y("node detached multiple times");
            throw null;
        }
        if (!(this.f120049h != null)) {
            jk.r.y("detach invoked on a node without a coordinator");
            throw null;
        }
        if (!this.f120053l) {
            jk.r.y("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            throw null;
        }
        this.f120053l = false;
        E0();
    }

    public void J0(p pVar) {
        this.f120042a = pVar;
    }

    public final void K0(s3.c cVar) {
        k2.e eVar = ((c0) com.bumptech.glide.c.V0(this)).f115900p0;
        if (eVar.i(cVar)) {
            return;
        }
        eVar.b(cVar);
    }

    public void L0(q1 q1Var) {
        this.f120049h = q1Var;
    }

    public final j0 z0() {
        ho2.c cVar = this.f120043b;
        if (cVar != null) {
            return cVar;
        }
        ho2.c b13 = dl2.b.b(((c0) com.bumptech.glide.c.V0(this)).f115879f.plus(new p1((o1) ((c0) com.bumptech.glide.c.V0(this)).f115879f.get(g0.f20154b))));
        this.f120043b = b13;
        return b13;
    }
}

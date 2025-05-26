package b1;

import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.t1;
import androidx.lifecycle.l0;
import com.google.common.util.concurrent.c0;
import java.util.ArrayList;
import kh2.m0;
import v.k2;

/* loaded from: classes2.dex */
public final class d implements t1 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f20791a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f20792b;

    /* renamed from: c, reason: collision with root package name */
    public m f20793c;

    /* renamed from: d, reason: collision with root package name */
    public final n f20794d;

    /* renamed from: e, reason: collision with root package name */
    public g0.d f20795e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20796f = false;

    public d(h0 h0Var, l0 l0Var, n nVar) {
        this.f20791a = h0Var;
        this.f20792b = l0Var;
        this.f20794d = nVar;
        synchronized (this) {
            this.f20793c = (m) l0Var.d();
        }
    }

    @Override // androidx.camera.core.impl.t1
    public final void a(Object obj) {
        i0 i0Var = (i0) obj;
        if (i0Var == i0.CLOSING || i0Var == i0.CLOSED || i0Var == i0.RELEASING || i0Var == i0.RELEASED) {
            b(m.IDLE);
            if (this.f20796f) {
                this.f20796f = false;
                g0.d dVar = this.f20795e;
                if (dVar != null) {
                    dVar.cancel(false);
                    this.f20795e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((i0Var == i0.OPENING || i0Var == i0.OPEN || i0Var == i0.PENDING_OPEN) && !this.f20796f) {
            b(m.IDLE);
            ArrayList arrayList = new ArrayList();
            h0 h0Var = this.f20791a;
            g0.d a13 = g0.d.a(com.bumptech.glide.d.L(new l0.d(this, h0Var, arrayList, 2)));
            g0.a aVar = new g0.a() { // from class: b1.a
                @Override // g0.a
                public final c0 apply(Object obj2) {
                    return d.this.f20794d.f();
                }
            };
            f0.d s13 = l3.c.s();
            a13.getClass();
            g0.b j13 = g0.m.j(a13, aVar, s13);
            q.a aVar2 = new q.a() { // from class: b1.b
                @Override // q.a
                public final Object apply(Object obj2) {
                    d dVar2 = d.this;
                    dVar2.getClass();
                    dVar2.b(m.STREAMING);
                    return null;
                }
            };
            g0.b j14 = g0.m.j(j13, new g0.l(aVar2), l3.c.s());
            this.f20795e = j14;
            g0.m.a(j14, new k2(this, arrayList, h0Var, 3), l3.c.s());
            this.f20796f = true;
        }
    }

    public final void b(m mVar) {
        synchronized (this) {
            try {
                if (this.f20793c.equals(mVar)) {
                    return;
                }
                this.f20793c = mVar;
                m0.p("StreamStateObserver", "Update Preview stream state to " + mVar);
                this.f20792b.i(mVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.t1
    public final void onError(Throwable th3) {
        g0.d dVar = this.f20795e;
        if (dVar != null) {
            dVar.cancel(false);
            this.f20795e = null;
        }
        b(m.IDLE);
    }
}

package u4;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m extends h {
    public boolean A0;

    /* renamed from: v0, reason: collision with root package name */
    public float f120273v0 = -1.0f;

    /* renamed from: w0, reason: collision with root package name */
    public int f120274w0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public int f120275x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    public e f120276y0 = this.K;

    /* renamed from: z0, reason: collision with root package name */
    public int f120277z0 = 0;

    public m() {
        this.S.clear();
        this.S.add(this.f120276y0);
        int length = this.R.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.R[i13] = this.f120276y0;
        }
    }

    @Override // u4.h
    public final boolean J() {
        return this.A0;
    }

    @Override // u4.h
    public final boolean K() {
        return this.A0;
    }

    @Override // u4.h
    public final void c(s4.d dVar, boolean z13) {
        i iVar = (i) this.V;
        if (iVar == null) {
            return;
        }
        Object l13 = iVar.l(d.LEFT);
        Object l14 = iVar.l(d.RIGHT);
        h hVar = this.V;
        boolean z14 = hVar != null && hVar.U[0] == g.WRAP_CONTENT;
        if (this.f120277z0 == 0) {
            l13 = iVar.l(d.TOP);
            l14 = iVar.l(d.BOTTOM);
            h hVar2 = this.V;
            z14 = hVar2 != null && hVar2.U[1] == g.WRAP_CONTENT;
        }
        if (this.A0) {
            e eVar = this.f120276y0;
            if (eVar.f120186c) {
                s4.j n13 = dVar.n(eVar);
                dVar.e(n13, this.f120276y0.d());
                if (this.f120274w0 != -1) {
                    if (z14) {
                        dVar.g(dVar.n(l14), n13, 0, 5);
                    }
                } else if (this.f120275x0 != -1 && z14) {
                    s4.j n14 = dVar.n(l14);
                    dVar.g(n13, dVar.n(l13), 0, 5);
                    dVar.g(n14, n13, 0, 5);
                }
                this.A0 = false;
                return;
            }
        }
        if (this.f120274w0 != -1) {
            s4.j n15 = dVar.n(this.f120276y0);
            dVar.f(n15, dVar.n(l13), this.f120274w0, 8);
            if (z14) {
                dVar.g(dVar.n(l14), n15, 0, 5);
                return;
            }
            return;
        }
        if (this.f120275x0 != -1) {
            s4.j n16 = dVar.n(this.f120276y0);
            s4.j n17 = dVar.n(l14);
            dVar.f(n16, n17, -this.f120275x0, 8);
            if (z14) {
                dVar.g(n16, dVar.n(l13), 0, 5);
                dVar.g(n17, n16, 0, 5);
                return;
            }
            return;
        }
        if (this.f120273v0 != -1.0f) {
            s4.j n18 = dVar.n(this.f120276y0);
            s4.j n19 = dVar.n(l14);
            float f13 = this.f120273v0;
            s4.c o13 = dVar.o();
            o13.f111072d.a(n18, -1.0f);
            o13.f111072d.a(n19, f13);
            dVar.d(o13);
        }
    }

    @Override // u4.h
    public final boolean d() {
        return true;
    }

    @Override // u4.h
    public final void e0(s4.d dVar, boolean z13) {
        if (this.V == null) {
            return;
        }
        e eVar = this.f120276y0;
        dVar.getClass();
        int q13 = s4.d.q(eVar);
        if (this.f120277z0 == 1) {
            this.f120197a0 = q13;
            this.f120199b0 = 0;
            W(this.V.o());
            b0(0);
            return;
        }
        this.f120197a0 = 0;
        this.f120199b0 = q13;
        b0(this.V.y());
        W(0);
    }

    public final int f0() {
        return this.f120277z0;
    }

    public final int g0() {
        return this.f120274w0;
    }

    public final int h0() {
        return this.f120275x0;
    }

    @Override // u4.h
    public final void i(h hVar, HashMap hashMap) {
        super.i(hVar, hashMap);
        m mVar = (m) hVar;
        this.f120273v0 = mVar.f120273v0;
        this.f120274w0 = mVar.f120274w0;
        this.f120275x0 = mVar.f120275x0;
        n0(mVar.f120277z0);
    }

    public final float i0() {
        return this.f120273v0;
    }

    public final void j0(int i13) {
        this.f120276y0.n(i13);
        this.A0 = true;
    }

    public final void k0(int i13) {
        if (i13 > -1) {
            this.f120273v0 = -1.0f;
            this.f120274w0 = i13;
            this.f120275x0 = -1;
        }
    }

    @Override // u4.h
    public final e l(d dVar) {
        int i13 = l.f120272a[dVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            if (this.f120277z0 == 1) {
                return this.f120276y0;
            }
            return null;
        }
        if ((i13 == 3 || i13 == 4) && this.f120277z0 == 0) {
            return this.f120276y0;
        }
        return null;
    }

    public final void l0(int i13) {
        if (i13 > -1) {
            this.f120273v0 = -1.0f;
            this.f120274w0 = -1;
            this.f120275x0 = i13;
        }
    }

    public final void m0(float f13) {
        if (f13 > -1.0f) {
            this.f120273v0 = f13;
            this.f120274w0 = -1;
            this.f120275x0 = -1;
        }
    }

    public final void n0(int i13) {
        if (this.f120277z0 == i13) {
            return;
        }
        this.f120277z0 = i13;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.f120277z0 == 1) {
            this.f120276y0 = this.f120195J;
        } else {
            this.f120276y0 = this.K;
        }
        arrayList.add(this.f120276y0);
        e[] eVarArr = this.R;
        int length = eVarArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            eVarArr[i14] = this.f120276y0;
        }
    }
}

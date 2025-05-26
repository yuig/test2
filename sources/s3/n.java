package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n extends u2.p {

    /* renamed from: n, reason: collision with root package name */
    public final int f110842n = r1.f(this);

    /* renamed from: o, reason: collision with root package name */
    public u2.p f110843o;

    @Override // u2.p
    public final void B0() {
        super.B0();
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.L0(this.f120049h);
            if (!pVar.f120054m) {
                pVar.B0();
            }
        }
    }

    @Override // u2.p
    public final void C0() {
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.C0();
        }
        super.C0();
    }

    @Override // u2.p
    public final void G0() {
        super.G0();
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.G0();
        }
    }

    @Override // u2.p
    public final void H0() {
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.H0();
        }
        super.H0();
    }

    @Override // u2.p
    public final void I0() {
        super.I0();
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.I0();
        }
    }

    @Override // u2.p
    public final void J0(u2.p pVar) {
        this.f120042a = pVar;
        for (u2.p pVar2 = this.f110843o; pVar2 != null; pVar2 = pVar2.f120047f) {
            pVar2.J0(pVar);
        }
    }

    @Override // u2.p
    public final void L0(q1 q1Var) {
        this.f120049h = q1Var;
        for (u2.p pVar = this.f110843o; pVar != null; pVar = pVar.f120047f) {
            pVar.L0(q1Var);
        }
    }

    public final void M0(m mVar) {
        u2.p pVar = ((u2.p) mVar).f120042a;
        if (pVar != mVar) {
            u2.p pVar2 = mVar instanceof u2.p ? (u2.p) mVar : null;
            u2.p pVar3 = pVar2 != null ? pVar2.f120046e : null;
            if (pVar != this.f120042a || !Intrinsics.d(pVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
            }
            return;
        }
        if (!(!pVar.f120054m)) {
            jk.r.y("Cannot delegate to an already attached node");
            throw null;
        }
        pVar.J0(this.f120042a);
        int i13 = this.f120044c;
        int g13 = r1.g(pVar);
        pVar.f120044c = g13;
        int i14 = this.f120044c;
        int i15 = g13 & 2;
        if (i15 != 0 && (i14 & 2) != 0 && !(this instanceof c0)) {
            jk.r.y("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + pVar);
            throw null;
        }
        pVar.f120047f = this.f110843o;
        this.f110843o = pVar;
        pVar.f120046e = this;
        O0(g13 | i14, false);
        if (this.f120054m) {
            if (i15 == 0 || (i13 & 2) != 0) {
                L0(this.f120049h);
            } else {
                j1 j1Var = com.bumptech.glide.c.U0(this).f110837y;
                this.f120042a.L0(null);
                j1Var.g();
            }
            pVar.B0();
            pVar.H0();
            r1.a(pVar);
        }
    }

    public final void N0(m mVar) {
        u2.p pVar = null;
        for (u2.p pVar2 = this.f110843o; pVar2 != null; pVar2 = pVar2.f120047f) {
            if (pVar2 == mVar) {
                boolean z13 = pVar2.f120054m;
                if (z13) {
                    g1.z zVar = r1.f110915a;
                    if (!z13) {
                        jk.r.y("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    r1.b(pVar2, -1, 2);
                    pVar2.I0();
                    pVar2.C0();
                }
                pVar2.J0(pVar2);
                pVar2.f120045d = 0;
                if (pVar == null) {
                    this.f110843o = pVar2.f120047f;
                } else {
                    pVar.f120047f = pVar2.f120047f;
                }
                pVar2.f120047f = null;
                pVar2.f120046e = null;
                int i13 = this.f120044c;
                int g13 = r1.g(this);
                O0(g13, true);
                if (this.f120054m && (i13 & 2) != 0 && (g13 & 2) == 0) {
                    j1 j1Var = com.bumptech.glide.c.U0(this).f110837y;
                    this.f120042a.L0(null);
                    j1Var.g();
                    return;
                }
                return;
            }
            pVar = pVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + mVar).toString());
    }

    public final void O0(int i13, boolean z13) {
        u2.p pVar;
        int i14 = this.f120044c;
        this.f120044c = i13;
        if (i14 != i13) {
            u2.p pVar2 = this.f120042a;
            if (pVar2 == this) {
                this.f120045d = i13;
            }
            if (this.f120054m) {
                u2.p pVar3 = this;
                while (pVar3 != null) {
                    i13 |= pVar3.f120044c;
                    pVar3.f120044c = i13;
                    if (pVar3 == pVar2) {
                        break;
                    } else {
                        pVar3 = pVar3.f120046e;
                    }
                }
                if (z13 && pVar3 == pVar2) {
                    i13 = r1.g(pVar2);
                    pVar2.f120044c = i13;
                }
                int i15 = i13 | ((pVar3 == null || (pVar = pVar3.f120047f) == null) ? 0 : pVar.f120045d);
                while (pVar3 != null) {
                    i15 |= pVar3.f120044c;
                    pVar3.f120045d = i15;
                    pVar3 = pVar3.f120046e;
                }
            }
        }
    }
}

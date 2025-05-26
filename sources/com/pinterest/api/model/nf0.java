package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class nf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40395a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40396b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40397c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40398d;

    public nf0(nm.o oVar) {
        this.f40395a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        pf0 pf0Var;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new pf0(0);
        }
        nm.o oVar = this.f40395a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new pf0(0);
            }
            p13.hashCode();
            switch (p13) {
                case "safetytreatmentaudiostep":
                    if (this.f40397c == null) {
                        this.f40397c = a.cb.p(wf0.class, oVar);
                    }
                    pf0Var = new pf0((wf0) this.f40397c.a(uVar));
                    break;
                case "safetytreatmenttextstep":
                    if (this.f40396b == null) {
                        this.f40396b = a.cb.p(eg0.class, oVar);
                    }
                    pf0Var = new pf0((eg0) this.f40396b.a(uVar));
                    break;
                case "safetytreatmentquotestep":
                    if (this.f40398d == null) {
                        this.f40398d = a.cb.p(ag0.class, oVar);
                    }
                    pf0Var = new pf0((ag0) this.f40398d.a(uVar));
                    break;
                default:
                    return new pf0(0);
            }
            return pf0Var;
        } catch (Exception unused) {
            return new pf0(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        pf0 pf0Var = (pf0) obj;
        if (pf0Var == null) {
            cVar.m();
            return;
        }
        eg0 eg0Var = pf0Var.f40970a;
        nm.o oVar = this.f40395a;
        if (eg0Var != null) {
            if (this.f40396b == null) {
                this.f40396b = a.cb.q(oVar, eg0.class);
            }
            this.f40396b.e(cVar, eg0Var);
        }
        wf0 wf0Var = pf0Var.f40971b;
        if (wf0Var != null) {
            if (this.f40397c == null) {
                this.f40397c = a.cb.q(oVar, wf0.class);
            }
            this.f40397c.e(cVar, wf0Var);
        }
        ag0 ag0Var = pf0Var.f40972c;
        if (ag0Var != null) {
            if (this.f40398d == null) {
                this.f40398d = a.cb.q(oVar, ag0.class);
            }
            this.f40398d.e(cVar, ag0Var);
        }
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class cf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36408a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36409b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36410c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36411d;

    public cf0(nm.o oVar) {
        this.f36408a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        ef0 ef0Var;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new ef0(0);
        }
        nm.o oVar = this.f36408a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new ef0(0);
            }
            p13.hashCode();
            switch (p13) {
                case "safetytreatmentaudiostep":
                    if (this.f36410c == null) {
                        this.f36410c = a.cb.p(wf0.class, oVar);
                    }
                    ef0Var = new ef0((wf0) this.f36410c.a(uVar));
                    break;
                case "safetytreatmenttextstep":
                    if (this.f36409b == null) {
                        this.f36409b = a.cb.p(eg0.class, oVar);
                    }
                    ef0Var = new ef0((eg0) this.f36409b.a(uVar));
                    break;
                case "safetytreatmentquotestep":
                    if (this.f36411d == null) {
                        this.f36411d = a.cb.p(ag0.class, oVar);
                    }
                    ef0Var = new ef0((ag0) this.f36411d.a(uVar));
                    break;
                default:
                    return new ef0(0);
            }
            return ef0Var;
        } catch (Exception unused) {
            return new ef0(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ef0 ef0Var = (ef0) obj;
        if (ef0Var == null) {
            cVar.m();
            return;
        }
        eg0 eg0Var = ef0Var.f37260a;
        nm.o oVar = this.f36408a;
        if (eg0Var != null) {
            if (this.f36409b == null) {
                this.f36409b = a.cb.q(oVar, eg0.class);
            }
            this.f36409b.e(cVar, eg0Var);
        }
        wf0 wf0Var = ef0Var.f37261b;
        if (wf0Var != null) {
            if (this.f36410c == null) {
                this.f36410c = a.cb.q(oVar, wf0.class);
            }
            this.f36410c.e(cVar, wf0Var);
        }
        ag0 ag0Var = ef0Var.f37262c;
        if (ag0Var != null) {
            if (this.f36411d == null) {
                this.f36411d = a.cb.q(oVar, ag0.class);
            }
            this.f36411d.e(cVar, ag0Var);
        }
    }
}

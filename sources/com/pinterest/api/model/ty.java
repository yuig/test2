package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class ty extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42362a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42363b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42364c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42365d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42366e;

    public ty(nm.o oVar) {
        this.f42362a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        vy vyVar;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new vy(0);
        }
        nm.o oVar = this.f42362a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new vy(0);
            }
            p13.hashCode();
            switch (p13) {
                case "safetytext":
                    if (this.f42363b == null) {
                        this.f42363b = a.cb.p(lf0.class, oVar);
                    }
                    vyVar = new vy((lf0) this.f42363b.a(uVar));
                    break;
                case "safetytexttreatment":
                    if (this.f42365d == null) {
                        this.f42365d = a.cb.p(sf0.class, oVar);
                    }
                    vyVar = new vy((sf0) this.f42365d.a(uVar));
                    break;
                case "safetyaudiotreatment":
                    if (this.f42366e == null) {
                        this.f42366e = a.cb.p(hf0.class, oVar);
                    }
                    vyVar = new vy((hf0) this.f42366e.a(uVar));
                    break;
                case "safetyaction":
                    if (this.f42364c == null) {
                        this.f42364c = a.cb.p(af0.class, oVar);
                    }
                    vyVar = new vy((af0) this.f42364c.a(uVar));
                    break;
                default:
                    return new vy(0);
            }
            return vyVar;
        } catch (Exception unused) {
            return new vy(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        vy vyVar = (vy) obj;
        if (vyVar == null) {
            cVar.m();
            return;
        }
        lf0 lf0Var = vyVar.f43018a;
        nm.o oVar = this.f42362a;
        if (lf0Var != null) {
            if (this.f42363b == null) {
                this.f42363b = a.cb.q(oVar, lf0.class);
            }
            this.f42363b.e(cVar, lf0Var);
        }
        af0 af0Var = vyVar.f43019b;
        if (af0Var != null) {
            if (this.f42364c == null) {
                this.f42364c = a.cb.q(oVar, af0.class);
            }
            this.f42364c.e(cVar, af0Var);
        }
        sf0 sf0Var = vyVar.f43020c;
        if (sf0Var != null) {
            if (this.f42365d == null) {
                this.f42365d = a.cb.q(oVar, sf0.class);
            }
            this.f42365d.e(cVar, sf0Var);
        }
        hf0 hf0Var = vyVar.f43021d;
        if (hf0Var != null) {
            if (this.f42366e == null) {
                this.f42366e = a.cb.q(oVar, hf0.class);
            }
            this.f42366e.e(cVar, hf0Var);
        }
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class mb0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40050a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40051b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40052c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40053d;

    public mb0(nm.o oVar) {
        this.f40050a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        ob0 ob0Var;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new ob0(0);
        }
        nm.o oVar = this.f40050a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new ob0(0);
            }
            p13.hashCode();
            switch (p13) {
                case "peartopic":
                    if (this.f40051b == null) {
                        this.f40051b = a.cb.p(t20.class, oVar);
                    }
                    ob0Var = new ob0((t20) this.f40051b.a(uVar));
                    break;
                case "pin":
                    if (this.f40053d == null) {
                        this.f40053d = a.cb.p(f30.class, oVar);
                    }
                    ob0Var = new ob0((f30) this.f40053d.a(uVar));
                    break;
                case "board":
                    if (this.f40052c == null) {
                        this.f40052c = a.cb.p(v7.class, oVar);
                    }
                    ob0Var = new ob0((v7) this.f40052c.a(uVar));
                    break;
                default:
                    return new ob0(0);
            }
            return ob0Var;
        } catch (Exception unused) {
            return new ob0(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ob0 ob0Var = (ob0) obj;
        if (ob0Var == null) {
            cVar.m();
            return;
        }
        t20 t20Var = ob0Var.f40665a;
        nm.o oVar = this.f40050a;
        if (t20Var != null) {
            if (this.f40051b == null) {
                this.f40051b = a.cb.q(oVar, t20.class);
            }
            this.f40051b.e(cVar, t20Var);
        }
        v7 v7Var = ob0Var.f40666b;
        if (v7Var != null) {
            if (this.f40052c == null) {
                this.f40052c = a.cb.q(oVar, v7.class);
            }
            this.f40052c.e(cVar, v7Var);
        }
        f30 f30Var = ob0Var.f40667c;
        if (f30Var != null) {
            if (this.f40053d == null) {
                this.f40053d = a.cb.q(oVar, f30.class);
            }
            this.f40053d.e(cVar, f30Var);
        }
    }
}

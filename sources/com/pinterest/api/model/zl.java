package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class zl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44381a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44382b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44383c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44384d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44385e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44386f;

    public zl(nm.o oVar) {
        this.f44381a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        bm bmVar;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new bm(0);
        }
        nm.o oVar = this.f44381a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new bm(0);
            }
            p13.hashCode();
            switch (p13) {
                case "formatted_description_header_component":
                    if (this.f44383c == null) {
                        this.f44383c = a.cb.p(fm.class, oVar);
                    }
                    bmVar = new bm((fm) this.f44383c.a(uVar));
                    break;
                case "formatted_description_specs_component":
                    if (this.f44386f == null) {
                        this.f44386f = a.cb.p(mm.class, oVar);
                    }
                    bmVar = new bm((mm) this.f44386f.a(uVar));
                    break;
                case "formatted_description_paragraph_component":
                    if (this.f44382b == null) {
                        this.f44382b = a.cb.p(gm.class, oVar);
                    }
                    bmVar = new bm((gm) this.f44382b.a(uVar));
                    break;
                case "formatted_description_table_component":
                    if (this.f44385e == null) {
                        this.f44385e = a.cb.p(pm.class, oVar);
                    }
                    bmVar = new bm((pm) this.f44385e.a(uVar));
                    break;
                case "formatted_description_points_component":
                    if (this.f44384d == null) {
                        this.f44384d = a.cb.p(jm.class, oVar);
                    }
                    bmVar = new bm((jm) this.f44384d.a(uVar));
                    break;
                default:
                    return new bm(0);
            }
            return bmVar;
        } catch (Exception unused) {
            return new bm(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        bm bmVar = (bm) obj;
        if (bmVar == null) {
            cVar.m();
            return;
        }
        gm gmVar = bmVar.f36127a;
        nm.o oVar = this.f44381a;
        if (gmVar != null) {
            if (this.f44382b == null) {
                this.f44382b = a.cb.q(oVar, gm.class);
            }
            this.f44382b.e(cVar, gmVar);
        }
        fm fmVar = bmVar.f36128b;
        if (fmVar != null) {
            if (this.f44383c == null) {
                this.f44383c = a.cb.q(oVar, fm.class);
            }
            this.f44383c.e(cVar, fmVar);
        }
        jm jmVar = bmVar.f36129c;
        if (jmVar != null) {
            if (this.f44384d == null) {
                this.f44384d = a.cb.q(oVar, jm.class);
            }
            this.f44384d.e(cVar, jmVar);
        }
        pm pmVar = bmVar.f36130d;
        if (pmVar != null) {
            if (this.f44385e == null) {
                this.f44385e = a.cb.q(oVar, pm.class);
            }
            this.f44385e.e(cVar, pmVar);
        }
        mm mmVar = bmVar.f36131e;
        if (mmVar != null) {
            if (this.f44386f == null) {
                this.f44386f = a.cb.q(oVar, mm.class);
            }
            this.f44386f.e(cVar, mmVar);
        }
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class wj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43265a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43266b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43267c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43268d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43269e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43270f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43271g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43272h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f43273i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f43274j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f43275k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f43276l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f43277m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f43278n;

    public wj0(nm.o oVar) {
        this.f43265a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        yj0 yj0Var;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new yj0(0);
        }
        nm.o oVar = this.f43265a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new yj0(0);
            }
            p13.hashCode();
            switch (p13) {
                case "pincluster":
                    if (this.f43277m == null) {
                        this.f43277m = a.cb.p(q30.class, oVar);
                    }
                    yj0Var = new yj0((q30) this.f43277m.a(uVar));
                    break;
                case "todayarticle":
                    if (this.f43274j == null) {
                        this.f43274j = a.cb.p(zv0.class, oVar);
                    }
                    yj0Var = new yj0((zv0) this.f43274j.a(uVar));
                    break;
                case "board_section":
                    if (this.f43271g == null) {
                        this.f43271g = a.cb.p(ba.class, oVar);
                    }
                    yj0Var = new yj0((ba) this.f43271g.a(uVar));
                    break;
                case "storypinsticker":
                    if (this.f43276l == null) {
                        this.f43276l = a.cb.p(zq.class, oVar);
                    }
                    yj0Var = new yj0((zq) this.f43276l.a(uVar));
                    break;
                case "userdiditdata":
                    if (this.f43270f == null) {
                        this.f43270f = a.cb.p(az0.class, oVar);
                    }
                    yj0Var = new yj0((az0) this.f43270f.a(uVar));
                    break;
                case "pin":
                    if (this.f43266b == null) {
                        this.f43266b = a.cb.p(f30.class, oVar);
                    }
                    yj0Var = new yj0((f30) this.f43266b.a(uVar));
                    break;
                case "user":
                    if (this.f43269e == null) {
                        this.f43269e = a.cb.p(wy0.class, oVar);
                    }
                    yj0Var = new yj0((wy0) this.f43269e.a(uVar));
                    break;
                case "board":
                    if (this.f43267c == null) {
                        this.f43267c = a.cb.p(v7.class, oVar);
                    }
                    yj0Var = new yj0((v7) this.f43267c.a(uVar));
                    break;
                case "story":
                    if (this.f43273i == null) {
                        this.f43273i = a.cb.p(zj0.class, oVar);
                    }
                    yj0Var = new yj0((zj0) this.f43273i.a(uVar));
                    break;
                case "interest":
                    if (this.f43268d == null) {
                        this.f43268d = a.cb.p(zs.class, oVar);
                    }
                    yj0Var = new yj0((zs) this.f43268d.a(uVar));
                    break;
                case "board_section_name_recommendation":
                    if (this.f43272h == null) {
                        this.f43272h = a.cb.p(ga.class, oVar);
                    }
                    yj0Var = new yj0((ga) this.f43272h.a(uVar));
                    break;
                case "storypinstickercategory":
                    if (this.f43275k == null) {
                        this.f43275k = a.cb.p(dr.class, oVar);
                    }
                    yj0Var = new yj0((dr) this.f43275k.a(uVar));
                    break;
                case "pearinsight":
                    if (this.f43278n == null) {
                        this.f43278n = a.cb.p(h20.class, oVar);
                    }
                    yj0Var = new yj0((h20) this.f43278n.a(uVar));
                    break;
                default:
                    return new yj0(0);
            }
            return yj0Var;
        } catch (Exception unused) {
            return new yj0(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        yj0 yj0Var = (yj0) obj;
        if (yj0Var == null) {
            cVar.m();
            return;
        }
        f30 f30Var = yj0Var.f44057a;
        nm.o oVar = this.f43265a;
        if (f30Var != null) {
            if (this.f43266b == null) {
                this.f43266b = a.cb.q(oVar, f30.class);
            }
            this.f43266b.e(cVar, f30Var);
        }
        v7 v7Var = yj0Var.f44058b;
        if (v7Var != null) {
            if (this.f43267c == null) {
                this.f43267c = a.cb.q(oVar, v7.class);
            }
            this.f43267c.e(cVar, v7Var);
        }
        zs zsVar = yj0Var.f44059c;
        if (zsVar != null) {
            if (this.f43268d == null) {
                this.f43268d = a.cb.q(oVar, zs.class);
            }
            this.f43268d.e(cVar, zsVar);
        }
        wy0 wy0Var = yj0Var.f44060d;
        if (wy0Var != null) {
            if (this.f43269e == null) {
                this.f43269e = a.cb.q(oVar, wy0.class);
            }
            this.f43269e.e(cVar, wy0Var);
        }
        az0 az0Var = yj0Var.f44061e;
        if (az0Var != null) {
            if (this.f43270f == null) {
                this.f43270f = a.cb.q(oVar, az0.class);
            }
            this.f43270f.e(cVar, az0Var);
        }
        ba baVar = yj0Var.f44062f;
        if (baVar != null) {
            if (this.f43271g == null) {
                this.f43271g = a.cb.q(oVar, ba.class);
            }
            this.f43271g.e(cVar, baVar);
        }
        ga gaVar = yj0Var.f44063g;
        if (gaVar != null) {
            if (this.f43272h == null) {
                this.f43272h = a.cb.q(oVar, ga.class);
            }
            this.f43272h.e(cVar, gaVar);
        }
        zj0 zj0Var = yj0Var.f44064h;
        if (zj0Var != null) {
            if (this.f43273i == null) {
                this.f43273i = a.cb.q(oVar, zj0.class);
            }
            this.f43273i.e(cVar, zj0Var);
        }
        zv0 zv0Var = yj0Var.f44065i;
        if (zv0Var != null) {
            if (this.f43274j == null) {
                this.f43274j = a.cb.q(oVar, zv0.class);
            }
            this.f43274j.e(cVar, zv0Var);
        }
        dr drVar = yj0Var.f44066j;
        if (drVar != null) {
            if (this.f43275k == null) {
                this.f43275k = a.cb.q(oVar, dr.class);
            }
            this.f43275k.e(cVar, drVar);
        }
        zq zqVar = yj0Var.f44067k;
        if (zqVar != null) {
            if (this.f43276l == null) {
                this.f43276l = a.cb.q(oVar, zq.class);
            }
            this.f43276l.e(cVar, zqVar);
        }
        q30 q30Var = yj0Var.f44068l;
        if (q30Var != null) {
            if (this.f43277m == null) {
                this.f43277m = a.cb.q(oVar, q30.class);
            }
            this.f43277m.e(cVar, q30Var);
        }
        h20 h20Var = yj0Var.f44069m;
        if (h20Var != null) {
            if (this.f43278n == null) {
                this.f43278n = a.cb.q(oVar, h20.class);
            }
            this.f43278n.e(cVar, h20Var);
        }
    }
}

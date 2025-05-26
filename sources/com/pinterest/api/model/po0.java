package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class po0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41037a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41038b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41039c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41040d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41041e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41042f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41043g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41044h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41045i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f41046j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f41047k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f41048l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f41049m;

    public po0(nm.o oVar) {
        this.f41037a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        ro0 ro0Var;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new ro0(0);
        }
        nm.o oVar = this.f41037a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new ro0(0);
            }
            p13.hashCode();
            switch (p13) {
                case "story_pin_ingredient_block":
                    if (this.f41041e == null) {
                        this.f41041e = a.cb.p(sm0.class, oVar);
                    }
                    ro0Var = new ro0((sm0) this.f41041e.a(uVar));
                    break;
                case "story_pin_video_block":
                    if (this.f41044h == null) {
                        this.f41044h = a.cb.p(pq0.class, oVar);
                    }
                    ro0Var = new ro0((pq0) this.f41044h.a(uVar));
                    break;
                case "story_pin_music_block":
                    if (this.f41045i == null) {
                        this.f41045i = a.cb.p(no0.class, oVar);
                    }
                    ro0Var = new ro0((no0) this.f41045i.a(uVar));
                    break;
                case "story_pin_link_block":
                    if (this.f41040d == null) {
                        this.f41040d = a.cb.p(an0.class, oVar);
                    }
                    ro0Var = new ro0((an0) this.f41040d.a(uVar));
                    break;
                case "story_pin_supply_block":
                    if (this.f41042f == null) {
                        this.f41042f = a.cb.p(wp0.class, oVar);
                    }
                    ro0Var = new ro0((wp0) this.f41042f.a(uVar));
                    break;
                case "story_pin_generic_interactive_sticker_block":
                    if (this.f41049m == null) {
                        this.f41049m = a.cb.p(bp.class, oVar);
                    }
                    ro0Var = new ro0((bp) this.f41049m.a(uVar));
                    break;
                case "story_pin_paragraph_block":
                    if (this.f41039c == null) {
                        this.f41039c = a.cb.p(kp0.class, oVar);
                    }
                    ro0Var = new ro0((kp0) this.f41039c.a(uVar));
                    break;
                case "story_pin_image_block":
                    if (this.f41043g == null) {
                        this.f41043g = a.cb.p(km0.class, oVar);
                    }
                    ro0Var = new ro0((km0) this.f41043g.a(uVar));
                    break;
                case "story_pin_virtual_try_on_makeup_sticker_block":
                    if (this.f41048l == null) {
                        this.f41048l = a.cb.p(zq0.class, oVar);
                    }
                    ro0Var = new ro0((zq0) this.f41048l.a(uVar));
                    break;
                case "story_pin_product_sticker_block":
                    if (this.f41047k == null) {
                        this.f41047k = a.cb.p(mp0.class, oVar);
                    }
                    ro0Var = new ro0((mp0) this.f41047k.a(uVar));
                    break;
                case "story_pin_heading_block":
                    if (this.f41038b == null) {
                        this.f41038b = a.cb.p(gm0.class, oVar);
                    }
                    ro0Var = new ro0((gm0) this.f41038b.a(uVar));
                    break;
                case "story_pin_mention_sticker_block":
                    if (this.f41046j == null) {
                        this.f41046j = a.cb.p(fo0.class, oVar);
                    }
                    ro0Var = new ro0((fo0) this.f41046j.a(uVar));
                    break;
                default:
                    return new ro0(0);
            }
            return ro0Var;
        } catch (Exception unused) {
            return new ro0(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ro0 ro0Var = (ro0) obj;
        if (ro0Var == null) {
            cVar.m();
            return;
        }
        gm0 gm0Var = ro0Var.f41633a;
        nm.o oVar = this.f41037a;
        if (gm0Var != null) {
            if (this.f41038b == null) {
                this.f41038b = a.cb.q(oVar, gm0.class);
            }
            this.f41038b.e(cVar, gm0Var);
        }
        kp0 kp0Var = ro0Var.f41634b;
        if (kp0Var != null) {
            if (this.f41039c == null) {
                this.f41039c = a.cb.q(oVar, kp0.class);
            }
            this.f41039c.e(cVar, kp0Var);
        }
        an0 an0Var = ro0Var.f41635c;
        if (an0Var != null) {
            if (this.f41040d == null) {
                this.f41040d = a.cb.q(oVar, an0.class);
            }
            this.f41040d.e(cVar, an0Var);
        }
        sm0 sm0Var = ro0Var.f41636d;
        if (sm0Var != null) {
            if (this.f41041e == null) {
                this.f41041e = a.cb.q(oVar, sm0.class);
            }
            this.f41041e.e(cVar, sm0Var);
        }
        wp0 wp0Var = ro0Var.f41637e;
        if (wp0Var != null) {
            if (this.f41042f == null) {
                this.f41042f = a.cb.q(oVar, wp0.class);
            }
            this.f41042f.e(cVar, wp0Var);
        }
        km0 km0Var = ro0Var.f41638f;
        if (km0Var != null) {
            if (this.f41043g == null) {
                this.f41043g = a.cb.q(oVar, km0.class);
            }
            this.f41043g.e(cVar, km0Var);
        }
        pq0 pq0Var = ro0Var.f41639g;
        if (pq0Var != null) {
            if (this.f41044h == null) {
                this.f41044h = a.cb.q(oVar, pq0.class);
            }
            this.f41044h.e(cVar, pq0Var);
        }
        no0 no0Var = ro0Var.f41640h;
        if (no0Var != null) {
            if (this.f41045i == null) {
                this.f41045i = a.cb.q(oVar, no0.class);
            }
            this.f41045i.e(cVar, no0Var);
        }
        fo0 fo0Var = ro0Var.f41641i;
        if (fo0Var != null) {
            if (this.f41046j == null) {
                this.f41046j = a.cb.q(oVar, fo0.class);
            }
            this.f41046j.e(cVar, fo0Var);
        }
        mp0 mp0Var = ro0Var.f41642j;
        if (mp0Var != null) {
            if (this.f41047k == null) {
                this.f41047k = a.cb.q(oVar, mp0.class);
            }
            this.f41047k.e(cVar, mp0Var);
        }
        zq0 zq0Var = ro0Var.f41643k;
        if (zq0Var != null) {
            if (this.f41048l == null) {
                this.f41048l = a.cb.q(oVar, zq0.class);
            }
            this.f41048l.e(cVar, zq0Var);
        }
        bp bpVar = ro0Var.f41644l;
        if (bpVar != null) {
            if (this.f41049m == null) {
                this.f41049m = a.cb.q(oVar, bp.class);
            }
            this.f41049m.e(cVar, bpVar);
        }
    }
}

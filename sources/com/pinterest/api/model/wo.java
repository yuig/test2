package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class wo extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43307a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43308b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43309c;

    public wo(nm.o oVar) {
        this.f43307a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        yo yoVar;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if (aVar.K() != um.b.BEGIN_OBJECT) {
            aVar.E();
            return new yo(0);
        }
        nm.o oVar = this.f43307a;
        oVar.getClass();
        nm.u uVar = (nm.u) oVar.f(aVar, new TypeToken(nm.u.class));
        try {
            String p13 = uVar.v("type").p();
            if (p13 == null) {
                return new yo(0);
            }
            if (p13.equals("board_sticker")) {
                if (this.f43308b == null) {
                    this.f43308b = a.cb.p(hp.class, oVar);
                }
                yoVar = new yo((hp) this.f43308b.a(uVar));
            } else {
                if (!p13.equals("question_sticker")) {
                    return new yo(0);
                }
                if (this.f43309c == null) {
                    this.f43309c = a.cb.p(lp.class, oVar);
                }
                yoVar = new yo((lp) this.f43309c.a(uVar));
            }
            return yoVar;
        } catch (Exception unused) {
            return new yo(0);
        }
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        yo yoVar = (yo) obj;
        if (yoVar == null) {
            cVar.m();
            return;
        }
        hp hpVar = yoVar.f44091a;
        nm.o oVar = this.f43307a;
        if (hpVar != null) {
            if (this.f43308b == null) {
                this.f43308b = a.cb.q(oVar, hp.class);
            }
            this.f43308b.e(cVar, hpVar);
        }
        lp lpVar = yoVar.f44092b;
        if (lpVar != null) {
            if (this.f43309c == null) {
                this.f43309c = a.cb.q(oVar, lp.class);
            }
            this.f43309c.e(cVar, lpVar);
        }
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ns0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40475a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40476b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40477c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40478d;

    public ns0(nm.o oVar) {
        this.f40475a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ms0 ms0Var = new ms0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 101609:
                    if (k03.equals("fps")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 1193832214:
                    if (k03.equals("timeline_objects")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1502503441:
                    if (k03.equals("frames_amount")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40475a;
            if (c13 == 0) {
                if (this.f40478d == null) {
                    this.f40478d = a.cb.q(oVar, String.class);
                }
                ms0Var.f40199a = (String) this.f40478d.c(aVar);
                boolean[] zArr = ms0Var.f40204f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f40476b == null) {
                    this.f40476b = a.cb.q(oVar, Integer.class);
                }
                ms0Var.f40201c = (Integer) this.f40476b.c(aVar);
                boolean[] zArr2 = ms0Var.f40204f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f40477c == null) {
                    this.f40477c = oVar.g(new TypeToken<List<pu0>>(this) { // from class: com.pinterest.api.model.TemplateTimeline$TemplateTimelineTypeAdapter$2
                    }).b();
                }
                ms0Var.b((List) this.f40477c.c(aVar));
            } else if (c13 == 3) {
                if (this.f40476b == null) {
                    this.f40476b = a.cb.q(oVar, Integer.class);
                }
                ms0Var.f40202d = (Integer) this.f40476b.c(aVar);
                boolean[] zArr3 = ms0Var.f40204f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f40478d == null) {
                    this.f40478d = a.cb.q(oVar, String.class);
                }
                ms0Var.f40200b = (String) this.f40478d.c(aVar);
                boolean[] zArr4 = ms0Var.f40204f;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return ms0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Integer num;
        Integer num2;
        String str;
        String str2;
        ps0 ps0Var = (ps0) obj;
        if (ps0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ps0Var.f41083f;
        int length = zArr.length;
        nm.o oVar = this.f40475a;
        if (length > 0 && zArr[0]) {
            if (this.f40478d == null) {
                this.f40478d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40478d;
            um.c h10 = cVar.h("id");
            str2 = ps0Var.f41078a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40478d == null) {
                this.f40478d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40478d;
            um.c h13 = cVar.h("node_id");
            str = ps0Var.f41079b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40476b == null) {
                this.f40476b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40476b;
            um.c h14 = cVar.h("fps");
            num2 = ps0Var.f41080c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40476b == null) {
                this.f40476b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40476b;
            um.c h15 = cVar.h("frames_amount");
            num = ps0Var.f41081d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40477c == null) {
                this.f40477c = oVar.g(new TypeToken<List<pu0>>(this) { // from class: com.pinterest.api.model.TemplateTimeline$TemplateTimelineTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f40477c;
            um.c h16 = cVar.h("timeline_objects");
            list = ps0Var.f41082e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class pb0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40933a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40934b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40935c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40936d;

    public pb0(nm.o oVar) {
        this.f40933a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lb0 lb0Var = new lb0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2044459996:
                    if (k03.equals("num_columns")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1659648748:
                    if (k03.equals("objects")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 2011608879:
                    if (k03.equals("layout_type")) {
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
            nm.o oVar = this.f40933a;
            if (c13 == 0) {
                if (this.f40934b == null) {
                    this.f40934b = a.cb.q(oVar, Integer.class);
                }
                lb0Var.f39696d = (Integer) this.f40934b.c(aVar);
                boolean[] zArr = lb0Var.f39698f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f40935c == null) {
                    this.f40935c = oVar.g(new TypeToken<List<ob0>>(this) { // from class: com.pinterest.api.model.QuizOutputSectionData$QuizOutputSectionDataTypeAdapter$2
                    }).b();
                }
                lb0Var.f39697e = (List) this.f40935c.c(aVar);
                boolean[] zArr2 = lb0Var.f39698f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f40936d == null) {
                    this.f40936d = a.cb.q(oVar, String.class);
                }
                lb0Var.f39693a = (String) this.f40936d.c(aVar);
                boolean[] zArr3 = lb0Var.f39698f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f40934b == null) {
                    this.f40934b = a.cb.q(oVar, Integer.class);
                }
                lb0Var.f39695c = (Integer) this.f40934b.c(aVar);
                boolean[] zArr4 = lb0Var.f39698f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f40936d == null) {
                    this.f40936d = a.cb.q(oVar, String.class);
                }
                lb0Var.f39694b = (String) this.f40936d.c(aVar);
                boolean[] zArr5 = lb0Var.f39698f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new rb0(lb0Var.f39693a, lb0Var.f39694b, lb0Var.f39695c, lb0Var.f39696d, lb0Var.f39697e, lb0Var.f39698f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Integer num;
        Integer num2;
        String str;
        String str2;
        rb0 rb0Var = (rb0) obj;
        if (rb0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rb0Var.f41539f;
        int length = zArr.length;
        nm.o oVar = this.f40933a;
        if (length > 0 && zArr[0]) {
            if (this.f40936d == null) {
                this.f40936d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40936d;
            um.c h10 = cVar.h("id");
            str2 = rb0Var.f41534a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40936d == null) {
                this.f40936d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40936d;
            um.c h13 = cVar.h("node_id");
            str = rb0Var.f41535b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40934b == null) {
                this.f40934b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40934b;
            um.c h14 = cVar.h("layout_type");
            num2 = rb0Var.f41536c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40934b == null) {
                this.f40934b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40934b;
            um.c h15 = cVar.h("num_columns");
            num = rb0Var.f41537d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40935c == null) {
                this.f40935c = oVar.g(new TypeToken<List<ob0>>(this) { // from class: com.pinterest.api.model.QuizOutputSectionData$QuizOutputSectionDataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f40935c;
            um.c h16 = cVar.h("objects");
            list = rb0Var.f41538e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}

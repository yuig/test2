package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class oz extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40837a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40838b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40839c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40840d;

    public oz(nm.o oVar) {
        this.f40837a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        nz nzVar = new nz(0);
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1615086568:
                    if (k03.equals("display_name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40837a;
            if (c13 == 0) {
                if (this.f40840d == null) {
                    this.f40840d = a.cb.q(oVar, String.class);
                }
                nzVar.f40547a = (String) this.f40840d.c(aVar);
                boolean[] zArr = nzVar.f40553g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f40839c == null) {
                    this.f40839c = a.cb.q(oVar, f30.class);
                }
                nzVar.f40551e = (f30) this.f40839c.c(aVar);
                boolean[] zArr2 = nzVar.f40553g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f40838b == null) {
                    this.f40838b = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.NuxUseCase$NuxUseCaseTypeAdapter$2
                    }).b();
                }
                nzVar.f40552f = (List) this.f40838b.c(aVar);
                boolean[] zArr3 = nzVar.f40553g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f40840d == null) {
                    this.f40840d = a.cb.q(oVar, String.class);
                }
                nzVar.f40550d = (String) this.f40840d.c(aVar);
                boolean[] zArr4 = nzVar.f40553g;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 == 4) {
                if (this.f40840d == null) {
                    this.f40840d = a.cb.q(oVar, String.class);
                }
                nzVar.f40549c = (String) this.f40840d.c(aVar);
                boolean[] zArr5 = nzVar.f40553g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f40840d == null) {
                    this.f40840d = a.cb.q(oVar, String.class);
                }
                nzVar.f40548b = (String) this.f40840d.c(aVar);
                boolean[] zArr6 = nzVar.f40553g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new qz(nzVar.f40547a, nzVar.f40548b, nzVar.f40549c, nzVar.f40550d, nzVar.f40551e, nzVar.f40552f, nzVar.f40553g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        f30 f30Var;
        String str;
        String str2;
        String str3;
        String str4;
        qz qzVar = (qz) obj;
        if (qzVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qzVar.f41448g;
        int length = zArr.length;
        nm.o oVar = this.f40837a;
        if (length > 0 && zArr[0]) {
            if (this.f40840d == null) {
                this.f40840d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40840d;
            um.c h10 = cVar.h("id");
            str4 = qzVar.f41442a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40840d == null) {
                this.f40840d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40840d;
            um.c h13 = cVar.h("node_id");
            str3 = qzVar.f41443b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40840d == null) {
                this.f40840d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40840d;
            um.c h14 = cVar.h("background_color");
            str2 = qzVar.f41444c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40840d == null) {
                this.f40840d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40840d;
            um.c h15 = cVar.h("display_name");
            str = qzVar.f41445d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40839c == null) {
                this.f40839c = a.cb.q(oVar, f30.class);
            }
            nm.m mVar5 = this.f40839c;
            um.c h16 = cVar.h("pin");
            f30Var = qzVar.f41446e;
            mVar5.e(h16, f30Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40838b == null) {
                this.f40838b = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.NuxUseCase$NuxUseCaseTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f40838b;
            um.c h17 = cVar.h("pins");
            list = qzVar.f41447f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}

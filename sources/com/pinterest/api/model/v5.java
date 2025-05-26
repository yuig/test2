package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42730a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42731b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42732c;

    public v5(nm.o oVar) {
        this.f42730a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x5 x5Var = new x5(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1268779017) {
                if (hashCode != 3355) {
                    if (hashCode != 3002589) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("args")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("format")) {
                c13 = 0;
            }
            nm.o oVar = this.f42730a;
            if (c13 == 0) {
                if (this.f42732c == null) {
                    this.f42732c = a.cb.q(oVar, String.class);
                }
                x5Var.f43593d = (String) this.f42732c.c(aVar);
                boolean[] zArr = x5Var.f43594e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f42732c == null) {
                    this.f42732c = a.cb.q(oVar, String.class);
                }
                x5Var.f43590a = (String) this.f42732c.c(aVar);
                boolean[] zArr2 = x5Var.f43594e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f42731b == null) {
                    this.f42731b = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.AnnotatedText$AnnotatedTextTypeAdapter$2
                    }).b();
                }
                x5Var.f43592c = (List) this.f42731b.c(aVar);
                boolean[] zArr3 = x5Var.f43594e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42732c == null) {
                    this.f42732c = a.cb.q(oVar, String.class);
                }
                x5Var.f43591b = (String) this.f42732c.c(aVar);
                boolean[] zArr4 = x5Var.f43594e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new y5(x5Var.f43590a, x5Var.f43591b, x5Var.f43592c, x5Var.f43593d, x5Var.f43594e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        String str2;
        String str3;
        y5 y5Var = (y5) obj;
        if (y5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = y5Var.f43953e;
        int length = zArr.length;
        nm.o oVar = this.f42730a;
        if (length > 0 && zArr[0]) {
            if (this.f42732c == null) {
                this.f42732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42732c;
            um.c h10 = cVar.h("id");
            str3 = y5Var.f43949a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42732c == null) {
                this.f42732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42732c;
            um.c h13 = cVar.h("node_id");
            str2 = y5Var.f43950b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42731b == null) {
                this.f42731b = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.AnnotatedText$AnnotatedTextTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42731b;
            um.c h14 = cVar.h("args");
            list = y5Var.f43951c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42732c == null) {
                this.f42732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42732c;
            um.c h15 = cVar.h("format");
            str = y5Var.f43952d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}

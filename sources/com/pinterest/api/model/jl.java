package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class jl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39093a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39094b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39095c;

    public jl(nm.o oVar) {
        this.f39093a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        il ilVar = new il(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -662305033) {
                if (hashCode != 3355) {
                    if (hashCode != 102727412) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("label")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("swatch_hex_colors")) {
                c13 = 0;
            }
            nm.o oVar = this.f39093a;
            if (c13 == 0) {
                if (this.f39094b == null) {
                    this.f39094b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.FilterColorSwatchItem$FilterColorSwatchItemTypeAdapter$2
                    }).b();
                }
                ilVar.f38810d = (List) this.f39094b.c(aVar);
                boolean[] zArr = ilVar.f38811e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f39095c == null) {
                    this.f39095c = a.cb.q(oVar, String.class);
                }
                ilVar.f38807a = (String) this.f39095c.c(aVar);
                boolean[] zArr2 = ilVar.f38811e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f39095c == null) {
                    this.f39095c = a.cb.q(oVar, String.class);
                }
                ilVar.f38809c = (String) this.f39095c.c(aVar);
                boolean[] zArr3 = ilVar.f38811e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39095c == null) {
                    this.f39095c = a.cb.q(oVar, String.class);
                }
                ilVar.f38808b = (String) this.f39095c.c(aVar);
                boolean[] zArr4 = ilVar.f38811e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ll(ilVar.f38807a, ilVar.f38808b, ilVar.f38809c, ilVar.f38810d, ilVar.f38811e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        String str3;
        ll llVar = (ll) obj;
        if (llVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = llVar.f39816e;
        int length = zArr.length;
        nm.o oVar = this.f39093a;
        if (length > 0 && zArr[0]) {
            if (this.f39095c == null) {
                this.f39095c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39095c;
            um.c h10 = cVar.h("id");
            str3 = llVar.f39812a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39095c == null) {
                this.f39095c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39095c;
            um.c h13 = cVar.h("node_id");
            str2 = llVar.f39813b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39095c == null) {
                this.f39095c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39095c;
            um.c h14 = cVar.h("label");
            str = llVar.f39814c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39094b == null) {
                this.f39094b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.FilterColorSwatchItem$FilterColorSwatchItemTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f39094b;
            um.c h15 = cVar.h("swatch_hex_colors");
            list = llVar.f39815d;
            mVar4.e(h15, list);
        }
        cVar.g();
    }
}

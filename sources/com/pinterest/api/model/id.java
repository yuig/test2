package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class id extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38742a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38743b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38744c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38745d;

    public id(nm.o oVar) {
        this.f38742a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hd hdVar = new hd(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1019779949:
                    if (k03.equals("offset")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -40300674:
                    if (k03.equals("rotation")) {
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
                case 3344108:
                    if (k03.equals("mask")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 109250890:
                    if (k03.equals("scale")) {
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
            nm.o oVar = this.f38742a;
            if (c13 == 0) {
                if (this.f38744c == null) {
                    this.f38744c = oVar.g(new TypeToken<List<Double>>(this) { // from class: com.pinterest.api.model.CollagesItem$CollagesItemTypeAdapter$2
                    }).b();
                }
                hdVar.f38383d = (List) this.f38744c.c(aVar);
                boolean[] zArr = hdVar.f38386g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38743b == null) {
                    this.f38743b = a.cb.q(oVar, Double.class);
                }
                hdVar.f38384e = (Double) this.f38743b.c(aVar);
                boolean[] zArr2 = hdVar.f38386g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f38745d == null) {
                    this.f38745d = a.cb.q(oVar, String.class);
                }
                hdVar.f38380a = (String) this.f38745d.c(aVar);
                boolean[] zArr3 = hdVar.f38386g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38745d == null) {
                    this.f38745d = a.cb.q(oVar, String.class);
                }
                hdVar.f38382c = (String) this.f38745d.c(aVar);
                boolean[] zArr4 = hdVar.f38386g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f38743b == null) {
                    this.f38743b = a.cb.q(oVar, Double.class);
                }
                hdVar.f38385f = (Double) this.f38743b.c(aVar);
                boolean[] zArr5 = hdVar.f38386g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38745d == null) {
                    this.f38745d = a.cb.q(oVar, String.class);
                }
                hdVar.f38381b = (String) this.f38745d.c(aVar);
                boolean[] zArr6 = hdVar.f38386g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new kd(hdVar.f38380a, hdVar.f38381b, hdVar.f38382c, hdVar.f38383d, hdVar.f38384e, hdVar.f38385f, hdVar.f38386g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        List list;
        String str;
        String str2;
        String str3;
        kd kdVar = (kd) obj;
        if (kdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kdVar.f39402g;
        int length = zArr.length;
        nm.o oVar = this.f38742a;
        if (length > 0 && zArr[0]) {
            if (this.f38745d == null) {
                this.f38745d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38745d;
            um.c h10 = cVar.h("id");
            str3 = kdVar.f39396a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38745d == null) {
                this.f38745d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38745d;
            um.c h13 = cVar.h("node_id");
            str2 = kdVar.f39397b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38745d == null) {
                this.f38745d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38745d;
            um.c h14 = cVar.h("mask");
            str = kdVar.f39398c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38744c == null) {
                this.f38744c = oVar.g(new TypeToken<List<Double>>(this) { // from class: com.pinterest.api.model.CollagesItem$CollagesItemTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f38744c;
            um.c h15 = cVar.h("offset");
            list = kdVar.f39399d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38743b == null) {
                this.f38743b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f38743b;
            um.c h16 = cVar.h("rotation");
            d13 = kdVar.f39400e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38743b == null) {
                this.f38743b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f38743b;
            um.c h17 = cVar.h("scale");
            d2 = kdVar.f39401f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}

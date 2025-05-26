package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ru extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41670a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41671b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41672c;

    public ru(nm.o oVar) {
        this.f41670a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qu quVar = new qu(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -242738639) {
                if (hashCode != 577695464) {
                    if (hashCode == 1239095321 && k03.equals("upload_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("upload_parameters")) {
                    c13 = 1;
                }
            } else if (k03.equals("upload_url")) {
                c13 = 0;
            }
            nm.o oVar = this.f41670a;
            if (c13 == 0) {
                if (this.f41672c == null) {
                    this.f41672c = a.cb.q(oVar, String.class);
                }
                quVar.f41377c = (String) this.f41672c.c(aVar);
                boolean[] zArr = quVar.f41378d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41671b == null) {
                    this.f41671b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.MediaRegisteredUpload$MediaRegisteredUploadTypeAdapter$2
                    }).b();
                }
                quVar.f41376b = (Map) this.f41671b.c(aVar);
                boolean[] zArr2 = quVar.f41378d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41672c == null) {
                    this.f41672c = a.cb.q(oVar, String.class);
                }
                quVar.f41375a = (String) this.f41672c.c(aVar);
                boolean[] zArr3 = quVar.f41378d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new tu(quVar.f41375a, quVar.f41376b, quVar.f41377c, quVar.f41378d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        String str2;
        tu tuVar = (tu) obj;
        if (tuVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tuVar.f42302d;
        int length = zArr.length;
        nm.o oVar = this.f41670a;
        if (length > 0 && zArr[0]) {
            if (this.f41672c == null) {
                this.f41672c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41672c;
            um.c h10 = cVar.h("upload_id");
            str2 = tuVar.f42299a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41671b == null) {
                this.f41671b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.MediaRegisteredUpload$MediaRegisteredUploadTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f41671b;
            um.c h13 = cVar.h("upload_parameters");
            map = tuVar.f42300b;
            mVar2.e(h13, map);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41672c == null) {
                this.f41672c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41672c;
            um.c h14 = cVar.h("upload_url");
            str = tuVar.f42301c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}

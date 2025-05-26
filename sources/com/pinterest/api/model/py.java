package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes3.dex */
public final class py extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.i0 f41142a;

    /* renamed from: b, reason: collision with root package name */
    public final nm.m f41143b;

    public py(nm.o oVar, qy qyVar, TypeToken typeToken) {
        this.f41142a = oVar.i(qyVar, typeToken);
        this.f41143b = a.cb.p(String.class, oVar);
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        oy oyVar = new oy(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("link");
            nm.m mVar = this.f41143b;
            if (equals) {
                oyVar.f40828a = (String) mVar.c(aVar);
                boolean[] zArr = oyVar.f40830c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("text")) {
                oyVar.f40829b = (String) mVar.c(aVar);
                boolean[] zArr2 = oyVar.f40830c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ry(oyVar.f40828a, oyVar.f40829b, oyVar.f40830c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        this.f41142a.e(cVar, (ry) obj);
    }
}

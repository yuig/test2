package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class mm0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40164a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40165b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40166c;

    public mm0(nm.o oVar) {
        this.f40164a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lm0 lm0Var = new lm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("images");
            nm.o oVar = this.f40164a;
            if (equals) {
                if (this.f40165b == null) {
                    this.f40165b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.StoryPinImageMetadata$StoryPinImageMetadataTypeAdapter$2
                    }).b();
                }
                lm0Var.f39822b = (Map) this.f40165b.c(aVar);
                boolean[] zArr = lm0Var.f39823c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("dominant_color")) {
                if (this.f40166c == null) {
                    this.f40166c = a.cb.q(oVar, String.class);
                }
                lm0Var.f39821a = (String) this.f40166c.c(aVar);
                boolean[] zArr2 = lm0Var.f39823c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new om0(lm0Var.f39821a, lm0Var.f39822b, lm0Var.f39823c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        String str;
        om0 om0Var = (om0) obj;
        if (om0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = om0Var.f40758c;
        int length = zArr.length;
        nm.o oVar = this.f40164a;
        if (length > 0 && zArr[0]) {
            if (this.f40166c == null) {
                this.f40166c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40166c;
            um.c h10 = cVar.h("dominant_color");
            str = om0Var.f40756a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40165b == null) {
                this.f40165b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.StoryPinImageMetadata$StoryPinImageMetadataTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f40165b;
            um.c h13 = cVar.h("images");
            map = om0Var.f40757b;
            mVar2.e(h13, map);
        }
        cVar.g();
    }
}

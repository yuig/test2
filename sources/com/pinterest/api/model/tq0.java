package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class tq0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42276a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42277b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42278c;

    public tq0(nm.o oVar) {
        this.f42276a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        sq0 sq0Var = new sq0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("video_list");
            nm.o oVar = this.f42276a;
            if (equals) {
                if (this.f42278c == null) {
                    this.f42278c = oVar.g(new TypeToken<Map<String, h01>>(this) { // from class: com.pinterest.api.model.StoryPinVideoMetadata$StoryPinVideoMetadataTypeAdapter$4
                    }).b();
                }
                sq0Var.c((Map) this.f42278c.c(aVar));
            } else if (k03.equals("bitrates")) {
                if (this.f42277b == null) {
                    this.f42277b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.StoryPinVideoMetadata$StoryPinVideoMetadataTypeAdapter$3
                    }).b();
                }
                sq0Var.b((Map) this.f42277b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return sq0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        Map map2;
        vq0 vq0Var = (vq0) obj;
        if (vq0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vq0Var.f42957c;
        int length = zArr.length;
        nm.o oVar = this.f42276a;
        if (length > 0 && zArr[0]) {
            if (this.f42277b == null) {
                this.f42277b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.StoryPinVideoMetadata$StoryPinVideoMetadataTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42277b;
            um.c h10 = cVar.h("bitrates");
            map2 = vq0Var.f42955a;
            mVar.e(h10, map2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42278c == null) {
                this.f42278c = oVar.g(new TypeToken<Map<String, h01>>(this) { // from class: com.pinterest.api.model.StoryPinVideoMetadata$StoryPinVideoMetadataTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f42278c;
            um.c h13 = cVar.h("video_list");
            map = vq0Var.f42956b;
            mVar2.e(h13, map);
        }
        cVar.g();
    }
}

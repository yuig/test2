package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ce extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36390a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36391b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36392c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36393d;

    public ce(nm.o oVar) {
        this.f36390a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        be beVar = new be(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3552281:
                    if (k03.equals("tags")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1067168184:
                    if (k03.equals("object_ids")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1554732063:
                    if (k03.equals("image_signatures")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36390a;
            switch (c13) {
                case 0:
                    if (this.f36392c == null) {
                        this.f36392c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$4
                        }).b();
                    }
                    beVar.f36048d = (List) this.f36392c.c(aVar);
                    boolean[] zArr = beVar.f36052h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f36393d == null) {
                        this.f36393d = a.cb.q(oVar, String.class);
                    }
                    beVar.f36045a = (String) this.f36393d.c(aVar);
                    boolean[] zArr2 = beVar.f36052h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f36392c == null) {
                        this.f36392c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$6
                        }).b();
                    }
                    beVar.f36050f = (List) this.f36392c.c(aVar);
                    boolean[] zArr3 = beVar.f36052h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f36393d == null) {
                        this.f36393d = a.cb.q(oVar, String.class);
                    }
                    beVar.f36051g = (String) this.f36393d.c(aVar);
                    boolean[] zArr4 = beVar.f36052h;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f36391b == null) {
                        this.f36391b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$5
                        }).b();
                    }
                    beVar.f36049e = (List) this.f36391b.c(aVar);
                    boolean[] zArr5 = beVar.f36052h;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f36393d == null) {
                        this.f36393d = a.cb.q(oVar, String.class);
                    }
                    beVar.f36047c = (String) this.f36393d.c(aVar);
                    boolean[] zArr6 = beVar.f36052h;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f36393d == null) {
                        this.f36393d = a.cb.q(oVar, String.class);
                    }
                    beVar.f36046b = (String) this.f36393d.c(aVar);
                    boolean[] zArr7 = beVar.f36052h;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ee(beVar.f36045a, beVar.f36046b, beVar.f36047c, beVar.f36048d, beVar.f36049e, beVar.f36050f, beVar.f36051g, beVar.f36052h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        List list2;
        List list3;
        String str2;
        String str3;
        String str4;
        ee eeVar = (ee) obj;
        if (eeVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = eeVar.f37254h;
        int length = zArr.length;
        nm.o oVar = this.f36390a;
        if (length > 0 && zArr[0]) {
            if (this.f36393d == null) {
                this.f36393d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36393d;
            um.c h10 = cVar.h("id");
            str4 = eeVar.f37247a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36393d == null) {
                this.f36393d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36393d;
            um.c h13 = cVar.h("node_id");
            str3 = eeVar.f37248b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36393d == null) {
                this.f36393d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36393d;
            um.c h14 = cVar.h("image_signatures");
            str2 = eeVar.f37249c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36392c == null) {
                this.f36392c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f36392c;
            um.c h15 = cVar.h("images");
            list3 = eeVar.f37250d;
            mVar4.e(h15, list3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36391b == null) {
                this.f36391b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f36391b;
            um.c h16 = cVar.h("object_ids");
            list2 = eeVar.f37251e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36392c == null) {
                this.f36392c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommunityContent$CommunityContentTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f36392c;
            um.c h17 = cVar.h("tags");
            list = eeVar.f37252f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36393d == null) {
                this.f36393d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36393d;
            um.c h18 = cVar.h("text");
            str = eeVar.f37253g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}

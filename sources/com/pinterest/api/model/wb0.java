package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wb0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43209a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43210b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43211c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43212d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43213e;

    public wb0(nm.o oVar) {
        this.f43209a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vb0 vb0Var = new vb0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1782234803:
                    if (k03.equals("questions")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1496002765:
                    if (k03.equals("creator_analytics")) {
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
                case 1097546742:
                    if (k03.equals("results")) {
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
            nm.o oVar = this.f43209a;
            if (c13 == 0) {
                if (this.f43210b == null) {
                    this.f43210b = oVar.g(new TypeToken<List<ea0>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$5
                    }).b();
                }
                vb0Var.f42815d = (List) this.f43210b.c(aVar);
                boolean[] zArr = vb0Var.f42817f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f43212d == null) {
                    this.f43212d = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$4
                    }).b();
                }
                vb0Var.f42814c = (Map) this.f43212d.c(aVar);
                boolean[] zArr2 = vb0Var.f42817f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f43213e == null) {
                    this.f43213e = a.cb.q(oVar, String.class);
                }
                vb0Var.f42812a = (String) this.f43213e.c(aVar);
                boolean[] zArr3 = vb0Var.f42817f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f43211c == null) {
                    this.f43211c = oVar.g(new TypeToken<List<ge0>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$6
                    }).b();
                }
                vb0Var.f42816e = (List) this.f43211c.c(aVar);
                boolean[] zArr4 = vb0Var.f42817f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43213e == null) {
                    this.f43213e = a.cb.q(oVar, String.class);
                }
                vb0Var.f42813b = (String) this.f43213e.c(aVar);
                boolean[] zArr5 = vb0Var.f42817f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new yb0(vb0Var.f42812a, vb0Var.f42813b, vb0Var.f42814c, vb0Var.f42815d, vb0Var.f42816e, vb0Var.f42817f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Map map;
        String str;
        String str2;
        yb0 yb0Var = (yb0) obj;
        if (yb0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yb0Var.f44000f;
        int length = zArr.length;
        nm.o oVar = this.f43209a;
        if (length > 0 && zArr[0]) {
            if (this.f43213e == null) {
                this.f43213e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43213e;
            um.c h10 = cVar.h("id");
            str2 = yb0Var.f43995a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43213e == null) {
                this.f43213e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43213e;
            um.c h13 = cVar.h("node_id");
            str = yb0Var.f43996b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43212d == null) {
                this.f43212d = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43212d;
            um.c h14 = cVar.h("creator_analytics");
            map = yb0Var.f43997c;
            mVar3.e(h14, map);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43210b == null) {
                this.f43210b = oVar.g(new TypeToken<List<ea0>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f43210b;
            um.c h15 = cVar.h("questions");
            list2 = yb0Var.f43998d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43211c == null) {
                this.f43211c = oVar.g(new TypeToken<List<ge0>>(this) { // from class: com.pinterest.api.model.QuizPinDataChips$QuizPinDataChipsTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f43211c;
            um.c h16 = cVar.h("results");
            list = yb0Var.f43999e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}

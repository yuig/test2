package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class ho0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38501a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38502b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38503c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38504d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38505e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38506f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38507g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38508h;

    public ho0(nm.o oVar) {
        this.f38501a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        boolean z14 = false;
        go0 go0Var = new go0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            ?? r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            switch (k03.hashCode()) {
                case -1527936789:
                    if (k03.equals("canvas_aspect_ratio")) {
                        r15 = z14;
                        break;
                    }
                    break;
                case -1396198907:
                    if (k03.equals("basics")) {
                        r15 = 1;
                        break;
                    }
                    break;
                case -588647634:
                    if (k03.equals("pin_title")) {
                        r15 = 2;
                        break;
                    }
                    break;
                case -180013089:
                    if (k03.equals("template_type")) {
                        r15 = 3;
                        break;
                    }
                    break;
                case 351608024:
                    if (k03.equals("version")) {
                        r15 = 4;
                        break;
                    }
                    break;
                case 440918133:
                    if (k03.equals("diy_data")) {
                        r15 = 5;
                        break;
                    }
                    break;
                case 478463018:
                    if (k03.equals("pin_image_signature")) {
                        r15 = 6;
                        break;
                    }
                    break;
                case 1462773001:
                    if (k03.equals("is_compatible")) {
                        r15 = 7;
                        break;
                    }
                    break;
                case 1484622445:
                    if (k03.equals("compatible_version")) {
                        r15 = 8;
                        break;
                    }
                    break;
                case 1998625723:
                    if (k03.equals("recipe_data")) {
                        r15 = 9;
                        break;
                    }
                    break;
            }
            boolean[] zArr = go0Var.f38108k;
            nm.o oVar = this.f38501a;
            switch (r15) {
                case 0:
                    z13 = false;
                    if (this.f38503c == null) {
                        this.f38503c = a.cb.q(oVar, Double.class);
                    }
                    go0Var.f38099b = (Double) this.f38503c.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        continue;
                    }
                case 1:
                    if (this.f38505e == null) {
                        this.f38505e = a.cb.q(oVar, qk0.class);
                    }
                    go0Var.f38098a = (qk0) this.f38505e.c(aVar);
                    if (zArr.length > 0) {
                        z13 = false;
                        zArr[0] = true;
                        break;
                    }
                    break;
                case 2:
                    if (this.f38508h == null) {
                        this.f38508h = a.cb.q(oVar, String.class);
                    }
                    go0Var.f38104g = (String) this.f38508h.c(aVar);
                    if (zArr.length > 6) {
                        zArr[6] = true;
                        break;
                    }
                    break;
                case 3:
                    if (this.f38504d == null) {
                        this.f38504d = a.cb.q(oVar, Integer.class);
                    }
                    go0Var.f38106i = (Integer) this.f38504d.c(aVar);
                    if (zArr.length > 8) {
                        zArr[8] = true;
                        break;
                    }
                    break;
                case 4:
                    if (this.f38508h == null) {
                        this.f38508h = a.cb.q(oVar, String.class);
                    }
                    go0Var.f38107j = (String) this.f38508h.c(aVar);
                    if (zArr.length > 9) {
                        zArr[9] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f38506f == null) {
                        this.f38506f = a.cb.q(oVar, ql0.class);
                    }
                    go0Var.f38101d = (ql0) this.f38506f.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f38508h == null) {
                        this.f38508h = a.cb.q(oVar, String.class);
                    }
                    go0Var.f38103f = (String) this.f38508h.c(aVar);
                    if (zArr.length > 5) {
                        zArr[5] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f38502b == null) {
                        this.f38502b = a.cb.q(oVar, Boolean.class);
                    }
                    go0Var.f38102e = (Boolean) this.f38502b.c(aVar);
                    boolean[] zArr2 = go0Var.f38108k;
                    if (zArr2.length > 4) {
                        zArr2[4] = true;
                        break;
                    }
                    break;
                case 8:
                    if (this.f38508h == null) {
                        this.f38508h = a.cb.q(oVar, String.class);
                    }
                    go0Var.f38100c = (String) this.f38508h.c(aVar);
                    boolean[] zArr3 = go0Var.f38108k;
                    if (zArr3.length > 2) {
                        zArr3[2] = true;
                        break;
                    }
                    break;
                case 9:
                    if (this.f38507g == null) {
                        this.f38507g = a.cb.q(oVar, sp0.class);
                    }
                    go0Var.f38105h = (sp0) this.f38507g.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                        break;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
            z13 = false;
            z14 = z13;
        }
        aVar.g();
        return go0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        sp0 sp0Var;
        String str2;
        String str3;
        Boolean bool;
        ql0 ql0Var;
        String str4;
        Double d2;
        qk0 qk0Var;
        jo0 jo0Var = (jo0) obj;
        if (jo0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jo0Var.f39113k;
        int length = zArr.length;
        nm.o oVar = this.f38501a;
        if (length > 0 && zArr[0]) {
            if (this.f38505e == null) {
                this.f38505e = a.cb.q(oVar, qk0.class);
            }
            nm.m mVar = this.f38505e;
            um.c h10 = cVar.h("basics");
            qk0Var = jo0Var.f39103a;
            mVar.e(h10, qk0Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38503c == null) {
                this.f38503c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f38503c;
            um.c h13 = cVar.h("canvas_aspect_ratio");
            d2 = jo0Var.f39104b;
            mVar2.e(h13, d2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38508h == null) {
                this.f38508h = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38508h;
            um.c h14 = cVar.h("compatible_version");
            str4 = jo0Var.f39105c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38506f == null) {
                this.f38506f = a.cb.q(oVar, ql0.class);
            }
            nm.m mVar4 = this.f38506f;
            um.c h15 = cVar.h("diy_data");
            ql0Var = jo0Var.f39106d;
            mVar4.e(h15, ql0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38502b == null) {
                this.f38502b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f38502b;
            um.c h16 = cVar.h("is_compatible");
            bool = jo0Var.f39107e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38508h == null) {
                this.f38508h = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38508h;
            um.c h17 = cVar.h("pin_image_signature");
            str3 = jo0Var.f39108f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38508h == null) {
                this.f38508h = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f38508h;
            um.c h18 = cVar.h("pin_title");
            str2 = jo0Var.f39109g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38507g == null) {
                this.f38507g = a.cb.q(oVar, sp0.class);
            }
            nm.m mVar8 = this.f38507g;
            um.c h19 = cVar.h("recipe_data");
            sp0Var = jo0Var.f39110h;
            mVar8.e(h19, sp0Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38504d == null) {
                this.f38504d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f38504d;
            um.c h23 = cVar.h("template_type");
            num = jo0Var.f39111i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38508h == null) {
                this.f38508h = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f38508h;
            um.c h24 = cVar.h("version");
            str = jo0Var.f39112j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}

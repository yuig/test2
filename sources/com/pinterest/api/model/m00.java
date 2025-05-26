package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class m00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39953a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39954b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39955c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39956d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39957e;

    public m00(nm.o oVar) {
        this.f39953a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        l00 l00Var = new l00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1604143506:
                    if (k03.equals("background_color_hex")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1569721427:
                    if (k03.equals("text_color_hex")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1442735800:
                    if (k03.equals("image_urls")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -737588055:
                    if (k03.equals("icon_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -391963246:
                    if (k03.equals("selected_background_color_hex")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3226745:
                    if (k03.equals("icon")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 456541712:
                    if (k03.equals("is_selected")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 863147785:
                    if (k03.equals("image_medium_url")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1615269514:
                    if (k03.equals("display_text")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2027300355:
                    if (k03.equals("alt_text")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39953a;
            switch (c13) {
                case 0:
                    if (this.f39956d == null) {
                        this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$5
                        }).b();
                    }
                    l00Var.b((List) this.f39956d.c(aVar));
                    break;
                case 1:
                    if (this.f39956d == null) {
                        this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$8
                        }).b();
                    }
                    l00Var.h((List) this.f39956d.c(aVar));
                    break;
                case 2:
                    if (this.f39956d == null) {
                        this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$6
                        }).b();
                    }
                    l00Var.f((List) this.f39956d.c(aVar));
                    break;
                case 3:
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.e((String) this.f39957e.c(aVar));
                    break;
                case 4:
                    if (this.f39956d == null) {
                        this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$7
                        }).b();
                    }
                    l00Var.f39613k = (List) this.f39956d.c(aVar);
                    boolean[] zArr = l00Var.f39616n;
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case 5:
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.f39603a = (String) this.f39957e.c(aVar);
                    boolean[] zArr2 = l00Var.f39616n;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 6:
                    if (this.f39955c == null) {
                        this.f39955c = a.cb.q(oVar, Integer.class);
                    }
                    l00Var.d((Integer) this.f39955c.c(aVar));
                    break;
                case 7:
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.f39615m = (String) this.f39957e.c(aVar);
                    boolean[] zArr3 = l00Var.f39616n;
                    if (zArr3.length <= 12) {
                        break;
                    } else {
                        zArr3[12] = true;
                        break;
                    }
                case '\b':
                    if (this.f39954b == null) {
                        this.f39954b = a.cb.q(oVar, Boolean.class);
                    }
                    l00Var.g((Boolean) this.f39954b.c(aVar));
                    break;
                case '\t':
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.f39610h = (String) this.f39957e.c(aVar);
                    boolean[] zArr4 = l00Var.f39616n;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case '\n':
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.c((String) this.f39957e.c(aVar));
                    break;
                case 11:
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.f39605c = (String) this.f39957e.c(aVar);
                    boolean[] zArr5 = l00Var.f39616n;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case '\f':
                    if (this.f39957e == null) {
                        this.f39957e = a.cb.q(oVar, String.class);
                    }
                    l00Var.f39604b = (String) this.f39957e.c(aVar);
                    boolean[] zArr6 = l00Var.f39616n;
                    if (zArr6.length <= 1) {
                        break;
                    } else {
                        zArr6[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return l00Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        List list2;
        Boolean bool;
        List list3;
        String str2;
        String str3;
        Integer num;
        String str4;
        List list4;
        String str5;
        String str6;
        String str7;
        o00 o00Var = (o00) obj;
        if (o00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o00Var.f40581n;
        int length = zArr.length;
        nm.o oVar = this.f39953a;
        if (length > 0 && zArr[0]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39957e;
            um.c h10 = cVar.h("id");
            str7 = o00Var.f40568a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39957e;
            um.c h13 = cVar.h("node_id");
            str6 = o00Var.f40569b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39957e;
            um.c h14 = cVar.h("alt_text");
            str5 = o00Var.f40570c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39956d == null) {
                this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f39956d;
            um.c h15 = cVar.h("background_color_hex");
            list4 = o00Var.f40571d;
            mVar4.e(h15, list4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39957e;
            um.c h16 = cVar.h("display_text");
            str4 = o00Var.f40572e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39955c == null) {
                this.f39955c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f39955c;
            um.c h17 = cVar.h("icon");
            num = o00Var.f40573f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39957e;
            um.c h18 = cVar.h("icon_url");
            str3 = o00Var.f40574g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f39957e;
            um.c h19 = cVar.h("image_medium_url");
            str2 = o00Var.f40575h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f39956d == null) {
                this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f39956d;
            um.c h23 = cVar.h("image_urls");
            list3 = o00Var.f40576i;
            mVar9.e(h23, list3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f39954b == null) {
                this.f39954b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f39954b;
            um.c h24 = cVar.h("is_selected");
            bool = o00Var.f40577j;
            mVar10.e(h24, bool);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f39956d == null) {
                this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$3
                }).b();
            }
            nm.m mVar11 = this.f39956d;
            um.c h25 = cVar.h("selected_background_color_hex");
            list2 = o00Var.f40578k;
            mVar11.e(h25, list2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f39956d == null) {
                this.f39956d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduledisplay$OnebarmoduledisplayTypeAdapter$4
                }).b();
            }
            nm.m mVar12 = this.f39956d;
            um.c h26 = cVar.h("text_color_hex");
            list = o00Var.f40579l;
            mVar12.e(h26, list);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f39957e == null) {
                this.f39957e = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f39957e;
            um.c h27 = cVar.h("type");
            str = o00Var.f40580m;
            mVar13.e(h27, str);
        }
        cVar.g();
    }
}

package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.qv;
import java.util.List;

/* loaded from: classes3.dex */
public final class rv extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41678a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41679b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41680c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41681d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41682e;

    public rv(nm.o oVar) {
        this.f41678a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pv pvVar = new pv(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2098442016:
                    if (k03.equals("selected_level")) {
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
                case 506361563:
                    if (k03.equals("group_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 662382807:
                    if (k03.equals("eligible_levels")) {
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
            nm.o oVar = this.f41678a;
            if (c13 == 0) {
                if (this.f41681d == null) {
                    this.f41681d = a.cb.q(oVar, qv.b.class);
                }
                pvVar.f41119e = (qv.b) this.f41681d.c(aVar);
                boolean[] zArr = pvVar.f41120f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f41682e == null) {
                    this.f41682e = a.cb.q(oVar, String.class);
                }
                pvVar.f41115a = (String) this.f41682e.c(aVar);
                boolean[] zArr2 = pvVar.f41120f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f41680c == null) {
                    this.f41680c = a.cb.q(oVar, qv.a.class);
                }
                pvVar.f41118d = (qv.a) this.f41680c.c(aVar);
                boolean[] zArr3 = pvVar.f41120f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f41679b == null) {
                    this.f41679b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.MessagingPermissionsGroup$MessagingPermissionsGroupTypeAdapter$2
                    }).b();
                }
                pvVar.f41117c = (List) this.f41679b.c(aVar);
                boolean[] zArr4 = pvVar.f41120f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41682e == null) {
                    this.f41682e = a.cb.q(oVar, String.class);
                }
                pvVar.f41116b = (String) this.f41682e.c(aVar);
                boolean[] zArr5 = pvVar.f41120f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new qv(pvVar.f41115a, pvVar.f41116b, pvVar.f41117c, pvVar.f41118d, pvVar.f41119e, pvVar.f41120f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        qv.b bVar;
        qv.a aVar;
        List list;
        String str;
        String str2;
        qv qvVar = (qv) obj;
        if (qvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qvVar.f41392f;
        int length = zArr.length;
        nm.o oVar = this.f41678a;
        if (length > 0 && zArr[0]) {
            if (this.f41682e == null) {
                this.f41682e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41682e;
            um.c h10 = cVar.h("id");
            str2 = qvVar.f41387a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41682e == null) {
                this.f41682e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41682e;
            um.c h13 = cVar.h("node_id");
            str = qvVar.f41388b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41679b == null) {
                this.f41679b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.MessagingPermissionsGroup$MessagingPermissionsGroupTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41679b;
            um.c h14 = cVar.h("eligible_levels");
            list = qvVar.f41389c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41680c == null) {
                this.f41680c = a.cb.q(oVar, qv.a.class);
            }
            nm.m mVar4 = this.f41680c;
            um.c h15 = cVar.h("group_id");
            aVar = qvVar.f41390d;
            mVar4.e(h15, aVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41681d == null) {
                this.f41681d = a.cb.q(oVar, qv.b.class);
            }
            nm.m mVar5 = this.f41681d;
            um.c h16 = cVar.h("selected_level");
            bVar = qvVar.f41391e;
            mVar5.e(h16, bVar);
        }
        cVar.g();
    }
}

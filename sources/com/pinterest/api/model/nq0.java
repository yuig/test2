package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class nq0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40464a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40465b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40466c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40467d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40468e;

    public nq0(nm.o oVar) {
        this.f40464a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mq0 mq0Var = new mq0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1178105356:
                    if (k03.equals("video_signature")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 112202875:
                    if (k03.equals("video")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1227548543:
                    if (k03.equals("block_style")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            boolean[] zArr = mq0Var.f40196f;
            nm.o oVar = this.f40464a;
            if (c13 == 0) {
                if (this.f40468e == null) {
                    this.f40468e = a.cb.q(oVar, String.class);
                }
                mq0Var.f40195e = (String) this.f40468e.c(aVar);
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f40468e == null) {
                    this.f40468e = a.cb.q(oVar, String.class);
                }
                mq0Var.f40193c = (String) this.f40468e.c(aVar);
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f40467d == null) {
                    this.f40467d = a.cb.q(oVar, vq0.class);
                }
                mq0Var.f40194d = (vq0) this.f40467d.c(aVar);
                boolean[] zArr2 = mq0Var.f40196f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f40466c == null) {
                    this.f40466c = a.cb.q(oVar, zk0.class);
                }
                mq0Var.f40192b = (zk0) this.f40466c.c(aVar);
                boolean[] zArr3 = mq0Var.f40196f;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f40465b == null) {
                    this.f40465b = a.cb.q(oVar, Integer.class);
                }
                mq0Var.f40191a = (Integer) this.f40465b.c(aVar);
                boolean[] zArr4 = mq0Var.f40196f;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new pq0(mq0Var.f40191a, mq0Var.f40192b, mq0Var.f40193c, mq0Var.f40194d, mq0Var.f40195e, mq0Var.f40196f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        vq0 vq0Var;
        String str2;
        zk0 zk0Var;
        Integer num;
        pq0 pq0Var = (pq0) obj;
        if (pq0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pq0Var.f41063f;
        int length = zArr.length;
        nm.o oVar = this.f40464a;
        if (length > 0 && zArr[0]) {
            if (this.f40465b == null) {
                this.f40465b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f40465b;
            um.c h10 = cVar.h("block_type");
            num = pq0Var.f41058a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40466c == null) {
                this.f40466c = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f40466c;
            um.c h13 = cVar.h("block_style");
            zk0Var = pq0Var.f41059b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40468e == null) {
                this.f40468e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40468e;
            um.c h14 = cVar.h("type");
            str2 = pq0Var.f41060c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40467d == null) {
                this.f40467d = a.cb.q(oVar, vq0.class);
            }
            nm.m mVar4 = this.f40467d;
            um.c h15 = cVar.h("video");
            vq0Var = pq0Var.f41061d;
            mVar4.e(h15, vq0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40468e == null) {
                this.f40468e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40468e;
            um.c h16 = cVar.h("video_signature");
            str = pq0Var.f41062e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}

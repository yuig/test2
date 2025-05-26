package ads_mobile_sdk;

import a.ih;

/* loaded from: classes2.dex */
public final class za1 implements a.tb {

    /* renamed from: a, reason: collision with root package name */
    public final a.xe f14690a;

    /* renamed from: b, reason: collision with root package name */
    public final a.tf f14691b;

    /* renamed from: c, reason: collision with root package name */
    public final a.x6 f14692c;

    public za1(a.tf tfVar, a.x6 x6Var, a.xe xeVar) {
        this.f14691b = tfVar;
        x6Var.getClass();
        this.f14692c = x6Var;
        this.f14690a = xeVar;
    }

    @Override // a.tb
    public final boolean a(Object obj) {
        ((a.d8) this.f14692c).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.tb
    public final boolean b(Object obj, Object obj2) {
        ((ih) this.f14691b).getClass();
        yv2 yv2Var = ((sj0) obj).f11118b;
        ((ih) this.f14691b).getClass();
        return yv2Var.equals(((sj0) obj2).f11118b);
    }

    @Override // a.tb
    public final void c(Object obj) {
        this.f14691b.d(obj);
        ((a.d8) this.f14692c).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.tb
    public final int d(Object obj) {
        ((ih) this.f14691b).getClass();
        return ((sj0) obj).f11118b.hashCode();
    }

    @Override // a.tb
    public final void a(Object obj, a.q3 q3Var, jc0 jc0Var) {
        a.tf tfVar = this.f14691b;
        a.x6 x6Var = this.f14692c;
        tfVar.a(obj);
        ((a.d8) x6Var).getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.tb
    public final int b(Object obj) {
        ((ih) this.f14691b).getClass();
        yv2 yv2Var = ((sj0) obj).f11118b;
        int i13 = yv2Var.f14427d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < yv2Var.f14424a; i15++) {
            int i16 = yv2Var.f14425b[i15] >>> 3;
            i14 += oo.a((il) yv2Var.f14426c[i15]) + oo.h(3) + oo.i(i16) + oo.h(2) + (oo.h(1) * 2);
        }
        yv2Var.f14427d = i14;
        return i14;
    }

    @Override // a.tb
    public final void a(Object obj, Object obj2) {
        td2.a(this.f14691b, obj, obj2);
    }

    @Override // a.tb
    public final void a(Object obj, byte[] bArr, int i13, int i14, pg pgVar) {
        sj0 sj0Var = (sj0) obj;
        if (sj0Var.f11118b == yv2.f14423f) {
            sj0Var.f11118b = yv2.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // a.tb
    public final sj0 a() {
        a.xe xeVar = this.f14690a;
        if (xeVar instanceof sj0) {
            return (sj0) ((sj0) xeVar).a(4, (sj0) null);
        }
        qj0 qj0Var = (qj0) ((sj0) xeVar).a(5, (sj0) null);
        if (!qj0Var.f10110b.m()) {
            return qj0Var.f10110b;
        }
        qj0Var.f10110b.n();
        return qj0Var.f10110b;
    }

    @Override // a.tb
    public final void a(Object obj, po poVar) {
        ((a.d8) this.f14692c).getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
